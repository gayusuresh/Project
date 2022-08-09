import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/common/employee';
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit
 {
  isEditable :boolean;
  employee : Employee = new Employee(0,"","",0,new Date(),0,0,0,"");
  constructor(public empService:EmployeeService,private route:Router,private activateRoute:ActivatedRoute) { }

  ngOnInit(): void 
  {
    this.activateRoute.paramMap.subscribe(()=>this.employee);
    this.activateRoute.paramMap.subscribe(()=>this.getEmployeeById());
  
   }
   onSubmit(){
    console.log(this.employee);
    if(this.isEditable){
      this.empService.updateEmployee(this.employee).subscribe(data=>
        this.route.navigateByUrl("/employees"));

    }
    else{
    this.empService.SaveEmployee( this.employee ).subscribe(data =>
      console.log(data));
      this.route.navigateByUrl("/employees");
  }
}

  getEmployeeById(){
    const empID  = parseFloat(this.activateRoute.snapshot.paramMap.get("id"));
    
  console.log(empID);
  if(empID> 0)
  {
    this.isEditable = true;
    this.empService.getEmployeeByID(empID).subscribe(data=>{
      this.employee = data;
      console.log(this.employee)
    });
  }

  }}

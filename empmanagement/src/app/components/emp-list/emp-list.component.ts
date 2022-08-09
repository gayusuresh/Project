import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/common/employee';

import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit
 {
employees:Employee[];
  hasSearchName: any;
  searchName: string;
  constructor(private empSerive:EmployeeService,public router:Router,private activateRoute:ActivatedRoute) { }

  ngOnInit(): void 
  {
    this.getAllEmployees();
    this.employees;
  }
  getAllEmployees(){
    
 
    this.hasSearchName = this.activateRoute.snapshot.paramMap.has("ename");
    
    
 
    if(this.hasSearchName){
        this.searchName  = this.activateRoute.snapshot.paramMap.get("ename");
        console.log(this.searchName)
      this.empSerive.getAllEmployeesSearchByEname(this.searchName).subscribe(data=>{
        console.log(data);
        this.employees= data;
      })
    }
 
else {
   this.empSerive.getAllEmployee().subscribe(
     data => {
       console.log(data);
       this.employees = data;
     }
   );
  }}

addEmp():void
{
  this.router.navigateByUrl("/empform")
}
updateEmp(id:number)
{
  this.router.navigateByUrl("/updateEmp/"+id);
}
deleteEmp(id : Number){
  console.log(id);
  if(confirm("Do you want to delete ?")){
    this.empSerive.deleteEmployee(id).subscribe(data=>{
      console.log(data);
      this.getAllEmployees();
    })
  };

 }}
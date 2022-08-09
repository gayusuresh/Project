import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(public empService: EmployeeService, public route : Router, public activateRoute : ActivatedRoute) { }

  ngOnInit(): void
   {
    this.activateRoute.paramMap.subscribe(()=>this.search())
  }
 
  ename : string 
 
  
  search(){  
    
    this.route.navigateByUrl("/search/"+this.ename);
  }


}

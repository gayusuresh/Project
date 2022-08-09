import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable,map } from 'rxjs';
import { Employee } from './common/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService 
{
private empURl="http://localhost:8080/api/emp";
  constructor(private httpClient:HttpClient) 
  {

   }
    getAllEmployee() :Observable<Employee[]> 
   {

    return this.httpClient.get<getEmployeeResponse>(this.empURl).pipe(map(response=>response._embedded.employees));
   }
   SaveEmployee(employee : Employee):Observable<Employee>{
    const httpOptions = {
      headers : new HttpHeaders({
          'Content-Type' : 'application/json',
          'Authorization' : 'auth-token',
          'Access-Control-Allow-Origin' : '*'
      })
    };

    
   return  this.httpClient.post<Employee>(this.empURl,employee,httpOptions);



}
getEmployeeByID(empID:number):Observable<Employee>
{
  const empIDURl=this.empURl+"/"+empID;
  return  this.httpClient.get<Employee>(empIDURl);
}
updateEmployee(employee:Employee):Observable<Employee>{
  const httpOptions = {
    headers : new HttpHeaders({
        'Content-Type' : 'application/json',
        'Authorization' : 'auth-token',
        'Access-Control-Allow-Origin' : '*'
    })
  };
  return  this.httpClient.put<Employee>(this.empURl+`/${employee.id}`,employee,httpOptions);
}
deleteEmployee(id: Number) {
   
  const httpOptions = {
    headers : new HttpHeaders({
        'Content-Type' : 'application/json',
        'Authorization' : 'auth-token',
        'Access-Control-Allow-Origin' : '*'
    })
  };
  return  this.httpClient.delete<Employee>(this.empURl+`/${id}`,httpOptions);
}
getAllEmployeesSearchByEname(ename : string) : Observable<Employee[]> {
  const searchURL = "http://localhost:8080/api/emp/search/findByEnameIgnoreCase?ename=" + ename;

  return this.httpClient.get<GetSearchByEname>(searchURL).pipe(map(response => response._embedded.employees));
}


}
interface getEmployeeResponse
{
  _embedded:
  {
  employees:Employee[]
  }
}
interface GetSearchByEname{
  _embedded : {
    employees : Employee[]
  }
}




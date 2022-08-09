import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { EmpListComponent } from './components/emp-list/emp-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import {Route,RouterModule,Routes} from '@angular/router';
import { AddEmpComponent } from './components/add-emp/add-emp.component';
import { SearchComponent } from './components/search/search.component'
const routes:Routes=[{path:'',component:WelcomeComponent},{path:'employees',component:EmpListComponent},{path:'empform',component:AddEmpComponent},{path:'updateEmp/:id',component:AddEmpComponent},{path:'search/:ename',component:EmpListComponent}]
@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    WelcomeComponent,
    AddEmpComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

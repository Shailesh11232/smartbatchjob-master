import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BatchjobParameterComponent } from './batchjobs/batchjob-parameter/batchjob-parameter.component';
import { BatchjobComponent } from './batchjobs/batchjob/batchjob.component';
import { BatchjobsComponent } from './batchjobs/batchjobs.component';

const routes: Routes = [
  { path: '', redirectTo: 'batchjob', pathMatch: 'full'},
  { path: 'batchjobs', component:BatchjobsComponent},
  { path:'batchjob', children:[
    { path:'',component:BatchjobComponent},
    { path:':Id',component:BatchjobComponent},
  ]} 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [
                  BatchjobComponent,
                  BatchjobsComponent,
                  BatchjobParameterComponent
                ]
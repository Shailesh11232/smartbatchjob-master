import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MaterialModule } from './material.module';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BatchjobService } from './shared/batchjob.service';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BatchjobParameterComponent } from './batchjobs/batchjob-parameter/batchjob-parameter.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    NgbModule,
    HttpClientModule,
    ToastrModule.forRoot()  
  ],
  entryComponents:[BatchjobParameterComponent],
  providers: [BatchjobService],
  bootstrap: [AppComponent]
})
export class AppModule { }

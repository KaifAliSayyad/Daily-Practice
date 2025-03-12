import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { ServicesComponent } from './components/services/services.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { LoginComponent } from './components/login/login.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { WelcomeGuard } from './guards/welcome.guard';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'about', component: AboutUsComponent},
  {path:'service', component: ServicesComponent},
  {path: 'contact', component: ContactUsComponent},
  {path: 'netbanking', component: LoginComponent},
  {
    path: 'welcome', 
    component: WelcomeComponent, 
    canActivate: [WelcomeGuard],
    data: ['Manager']
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

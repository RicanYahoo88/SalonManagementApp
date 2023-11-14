import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { SalonServicesComponent } from "./components/salon-services/salon-services.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    imports: [CommonModule, RouterOutlet, SalonServicesComponent]
})
export class AppComponent {
  title = 'salon-booking-app';
}

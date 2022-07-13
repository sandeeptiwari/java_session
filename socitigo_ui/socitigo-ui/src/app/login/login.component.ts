import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Member } from '../domain/member';
import { ShareService } from '../share.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  loader = false;
  constructor(
    private fb: FormBuilder,
    private router: Router,
    private route: ActivatedRoute,
    private shareService: ShareService
  ) {
    this.loginForm = fb.group({
      username: ['', [Validators.required]],
      password: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  login = () => {
    const val = this.loginForm.value;
    console.log('Form value ', val);
    this.loader = true;
    const member = new Member(val.username, '12345678', val.password);
    this.shareService.login(member).subscribe((res) => {
      console.log('Login ', res);
      this.loader = false;
      this.router.navigate(['dashbord'], { relativeTo: this.route.parent });
    });
  };
}

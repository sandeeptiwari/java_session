import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Member } from './domain/member';
import { Observable } from 'rxjs';
import { shareReplay } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class ShareService {
  private LOGIN_URL =
    'http://socitigoapi-env.eba-xm2pmc5c.us-east-1.elasticbeanstalk.com/socitigo/authservice/api/login';
  constructor(private http: HttpClient) {}

  registration = (member: Member) => {};

  login = (member: Member): Observable<Member> => {
    return this.http.post<Member>(this.LOGIN_URL, member).pipe(shareReplay());
  };
}

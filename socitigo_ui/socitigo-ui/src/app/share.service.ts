import { Injectable } from '@angular/core';
import { Member } from './domain/member';

@Injectable({
  providedIn: 'root',
})
export class ShareService {
  constructor() {}

  registration = (member: Member) => {};

  login = (emailId: string, password: string) => {};
}

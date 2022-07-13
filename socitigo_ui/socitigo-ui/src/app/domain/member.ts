export class Member {
  username: string;
  mobileNo: string;
  password: string;

  constructor(username: string, mobileNo: string, password: string) {
    this.username = username;
    this.mobileNo = mobileNo;
    this.password = password;
  }
}

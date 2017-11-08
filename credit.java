HttpResponse<String> response = Unirest.post("https://gatewaystaging.payscout.com/api/process")
  .header("content-type", "application/x-www-form-urlencoded")
  .header("cache-control", "no-cache")
  .body("client_username={yourUsername}&client_password={yourPassword}&client_token=token&processing_type=CREDIT&expiration_month=10&expiration_year=2022&account_number={yourTestCardNumber}&cvv2=123¤cy=USD&initial_amount=99.99")
  .asString(); 

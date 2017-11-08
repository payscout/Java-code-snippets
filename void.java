HttpResponse<String> response = Unirest.post("https://gatewaystaging.payscout.com/api/process")
  .header("content-type", "application/x-www-form-urlencoded")
  .header("cache-control", "no-cache")
  .body("client_username={yourUsername}&client_password={yourPassword}&client_token=token&processing_type=VOID&original_transaction_id=A000177MEKX")
  .asString(); 

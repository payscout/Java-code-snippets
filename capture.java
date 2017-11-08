HttpResponse<String> response = Unirest.post("https://gatewaystaging.payscout.com/api/process")
  .header("content-type", "application/x-www-form-urlencoded")
  .header("cache-control", "no-cache")
  .body("client_username={yourUsername}&client_password={yourPassword}&client_token=token&processing_type=CAPTURE¤cy=USD&initial_amount=99.99&original_transaction_id=A000133RY3R&billing_invoice_number=1999")
  .asString(); 

package com.store.productcatalogue.model;

import org.springframework.http.HttpStatus;

public class ResponseDto<T> {
	  private HttpStatus statusCode;
	  
	  private T response;
	  
	  public ResponseDto(HttpStatus statusCode, T response) {
	    this.statusCode = statusCode;
	    this.response = response;
	  }
	  
	  public HttpStatus getStatusCode() {
	    return this.statusCode;
	  }
	  
	  public void setStatusCode(HttpStatus statusCode) {
	    this.statusCode = statusCode;
	  }
	  
	  public T getResponse() {
	    return this.response;
	  }
	  
	  public void setResponse(T response) {
	    this.response = response;
	  }
	}
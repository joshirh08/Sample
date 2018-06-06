package com.example;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;/*
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;*/
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class request_handler implements RequestHandler<RequestClass, ResponseClass> {  

	public ResponseClass handleRequest(RequestClass request, Context context) {
			Employee employee1 = new Employee();
	    	employee1.setEmployeeID(request.getEmployeeID());
	    	ResponseClass response = new ResponseClass();
	    	response.setEmployeeName(retrieveDeal(employee1));
	    	return response;
	    }
	    
		private String retrieveDeal(Employee employee1) {
			
			 /*AmazonDynamoDBClient client = new AmazonDynamoDBClient();
			 DynamoDB dynamoDB = new DynamoDB(client);
			 String tableName = "Employee";
			 Table table = dynamoDB.getTable(tableName);
			 Item item = table.getItem("EmployeeID", employee1.getEmployeeID()  );
			 employee1.setEmployeeName(item.getString("EmployeeName"));*/
			
			 employee1.setEmployeeName("ABCD");
			 
			 return employee1.getEmployeeName();
		   
		}
	}

	



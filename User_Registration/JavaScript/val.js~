$(document).ready(function(event){
	//global variables
	
	var form = $("#index");
	
        var name = $("#name").val();
	
      	var email= $("#email").val();

	var age= $("#age").val();

	var address = $("#address").val();

	var pincode = $("#pincode").val();

	var description = $("#description").val();

form.submit(function(event){

		if(validateName(name) && validateAge(age) && validateAddress(address) && validatePincode(pincode) && validateEmail(email) && validateDescription(description)){
			return true;}
		else{
			return false;}
	});

});
function validateName(name_verify){
		//NOT valid name
                var a=name_verify;
                var expr1= /^[A-z\s][^0-9]ig/;
		if(a.length < 4 || expr1.test(a))
		{
			$("#nameInfo").text("Enter a valid name!");
	
			return false;
		}

		//valid name

		else{
	
	         	return true;
		}
	}

function validateEmail(email_verify){

		var b = email_verify;
		var expr2 = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
		
		//valid email
		if(expr2.test(b)){
         		return true;
		}

		//NOT valid email

		else{
			
			$("#emailInfo").text("Please enter a valid E-mail!");
			
			return false;
		}
	}

function validateAge(age_verify){
		var c = age_verify;
		var expr6 = /^[0-9]+/;
		//NOT valid age
		if(expr6.test(c)){
		
			return true;
		}

		//valid age

		else{			

			$("#ageInfo").text("You can't be this old! Please enter a valid age.");

			return false;
		}
	}


function validateAddress(addr_verify){
		var e = addr_verify;
              var expr3= /^[A-z0-9]+[A-z0-9.,-]+/;
		//valid address
		if(expr3.test(e)){
			return true;
		}

		//NOT valid address

		else{			
			$("#addrInfo").text("Enter your address!");
			return false;
		}
	}

function validatePincode(pincode_verify){
		var f = pincode_verify;
                var expr4= /^[0-9]/;
		//valid pincode
		if(expr4.test(f) && f.length==6){

			return true;
		}

		//NOT valid pincode

		else{			
			$("#pinInfo").text("Check your Pincode!");
			return false;
		}
	}

function validateDescription(description_verify){

		var g = description_verify;
                var expr5= /^[A-Za-z][a-zA-Z0-9.,;:()*!]/;
		//valid description
		if(g.length > 4 || expr5.test(g)){

			return true;
		}
		//NOT valid description
		else{			
                        $("#descriptionInfo").text("Enter a reasonable description of yourself!");
			return false;
		}
	}


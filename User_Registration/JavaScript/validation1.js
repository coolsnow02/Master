$(document).ready(function(){
	//global variables

	var form = $("#index");
	
        var name = $("#name");
	var nameInfo = $("#nameInfo");
        
        var age = $("#age");
	var ageInfo = $("#ageInfo");	
        
        var gender = $("#gender");
	var genderInfo = $("#genderInfo");

	var address = $("#address");
	var addrInfo = $("#addrInfo");

	var pincode = $("#pincode");
	var pinInfo = $("#pinInfo");

	var email = $("#email");
	var emailInfo = $("#emailInfo");
	
        var description = $("#description");
	var descInfo = $("#descriptionInfo");
        
        //store RegExp in variable to test
        var expr;


	//On blur
	name.blur(validateName);
	age.blur(validateAge);
	gender.blur(validateGender);
	address.blur(validateAddr);
	pincode.blur(validatePin);
	email.blur(validateEmail);
	description.blur(validateDesc);

	//On Submitting
	form.submit(function(){
		if(validateName() && validateAge() && validateGender() && validateAddr() && validatePin() && validateEmail() && validateDesc())
			return true
		else
			return false;
	});
	
//validation functions

	function validateEmail(){

		//testing regular expression

		var a = email.val();
		var filter = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
		//if it's valid email
		if(filter.test(a)){
			
         		return true;
		}

		//if it's NOT valid

		else{
			
			emailInfo.text("Please enter a valid E-mail!");
			
			return false;
		}
	}

	function validateName(){
		//if it's NOT valid
                var a=name.val();
                var expr=[A-z][^0-9]\s[A-z][^0-9]
		if(a.length < 4 || expr.test(a)){
			nameInfo.text("Enter a valid name!");
	
			return false;
		}

		//if it's valid

		else{
	
	         	return true;
		}
	}

	function validateAge(){
		var a = age.val();

		//it's NOT valid
		if(a.length >2 || a=''){
		
			ageInfo.text("You can't be this old! Please enter a valid age.");
		
			return false;
		}

		//it's valid

		else{			

			ageInfo.text("Age in numbers (eg.25)");

			return true;
		}
	}

function validateGender(){
		var a = gender.val();

		//it's NOT valid
		if(a==''){

			ageInfo.text("You must select an option!");

			return false;
		}

		//it's valid

		else{			
			return true;
		}
	}

function validateAddr(){
		var a = $("#address").val();
                expr=[A-z0-9]+[A-z0-9./,]+/g;
		//it's NOT valid
		if(a=='' || expr.test(a){
			ageInfo.text("Enter your address!");
			return false;
		}

		//it's valid

		else{			
			ageInfo.text("Age in numbers (eg.25)");
			return true;
		}
	}

function validatePin(){
		var a = $("#pincode").val();
                expr=[0-9]+;
		//it's NOT valid
		if(address.val()=='' || expr.test(a){
			ageInfo.text("You can't be this old!");
			return false;
		}

		//it's valid

		else{			
			ageInfo.text("Age in numbers (eg.25)");
			return true;
		}
	}

	function validateDesc(){
		//it's NOT valid
		if(description.val().length < 4 || expr.test(a)){

                        descInfo.text("Enter a reasonable description of yourself!");
			return false;
		}
		//it's valid
		else{			

			return true;
		}
	}
});

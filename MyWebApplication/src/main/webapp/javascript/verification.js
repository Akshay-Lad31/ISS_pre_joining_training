/**
 * 
 */
function verify(){
	var name = document.forms.registration.userName;
	var email = document.forms.registration.userEmailID;
    var password = document.forms.registration.userPassword;
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[-+_!@#$%^&*., ?]).+$/;
    var cpassword = document.forms.registration.confirmPassword;
    if(name.value == null || name.value == ""){
		window.alert("Name filled is empty");
		name.focus();
		return false;
	}
	else if(password.value.length <= 8){
		window.alert("Password length is small.\nPassword should be atleast of 8 characters.");
		password.focus();
		return false;
	}
	else if(email.value == null || email.value == ""){
		window.alert("Enter your email ID");
		email.focus();
		return false;
	}
	else if(password.value != cpassword.value){
		window.alert("Re enter the correct password as above.");
		password.focus();
		return false;
		
	}
	else if(regex.test(password.value)){
		window.alert("Password should contain 1 uppercase, 1 lowercase and 1 specail character..");
		password.focus();
		return false;
	}
	else{
		window.alert("Password looks strong");
    	return true;
	}
}

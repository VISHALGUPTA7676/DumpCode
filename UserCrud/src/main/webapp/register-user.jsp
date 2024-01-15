<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.20.0/jquery.validate.min.js"
	integrity="sha512-WMEKGZ7L5LWgaPeJtw9MBM4i5w5OSBlSjTjCtSnvFJGSVD26gE5+Td12qN5pvWXhuWaWcVwF++F7aqu9cvqP0A=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>

<script>
	$(document).ready(function() {
		
		$("#name").click(function() {
			

			alert("nn")
			addCollegeForm();
			//addExperience();
		});
		var formCounter = 1;
		function addCollegeForm() {
			alert(formCounter);
			$("#main_experience_node").on("click", ".remove-btn", function() {
		        $(this).closest(".college-entry").remove();
		    });
		    var collegeFormsContainer = $("#main_experience_node");

		    // Create a new div for the college entry form
		    var newFormDiv = $("<div>").addClass("college-entry").attr("id", "collegeForm" + formCounter);

		    // Add form elements to the new div
		    newFormDiv.html(`
		    		<label for="collegeName`+formCounter+`">College Name:</label>
		    	    <input type="text" name="collegeName[`+formCounter+`]" class="collage">
		    	    <label for="location`+formCounter+`">Location:</label>
		    	    <input type="text" name="location[`+formCounter+`]" class="location">
		    	    <button class="remove-btn">Remove</button>
		    `);
		    
		    // Append the new div to the container
		    collegeFormsContainer.append(newFormDiv);
		    addExperience();
		    // Increment the form counter for unique IDs
		    formCounter++;
		    
		};
		
		onLoadFormData();
		
		$("#country").change(function() {
			let countryId=$("#country").val();
			alert("k" + countryId);
			getStates(countryId);
			
		});
		
		
		
		
		function getStates(countryId){
			alert(">>");
			$.ajax({
				url : "UserController", 
				type : "GET", 
				data : {action:"getStateById",id:countryId}, 
				dataType: "json",
				success : function(data) {
					 $("#stateId").empty();
					 $("#stateId").append("<option value='' >" + "Please Select the state" +  "</option>");
					 $.each(data, function (index, country) {
                    	 $("#stateId").append("<option value='" + country.stateId + "' >" + country.stateName + "</option>");

                     });
					console.log("Servlet response:", data);
				},
				error : function(error) {
					console.error("Error:", error);
				}
			});
		};
		
		$("#formSubmit").validate({
			
			rules:{
				firstName:{required:true,minlength:2},
				lastName:{required:true,minlength:2},
				mobileNumber:{required:true,minlength:10,maxlength:10},
				cityName:{required:true,minlength:3},
				emailId:{required:true,email:true},
				password:{required:true,minlength:5},
				country:"required",
				state:"required",
				'userLanguageId[]':{required:true,minlength:2},
				userTypeId:"required",
				},messages:{
					firstName:"Enter The First Name and min char 2",
					lastName:"Enter the last name",
					mobileNumber:"Enter 10 digit mobile number",
					cityName:"Enter city name with minimum 3 char",
					emailId:"Enter valid emailId",
					password:"Enter password",
					country:"choose Any country",
					state:"choose any state please",
					'userLanguageId[]':"Select minimum one language",
					userTypeId:"choose one of user type "
				}
			
		});
		
		 function addExperience(){
			 $('.collage').each(function(i, e) {
				  $(e).rules('add', {
				    required: true
				  });
			}); 
			 $('.location').each(function(i, e) {
				  $(e).rules('add', {
				    required: true
				  });
			});
			
			
		 };
		
		addExperience();
		
		function onLoadFormData() {
			$.ajax({
				url : "UserController", 
				type : "GET", 
				data : {action:"getCountry"}, 
				dataType: "json",
				success : function(data) {
					 $("#country").empty();
                     $.each(data.country, function (index, country) {
                    	 $("#country").append("<option value='" + country.countryId + "'" + (country.countryId == ${initParam.selectedCountryId} ? " selected" : "") + " >" + country.countryName + "</option>");

                     });
                     $.each(data.language, function (index, language) {
                    	 $("#language").append('&nbsp;&nbsp;<input type="checkbox" class="form-check-input" id="userLanguageId[' + index + ']" name="userLanguageId[]" value="'+language.languageId+'">  <label for="userLanguageId[' + index + ']">' + language.language + '</label>');

                    	 console.log("Servlet response:", language.languageId +"s"+index);
                    });
                    
                     $.each(data.userType, function (index, type) {
                    	 $("#usertype").append('&nbsp;&nbsp;<input type="radio" class="form-check-input" id="userType[' + index + ']" name="userTypeId" value="'+type.userTypeId+'">  <label for="userLanguageId[' + index + ']">' + type.userType+ '</label>');

                    	 console.log("Servlet response:", language.languageId +"s"+index);
                    });
	                     
					console.log("Servlet response:", data);
				},
				error : function(error) {
					console.error("Error:", error);
				}
			});
			if(${initParam.selectedCountryId} == null){
				
			}else{
				getStates(${initParam.selectedCountryId});
			}

		}
	});
</script>
</head>
<body>
${jsonCountries}
	<div class="container mt-3">
		<input type="text">
		<h1>${initParam.selectedCountryId}</h1>

		<form action="aa" id="formSubmit">

			<div class="">
				<label for="firstName">First Name:</label> <input type="text"
					class="form-control" name="firstName" id="firstName" >
			</div>

			<div>
				<label for="lastName">Last Name:</label> <input type="text"
					class="form-control" name="lastName" id="lastName" required>
			</div>

			<div>
				<label for="mobileNumber">Mobile Number:</label> <input type="text"
					class="form-control" name="mobileNumber" id="mobileNumber" required>

			</div>

			<div>
				<label for="cityName">City Name:</label> <input type="text"
					class="form-control" name="cityName" id="cityName" required>
			</div>
			<div>
				<label for="emailId">Email ID:</label> <input type="text"
					class="form-control" name="emailId" id="emailId" required>
			</div>

			<div>
				<label for="password">Password:</label> <input type="password"
					class="form-control" name="password" id="" required>
			</div>


			<div>
				<label>Select Any Country </label> <select
					class="form-select form-select-m" id="country" name="country">
				</select>
			</div>
			<div>
				<label>Select Any State </label> <select
					class="form-select form-select-m" id="stateId" name="state"><option
						selected>Please Select State</option></select>
			</div>
			<div>
				<label for="password">Select Languages</label>
				<div id="language"></div>
			</div>

			<div>
				<label>Choose User TYPE</label>
				<div id="usertype"></div>
			</div>
			<div class="container">
				<h5>Experiences</h5>
				<div id="main_experience_node"
					style="border: 2px solid black; margin: 2px; padding: 4px">
					
					
				<label for="collegeName">College Name:</label>
                <input type="text" name="collegeName[0]" class="collage">
                <label for="location">Location:</label>
                <input type="text" name="location[0]" class="location">
                
				</div>
				<button  id="name">Add College Form</button>
			</div>
			//<input type="submit" value="bb">
			<br> <br> <br> <br> <br>
		</form>

	
	</div>

</body>
</html>
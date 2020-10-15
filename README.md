"# image-hoster-project" 
##Assessment 1 - Run the application
###Instructions:
Display the 'Image Hoster' message as the heading of the website's homepage. In order to implement this, follow the instructions given below:

1. Complete the code in 'HomeController' class to map the homepage file ('index.html') of the website.
2. In the 'index.html', change the header title to 'Spring MVC Application - Image Hoster' and the heading of the page to ‘Image Hoster’. This will allow you to observe the output in the browser as shown in the image below:

Web page showing 'Image Hoster' as heading and 'Spring MVC Application - Image Hoster' as the title:

## Assessment 2 - Display images

###Instructions:
Complete the code in model class for the image.
Observe the code written in 'ImageService' class. Note that the imageFile attribute of Image class is hard-coded with the value obtained after converting the image to the Base64 format as a string.
In the 'HomeController' class, complete the code to add the list of images in the model with 'images' as the key as it is accessed by 'index.html' by the instruction '${images}'.
Uncomment the required HTML instruction set in the 'index.html' file to display the list of images on the homepage of the website.

##Assessment 3 - Registration

###Instructions:
We have implemented two model classes for the user. User class contains the important user details like username and password, while UserProfile class contains all other details of the user. Complete the code in model classes for the user.
In the ‘UserController’ class, complete the code to register the user details and again redirect to user registration page after successful registration.
Uncomment the required HTML instruction set in the ‘registration.html’ file to store user details.
document.getElementById('logged').addEventListener('click', function () {
  console.log("test");

  try {
      var settings = {
          "url": "http://localhost:9001/Login/username",
          "method": "POST",
          "timeout": 0,
          "headers": {
              "Content-Type": "application/json",
              "Access-Control-Allow-Origin": "*"
          },
          "data": JSON.stringify({
              "UserName": document.getElementById('UserName').value,
              "passWord": document.getElementById('passWord').value
          }),
      };

      $.ajax(settings)
          .done(function (response) {
              console.log(response);
              alert('Login successful!');
          })
          .fail(function (jqXHR, textStatus, errorThrown) {
              console.error("AJAX request failed:", textStatus, errorThrown);
              alert('Login failed! Please check your credentials.');
          });
  } catch (error) {
      console.error("Unexpected error:", error);
      alert('An unexpected error occurred during login. Please try again.');
  }
});


// Assume you have a function to handle the login process
//'http://localhost:9900/Login/username'


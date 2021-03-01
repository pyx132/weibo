$("#sign_in_btn").click(function () {
    var username=$("#username").val();
    var password=$("#password").val();
    $.ajax({
        type: 'POST',
        url: "/sign_in",
        data: {
            username : username,
            password : password
        },
        success: function (data) {
            localStorage.setItem("username",username);
            window.location.href="/"
        },
        dataType: "text"
    })
})
$("#sign_up_btn").click(function () {
    var username=$("#username").val();
    $.ajax({
        type: 'POST',
        url: "/sign_up",
        data: $("#sign_up").serialize(),
        success: function (data) {
            alert(data)
            localStorage.setItem("username",username);
            window.location.href="/"
        },
        dataType: "text"
    })
})
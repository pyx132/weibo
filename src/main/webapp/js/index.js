$(function () {
    $.get("/api/load/index",function (data,status) {
        if (status=="success"){
            $(".username").text(data.username)
        }
    },"json")
})

function load_data(){
    var theme=localStorage.getItem("username");
    if(theme==null||theme==""){
        $(".username").html("游客")
    }else{
        $(".username").html(theme)
    }
}
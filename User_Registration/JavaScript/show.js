 $(document).ready(function(event){
 $("#show").click(function(){
  $.getJSON("http://blooming-beach-2334.herokuapp.com/users.json",function(result){
    $("*")(result, function(i, field){
      $("div").append(field + " ");
    });
  });
});
});

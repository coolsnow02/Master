function validation($) {
    var validation = function() {
        var rules = {  
            name : {
                     check: function(value)
                            {
                               if(value)
                                  return testPattern(value, "[A-z][^0-9]\s[A-z][^0-9]");
                            }
                         return true;
                   },
                  msg : "Enter a valid name(do not use numbers)"
                },
                required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }

            age : {
                     check: function(value)
                            {
                               if(value)
                                  return testPattern(value, "\d[0-9]+");
                            }
                         return true;
                   },
                  msg : "Enter a valid age"
                },
                required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }

            gender : {
                     
                required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }
           
                
             address : {
                     check: function(value)
                            {
                               if(value)
                                  return testPattern(value, "[A-z0-9\w\d\.\s]+gm");
                            }
                         return true;
                   },
                  msg : "Enter a valid address"
                },
                required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }

             pincode : {
                     check: function(value)
                            {
                               if(value)
                                  return testPattern(value, "[0-9\d]+g");
                            }
                         return true;
                   },
                  msg : "Enter a valid pincode"
                },
                required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }

              
             email : {
               check: function(value) {
                   if(value) {
                       return testPattern(value,"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])");
                   }
                   return true;
               },
               msg : "Enter a valid e-mail address"
            },
            required : {

               check: function(value) {

                   if(value) {
                       return true;
                   }
                   else {
                       return false;
                   }
               },
               msg : "This field is required"
            }

               description : {
                         required : {
                               check : function(value)
                                     {
                                        if(value)
                                         {return true;}
                                         else {
                                              return false;
                                             }
                                     },
                            msg : "This field is required"
                           }

        }

}

}

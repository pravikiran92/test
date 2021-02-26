/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


 
function addDate(){
date = new Date();
var month = date.getMonth()+1;
var day = date.getDate();
var year = date.getFullYear();
var Hours = date.getHours();
var Min = date.getMinutes();
var Sec = date.getSeconds();

if (document.getElementById('open_date').value == ''){
document.getElementById('open_date').value = day + '-' + month + '-' + year+ '  ' + Hours+':'+Min+':'+Sec;
}
else if (document.getElementById('close_date').value == ''){
document.getElementById('close_date').value = day + '-' + month + '-' + year+ '  ' + Hours+':'+Min+':'+Sec;
}

}

(function getstatus()
            {
                $(function() 
                {
                    $('input[type="checkbox"]').click(function(e)
                    {
                        value = $("input[name=agree]:checked").val();
                        $('#txtNumberB').val("PROCESS");
                                            });
                });
            })(jQuery);


function awbrefno(){
date = new Date();
var month = date.getMonth()+1;
var day = date.getDate();
//var year = date.getFullYear();
var year = date.getUTCFullYear();
var Hours = date.getHours();
var Min = date.getMinutes();
var Sec = date.getSeconds();

if (document.getElementById('awbrefno').value == ''){
document.getElementById('awbrefno').value = 'AWB'+'ITTMS'+year +''+ month + '' +day+ ''+ Hours+''+Min+''+Sec;
}
/* else if (document.getElementById('close_date').value == ''){
document.getElementById('close_date').value = day + '-' + month + '-' + year+ '  ' + Hours+':'+Min+':'+Sec;
}
*/
}


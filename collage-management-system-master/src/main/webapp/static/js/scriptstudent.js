var personal = document.getElementById('personal'),
    row = document.getElementById('row');



personal.onclick = function () {
    'use strict';
   row.style.display='block';
    ahmd.style.display='none';
     sasa.style.display='none';
       eissa.style.display='none';

};

/**/
var edu = document.getElementById('edu'),

   ahmd = document.getElementById('ahmd');

edu.onclick = function () {
    'use strict';
   ahmd.style.display='block';
    row.style.display='none';
    eissa.style.display='none';
     sasa.style.display='none';

};
/**/
var notif = document.getElementById('notif'),

   eissa= document.getElementById('eissa');

notif.onclick = function () {
    'use strict';
   eissa.style.display='block';
    row.style.display='none';
    ahmd.style.display='none';
     sasa.style.display='none';
};
/**/
var chat = document.getElementById('chat'),

   sasa= document.getElementById('sasa');

chat.onclick = function () {
    'use strict';
   sasa.style.display='block';
    row.style.display='none';
    ahmd.style.display='none';
    eissa.style.display='none';
};

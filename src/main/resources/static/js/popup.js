const wrap = document.querySelector(".popup");
const header = document.querySelector(".header");
const button = document.getElementById("open");
const close = document.querySelector('.close-icon');

button.addEventListener('click', function(e) {
    wrap.style.display = 'block';
})

close.addEventListener('click', function(e) {
    wrap.style.display='none';
})


let lastX = 0;
let lastY = 0; 
let startX = 0; 
let startY = 0; 

// 1.
header.addEventListener('mousedown', function(e){
  e.preventDefault(); 
  startX = e.clientX; 
  startY = e.clientY; 
	
  // 2.  
  header.classList.add('active');
  
  // 3.
  document.addEventListener('mouseup', onRemoveEvent); 
  
  // 4.
  document.addEventListener('mousemove', onMove); 
});

function onRemoveEvent() { 
  header.classList.remove('active');
  document.removeEventListener('mouseup', onRemoveEvent); 
  document.removeEventListener('mousemove', onMove); 
} 

function onMove(e) { 
  e.preventDefault(); 
  lastX = startX - e.clientX; 
  lastY = startY - e.clientY; 

  startX = e.clientX; 
  startY = e.clientY; 

  wrap.style.top = `${wrap.offsetTop - lastY}px`;
  wrap.style.left = `${wrap.offsetLeft - lastX}px`;
}
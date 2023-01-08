window.onload = function(){
    const btn = document.getElementById('menuDelBtn');
    btn.addEventListener('click',sendit);
}

function sendit(){

    const meIdx = document.getElementById("meIdx");

    fetch('http://localhost:9999/menuLookUp/'+ meIdx, {
        method: 'DELETE',
    })
        .then((res) => {
            alert('등록성공')
            location.href='/menuLookUp';
            return;
        })
        .then((data) => {
            console.log(data);
            return;
        })
        .catch((err) => {
            alert('에러!');
            location.reload();
            return;
        });

    // fetch
    return true;
}
const listUser = async () => {
    try {
        const response = await fetch("http://localhost:8080/api/v1/anagrafica/all");
        const data = await response.json();
        console.log(data);
    } catch (ex) {
        alert(ex);
    }
};

window.addEventListener("load", async () => {
    await listUser();
});

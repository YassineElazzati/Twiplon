document.querySelectorAll(".like-button").forEach(function(likeButton) {
    likeButton.addEventListener("click", function() {
        var postId = likeButton.getAttribute("data-idpost");
        fetch("/like", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                idUser: 2, // Remplacez par l'ID de l'utilisateur actuel
                idPost: parseInt(postId) // Assurez-vous que l'ID du post est un nombre entier
            })
        })
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            // Mettez à jour le contenu du bouton avec le nombre de likes
            likeButton.innerHTML = "Nombre de like : " + data.likesCount;
        })
        .catch(function(error) {
            console.error(error);
        });
    });
});

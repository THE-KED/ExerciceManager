# ExerciceManager
"Exo Manager" est une Platforme de correction des exercices de mathematique pour le secondaire 

## Description du projet

Ce projet vient faciliter la transition des exercices de mathématiques entre un ou plusieurs
élèves(fournissent la copie à corriger), un modérateur(valide la copie à corriger) 
et un ou plusieurs Enseignants(rendent les copies corrigées et la correction des exercices). 

Notre stack de developement inclus java(Spring boot) et son template de vus(Thymeleaf).
Nous avons utilisés Spring boot à cause de sa grande communauté, son autoconfiguration,
et son optimisation dans la gestion des dépendances.

Le projet de gestion des exercices de mathématique était un grand challenge. La version actuelle permet néanmoins 
le transit et la validation des exercices de mathématiques entre un étutudiant et l'enseignant, en passant par le modérateur.
Les versions à venir serons plus complètes, et mettrons l'accent sur le renvoie des copies corrigées,
la responsivité mobile de l'application web, et les commentaires sur les copies corrigées.

## Installation et exécution du projet
Il s'agit ici d'une application web. 
L'exécution implique avoir un navigateur en sa disposition. 
Néanmoins, l'exécution de la version actuelle nécessite les étapes suivantes: 
- l'installation d'un environnement java sur sa machine.
- l'installation ou l'ajout des configurations Spring dans un IDE java, ou directement installer Spring Tool Suite (STS).
- l'installation de MySQL
- l'importation du projet dans l'IDE
- Et l'exécution du projet dans l'IDE (Autres IDE que Spring tool Suite requiert l'installation d'un serveur locale pour l'exécution du projet).

## Comment utiliser le projet
- Le projet requiert une authentification.
- L'utilisateur peux choisir s'authentifier comme Élève, Enseignant, ou Modérateur.
- L'authentification de chaque acteur implique la connexion et l'inscription. 
- Il faudrait s'être connecté avant de s'inscrire au préalable.
- Une fois authentifié, l'élève peut consulter la liste de ses exercices déjà envoyés, et même ceux rejetés. Ce dernier peux aussi soumettre un exercice en cliquant sur le boutton 'soumettre' placé au top-right de sa page d'acceuil. 
- Lorsque le modérateur est authentifié, il peux voir la liste des exercices à rejeter ou à valider. Il peux juste télécharger le fichier PDF, image, ou .docx et valider ou rejeter avec motif. Les buttons 'rejeter' et 'valider' sont placés à la fin de chqaue ligne d'exercices, dans la table d'exercices à consulter.
- Quant à l'enseignant, son authentification requiert son nom et son mot de passe. Et une fois authentifié, il peux télécharger une copie(Boutton télécharger), là corriger, et renvoyer la correction de la copie et le corrigé de tous les exercices.




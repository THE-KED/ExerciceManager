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
- Il faudrait s'être inscrit avant de se conneter.
- Une fois authentifié, l'élève peut consulter la liste de ses exercices déjà envoyés, et même ceux rejetés. Ce dernier peux aussi soumettre un exercice en cliquant sur le boutton 'soumettre' placé au top-right de sa page d'acceuil. 
- Lorsque le modérateur est authentifié, il peux voir la liste des exercices à rejeter ou à valider. Il peux juste télécharger le fichier PDF, image, ou .docx et valider ou rejeter avec motif. Les buttons 'rejeter' et 'valider' sont placés à la fin de chqaue ligne d'exercices, dans la table d'exercices à consulter.
- Quant à l'enseignant, son authentification requiert son nom et son mot de passe. Et une fois authentifié, il peux télécharger une copie(Boutton télécharger), là corriger, et renvoyer la correction de la copie et le corrigé de tous les exercices.

## Crédits 
```diff
# Wandji Njietche - project manager
# Kewou Eric - project development lead
# Mengue Essomba - project front-end lead
# Ntantame Ted - project analyst lead
# Kengni manuella - project design lead
@@ Special thanks to the University of Yaounde 1@@
```

## Licence

CONDITIONS D'UTILISATION, DE REPRODUCTION ET DE DISTRIBUTION

   1. Définitions.

      Le terme " Licence " désigne les conditions d'utilisation, de reproduction,
      et de distribution telles que définies dans les sections 1 à 9 du présent document.

      "Concédant" désigne le propriétaire du droit d'auteur ou l'entité autorisée par le propriétaire du droit d'auteur qui concède la licence.
      le propriétaire des droits d'auteur ou l'entité autorisée par le propriétaire des droits d'auteur qui concède la Licence.

      "Entité légale" désigne l'union de l'entité agissante et de toutes les autres entités qui contrôlent ou sont contrôlées par elle.
      entités qui contrôlent, sont contrôlées par, ou sont sous contrôle commun avec cette
      contrôle commun avec cette entité. Aux fins de la présente définition,
      le terme " contrôle " signifie (i) le pouvoir, direct ou indirect, de provoquer la
      direction ou la gestion de cette entité, que ce soit par contrat ou autrement, ou
      (ii) la propriété de cinquante pour cent (50 %) ou plus des actions en circulation, ou
      actions en circulation, ou (iii) la propriété effective de cette entité.

      "Vous" (ou "Votre") désigne une personne physique ou une Entité Légale
      exerçant les permissions accordées par la présente Licence.

      La forme "Source" désigne la forme préférée pour effectuer des modifications,
      y compris, mais sans s'y limiter, le code source du logiciel, la documentation
      source et les fichiers de configuration.

      La forme "Objet" désigne toute forme résultant de la transformation ou de la traduction
      transformation ou de la traduction mécanique d'une forme Source, y compris mais non
      non limitée au code objet compilé, à la documentation générée,
      et les conversions vers d'autres types de supports.

      Le terme "Œuvre" désigne le travail d'auteur, qu'il soit sous forme Source ou Objet, mis à disposition sous la Licence.
      Objet, mis à disposition sous la Licence, comme indiqué par un avis de droit d'auteur inclus dans ou attaché à la Licence.
      l'avis de droit d'auteur qui est inclus dans ou attaché à l'œuvre
      (un exemple est fourni dans l'annexe ci-dessous).

      "Œuvres Dérivées " désigne toute œuvre, qu'elle soit sous forme Source ou Objet, qui est basée sur (ou qui est liée à) la Licence.
      ou objet, qui est basée sur (ou dérivée de) l'œuvre et pour laquelle les
      révisions éditoriales, annotations, élaborations ou autres modifications
      représentent, dans leur ensemble, une œuvre originale de l'auteur. Aux fins de la
      de la présente licence, les œuvres dérivées n'incluent pas les œuvres qui demeurent
      séparables de, ou simplement liées (ou liées par leur nom) aux interfaces de,
      l'œuvre et de ses œuvres dérivées.

      "Contribution " désigne tout travail d'auteur, y compris
      la version originale de l'œuvre et toutes les modifications ou tous les ajouts
      modifications ou ajouts à cette œuvre ou à ses œuvres dérivées, qui est intentionnellement
      intentionnellement soumise au concédant pour être incluse dans l'œuvre par le titulaire du droit d'auteur ou par une personne physique ou morale.
      ou par une personne physique ou morale autorisée à le faire au nom du propriétaire du droit d'auteur.
      le propriétaire du droit d'auteur. Aux fins de la présente définition, " soumis " signifie
      désigne toute forme de communication électronique, verbale ou écrite envoyée
      au Concédant ou à ses représentants, y compris, mais sans s'y limiter, les éléments suivants
      la communication sur des listes de diffusion électroniques, des systèmes de contrôle du code source,
      et les systèmes de suivi des problèmes qui sont gérés par le concédant ou en son nom, dans le but de discuter des questions relatives à l'utilisation du logiciel.
      le donneur de licence dans le but de discuter et d'améliorer l'œuvre, mais
      mais excluant les communications qui sont marquées de manière visible ou autrement
      ou autrement désignée par écrit par le titulaire du droit d'auteur comme " ne constituant pas une contribution ".

      Le terme " contributeur " désigne le concédant et toute personne physique ou morale au nom de laquelle une contribution a été faite.
      personne physique ou morale au nom de laquelle une contribution a été reçue par le concédant et
      et qui est ensuite incorporée à l'œuvre.

   2. Octroi de la licence de droit d'auteur. Sous réserve des termes et conditions de la
      conditions de la présente licence, chaque contributeur vous accorde par la présente une licence perpétuelle, mondiale, non exclusive, gratuite, libre de redevance et irrévocable,
      perpétuelle, mondiale, non exclusive, gratuite, libre de droits et irrévocable pour
      licence de droit d'auteur pour reproduire, préparer des travaux dérivés,
      l'affichage public, l'exécution publique, l'octroi de sous-licences et la distribution de l'œuvre et des œuvres dérivées dans le monde entier.
      l'œuvre et les œuvres dérivées sous forme de source ou d'objet.

   3. Octroi d'une licence de brevet. Sous réserve des termes et conditions de la
      conditions de la présente licence, chaque contributeur vous accorde par les présentes une licence perpétuelle, mondiale, non exclusive, gratuite et assortie de redevances,
      perpétuelle, mondiale, non exclusive, gratuite, libre de redevance et irrévocable (à l'exception de ce qui est indiqué dans cette section).
      (à l'exception de ce qui est indiqué dans la présente section) une licence de brevet pour faire, faire faire,
      utiliser, offrir à la vente, vendre, importer et transférer de toute autre manière l'œuvre,
      où cette licence ne s'applique qu'aux revendications de brevet pouvant faire l'objet d'une licence par ce contributeur et qui sont nécessairement contrefaites.
      par ce Contributeur qui sont nécessairement violées par leur(s)
      contribution(s) seule(s) ou par la combinaison de leur(s) contribution(s)
      avec l'œuvre à laquelle cette ou ces contributions ont été soumises. Si vous
      engagez un litige en matière de brevets contre toute entité (y compris une
      d'une demande reconventionnelle ou d'une demande reconventionnelle dans un procès) alléguant que l'œuvre
      ou une contribution incorporée dans l'œuvre constitue une
      directe ou contributive, alors toutes les licences de brevet qui vous sont
      licence de brevet qui vous est accordée en vertu de la présente licence pour ce travail
      à compter de la date à laquelle ce litige est déposé.
      
 4. Redistribution. Vous pouvez reproduire et distribuer des copies de l
      œuvre ou de ses travaux dérivés sur n'importe quel support, avec ou sans
      modifications, et sous forme de Source ou d'Objet, à condition que Vous
      respectiez les conditions suivantes :

      (a) Vous devez donner à tout autre destinataire de l'œuvre ou des travaux dérivés une copie de ce document.
          (a) Vous devez remettre à tout autre destinataire de l'œuvre ou des travaux dérivés une copie de la présente licence ; et

      (b) Vous devez faire en sorte que tous les fichiers modifiés portent des avis bien visibles
          indiquant que vous avez modifié les fichiers ; et

      (c) Vous devez conserver, dans la forme Source de toute Œuvre Dérivée
          que vous distribuez, tous les avis de droit d'auteur, de brevet, de marque de commerce et d'attribution de la forme source de l'œuvre dérivée.
          d'attribution de la forme Source de l'œuvre,
          à l'exclusion des avis qui ne se rapportent pas à une partie quelconque des
          les œuvres dérivées ; et

      (d) Si l'œuvre comprend un fichier texte " NOTICE " dans le cadre de sa distribution, alors toutes les œuvres dérivées qui ont été distribuées sont considérées comme des œuvres originales.
          distribution, toutes les œuvres dérivées que vous distribuez doivent inclure une copie lisible de l'attribution.
          inclure une copie lisible des avis d'attribution contenus dans ce fichier
          d'attribution contenus dans ce fichier NOTICE, à l'exclusion des avis qui ne se
          ne se rapportent à aucune partie des Travaux Dérivés, à au moins un des endroits suivants
          l'un des endroits suivants : dans un fichier texte de NOTICE distribué
          distribué dans le cadre des travaux dérivés ; dans le formulaire ou la documentation
          documentation, si elle est fournie avec les Travaux Dérivés ; ou,
          dans un affichage généré par les Travaux Dérivés, si et
          où de tels avis de tiers apparaissent normalement. Le contenu
          Le contenu du fichier NOTICE est fourni à titre d'information uniquement et
          ne modifie pas la Licence. Vous pouvez ajouter vos propres avis d'attribution
          d'attribution à l'intérieur des œuvres dérivées que vous distribuez, à côté de
          ou comme un addendum au texte de la NOTICE de l'œuvre, à condition que
          que ces avis d'attribution supplémentaires ne puissent être interprétés
          comme une modification de la Licence.

      Vous pouvez ajouter votre propre déclaration de droits d'auteur à vos modifications et
      pouvez fournir des termes et conditions de licence supplémentaires ou différents
      pour l'utilisation, la reproduction ou la distribution de vos modifications, ou
      pour l'ensemble de ces Travaux Dérivés, à condition que votre utilisation,
      l'ensemble de ces travaux dérivés, à condition que l'utilisation, la reproduction et la distribution de l'œuvre soient conformes aux conditions énoncées dans la présente licence.
      les conditions énoncées dans la présente licence.

   5. Soumission des contributions. Sauf indication contraire explicite de votre part,
      toute contribution que vous soumettez intentionnellement au concédant pour l'inclure dans le travail
      l'œuvre par vous au concédant est soumise aux conditions de la présente
      la présente licence, sans aucune condition supplémentaire.
      Nonobstant ce qui précède, rien dans le présent document ne remplace ou ne modifie les conditions d'un contrat de licence distinct que vous avez conclu avec le concédant.
      les conditions de tout contrat de licence distinct que vous avez pu signer
      avec le Concédant concernant ces Contributions.

   6. Marques de commerce. La présente Licence n'accorde pas l'autorisation d'utiliser les noms de
      marques commerciales, marques de service ou noms de produits du Concédant,
      sauf si cela est nécessaire pour un usage raisonnable et habituel dans la description de
      l'origine de l'œuvre et la reproduction du contenu du fichier NOTICE.

   7. Exclusion de garantie. À moins que la loi applicable ne l'exige ou que
      applicable ou convenu par écrit, le concédant fournit l'œuvre (et chaque contributeur fournit ses contributions) en l'état.
      contributeur fournit ses contributions) sur une base " telle quelle ",
      SANS GARANTIES NI CONDITIONS DE QUELQUE NATURE QUE CE SOIT, qu'elles soient expresses ou
      explicite ou implicite, y compris, sans limitation, toute garantie ou condition
      garantie ou condition de TITRE, d'ABSENCE DE CONTREFAÇON, de QUALITÉ MARCHANDE ou d'ADAPTATION À UN
      USAGE PARTICULIER. Vous êtes seul responsable de la détermination de la
      l'opportunité d'utiliser ou de redistribuer l'œuvre et d'assumer les risques
      risques associés à l'exercice de vos permissions en vertu de la présente licence.

   8. Limitation de la responsabilité. En aucun cas et sous aucune théorie légale,
      que ce soit en matière de délit civil (y compris la négligence), de contrat ou autre,
      sauf si la loi applicable l'exige (comme les actes délibérés et de négligence grave) ou s'il en est convenu ainsi.
      négligence grave) ou convenu par écrit, un Contributeur ne pourra être
      responsable envers vous de tout dommage, y compris tout dommage direct, indirect, spécial,
      dommages directs, indirects, speciaux, accessoires ou consecutifs de toute nature
      résultant de la présente licence ou de l'utilisation ou de l'impossibilité d'utiliser le
      œuvre (y compris, mais sans s'y limiter, les dommages pour perte de clientèle,
      arrêt de travail, panne ou dysfonctionnement d'ordinateur, ou tout autre dommage ou
      tout autre dommage ou perte commerciale), même si le Contributeur a été
      a été informé de la possibilité de tels dommages.

 9. Acceptation de la garantie ou de la responsabilité supplémentaire. En redistribuant
      l'œuvre ou ses œuvres dérivées, vous pouvez choisir d'offrir,
      et faire payer l'acceptation de l'assistance, de la garantie, de l'indemnisation,
      de garantie, d'indemnisation ou d'autres obligations et/ou droits en matière de
      licence. Cependant, en acceptant de telles obligations, vous ne pouvez agir que
      en votre nom et sous votre seule responsabilité, et non pour le compte d'un
      pas pour le compte d'un autre Contributeur, et seulement si Vous acceptez d'indemniser,
      défendre et dégager de toute responsabilité chaque Contributeur pour toute responsabilité
      responsabilité encourue par ledit Contributeur, ou les réclamations formulées contre lui
      de votre acceptation d'une telle garantie ou responsabilité supplémentaire.

   FIN DES TERMES ET CONDITIONS
   Copyright [aaaa] [Groupe 12 - TP INF3055].

   Sous licence Apache License, Version 2.0 (la "Licence") ;
   vous ne pouvez utiliser ce fichier qu'en conformité avec la licence.
   Vous pouvez obtenir une copie de la licence à l'adresse

   À moins que la loi applicable ne l'exige ou qu'il n'en soit convenu autrement par écrit, le logiciel
   distribué sous la Licence est distribué sur une base "AS IS",
   SANS GARANTIES OU CONDITIONS DE QUELQUE NATURE QUE CE SOIT, explicites ou implicites.
   Voir la Licence pour connaître les termes spécifiques régissant les autorisations et les
   et les limitations de la Licence.


# **Tutoriel : Configurer des Playlists IPTV via l'Interface Web (HTTP Server)**  

**Objectif** : Ajouter des playlists M3U à votre application IPTV en utilisant l’interface web du serveur HTTP intégré.  

---

## **Étape 1 : Activer le Serveur HTTP**  
1. Sur votre TV, lancez l’application et **activez le serveur HTTP** en cliquant sur le bouton qui affiche l'adresse IP. 
2. Notez **l’adresse IP locale de la TV** (exemple : `192.168.1.64:8080`).  

---

## **Étape 2 : Accéder à l’Interface Web depuis un Smartphone/PC**  
1. Sur un autre appareil (téléphone/PC), ouvrez un navigateur.  
2. Entrez l’URL suivante :  
   ```
   http://[IP-de-la-TV]:8080/stalker  
   ```  
   *(Exemple : `http://192.168.1.64:8080/stalker`)*  
3. Une **page web avec un formulaire** s’affiche.  

---

## **Étape 3 : Préparer la Structure JSON pour les Playlists**  
Dans le formulaire, vous devez entrer un **JSON valide** pour importer vos playlists.  

### **Format Requis :**  
```json
[
  {
    "name": "List1",
    "host": "http://localhost:8080/",
    "username": "Chaines francaise",
    "password": "URL_M3U_ou_Lien_Direct",
    "type": "M3u"
  }
]
```
### **Exemple avec 2 Playlists :**  
```json
[
  {
    "name": "List1",
    "host": "http://localhost:8080/",
    "username": "France",
    "password": "https://exemple.com/france.m3u8",
    "type": "M3u"
  },
  {
    "name": "List2",
    "host": "http://localhost:8080/",
    "username": "UK",
    "password": "https://exemple.com/uk.m3u8",
    "type": "M3u"
  }
]
```
*(Remplacez les liens `password` par vos propres URLs M3U.)*  

---

## **Étape 4 : Soumettre le JSON via le Formulaire**  
1. **Copiez le JSON** ci-dessus.  
2. **Collez-le dans le champ du formulaire** sur `http://[IP-TV]:8080/stalker`.  
3. Cliquez sur **Submit (Envoyer)**.  

---

## **Étape 5 : Actualiser l’Application sur la TV**  
1. Retournez sur votre TV.  
2. **Quittez et rouvrez l’application IPTV** (ou allez dans *Accueil → Films → IPTV*).  
3. **Les playlists apparaîtront automatiquement !** ✅  

---

### **Problèmes Possibles & Solutions :**  
❌ **La playlist ne se charge pas ?**  
→ Vérifiez que le lien M3U est **accessible** (ouvrez-le dans un navigateur).  
→ Assurez-vous que la TV et le téléphone/PC sont **sur le même réseau**.  

❌ **Erreur JSON ?**  
→ Vérifiez les **guillemets** (`"` et non `‘`).  

🎉 **C’est fait ! Vous pouvez maintenant regarder vos chaînes IPTV.** 🚀
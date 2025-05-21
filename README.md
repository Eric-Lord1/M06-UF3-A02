# Captures dels end points

# 1. Afegiu un endpoint que cerqui per un camp de tipus String on feu servir regex. Afegiu el que calgui al servei, repositori, etc.

# 2. Què caracteritza una api reactiva com aquesta i què la fa diferent d’una api síncrona amb MVC com les treballades anteriorment?
Una API reactiva es treballa de manera asíncrona i no bloquejant, utilizatant fluxos de 	dades (Mono i Flux). Aquest tipus d’API està pensada per ser més eficient i escalable, 	sobre tot per aplicacions amb moltes peticions simultaneas.
Una de les característiques més importants es que la reactiva, com hem dit abans, és no 	bloquejant, i això significa que no bloqueja els fils, si no que funciona per esdeveniments. 
 
# 3. Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?
En aquest tipus de programació  Mono i flux són dos tipus que permeten treballar amb dades de manera asíncrona. Per entendre millor els explicarem separadament:

Mono representa una seqüència que pot emtre zero o un únic element. L’utilitzem quan sol volem rebre una única resposta, com per exemple obtenir un sol objecte d’una BBDD o el resultat d’una operació.
      
Flux representa una seqüencia que pot emetre entre zero i N elements. És útil quan volem treballar amb col·leccions de dades o amb fluxos continus, com per exemple una llista d’elements, esdeveniments o missatges.

Els dos són molt útils perquè permeten gestionar de manera eficient processos asíncrons i 	concurrents, sense bloquejar fils. Aiò fa que les aplicacions siguin més escalables, 	reactives i eficients.

# 4. Què és record? Un record utilitza getters i setters? Justifiqueu la resposta
Record és una classe inmutable, es fa servir per representar dades de forma concisa. No conté getters i setters perquè al ser dades encapsulades no es poden modificar, són 	inmutables. Però, si que hi ha una mena de getters que es que cada camp té un mètode públic 	amb el mateix nom que el camp per obtenir-ne el valor.

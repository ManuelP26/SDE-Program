# SDE-Program
SDE Program Project samen met Luke van Overbeeke

We maken een Abstract Factory van een auto fabriek, met de auto's Polo, golf en scirocco.
we maken het zo dat je kan kiezen welke auto je wilt, dus dat je kan kiezen uit deze 3 plus 3 verschillende kleuren.
De kleuren Blauw, Groen, Rood. 
We maken het ook dat je geen andere kleuren kan kiezen dus dat je 1 van die 3 anders geeft hij een fout dat je een andere kleur moet kiezen
omdat bijvoorbeeld de auto niet meer leverbaar is in die kleur.
We maken dus ook een Facade en een state Design pattern.

We hebben gewerkt in pair programming, en individueel. Als we iets wilde committen hebben we dat samen gedaan en direct onze merge conflicts uitgewerkt.

FACTORY 
Als creational pattern hadden wij een factory method gemaakt, om precies te zijn twee stuks. Namelijk voor de car en de color. Manuel heeft de color aangepakt
terwijl Luke de car factory heeft gemaakt. 

STATE
We hebben drie states aangemaakt, dat waren de ChooseCar, ChooseColor en Reveal State. Bij Car kan je de auto kiezen en hier begint ons programma ook.
Daarna gaan we naar de Color State waar je de kleur kan kiezen van de auto. Na het kiezen van de kleur gaan we naar de Reveal state waar de auto onthult wordt.

FACADE
Onze Facade maakt gebruik van onze 3 States die hierboven beschreven zijn. Het zorgt ervoor dat er steeds maar één wordt uitgevoerd en daarna naar de volgende gaat.
Voor een makkelijke interface.

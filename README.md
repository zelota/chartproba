chartproba
==============

A Chart.JS bar grafikon használata egy vaadinos projectben. POC.

A Chart.JS behúzva innen:  
https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.js

### Használat

<b>Környezet</b>: AdoptOpenJDK 8 (64 bit - hotspot)
<br/><b>Konténer</b>: Tomee Plume 7.1.0

A chart view-ra átmenve a gombok véletlenszerűen változtatják az adatokat.
Tud teljes konfigot is update-elni, de az nem lett kivezetve, csak kipróbálva.

### Ezek lettek használva ("függőségek")
* Vaadin 8.7.0
* Chart JS (https://www.chartjs.org/docs/latest/) (ver: 2.7.3)
* Lombok 1.18.4
* Gson 2.8.5

### Ami még hasznos lenne
* A ```canvas``` mértetezhetősége server oldalról.
* Több chart használata egy lapon - egyedi id.
* Csak a ```bar``` típusú lett kirpóbálva, más nem!
* És még stb.
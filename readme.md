#Skatteberegning
Skatten i Norge kan deles opp i 
- Skatt på alminnelig inntekt
- Trygdeavgift
- Trinnskatt
- Formueskatt

Vi skal kode beregningen av skatt basert på en persons inntekt og formue. Vi tar ikke hensyn til pensjon i denne oppgaven, samt andre fradrag som f.eks rentefradrag.

Kilde: https://www.smartepenger.no/94-nyhet/2687-slik-beregnes-skatten-din


##Oppgaver
- Skriv en test som skal finne riktig trygdeavgift til en person som tjener 300.000kr.
- Fullfør metoden calculateTrygdeavgift() slik at testen kjører grønt
- Skriv en test som skal finne riktig trinnskatt for en person som tjener 650.000kr
- Fullfør metoden calculateTrinnskatt() slik at testen kjører grønt
- Skriv en test som skal finne riktig formueskatt for en person som har en formue på 100.000kr
- Fullfør metoden calculateFormueskatt() slik at testen kjører grønt


##Regler

Trinnskatt og trygdeavgift beregnes direkte av lønn, pensjoner og trygd. Grunnlaget for beregning av skatt på alminnelige inntekt er etter alle fradrag (nettoinntekt). Grunnlaget for formuesskatten er av netto formue.
### Trygdeavgift

- Trygdeavgift har i 2019 en sats på 8,2 prosent. Det skal ikke betales trygdeavgift hvis inntekten er under 54.650 kroner

### Trinnskatt
- Trinnskatten regnes av personinntekt. Det er det samme grunnlaget som trygdeavgiften.

Klasser | Trinnene | Sats
--- | --- | --- |
1 | 174.500 | 1.9% 
2 | 245.650 | 4.2% 
3 | 617.500 | 13.20% 
4 | 964.800 | 16.20% 

Du betaler altså denne skatten innenfor hvert enkelt trinn. Har du en inntekt på 650.000 kroner betaler du 1,90 prosent og 4,20 prosent innenfor de to første trinnene. Satsen på 13,20 prosent betaler du fra 617.500 kroner til 650.000 kroner. Personer bosatt i Finnmark og Nord-Troms betaler bare 11,2 prosent ikke 13,2 prosent i 2019.

### Skatt av alminnelig inntekt

Alminnelig inntekt kan ses på som en nettoinntekt, det vil si etter at alle fradrag er gjort. Satsen er 22 prosent i 2019. Når denne skatten beregnes trekkes det først fra et «personfradrag». Dette fradraget ser du ikke skattemeldingen. Fradraget er på 56.550 kroner i 2019. Et annet hovedfradrag er minstefradraget. Dette er i 2019 på 45 prosent av lønnen. Det maksimale fradraget er 100.800 kroner i 2019. 

### Formueskatt

Formueskatten betales til staten og kommunen og beregnes ut ifra formuen til en person. Formueskatten beregnes for 2019 ut ifra følgende tabell:

Til kommunen:

Ugift | Ektefeller | Skatteprosent
--- | --- | --- |
0 - 1.500.000 | 0 - 3.000.000 | 0.0% 
1.500.000 og over | 3.000.000 og over | 0.70% 

Til staten:

Ugift | Ektefeller | Skatteprosent
--- | --- | --- |
0 - 1.500.000 | 0 - 3.000.000 | 0.0% 
1.500.000 og over | 3.000.000 og over | 0.15% 

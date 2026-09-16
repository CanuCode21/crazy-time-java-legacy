# Crazy Time - Legacy Console Edition (Java)

## 📌 Descrizione
Progetto sviluppato alle mie prime armi con la programmazione Java. Si tratta di un emulatore a riga di comando del celebre gioco "Crazy Time", che utilizza la console di NetBeans come interfaccia grafica e di testo per l'utente.

Questo progetto è stato realizzato con logica pura e in autonomia (con pochissimo ausilio dell'IA), concentrandomi sulla gestione delle probabilità, sui flussi condizionali e sulla simulazione dei minigiochi bonus.

## 🛠️ Caratteristiche Tecniche & Architettura
* **Linguaggio:** Java
* **Ambiente di sviluppo:** NetBeans
* **Interfaccia:** Console I/O (Scanner e stampe formattate)
* **Paradigma:** Programmazione procedurale / Monolitica (gestita in un'unica classe principale)
* **Meccaniche implementate:** Gestione delle puntate, estrazione casuale basata sulle percentuali reali e simulazione dei 4 minigiochi Bonus (Coin Flip, Pachinko, Cash Hunt e Crazy Time).

## ⚠️ Nota sul Codice (Legacy Status)
Trattandosi di uno dei miei primi progetti di programmazione, il codice riflette uno stile di sviluppo procedurale e non orientato agli oggetti (OOP). Contiene variabili globali e una struttura monolitica: è conservato in questo repository a scopo storico per tracciare il mio percorso di crescita.

## 🚀 Prossimi Sviluppi (v2 Refactoring)
Sto attualmente lavorando al refactoring completo del progetto per applicare i concetti avanzati di Object-Oriented Programming (OOP):
* Separazione delle responsabilità (Classe Menu, classi per ogni singolo Spicchio e gestione del Giocatore).
* Utilizzo del Polimorfismo e delle Interfacce.
* Pulizia dell'architettura per una futura transizione verso una vera interfaccia grafica o un'applicazione web in Spring Boot.

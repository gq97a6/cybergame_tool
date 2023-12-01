package org.acme

import org.acme.classes.Option

val availableOptions = mutableListOf(
    Option(
        "O1",
        "Analiza Ryzyka",
        "Identyfikacja zasobów informatycznych pod kątem zagrożeń i oszacowanie ryzyka dla wyboru zabezpieczeń"
    ),
    Option(
        "O2",
        "Cyberubezpieczenie",
        "Ubezpieczenie ryzyk cybernetycznych ograniczające skutki incydentów i pokrycie kosztów ekspertów"
    ),
    Option(
        "O3",
        "Szkolenia Uświadamiające dla Pracowników",
        "Budowanie świadomości bezpieczeństwa IT wśród pracowników poprzez różne formy szkoleń"
    ),
    Option(
        "O4",
        "Blokada Portów USB i Nośników Danych",
        "Zabezpieczenie przed wyciekiem danych przez konfigurację polityk GPO lub aplikacje cyberbezpieczeństwa"
    ),
    Option("O5", "Klasyfikacja Danych", "Przypisywanie informacji do kategorii i stosowanie odpowiednich zabezpieczeń"),
    Option(
        "O6",
        "Usługa Threat Intelligence",
        "Procesy identyfikacji i przetwarzania danych o zagrożeniach dla wsparcia świadomości sytuacyjnej"
    ),
    Option(
        "O7",
        "Usługa Wsparcia Zewnętrznego w Reagowaniu na Incydenty",
        "Specjalistyczne wsparcie w reagowaniu na incydenty komputerowe"
    ),
    Option(
        "O8",
        "Hardening Serwerów i Urządzeń Sieciowych",
        "Optymalizacja zabezpieczeń systemów operacyjnych i urządzeń poprzez konfigurację"
    ),
    Option(
        "O9",
        "Audyt Organizacyjno Procesowy",
        "Weryfikacja identyfikacji ryzyk i zagrożeń oraz adekwatności zabezpieczeń"
    ),
    Option(
        "O10",
        "Separacja Zasobów Sieciowych",
        "Segmentacja sieci na podsieci i odizolowanie ruchu sieciowego dla ochrony przed zagrożeniami"
    ),
    Option(
        "O11",
        "Zewnętrzna Usługa Testów Penetracyjnych",
        "Aktywne testy bezpieczeństwa infrastruktury i raportowanie wyników"
    ),
    Option("O12", "Zespół SOC (Security Operations Center)", "Monitorowanie i detekcja zdarzeń cyberbezpieczeństwa"),
    Option(
        "O13",
        "Zespół CERT (Computer Emergency Response Team)",
        "Zarządzanie incydentami i inne usługi związane z cyberbezpieczeństwem"
    ),
    Option(
        "O14",
        "Zarządzanie konfiguracją",
        "Projektowanie, wdrożenie i utrzymanie bezpiecznej konfiguracji systemów informatycznych"
    ),
    Option(
        "O15",
        "Proces Zarządzania Dostępem",
        "Nadzorowanie procesu przyznawania, modyfikacji i odbierania uprawnień użytkownikom"
    ),
    Option(
        "O16",
        "Logowanie zdarzeń bezpieczeństwa",
        "Rejestracja i analiza logów zdarzeń dla identyfikacji ataków na infrastrukturę"
    ),
    Option(
        "O17",
        "Proces Rozwoju Bezpiecznego Oprogramowania",
        "Metodyki bezpiecznego rozwoju oprogramowania od projektowania do utrzymania"
    ),
    Option(
        "P1",
        "Procedury Zarządzania Bezpieczeństwem Outsourcingu",
        "Regulacje relacji z dostawcami zewnętrznymi dla zabezpieczenia dostarczanych systemów i usług"
    ),
    Option(
        "P2",
        "Zarządzanie Kadrą Cyberbezpieczeństwa",
        "Procedury kadrowe dla selekcji, określenia ról i zapewnienia bezpieczeństwa IT"
    ),
    Option("P3", "Procedura Zarządzania Ryzykiem", "Koordynacja nadzoru nad ryzykiem dla wdrożenia zabezpieczeń"),
    Option(
        "P4",
        "Procedura Zarządzania Ciągłością Działania",
        "Utrzymanie ciągłości biznesu i dostępności zasobów informatycznych"
    ),
    Option("P5", "Procedura Zarządzania Prawami Dostępu", "Zasady procesu zarządzania dostępem"),
    Option(
        "P6",
        "Procedura Reagowania na Incydenty",
        "Opis działań w przypadku incydentu, od identyfikacji po analizę wniosków"
    ),
    Option(
        "P7",
        "Procedura Zarządzanie Słabościami Systemowymi",
        "Proces zarządzania podatnościami od identyfikacji do eliminacji"
    ),
    Option(
        "P8",
        "Procedura Zarządzania Konfiguracją",
        "Wymagania i ustawienia bazowe dla konfiguracji systemów i urządzeń"
    ),
    Option(
        "P9",
        "Procedura Wytwarzania Bezpiecznego Oprogramowania",
        "Reguły i zasady dla bezpiecznego procesu rozwoju oprogramowania"
    ),
    Option(
        "P10",
        "Polityka Bezpieczeństwa",
        "Zbiór zasad i metod dla cyberbezpieczeństwa i ochrony przed zagrożeniami"
    ),
    Option(
        "P11",
        "Procedura Zarządzania Aktywami",
        "Zasady bezpieczeństwa dla inwentaryzacji, klasyfikacji i utrzymania zasobów technologicznych"
    ),
    Option(
        "P12",
        "Procedura Bezpieczeństwa Fizycznego i Środowiskowego",
        "Standardy dla ochrony infrastruktury IT przed czynnikami fizycznymi i środowiskowymi"
    ),
    Option(
        "T1",
        "System Zapasowy Łącza Internetowego",
        "Zapewnienie nieprzerwanego dostępu do internetu przez zapasowe łącze od innego dostawcy"
    ),
    Option(
        "T2",
        "System Antyspamowy",
        "Filtrowanie i blokowanie podejrzanej poczty dla ochrony przed spamem i złośliwym oprogramowaniem"
    ),
    Option(
        "T3",
        "System Szyfrowania Danych na Serwerach",
        "Ochrona danych przez szyfrowanie, nawet w przypadku kradzieży sprzętu"
    ),
    Option(
        "T4",
        "System Obsługi Uwierzytelnienia Wieloskładnikowego (MFA)",
        "Zwiększenie bezpieczeństwa przez wykorzystanie kilku metod uwierzytelniania"
    ),
    Option(
        "T5",
        "System Szyfrowania Ruchu Sieciowego",
        "Zapobieganie przechwyceniu i modyfikacji danych przez szyfrowanie transmisji"
    ),
    Option(
        "T6",
        "System Network Access Control",
        "Kontrola dostępu do sieci i ochrona przed podłączeniem nieautoryzowanych urządzeń"
    ),
    Option("T7", "Oprogramowanie Antywirusowe", "Ochrona przed zagrożeniami jak phishing, ataki webowe i DDoS"),
    Option(
        "T8",
        "System Szyfrowania Danych na Desktopach",
        "Zapobieganie nieautoryzowanemu dostępowi i wyciekom danych z komputerów"
    ),
    Option(
        "T9",
        "System antyDDoS",
        "Ochrona przed atakami typu DDoS przez analizę ruchu i przekierowanie niepożądanych pakietów"
    ),
    Option(
        "T10",
        "TSystem Inwentaryzacji Zasobów IT",
        "Informacje o zasobach teleinformatycznych w firmie i ich aktualny status"
    ),
    Option(
        "T11",
        "Firewall Sieciowy",
        "Filtrowanie ruchu i ochrona przed nieautoryzowanym dostępem oraz złośliwym oprogramowaniem"
    ),
    Option(
        "T12",
        "Web Application Firewall (WAF)",
        "Kontrola ruchu aplikacji webowych i ochrona przed niebezpiecznymi treściami"
    ),
    Option(
        "T13",
        "System Blokowania i Filtrowania Stron WWW",
        "Zapobieganie dostępu do szkodliwych stron i podniesienie produktywności pracy"
    ),
    Option(
        "T14",
        "System Wykrywania i Zapobiegania Atakom Sieciowym (IDS/IPS)",
        "Detekcja i prewencja wobec prób kompromitacji systemu teleinformatycznego"
    ),
    Option(
        "T15",
        "System Zarządzania Dostępem i Tożsamością (IAM/PAM)",
        "Rejestracja, udzielanie i blokowanie dostępu oraz zarządzanie kontami uprzywilejowanymi"
    ),
    Option(
        "T16",
        "System Archiwizacji Danych (backup)",
        "Tworzenie kopii bezpieczeństwa danych dla ich ochrony w przypadku ataku lub utraty"
    ),
    Option(
        "T17",
        "System Zarządzania Podatnościami (VM)",
        "Zarządzanie podatnościami systemowymi i wprowadzanie poprawek"
    ),
    Option(
        "T18",
        "System Zapobiegania Wyciekowi Danych (DLP)",
        "Monitorowanie, kontrola i zapobieganie nieautoryzowanym działaniom prowadzącym do wycieku danych"
    ),
    Option(
        "T19",
        "System Zapasowy (redundancja)",
        "Podwojenie kluczowych elementów systemu dla ograniczenia skutków awarii czy ataków"
    ),
    Option(
        "T20",
        "System SIEM Security Information and Events Management",
        "Korelacja logów i wykrywanie zdarzeń naruszających bezpieczeństwo w czasie rzeczywistym"
    ),
    Option(
        "T21",
        "System ochrony stacji roboczych (End Point Security)",
        "Zestaw funkcjonalności ochrony urządzeń końcowych"
    ),
    Option("T22", "Email security gateway", "Ochrona serwera pocztowego przed zawartością złośliwą w korespondencji"),
    Option(
        "T23",
        "Email sandbox",
        "Detonacja załączników poczty w bezpiecznym środowisku dla wykrycia złośliwego oprogramowania"
    ),
    Option(
        "T24",
        "Software whitelisting",
        "Definiowanie listy zatwierdzonego oprogramowania dozwolonego do uruchomienia"
    ),
    Option(
        "T25",
        "System Monitorowania Sieci",
        "Monitorowanie sieci w poszukiwaniu problemów i informowanie administratorów"
    ),
    Option("T26", "Narzędzia do analizy kodu", "Analiza kodu w celu wykrycia potencjalnych luk bezpieczeństwa"),
    Option(
        "T27",
        "Systemy bezpieczeństwa środowiskowego",
        "Ochrona przed czynnikami środowiskowymi i fizycznymi, w tym kontrola dostępu i systemy antywłamaniowe"
    ),
    Option(
        "T28",
        "Systemy bezpieczeństwa fizycznego",
        "Ochrona przed nieautoryzowanym dostępem i czynnikami fizycznymi"
    ),
    Option(
        "T29",
        "System Zarządzania Konfiguracją (SCM)",
        "Zarządzanie konfiguracją zgodnie z wymaganiami biznesowymi i regulacjami"
    ),
    Option(
        "T30",
        "System do zarządzania ryzykiem",
        "Repozytorium informacji o ryzyku i analiza na podstawie standardów"
    ),
    Option(
        "T31",
        "System zarządzania urządzeniami mobilnymi",
        "Monitorowanie i zarządzanie politykami bezpieczeństwa na urządzeniach mobilnych"
    ),
    Option("T32", "Advanced Threat Protection System", "Wykrywanie, analiza i zapobieganie zaawansowanym atakom")
)
import classes.Option

val availableOptions = mutableListOf(
    Option(
        "O1",
        44000,
        "Analiza Ryzyka",
        "Polega na identyfikacji zasobów informatycznych (tj. Sprzęt, oprogramowanie, dane), które mogą być zagrożone różnego rodzaju atakami (np.. malware, phishing, DDos), oraz oszacowaniu prawdopodobieństwa i skutków takiego zdarzenia. Podstawa do wyboru i wdrożenia zabezpieczeń."
    ),
    Option(
        "O2",
        25000,
        "Cyberubezpieczenie",
        "Ubezpieczenie ryzyk cybernetycznych pozwala ograniczyć dotkliwe i daleko sięgające skutki incydentu np. naruszenia bezpieczeństwa danych czy niedostępności systemów. Zapewnia również pokrycie kosztów konsultantów – ekspertów ds. informatyki śledczej, odzyskiwania danych, prawników oraz konsultantów PR – specjalistów, którzy doradzą i opracują odpowiedni plan działania w sytuacji kryzysowej."
    ),
    Option(
        "O3",
        36000,
        "Szkolenia Uświadamiające dla Pracowników",
        "Działania polegające na budowanie świadomości bezpieczeństwa IT wśród pracowników obejmujące m.in. wiedzę o zagrożeniach, sposobach ich zapobiegania oraz sposób postępowania w przypadku wykrycia incydentu oraz podczas sytuacji kryzysowej. Szkolenia można realizować wykorzystując różne techniki np. warsztaty, e-learning, gry symulacyjne."
    ),
    Option(
        "O4",
        40000,
        "Blokada Portów USB i Nośników Danych",
        "Zabezpieczenie zapobiegające wyciekowi danych realizowane za pomocą konfiguracji odpowiednich polityk GPO lub dedykowanych aplikacji cyberbezpieczeństwa (np. DLP). Zapewnia blokadę portów USB oraz eksploatacji zewnętrznych nośników danych (np. napęd CD, DVD). Może dotyczyć wszystkich lub wybranych stacji roboczych."
    ),
    Option(
        "O5",
        53000,
        "Klasyfikacja Danych",
        "Działania polegające na przypisaniu informacji kategorii, na podstawie której stosuje się odpowiednie zabezpieczenia np. pod względem poufności"
    ),
    Option(
        "O6",
        78000,
        "Usługa Threat Intelligence",
        "Stanowi zespół procesów identyfikowania, gromadzenia i przetwarzania danych w celu uzyskania informacji wspierającej świadomość sytuacyjną dot. zagrożeń cyberbezpieczeństwa. Taka usługa może być realizowana w ramach przeglądania dostępnych źródeł informacji o zagrożeniach, budowania infrastruktury automatyzującej proces gromadzenia danych o zagrożeniach oraz dzielenia się informacjami z zainteresowanymi stronami. Threat Intelligence koncentruje się na dostarczaniu informacji w sposób usystematyzowany i zunifikowany, opierając się np. o platformy CTI (takie jak MISP)."
    ),
    Option(
        "O7",
        85000,
        "Usługa Wsparcia Zewnętrznego w Reagowaniu na Incydenty",
        "Usługa wykonywana przez specjalistyczne zespoły reagowania na incydenty komputerowe. Zakres tego typu wsparcia jest określany w umowach pomiędzy organizacją a podwykonawcą (outsourcingowanym CSIRT-em lub SOC-iem). Najczęściej spotykanym wsparciem oferowanym na rynku jest usługa monitoringu i detekcji zdarzeń, obsługa zaawansowanych incydentów cyberbezpieczństwa oraz dostarczanie tzw. feedów threat intelligence, czyli ustrukturyzowanych informacji o bieżących zagrożeniach dla klienta. Zewnętrzne wsparcie w reagowaniu na incydenty może także oznaczać wykonywanie zadań typu analiza złośliwego oprogramowania czy analiza powłamaniowa."
    ),
    Option(
        "O8",
        88000,
        "Hardening Serwerów i Urządzeń Sieciowych",
        "Utwardzanie systemów obejmuje zespół kompleksowych działań zmierzających do optymalizacji działania i poprawy stanu zabezpieczeń systemów operacyjnych serwerów oraz urządzeń końcowych. Polega na optymalnej konfiguracji systemów operacyjnych i urządzeń poprzez wyłączanie nadmiarowych, potencjalnie niebezpiecznych usług oraz włączanie dedykowanych i rekomendowanych zabezpieczeń. Podejmowane w ramach utwardzania czynności skutecznie zabezpieczają przed włamaniami czy wpływem złośliwego oprogramowania."
    ),
    Option(
        "O9",
        100000,
        "Audyt Organizacyjno Procesowy",
        "Audyt wewnętrzny pomaga organizacji w osiąganiu jej celów poprzez systematyczne i metodyczne podejście do oceny i doskonalenia skuteczności procesów zarządzania ryzykiem, kontroli i zarządzania organizacją. Rolą audytu w cyberbezpieczeństwie jest weryfikacja czy organizacja zidentyfikowała ryzyka i zagrożenia oraz czy zaprojektowała, wdrożyła i utrzymuje adekwatne zabezpieczenia."
    ),
    Option(
        "O10",
        172000,
        "Separacja Zasobów Sieciowych",
        "Działania polegające na podziale sieci korporacyjnej na mniejsze podsieci (segmentacja) dedykowane dla poszczególnych grup użytkowników np. księgowość, zarząd, produkcja itd. oraz odizolowaniu (separacja) ruchu sieciowego do/z tych segmentów. Zapewniają ochronę przed zagrożeniami złośliwego oprogramowania, zagrożeniom wewnętrznym, naruszenia bezpieczeństwa danych oraz odmowy usługi. Skutecznie minimalizują skutki rozprzestrzeniania się incydentu."
    ),
    Option(
        "O11",
        174000,
        "Zewnętrzna Usługa Testów Penetracyjnych",
        "Usługa polegająca na wykonywaniu aktywnych testów cyberbezpieczeństwa infrastruktury organizacji. Celem testów penetracyjnych jestkontrolowany atak na dany system i przełamanie jego zabezpieczeń. Przykładem takiego testu jest próba wykorzystania podatności strony internetowej dostarczenia złośliwej próbki poprzez wiadomość elektroniczną lub fizyczne wejście do chronionego budynku. Testy penetracyjne kończą się szczegółowym raportem działań dla organizacji zlecającej."
    ),
    Option(
        "O12",
        455000,
        "Zespół SOC (Security Operations Center)",
        "Jest odpowiedzialny za monitorowanie i detekcję zdarzeń cyberbezpieczeństwa. Zabezpieczenie jest rozumiane jako zespół procesów i procedur, określony model osobowy, stosowane narzędzia i technologie oraz umiejętności pracowników."
    ),
    Option(
        "O13",
        530000,
        "Zespół CERT (Computer Emergency Response Team)",
        "Odpowiedzialny za zarządzanie incydentami cyberbezpieczeństwa (oraz inne właściwe usługi, np. analizy złośliwego oprogramowania lub rozwijanie świadomości sytuacyjnej). Rozumiany jako zespół procesów i procedur, określony model osobowy, stosowane narzędzia i technologie oraz umiejętności pracowników."
    ),
    Option(
        "O14",
        72000,
        "Zarządzanie konfiguracją",
        "Proces skoncentrowany na zaprojektowaniu, wdrożeniu I utrzymaniu bezpiecznej konfiguracji systemów informatycznych opartej na wymaganiach biznesowych oraz regulacji prawnych."
    ),
    Option(
        "O15",
        72000,
        "Proces Zarządzania Dostępem",
        "Zarządzanie dostępem jest nieodłącznym elementem korzystania z zasobów IT (systemów, danych) i stanowi jeden z fundamentów cyberbezpieczeństwa. Przeznaczeniem kontroli dostępu jest zarządzany i nadzorowany proces przyznawania, modyfikacji i odbierania uprawnień użytkownikom do zasobów IT, pomieszczeń itp. Efektywny proces zarządzania uprawnieniami minimalizuje ryzyko nieautoryzowanego dostępu, ataku na aplikacje webowe oraz wycieku danych"
    ),
    Option(
        "O16",
        22000,
        "Logowanie zdarzeń bezpieczeństwa",
        "Proces rejestracji I analizowania logów zdarzeń w celu identyfikacji symptomów wskazujących na atak na infrastrukturę informatyczną organizacji."
    ),
    Option(
        "O17",
        22000,
        "Proces Rozwoju Bezpiecznego Oprogramowania",
        "Bezpieczeństwo aplikacji jest bardzo szerokim zagadnieniem obejmującym wiele aspektów od wczesnego projektowania i modelowania zagrożeń po utrzymanie i ochronę aplikacji w środowisku produkcyjnym. Metodyki cyklu bezpiecznego rozwoju oprogramowania (Secure Software Development Cycle) zawierają wiele elementów wspólnych, takich jak specyfikacja wymagań, ocena i modelowanie zagrożeń czy weryfikacja i testowanie."
    ),
    Option(
        "P1",
        25000,
        "Procedury Zarządzania Bezpieczeństwem Outsourcingu",
        "Bezpieczeństwo dostarczonych systemów, aplikacji usług w dużej mierze zależy od uwzględnienia wymaganych zabezpieczeń na etapie ich wytwarzania lub dostarczania. Ponadto dostawcy zewnętrzni są często wykorzystywanym wektorem ataku ze względu na posiadany przez nich uprzywilejowany dostęp do naszych systemów w celach utrzymaniowych lub serwisowych. Procedury regulujące relacje z dostawcami obejmują m.in. kontrolę i monitoring dostępu, zdefiniowane wymagania bezpieczeństwa, poziomy SLA, monitorowanie usług, zarządzanie zmianami, komunikacja w trakcie incydentu."
    ),
    Option(
        "P2",
        29000,
        "Zarządzanie Kadrą Cyberbezpieczeństwa",
        "Jednym z najważniejszych ogniw bezpieczeństwa IT jest człowiek, jego kompetencje, nastawienie, motywacja oraz świadomość odpowiedzialności za cyberbezpieczeństwo. Odpowiednio zdefiniowane procedury kadrowe pomagają wyselekcjonować odpowiednich kandydatów do pracy, określić role i odpowiedzialności w trakcie zatrudnienia oraz zapewnić bezpieczeństwo IT po zakończeniu zatrudnienia."
    ),
    Option(
        "P3",
        31000,
        "Procedura Zarządzania Ryzykiem",
        "Skoordynowane działania dotyczące kierowania i nadzoru nad cyberbezpieczeństwem w odniesieniu do ryzyka. Podstawa do wdrożenia zabezpieczeń w odniesieniu do zidentyfikowanych zagrożeń oraz prawdopodobieństwa i skutków ich wystąpienia."
    ),
    Option(
        "P4",
        38000,
        "Procedura Zarządzania Ciągłością Działania",
        "Zbiór działań mających na celu utrzymanie ciągłości biznesu na założony poziomie. W cyberbezpieczeństwie dotyczy dostępności zasobów informatycznych wspierających realizację krytycznych procesów biznesowych (infrastruktura, sieć, sprzęt, systemy, aplikacji, dane). Obejmuje analizę wpływu zagrożeń na biznes, zdefiniowanie i wdrożenie zabezpieczeń zarówno prewencyjnych jak i reakcyjnych odpowiednich do zidentyfikowanych zagrożeń, testowanie zdefiniowanych scenariuszy, procedury działania i komunikacji w trakcie sytuacji kryzysowej."
    ),
    Option("P5", 71000, "Procedura Zarządzania Prawami Dostępu", "Zbiór zasad opisujący proces zarządzania dostępem."),
    Option(
        "P6",
        30000,
        "Procedura Reagowania na Incydenty",
        "Opisują role i odpowiedzialności oraz działania w przypadku wystąpienia incydentu obejmujące jego identyfikację i zgłoszenie, gromadzenie i analizę tropów i dowodów, czynności naprawcze oraz wyciągania i analizę wniosków po zdarzeniu."
    ),
    Option(
        "P7",
        34000,
        "Procedura Zarządzanie Słabościami Systemowymi",
        "Każda technologia ma swoje słabe punkty. Właściwie zaprojektowany i wdrożony proces zarządzania podatnościami skutecznie chroni przed większością zagrożeń. Obejmuje on identyfikację, klasyfikację., priorytetyzację oraz przypisanie odpowiedzialności za zabezpieczanie lub eliminację podatności."
    ),
    Option(
        "P8",
        76000,
        "Procedura Zarządzania Konfiguracją",
        "Ustanawia wymagania I bazowe ustawienia konfiguracji dla systemów I urządzeń teleinformatycznych."
    ),
    Option(
        "P9",
        85000,
        "Procedura Wytwarzania Bezpiecznego Oprogramowania",
        "Zbiór reguł i zasad określających w jaki sposób powinien przebiegać proces rozwoju oprogramowania, aby był on zgodny z wymaganiami bezpieczeństwa."
    ),
    Option(
        "P10",
        94000,
        "Polityka Bezpieczeństwa",
        "Ogół zasad, metod i narzędzi do zapewnienia cyberbezpieczeństwa. Określają cel i zakres oraz regulują poszczególne domeny cyberbezpieczeństwa, takie jak bezpieczeństwo dostępu, sieci, danych, systemów IT, aby skutecznie chronić organizację przed zidentyfikowanymi zagrożeniami cyberbezpieczeństwa adekwatnie do oszacowanego ryzyka. W bezpieczeństwie IT najczęściej rozpatrywane w aspektach utraty poufności, integralności i dostępności danych."
    ),
    Option(
        "P11",
        29000,
        "Procedura Zarządzania Aktywami",
        "Definiuje zasady bezpieczeństwa zasobów technologicznych obejmując ich inwentaryzację, klasyfikację, użycie, utrzymanie i zwrot."
    ),
    Option(
        "P12",
        25000,
        "Procedura Bezpieczeństwa Fizycznego i Środowiskowego",
        "Zbiór zasad i standardów ustanowionych w celu ochrony infrastruktury informatycznej przed nieautoryzowanym bezpieczeństwem fizycznym oraz przed uszkodzeniami i awariami w wyniku działania czynników fizycznych i środowiskowych takich jak pożar czy zalanie."
    ),
    Option(
        "T1",
        30000,
        "System Zapasowy Łącza Internetowego",
        "Działanie większości systemów IT opiera się na usługach internetowych. Zapasowe łącze internetowe zapewni stabilny i nieprzerwany dostęp do internetu w przypadku ataku typu odmowa usługi. Powinno ono pochodzić od innego dostawcy. Jeżeli na przykład korzystamy ze stałego łącza, można skorzystać z oferty konkurenta lub wykupić pakiet internetu mobilnego."
    ),
    Option(
        "T2",
        34000,
        "System Antyspamowy",
        "Pozwala na zminimalizowanie spamu pochodzącego z podejrzanych źródeł. Wykorzystując techniki filtrowania i blokowaniu podejrzanej poczty chroni przed otrzymaniem korespondencji ze złośliwym oprogramowaniem, phishingiem oraz odmową usługi."
    ),
    Option(
        "T3",
        76000,
        "System Szyfrowania Danych na Serwerach",
        "Jednym z najlepszych sposobów na zapobieganie nieuprawnionemu dostępowi do danych przez osoby nieupoważnione jest ich szyfrowanie. I to nawet wtedy, gdy dojdzie do kradzieży dysków twardych lub całego serwera. Pomaga też ograniczyć skutki udanego ataku nakierowanego na kradzież danych."
    ),
    Option(
        "T4",
        85000,
        "System Obsługi Uwierzytelnienia Wieloskładnikowego (MFA)",
        "Uwierzytelnianie jest techniką potwierdzania tożsamości. Wyróżnia się czynników uwierzytelnienia, coś co wiesz (np. hasło, kod), coś co masz (np. karta, token) , coś czym jesteś (techniki biometryczne). W celu zwiększenia poziomu bezpieczeństwa, MFA (Multi-Factor Aunthentication) wykorzystuje kilka metod uwierzytelniania np. użycie tokenu sprzętowego wymagającego podania hasła lub potwierdzenia odciskiem palca."
    ),
    Option(
        "T5",
        94000,
        "System Szyfrowania Ruchu Sieciowego",
        "W celu zapewnienia bezpiecznej komunikacji i wymiany informacji stosuje się szyfrowanie ruchu sieciowego. Dzięki temu można zapobiec podsłuchaniu i przechwyceniu transmisji, wyciekowi i modyfikacji danych"
    ),
    Option(
        "T6",
        101000,
        "System Network Access Control",
        "Usługa polegająca na określeniu dedykowanych polityk stanowiących o zakresie dostępu do sieci. W praktyce, technologia ta ma na celu ochronę organizacji przed podłączaniem się do sieci nieznanych urządzeń, nie będących na tzw. białej liście (z ang. whitelist). NAC umożliwia jednolitą kontrolę tego typu oraz posiada mechanizmy blokowania i alarmowania o anomaliach."
    ),
    Option(
        "T7",
        114000,
        "Oprogramowanie Antywirusowe",
        "Program komputerowy, którego pierwotnym przeznaczeniem było wykrywanie, zwalczanie i usuwanie wirusów komputerowych. Obecnie najczęściej jest to pakiet programów chroniących także przed wieloma innymi zagrożeniami jak phishing, ataki webowe, a także ataki DDoS."
    ),
    Option(
        "T8",
        115000,
        "System Szyfrowania Danych na Desktopach",
        "Szyfrowanie danych na desktopach zapobiega nieautoryzowanemu dostępowi, kradzieży i wyciekowi danych z komputera."
    ),
    Option(
        "T9",
        115000,
        "System antyDDoS",
        "Atak DDoS (Distributed Denial Of Service) ma na celu spowodowanie niedostępności serwera, usługi lub infrastruktury. Ochrona AntyDDoS może łączyć różne techniki umożliwiające m.in., szybką analizę w czasie rzeczywistym wszystkich pakietów, przekierowanie ruchu przychodzącego do Twojego serwera czy oddzielenie niepożądanych elementów ruchu od pozostałych w celu przepuszczenia pożądanego ruchu."
    ),
    Option(
        "T10",
        128000,
        "TSystem Inwentaryzacji Zasobów IT",
        "Baza, która umożliwia uzyskanie informacji o dostępnych zasobach teleinformatycznych w firmie. Oznacza to dostęp do wiedzy o typie używanego sprzętu (stacje robocze, urządzenia brzegowe, serwery), ich adresacji IP, typowej konfiguracji oraz oprogramowaniu. Informacje w zaawansowanych systemach tego typu są aktualizowane w czasie rzeczywistym oraz umożliwiają sprawdzenie usług oraz procesów powiązanych z danym urządzeniem."
    ),
    Option(
        "T11",
        138000,
        "Firewall Sieciowy",
        "Zapewnia filtrowanie ruchu do/z sieci firmowej, a także pomiędzy jej segmentami. Zabezpiecza przed nieuprawnionym dostępem oraz stanowi element ochrony przed złośliwym oprogramowaniem i odmową usługi."
    ),
    Option(
        "T12",
        138000,
        "Web Application Firewall (WAF)",
        "Narzędzie dedykowane do ochrony aplikacji webowych. Pozwala kontrolować ruch od i do naszej aplikacji, wykorzystując przy tym wcześniej przygotowane reguły, model negatywny (blacklist) – polegający na tworzeniu listy treści niebezpiecznych, które zostaną zablokowane, zmienione lub odnotowane w logach, zależnie od naszej konfiguracji; model pozytywny (whitelist) – polegający na stworzeniu listy zaakceptowanych treści, które zostaną przepuszczone, a cała reszta zostanie jw. zablokowana, zmodyfikowana lub odnotowana w logach WAF."
    ),
    Option(
        "T13",
        150000,
        "System Blokowania i Filtrowania Stron WWW - Web Filtering",
        "Założeniem web filtering jest zapobieganie dostępowi do witryn z niewłaściwą lub szkodliwą treścią albo stron mogący mieć negatywny wpływ na produktywność pracy. Jest to osiągane za pomocą filtrowania konkretnych adresów URL lub predefiniowanych kategorii zawierających strony zawierające nielegalną treść, pornografię, strony naruszające własność intelektualną lub witryny mogące oddziaływać na firmową infrastrukturę IT."
    ),
    Option(
        "T14",
        165000,
        "System Wykrywania i Zapobiegania Atakom Sieciowym (IDS/IPS)",
        "System wykrywania (detekcji) i zapobiegania (prewencji) w zakresie prób kompromitacji systemu teleinformatycznego (np. włamanie, przejęcie kontroli, wyciek danych). Systemy klasy IDS/IPS mogą wykorzystywać analizę heurystyczną oraz/lub analizę sygnaturową. W zakresie urządzeń stosowane są sondy, bazy danych i analizatory logów. Systemy (sieciowe i hostowe) wykrywają zdarzenia na bazie reguł logicznych."
    ),
    Option(
        "T15",
        178000,
        "System Zarządzania Dostępem i Tożsamością (IAM/PAM)",
        "IAM (Identity and Access management)– system zarządzania tożsamością i dostępem jest systemem teleinformatycznym przetwarzającym informacje o tożsamości użytkowników i wykorzystywanym do rejestracji, udzielania oraz blokowania dostępu. PAM (Priviliged Access management) – system zarządzania kontami uprzywilejowanymi pomaga w zarządzaniu, monitoringu i nadzorze nad kontami posiadającymi wysokie uprawnienia lub dostęp do wrażliwych danych lub krytycznych systemów."
    ),
    Option(
        "T16",
        178000,
        "System Archiwizacji Danych (backup)",
        "Tworzenie kopii bezpieczeństwa danych to jedne z najlepszych sposób na zapewnienie ich dostępności na wypadek ich utraty w wyniku ataku lub celowego bądź niezamierzonego działania pracowników."
    ),
    Option(
        "T17",
        203000,
        "System Zarządzania Podatnościami (VM)",
        "System pozwalający w sposób zaplanowany zarządzać konfiguracją aplikacji skanującej infrastrukturę, wykrywać podatności w infrastrukturze organizacji, oceniać krytyczność tych podatności oraz określać priorytet wprowadzania poprawek do środowiska produkcyjnego. System zarządzania podatnościami wymaga określonych procedur współpracy pomiędzy osobami odpowiedzialnymi za przeprowadzanie skanów, konfigurację skanerów i wprowadzania poprawek systemowych."
    ),
    Option(
        "T18",
        203000,
        "System Zapobiegania Wyciekowi Danych (DLP)",
        "Zbiór narzędzi i procesów umożliwiających monitorowanie i kontrolę działań wykonywanych na urządzeniach końcowych, przepływu danych w i z sieci korporacyjnej oraz przetwarzanie danych i wykrywanie nieautoryzowanych działań. DLP klasyfikuje wrażliwe dane, identyfikuje naruszenie polityk i podejmuje proaktywne działania (alarmowanie, blokowanie/kwarantanna, szyfrowanie) w celu zapobiegania przed ujawnieniem/wyciekiem wrażliwych danych, zarówno złośliwym jak i przypadkowym."
    ),
    Option(
        "T19",
        305000,
        "System Zapasowy (redundancja)",
        "Skuteczną metodą ograniczenia skutków awarii, złośliwego oprogramowania lub ataków powodujących odmowę usługi jest zastosowanie redundancji, czyli podwojenie kluczowych elementów systemu - tak, aby w razie niedostępności jednego z nich element rezerwowy natychmiast przejął jego rolę bez zatrzymywania procesu produkcyjnego."
    ),
    Option(
        "T20",
        460000,
        "System SIEM Security Information and Events Management",
        "System korelujący logi z infrastruktury sieciowej klienta, umożliwiający wykrywanie zdarzeń o charakterze naruszenia bezpieczeństw. Wykrywanie zdarzeń odbywa się w czasie rzeczywistym, na zasadzie działania reguł korelacyjnych. Potencjalne zdarzenia wraz z przypisanymi parametrami są wyświetlane na dashboardach. SIEM jest głównym narzędziem wykorzystywanym w Security Operations Center. Umożliwia detekcję, obsługę i analizę zdarzeń."
    ),
    Option(
        "T21",
        88000,
        "System ochrony stacji roboczych (End Point Security)",
        "Urządzenia końcowe (tj. stacje robocze lub urządzenia mobilne) wykorzystywane jako punkt dostępu do sieci korporacyjnej są częstym celem ataku. Systemy ochrony stacji roboczych zazwyczaj stanowi zestaw funkcjonalności takich jak oprogramowanie antywirusowe, firewall, czy host intrusion prevention system (HIPS)."
    ),
    Option(
        "T22",
        62400,
        "Email security gateway",
        "Chroni serwer pocztowy przed otrzymaniem niechcianej i zawierającą złośliwą zawartość korespondencją. Brama skanuje cały przychodząca, wychodzącą i wewnętrzną komunikacje mailową włączając załączniki i adresy URL w poszukiwaniu oznak skzodliwej i złośliwej zawartości."
    ),
    Option(
        "T23",
        30000,
        "Email sandbox",
        "Podstawowym celem jest wykrycie obecności złośliwego oprogramowania poprzez tzw. detonację załączników poczty czyli ich wirtualne uruchomienie w odizolowanym, bezpiecznym środowisku i późniejszą analizę efektów na system operacyjny. Pozwala na ochronę przed złośliwym oprogramowaiem propagowanym poprzez wbudowane skrypty lub zagrożeniami typu „zero day”."
    ),
    Option(
        "T24",
        88000,
        "Software whitelisting",
        "Praktyka polegająca na zdefiniowaniu listy zatwierdzonego oprogramowania czy plików wykonywalnych, które są dopuszczone do użytku i uruchomienia w infrastrukturze informatycznej."
    ),
    Option(
        "T25",
        118200,
        "System Monitorowania Sieci",
        "Jego działanie polega na stałym monitorowaniu sieci w poszukiwaniu wadliwych lub spowolnionych usług czy komponentów i informowaniu administratorów o potencjalnych lub istniejących problemach np. słaba jakość połączenia, przeciążone zasoby serwerów czy zajętość dysków."
    ),
    Option(
        "T26",
        14000,
        "Narzędzia do analizy kodu",
        "Narzędzia te służą do analizy kodu źródłowego lub skomilowanej wersji pod kątem wynajdowania potencjalnych luk bezpieczeństwa. Najbardziej optymalnym rozwiązaniem jest zastosowanie ich w procesie rozwoju oprogramowania jeszcze przed implementacją na środowisko produkcyjne."
    ),
    Option(
        "T27",
        194000,
        "Systemy bezpieczeństwa środowiskowego",
        "Zestaw narzędzi i systemów zapewniających ochronę przed nieautoryzowanym bezpieczeństwem fizycznym oraz przed uszkodzeniami i awariami w wyniku działania czynników fizycznych i środowiskowych takich jak pożar czy zalanie uwzględniając m.in. kontrolę dostępu fizycznego, telewizję przemysłowe, systemy antywłamaniowe i przeciwpożarowe, klimatyzację, czujniki wilgotności i temperatury itp."
    ),
    Option(
        "T28",
        350000,
        "Systemy bezpieczeństwa fizycznego",
        "Zestaw narzędzi i systemów zapewniających ochronę przed nieautoryzowanym bezpieczeństwem fizycznym oraz przed uszkodzeniami i awariami w wyniku działania czynników fizycznych i środowiskowych takich jak pożar czy zalanie uwzględniając m.in. kontrolę dostępu fizycznego, telewizję przemysłowe, systemy antywłamaniowe i przeciwpożarowe, klimatyzację, czujniki wilgotności i temperatury itp."
    ),
    Option(
        "T29",
        48000,
        "System Zarządzania Konfiguracją (SCM)",
        "Łączy elementy zarządzania konfiguracji, podatnościami oraz aktualizacji. Głównym zadaniem jest zapewnienie, że systemy sa właściwie skonfigurowane zgodnie z wymaganiami biznesowymi, bezpieczeństwa i regulacji prawnych."
    ),
    Option(
        "T30",
        55000,
        "System do zarządzania ryzykiem",
        "Służy do gromadzenia i utrzymania informacji o ryzyku cyberbezpieczeństwa w jednym repozytorium i wykonywania procesu analizy w oparciu o predefiniowane biblioteki, standardy i regulacje."
    ),
    Option(
        "T31",
        157000,
        "System zarządzania urządzeniami mobilnymi",
        "Oprogramowanie służące do monitorowania , zarządzania i wdrażania polityk bezpieczeństwa na urządzeniach przenośnych różnych producentów i wykorzystujących różne systemy operacyjne."
    ),
    Option(
        "T32",
        151400,
        "Advanced Threat Protection System",
        "Kategoria rozwiązań cyberbezpieczeństwa pozwalających ma wykrycie, analizę i zapobieganie zaawansowanym i nakierowanym atakom. Różnią się między sobą podejściem i komponentami, ale większość z nich łączy w sobie funkcjonalności agentów zainstalowanych na urządzeniach końcowych, urządzenia sieciowe, bramy mailowe, oprogramowanie antywirusowe, systemy IPS/IDS i za pomocą centralnej konsoli pozwalają na kolerowania alarmów i zarządzanie ochroną."
    )
)
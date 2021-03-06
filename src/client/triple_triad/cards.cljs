(ns triple-triad.cards)


(def cards
  [{:file "/triple-triad/images/Abaddon.png", :level 6, :name "Abadon", :top 6, :right 8,
    :bottom 4, :left 5, :element nil, :location "Abyss Worm, Blood Soul"}
   {:file "/triple-triad/images/AbyssWorm.png", :level 3, :name "Abyss Worm", :top 7, :right 2,
    :bottom 3, :left 5, :element :earth, :location "Abyss Worm"}
   {:file "/triple-triad/images/Adamantoise.png", :level 4, :name "Adamantiose", :top 4, :right 5,
    :bottom 5, :left 6, :element :earth, :location "Adamantiose"}
   {:file "/triple-triad/images/Alexander.png", :level 9, :name "Alexander", :top 9, :right 10,
    :bottom 4, :left 2, :element :holy, :location "Piet (Lunar Base)"}
   {:file "/triple-triad/images/Anacondaur.png", :level 2, :name "Anacondaur", :top 5, :right 1,
    :bottom 3, :left 5, :element :poison, :location "Anacondaur"}
   {:file "/triple-triad/images/Angelo.png", :level 8, :name "Angelo", :top 9, :right 6,
    :bottom 7, :left 3, :element nil, :location "Forest Owl's Train or White Seed Ship"}
   {:file "/triple-triad/images/Armadodo.png", :level 3, :name "Armadodo", :top 6, :right 3,
    :bottom 1, :left 6, :element :earth, :location "Armadodo"}
   {:file "/triple-triad/images/BGH251F2.png", :level 7, :name "BGH251F2", :top 5, :right 7,
    :bottom 8, :left 5, :element nil, :location "Behemoth,Grand Mantis"}
   {:file "/triple-triad/images/Bahamut.png", :level 9, :name "Bahumut", :top 10, :right 8,
    :bottom 2, :left 6, :element nil, :location "Bahamut"}
   {:file "/triple-triad/images/Behemoth.png", :level 5, :name "Behemoth", :top 3, :right 6,
    :bottom 5, :left 7, :element nil, :location "Behemoth"}
   {:file "/triple-triad/images/Belhelmel.png", :level 2, :name "Belhelmel", :top 3, :right 4,
    :bottom 5, :left 3, :element nil, :location "Belhelmel"}
   {:file "/triple-triad/images/BiteBug.png", :level 1, :name "Bite Bug", :top 1, :right 3,
    :bottom 3, :left 5, :element nil, :location "Bite Bug"}
   {:file "/triple-triad/images/Blitz.png", :level 4, :name "Blitz", :top 1, :right 6,
    :bottom 4, :left 7, :element :thunder, :location "Blitz"}
   {:file "/triple-triad/images/Blobra.png", :level 1, :name "Blobra", :top 2, :right 3,
    :bottom 1, :left 5, :element nil, :location "Blobra"}
   {:file "/triple-triad/images/BloudSoul.png", :level 1, :name "Blood Soul", :top 2, :right 1,
    :bottom 6, :left 1, :element nil, :location "Blood Soul"}
   {:file "/triple-triad/images/Buel.png", :level 4, :name "Blue Dragon", :top 6, :right 2,
    :bottom 7, :left 3, :element :poison, :location "Blue Dragon"}
   {:file "/triple-triad/images/Bomb.png", :level 4, :name "Bomb", :top 2, :right 7,
    :bottom 6, :left 3, :element :fire, :location "Bomb"}
   {:file "/triple-triad/images/Buel.png", :level 2, :name "Buel", :top 6, :right 2,
    :bottom 2, :left 3, :element nil, :location "Buel"}
   {:file "/triple-triad/images/Cactuar.png", :level 3, :name "Cactaur", :top 6, :right 2,
    :bottom 6, :left 3, :element nil, :location "Cactaur"}
   {:file "/triple-triad/images/Carbuncle.png", :level 9, :name "Carbuncle", :top 8, :right 4,
    :bottom 10, :left 4, :element nil, :location "CC Heart (Xu)"}
   {:file "/triple-triad/images/Caterchipillar.png", :level 1, :name "Caterchipillar", :top 4, :right 2,
    :bottom 4, :left 3, :element nil, :location "Caterchipillar"}
   {:file "/triple-triad/images/Catoblepas.png", :level 7, :name "Catoblepas", :top 1, :right 8,
    :bottom 7, :left 7, :element nil, :location "Elnoyle, Armadodo"}
   {:file "/triple-triad/images/Cerberus.png", :level 9, :name "Cerberus", :top 7, :right 4,
    :bottom 6, :left 10, :element nil, :location "Cerberus"}
   {:file "/triple-triad/images/Chocobo.png", :level 8, :name "Chicobo", :top 9, :right 4,
    :bottom 8, :left 4, :element nil, :location "Chocobo Forests"}
   {:file "/triple-triad/images/Chimera.png", :level 5, :name "Chimera", :top 7, :right 6,
    :bottom 5, :left 3, :element :water, :location "Chimera"}
   {:file "/triple-triad/images/ChubbyChocobo.png", :level 8, :name "Chubby Chocobo", :top 4, :right 4,
    :bottom 8, :left 9, :element nil, :location "Card Queen"}
   {:file "/triple-triad/images/Cockatrice.png", :level 1, :name "Cockatrice", :top 2, :right 1,
    :bottom 2, :left 6, :element :thunder, :location "Cockatrice"}
   {:file "/triple-triad/images/Creeps.png", :level 2, :name "Creeps", :top 5, :right 2,
    :bottom 5, :left 2, :element :thunder, :location "Creeps"}
   {:file "/triple-triad/images/DeathClaw.png", :level 3, :name "Death Claw", :top 4, :right 4,
    :bottom 7, :left 2, :element :fire, :location "Death Claw"}
   {:file "/triple-triad/images/Diablos.png", :level 9, :name "Diablos", :top 5, :right 10,
    :bottom 8, :left 3, :element nil, :location "Diablos"}
   {:file "/triple-triad/images/Doomtrain.png", :level 9, :name "Doomtrain", :top 3, :right 1,
    :bottom 10, :left 10, :element :poison, :location "Card Queen"}
   {:file "/triple-triad/images/Edea.png", :level 10, :name "Edea", :top 10, :right 10,
    :bottom 3, :left 3, :element nil, :location "Edea"}
   {:file "/triple-triad/images/Eden.png", :level 9, :name "Eden", :top 4, :right 4,
    :bottom 9, :left 10, :element nil, :location "Ultima Weapon"}
   {:file "/triple-triad/images/Elastoid.png", :level 5, :name "Elastiod", :top 6, :right 2,
    :bottom 6, :left 7, :element nil, :location "Elastiod"}
   {:file "/triple-triad/images/Elnoyle.png", :level 5, :name "Elnoyle", :top 5, :right 3,
    :bottom 7, :left 6, :element nil, :location "Elnoyle"}
   {:file "/triple-triad/images/Elvoret.png", :level 6, :name "Elvoret", :top 7, :right 8,
    :bottom 3, :left 4, :element :wind, :location "Ochu,  Bite Bug"}
   {:file "/triple-triad/images/Fastitocalon.png", :level 3, :name "Fastitcalon", :top 7, :right 5,
    :bottom 1, :left 3, :element :earth, :location "Fastitcalon"}
   {:file "/triple-triad/images/FastitocalonF.png", :level 1, :name "Fastitocalon-F", :top 3, :right 5,
    :bottom 2, :left 1, :element :earth, :location "Fastitocalon-F"}
   {:file "/triple-triad/images/Forbidden.png", :level 3, :name "Forbidden", :top 6, :right 6,
    :bottom 3, :left 2, :element nil, :location "Forbidden"}
   {:file "/triple-triad/images/FujinRaijin.png", :level 6, :name "Fujin, Raijin", :top 2, :right 8,
    :bottom 8, :left 4, :element nil, :location "Iron Giant, Jelleye"}
   {:file "/triple-triad/images/Funguar.png", :level 1, :name "Fungar", :top 5, :right 1,
    :bottom 1, :left 3, :element nil, :location "Fungar"}
   {:file "/triple-triad/images/GIM47N.png", :level 5, :name "GIM47N", :top 5, :right 5,
    :bottom 7, :left 4, :element nil, :location "GIM47N"}
   {:file "/triple-triad/images/Gargantua.png", :level 7, :name "Gargantua", :top 5, :right 6,
    :bottom 6, :left 8, :element nil, :location "Imp, Thrustaevis"}
   {:file "/triple-triad/images/Gayla.png", :level 1, :name "Gayla", :top 2, :right 1,
    :bottom 4, :left 4, :element :thunder, :location "Gayla"}
   {:file "/triple-triad/images/Geezard.png", :level 1, :name "Geezard", :top 1, :right 4,
    :bottom 1, :left 5, :element nil, :location "Geezard"}
   {:file "/triple-triad/images/Gerogero.png", :level 6, :name "Gerogero", :top 1, :right 8,
    :bottom 8, :left 3, :element :poison, :location "Cactaur, Gayla"}
   {:file "/triple-triad/images/Gesper.png", :level 1, :name "Gesper", :top 1, :right 5,
    :bottom 4, :left 1, :element nil, :location "Gesper"}
   {:file "/triple-triad/images/Gilgamesh.png", :level 8, :name "Gilgamesh", :top 3, :right 7,
    :bottom 9, :left 6, :element nil, :location "CC King"}
   {:file "/triple-triad/images/GlacialEye.png", :level 2, :name "Glacial Eye", :top 6, :right 1,
    :bottom 4, :left 3, :element :ice, :location "Glacial Eye"}
   {:file "/triple-triad/images/GrandMantis.png", :level 2, :name "Grand Mantis", :top 5, :right 2,
    :bottom 5, :left 3, :element nil, :location "Grand Mantis"}
   {:file "/triple-triad/images/Granaldo.png", :level 6, :name "Granaldo", :top 7, :right 2,
    :bottom 8, :left 5, :element nil, :location "Death Claw,  Blobra"}
   {:file "/triple-triad/images/Grat.png", :level 2, :name "Grat", :top 7, :right 1,
    :bottom 3, :left 1, :element nil, :location "Grat"}
   {:file "/triple-triad/images/Grendel.png", :level 2, :name "Grendel", :top 4, :right 4,
    :bottom 5, :left 2, :element :thunder, :location "Grendel"}
   {:file "/triple-triad/images/Hexadragon.png", :level 4, :name "Hexadragon", :top 7, :right 5,
    :bottom 4, :left 3, :element :fire, :location "Hexadragon"}
   {:file "/triple-triad/images/Ifrit.png", :level 8, :name "Ifrit", :top 9, :right 6,
    :bottom 2, :left 8, :element :fire, :location "Fire Cavern (Ifrit)"}
   {:file "/triple-triad/images/Iguion.png", :level 6, :name "Iguion", :top 8, :right 2,
    :bottom 8, :left 2, :element nil, :location "Tonberry, Gesper"}
   {:file "/triple-triad/images/Imp.png", :level 4, :name "Imp", :top 3, :right 7,
    :bottom 3, :left 6, :element nil, :location "Imp"}
   {:file "/triple-triad/images/IronGiant.png", :level 5, :name "Iron Giant", :top 6, :right 5,
    :bottom 6, :left 5, :element nil, :location "Iron Giant"}
   {:file "/triple-triad/images/Irvine.png", :level 10, :name "Irvine", :top 2, :right 6,
    :bottom 9, :left 10, :element nil, :location "Card Queen"}
   {:file "/triple-triad/images/Jelleye.png", :level 2, :name "Jelleye", :top 3, :right 2,
    :bottom 1, :left 7, :element nil, :location "Jelleye"}
   {:file "/triple-triad/images/JumboCactuar.png", :level 7, :name "Jumbo Cactaur", :top 8, :right 8,
    :bottom 4, :left 4, :element nil, :location "Wendigo,  Glacial Eye"}
   {:file "/triple-triad/images/Kiros.png", :level 10, :name "Kiros", :top 6, :right 7,
    :bottom 6, :left 10, :element nil, :location "Card Queen"}
   {:file "/triple-triad/images/Krysta.png", :level 6, :name "Krysta", :top 7, :right 5,
    :bottom 8, :left 1, :element nil, :location "Bomb, Buel789"}
   {:file "/triple-triad/images/Laguna.png", :level 10, :name "Laguna", :top 5, :right 10,
    :bottom 3, :left 9, :element nil, :location "Ellone"}
   {:file "/triple-triad/images/Leviathan.png", :level 9, :name "Leviathan", :top 7, :right 10,
    :bottom 1, :left 7, :element :water, :location "CC Joker"}
   {:file "/triple-triad/images/Malboro.png", :level 5, :name "Malboro", :top 7, :right 7,
    :bottom 4, :left 2, :element :poison, :location "Malboro"}
   {:file "/triple-triad/images/Mesmerize.png", :level 2, :name "Mesmerize", :top 5, :right 3,
    :bottom 3, :left 4, :element nil, :location "Mesmerize"}
   {:file "/triple-triad/images/MiniMog.png", :level 8, :name "MinMog", :top 9, :right 3,
    :bottom 9, :left 2, :element nil, :location "Balamb Garden"}
   {:file "/triple-triad/images/Minotaur.png", :level 8, :name "Minotaur", :top 9, :right 5,
    :bottom 2, :left 9, :element :earth, :location "Tomb of the Unknown King"}
   {:file "/triple-triad/images/MobileType8.png", :level 7, :name "Mobile Type 8", :top 8, :right 6,
    :bottom 7, :left 3, :element nil, :location "Blue Dragon, Anacondaur"}
   {:file "/triple-triad/images/Ochu.png", :level 3, :name "Ochu", :top 5, :right 6,
    :bottom 3, :left 3, :element nil, :location "Ochu"}
   {:file "/triple-triad/images/Odin.png", :level 9, :name "Odin", :top 8, :right 10,
    :bottom 3, :left 5, :element nil, :location "Odin"}
   {:file "/triple-triad/images/Oilboyle.png", :level 6, :name "Oilboyle", :top 1, :right 8,
    :bottom 4, :left 8, :element nil, :location "GIM47N, Cockatrice"}
   {:file "/triple-triad/images/Pandemona.png", :level 9, :name "Pandemona", :top 10, :right 1,
    :bottom 7, :left 7, :element :wind, :location "Balamb"}
   {:file "/triple-triad/images/Phoenix.png", :level 9, :name "Phoenix", :top 7, :right 2,
    :bottom 7, :left 10, :element :fire, :location "Card Queen"}
   {:file "/triple-triad/images/Propagator.png", :level 7, :name "Propagator", :top 8, :right 4,
    :bottom 4, :left 8, :element nil, :location "Blitz,  Mesmerize"}
   {:file "/triple-triad/images/PuPu.png", :level 5, :name "PuPu", :top 3, :right 10,
    :bottom 2, :left 1, :element nil, :location "PuPu (UFO encounters)"}
   {:file "/triple-triad/images/Quezacotl.png", :level 8, :name "Quezacotl", :top 2, :right 9,
    :bottom 9, :left 4, :element :thunder, :location "FH (Mayor Dobe)"}
   {:file "/triple-triad/images/Quistis.png", :level 10, :name "Quistis", :top 9, :right 6,
    :bottom 10, :left 2, :element nil, :location "Balamb Garden"}
   {:file "/triple-triad/images/RedBat.png", :level 1, :name "Red Bat", :top 6, :right 1,
    :bottom 1, :left 2, :element nil, :location "Red Bat"}
   {:file "/triple-triad/images/RedGiant.png", :level 7, :name "Red Giant", :top 6, :right 8,
    :bottom 4, :left 7, :element nil, :location "Chimera, Forbidden"}
   {:file "/triple-triad/images/Rinoa.png", :level 10, :name "Rinoa", :top 4, :right 10,
    :bottom 2, :left 10, :element nil, :location "Rinoa's Father"}
   {:file "/triple-triad/images/RubyDragon.png", :level 5, :name "Ruby Dragon", :top 7, :right 2,
    :bottom 7, :left 4, :element :fire, :location "Ruby Dragon"}
   {:file "/triple-triad/images/SAM08G.png", :level 3, :name "SAM08G", :top 5, :right 6,
    :bottom 2, :left 4, :element :fire, :location "SAM08G"}
   {:file "/triple-triad/images/Sacred.png", :level 8, :name "Sacred", :top 5, :right 1,
    :bottom 9, :left 9, :element :earth, :location "Brothers"}
   {:file "/triple-triad/images/Seifer.png", :level 10, :name "Seifer", :top 6, :right 9,
    :bottom 10, :left 4, :element nil, :location "Cid"}
   {:file "/triple-triad/images/Selphie.png", :level 10, :name "Selphie", :top 10, :right 8,
    :bottom 6, :left 4, :element nil, :location "Trabia Garden"}
   {:file "/triple-triad/images/Shiva.png", :level 8, :name "Shiva", :top 6, :right 7,
    :bottom 4, :left 9, :element :ice, :location "White SeeD Ship (Zone)"}
   {:file "/triple-triad/images/NORG.png", :level 6, :name "Shumi Tribe", :top 6, :right 5,
    :bottom 8, :left 4, :element nil, :location "TRexaur, Grat"}
   {:file "/triple-triad/images/Siren.png", :level 8, :name "Siren", :top 8, :right 9,
    :bottom 6, :left 2, :element nil, :location "Dollet Pub"}
   {:file "/triple-triad/images/SnowLion.png", :level 3, :name "Snow Lion", :top 7, :right 1,
    :bottom 5, :left 3, :element :ice, :location "Snow Lion"}
   {:file "/triple-triad/images/Sphinxaur.png", :level 7, :name "Sphinxara", :top 8, :right 3,
    :bottom 5, :left 8, :element nil, :location "Adamantoise, Creeps"}
   {:file "/triple-triad/images/Squall.png", :level 10, :name "Squall", :top 10, :right 4,
    :bottom 6, :left 9, :element nil, :location "Laguna"}
   {:file "/triple-triad/images/TRexaur.png", :level 4, :name "T-Rexaur", :top 4, :right 6,
    :bottom 2, :left 7, :element nil, :location "T-Rexaur"}
   {:file "/triple-triad/images/Thrustaevis.png", :level 2, :name "Thrustaevis", :top 5, :right 3,
    :bottom 2, :left 5, :element :wind, :location "Thrustaevis"}
   {:file "/triple-triad/images/Tiamat.png", :level 7, :name "Tiamat", :top 8, :right 8,
    :bottom 5, :left 4, :element nil, :location "Hexadragon, Grendel"}
   {:file "/triple-triad/images/Tonberry.png", :level 3, :name "Tonberry", :top 3, :right 6,
    :bottom 4, :left 4, :element nil, :location "Tonberry"}
   {:file "/triple-triad/images/TonberryKing.png", :level 5, :name "Tonberry King", :top 4, :right 6,
    :bottom 7, :left 4, :element nil, :location "Fatitocalon,  Malboro"}
   {:file "/triple-triad/images/Torama.png", :level 4, :name "Torama", :top 7, :right 4,
    :bottom 4, :left 4, :element nil, :location "Torama"}
   {:file "/triple-triad/images/Trauma.png", :level 6, :name "Trauma", :top 4, :right 8,
    :bottom 5, :left 6, :element nil, :location "Turtapod,  Caterchipillar"}
   {:file "/triple-triad/images/TriPoint.png", :level 7, :name "Tri-Point", :top 8, :right 5,
    :bottom 2, :left 8, :element :thunder, :location "Torama,  Belhelmel"}
   {:file "/triple-triad/images/TriFace.png", :level 3, :name "TriFace", :top 3, :right 5,
    :bottom 5, :left 5, :element :poison, :location "TriFace"}
   {:file "/triple-triad/images/Turtapod.png", :level 4, :name "Turtapod", :top 2, :right 3,
    :bottom 6, :left 7, :element nil, :location "Turtapod"}
   {:file "/triple-triad/images/UltimaWeapon.png", :level 7, :name "Ultima Weapon", :top 7, :right 7,
    :bottom 2, :left 8, :element nil, :location "Elastiod, Tri-Face"}
   {:file "/triple-triad/images/Vysage.png", :level 4, :name "Vysage", :top 6, :right 5,
    :bottom 4, :left 5, :element nil, :location "Vysage, Lefty, Righty"}
   {:file "/triple-triad/images/Ward.png", :level 10, :name "Ward", :top 10, :right 7,
    :bottom 2, :left 8, :element nil, :location "Dr. Odine"}
   {:file "/triple-triad/images/BiggsWedge.png", :level 5, :name "Wedge, Biggs", :top 6, :right 6,
    :bottom 2, :left 7, :element nil, :location "Snow Lion,  Fungaur"}
   {:file "/triple-triad/images/Wendigo.png", :level 4, :name "Wendigo", :top 7, :right 3,
    :bottom 1, :left 6, :element nil, :location "Wendigo"}
   {:file "/triple-triad/images/X-ATM092.png", :level 6, :name "X-ATM092", :top 4, :right 8,
    :bottom 3, :left 7, :element nil, :location "SAM08G,  Red Bat"}
   {:file "/triple-triad/images/Zell.png", :level 10, :name "Zell", :top 8, :right 5,
    :bottom 10, :left 6, :element nil, :location "Zell's Mother"}])

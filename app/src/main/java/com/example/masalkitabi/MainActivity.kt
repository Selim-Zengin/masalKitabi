package com.example.masalkitabi

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.masalkitabi.databinding.ActivityDetayBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.masalkitabi.databinding.ActivityMainBinding
import com.example.masalkitabi.databinding.ReclyerRowBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_detay.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>


    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var mAdView : AdView

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(R.layout.activity_main)

        setContentView(view)

        // AdMob reklam id ca-app-pub-8332900776641016/8560559833

        // AdMob id ca-app-pub-8332900776641016~8013764926

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)



        Toast.makeText(applicationContext, "Hoşgeldin!", Toast.LENGTH_SHORT).show()


        landmarkList = ArrayList<Landmark>()


        val kibritci=Landmark(" Kibritçi Kız","Korkunç bir soğuk vardı; kar yağıyordu ve akşam karanlığı bastırmak üzereydi. Yılın son gecesiydi, yani yılbaşı gecesi. Bu soğukta, bu karanlıkta, küçük bir kız çocuğu, başı açık halde ve yalınayak yürüyordu sokakta. Aslında evden çıkarken ayaklarına terlik giymişti ama bunlar bir işe yaramamıştı! Ayağına çok büyük geliyorlardı, bunlar eskiden annesinin giydiği terliklerdi. Öyle büyüktüler ki, küçük kız sokakta karşıdan karşıya geçerken, doludizgin giden iki araba üzerine doğru gelince, telaştan terlikler ayağından çıkıvermiş ve kaybolmuştu. Birini bulamamış, diğerini de bir oğlan alıp kaçmış, kaçarken de, ilerde bir çocuğu olursa terliği beşik yerine kullanacağını söylemişti.\n" +
                "\n" +
                "İşte bu yüzden kızcağız soğuktan morarmış bir halde ayakları çıplak, öylece ilerliyordu sokakta. Eski önlüğünde bir sürü kibrit vardı, kibritlerin bir kısmını da elinde tutuyordu. Gün boyu hiç kimse bir tanecik bile kibrit satın almamış, kimse beş kuruş vermemişti ona. Zavallı küçük kız, karnı acıkmış, soğuktan donmuş halde karların içinde yürüyordu. Yılgın ve ürkmüş görünüyordu. Bukle bukle ensesine dökülen, uzun sapsarı saçlarına lapa lapa kar yağıyordu, ama onun bu güzelliği düşünecek hali yoktu hiç. Bütün pencerelerde ışıklar parlıyor ve sokaklara nefis kaz kızartması kokuları yayılıyordu. “Öyle ya, bu gece yılbaşı gecesi,” diye düşündü.\n" +
                "\n" +
                "Biri hafifçe sokağa doğru taşmış iki evin arasındaki bir köşeye büzülüp oturdu. Küçük ayaklarını altına toplayarak oturmuştu, ama yine de gittikçe daha çok üşüyordu. Buna rağmen eve gitmeye cesaret edemiyordu, çünkü bir tane olsun kibrit satamamış, beş kuruş bile kazanamamıştı. Babasının kızacağını düşünmüştü küçük prenses, hem zaten ev de burası kadar soğuktu. Ev dedikleri sadece bir çatı altıydı, koca koca delikleri samanlarla, paçavralarla tıkadıkları halde, gene de bıçak gibi kesen bir rüzgâr doluyordu içeri. Ah, küçük bir kibritin nasıl da yararı olurdu şimdi! Kutudan bir tane alıp duvara sürtse de, parmaklarını ısıtsa ne iyi olurdu! Sonunda dayanamadı, bir tane kibrit aldı. Duvara sürttü, bir kıvılcımla yandı kibrit!" +
                " Ne de güzel yanmıştı. Avucunun içine alınca, küçük bir mum gibi, sıcak parlak bir alevle yandı kibrit. Acayip bir ışıktı bu; küçük kıza, pirinçten boruları ve süsleri olan kocaman demir bir sobanın önünde oturuyormuş gibi gelmeye başladı. Soba alev alev yanıyor, harika ısıtıyordu! Küçük kız ayaklarını uzattı, onları da ısıtmak istiyordu. O anda alev söndü, " +
                "soba birden yok oldu… Kızcağız elinde yanmış kibrit çöpüyle öylece kalakaldı. Bir kibrit daha yaktı, parladı alev ve alevin ışığı duvara vurunca, tül gibi saydamlaştı duvar. Küçük kız odanın içini görüyordu şimdi; içerde, göz kamaştıracak kadar beyaz bir masa örtüsü serilmiş masanın üzerinde incecik şahane porselenler duruyordu, erik ve elmayla doldurulmuş kaz kızartmasının dumanı tütüyordu. Ve sonra daha da şaşırtıcı, harika bir şey oldu: Kaz tabaktan aşağı atladı, sırtında saplı çatal bıçakla beraber, yerde badi badi yürümeye başladı; tam da zavallı kızın bulunduğu yere doğru geliyordu. O sırada kibrit söndü, kalın, soğuk duvardan başka bir şey görünmez oldu.\n" +
                "\n" +
                "Küçük kız bir kibrit daha çaktı. Şimdi harika bir yılbaşı ağacının altında oturuyordu; geçen yılbaşında o zengin tüccarın evinde, cam kapıdan bakıp gördüğü ağaçtan çok daha büyük, çok daha süslüydü bu ağaç. Yeşil dallarında yüzlerce mum yanıyor, vitrinlerde sergilenenlere benzeyen rengârenk eşyalar yukarıdan ona bakıyorlardı. Küçük kız ellerini havaya kaldırdı, o sırada kibrit söndü. Bir sürü yılbaşı mumu gökyüzüne yükseliyor, küçük kız bunların birer yıldıza dönüştüğünü görüyordu. Derken yıldızlardan biri kaydı ve gökyüzünde alevden uzun bir çizgi bıraktı.\n" +
                "“Şimdi birisi ölüyor!” dedi küçük kız, çünkü, kendisine iyi davranan tek kişi olan, ama uzun zaman önce ölen yaşlı büyükannesi demişti ki: “Ne zaman bir yıldız kaysa, ölen birinin ruhu gökyüzüne yükseliyor demektir!”\n" +
                "Kibritçi kız, duvara bir kibrit daha sürttü; kibrit yanar yanmaz etraf aydınlandı ve bu aydınlığın içinde, nurlu, sevimli yüzüyle büyükannesi belirdi.\n" +
                "\n" +
                "“Büyükanne!” diye seslendi küçük kız. “Beni de al yanına! Biliyorum, kibrit söner sönmez kaybolacaksın, sıcacık soba, güzelim kaz kızartması ve o güzel, süslü yılbaşı ağacı nasıl kaybolduysa, sen de kaybolacaksın!” Sonra telaşla, geriye ne kadar kibrit kaldıysa hepsini peş peşe yaktı, büyükannesini bırakmak istemiyordu; kibritler öyle parlak yandılar ki, her yer gündüz gibi aydınlandı. Büyükannesi hiç bu kadar büyük, bu kadar güzel görünmemişti gözüne. Küçük kızı kollarına aldı ve ikisi birlikte, pırıl pırıl bir aydınlıkta, mutluluk içinde gökyüzüne yükseldiler; artık soğuk, açlık ve korku küçük kızdan uzaktı –Bambaşka bir hayattaydı şimdi o.Sabahın erken saatlerinde sokaktan geçenler küçük kızı bir evin köşesinde otururken gördüler. Al al olmuş yanakları ve dudaklarında bir gülümsemeyle, yılın son gecesinde çok üşümüştü titriyordu. Yeni yılın ilk sabahı, onun küçük bedeni üzerine doğdu; hemen hemen hepsi yanmış bir tomar kibritle orada öylece oturuyordu zavallıcık. “Isınmak istemiş!” dedi herkes. Ama onun ne güzel şeyler gördüğünü, kibrit alevinde ne düşler gördüğünü kimseler bilemezlerdi ki .")

        landmarkList.add(kibritci)


        val uyuyanGuzel=Landmark(" Uyuyan Güzel","Bir varmış bir yokmuş. ülkenin birinde bir Kral ve Kraliçe yaşıyormuş.\n" +
                "\n" +
                "Ama mutsuzmuşlar çünkü bir çocuklarının olmasını çok istiyorlarmış.\n" +
                "\n" +
                "Ve bir gün çok güzel bir kız çocukları olmuş.\n" +
                "\n" +
                "Adını da Gün Işığı koymuşlar. Gün ışığı için bir doğum günü yapmaya karar veren Kral ve Kraliçe ülkedeki tüm insanları ve perileri çağırmışlar ama yalnız unuttukları biri varmış.\n" +
                "\n" +
                "On iki periden birini çağırmayı unutmuşlar.\n" +
                "\n" +
                "Sarayda tüm hazırlıklar yapılmış ve Gün Işığına herkes hediyelerini vermeye başlamış.\n" +
                "\n" +
                "Periler de hediyelerini vermeye başlamışlar ve son üç peri hediyesini sunmaya başlamış.\n" +
                "\n" +
                "Bir tanesi Gün ışığının ömür boyu mutlu olması için hediye vermiş, diğer peri ömür boyu iyi olması için hediyesini vermiş ve o anda unutulan peri çıkagelmiş.\n" +
                "\n" +
                "O kötü kalpli periymiş.\n" +
                "\n" +
                "Görüyorum ki herkesi doğun günü partisine çağırmışsınız beni çağırmamışsınız demiş Kral’a.\n" +
                "\n" +
                "Kral da çok özür dilemiş.\n" +
                "\n" +
                "Ama kötü kalpli peri merak etmeyin bende hediyemi Gün Işığına vereceğim demiş ve onun ömür boyu mutlu olmasını istemiş ve demiş ki gün Işığı on altı yaşına geldiğinde eline bir dikiş iğnesi batacak ve ölecek demiş.\n" +
                "\n" +
                "Kral yakalayın şu Periyi demiş ve Peri adamları ittirerek oradan uzaklaşmış. Hediyesini vermeyen son Peri demiş ki ölmeyeceksin uykuya dalacaksın ne zaman seni yakışıklı birisi öpecek o zaman uykundan uyanacaksın demiş.\n" +
                "\n" +
                "Kral ülkedeki tüm iğneleri toplatmış ve adamlarına yaktırmış.\n" +
                "\n" +
                "Gün Işığı ile üç peri ilgileniyormuş onların dışında hiç kimseyle görüşmüyormuş bu iş periler için çok zormuş tabi.\n" +
                "\n" +
                "Gün ışığı yıllar geçtikçe büyümeye ve güzelleşmeye devam ediyormuş.\n" +
                "\n" +
                "Ve on altı yaşına geldiği gün Kral ve Kraliçe çok endişenmişler ülkedeki tüm iğneleri toplatıp önlem almış ama yine de içlerinde bir korku varmış.\n" +
                "\n" +
                "O gün akşamüstüne kadar vakitler varmış ve Gün Işığına bir şey olmasın diye odasına kapatmışlar.\n" +
                "\n" +
                "Gün Işığı çok sıkılıyormuş birden duvarda bir kapı belirmiş ve Gün Işığı kapıyı açarak içeri girmiş.\n" +
                "\n" +
                "İçerde bir kadın dikiş dikiyormuş. Dikiş makinesindeki iğneye elini büyülenmişçesine değdiren Gün Işığı orada bayılıvermiş.\n" +
                "\n" +
                "Kötü kalpli Peri de gülmüş ve oradan uzaklaşmış.\n" +
                "\n" +
                "Kral kızına güzel giysilerini giydirerek yatağına yatırmış ve kızı uyanana kadar sarayda yaşayan herkesin uyuması için üç perisine emir vermiş.\n" +
                "\n" +
                "Periler fareleri, kedileri ve muhafız ve Kral Kraliçeyi hepsini uyutmuş.\n" +
                "\n" +
                "Aradan yüz sene geçmiş ve saraya yakın yoldan geçmekte olan yakışıklı prense adamları uyuyan güzelin hikayesini anlatınca prens saraya girmeye karar vermiş.\n" +
                "\n" +
                "Ama etraftaki otlar çok büyükmüş sarayı kocaman sarmaşıklar sarmış.\n" +
                "\n" +
                "Prens kılıcıyla otları keserek saraya girmiş ve sarayda herkesin uyuduğunu görmüş.\n" +
                "\n" +
                "Yukarı çıkmış ve aman tanrım ne kadar güzel bir kız bu demiş.\n" +
                "\n" +
                "Onu alnından öpen prens kızın uyanmasını sağlamış.\n" +
                "\n" +
                "O uyanınca saraydaki tüm insanlar ve hayvanlarda yüz yıllık uykusundan uyanmışlar.\n" +
                "\n" +
                "Prens Kraldan kızını istemiş onunla evlenmek istiyormuş.\n" +
                "\n" +
                "Kral kızını prense vermiş ve ömür boyu mutlu bir şekilde yaşamışlar.")

        landmarkList.add(uyuyanGuzel)

        val kirmiziBaslikliKiz=Landmark(" Kırmızı Başlıklı Kız","Bir zamanlar küçük ve tatlı bir kız vardı; kim görse ondan hoşlanırdı, özellikle de büyükannesi. Öyle ki, torununa ne vereceğini bilemezdi. Bir keresinde ona kırmızı kadifeden bir başlık hediye etti. Şapka kıza o kadar yakıştı ki, başından çıkarmaz oldu. Bu yüzden de herkes ona Kırmızı Başlıklı demeye başladı. Bir gün annesi ona, \"Gel bakalım Kırmızı Başlıklı, şu kurabiyeyle şarabı büyükannene götür. Kadıncağız hasta ve halsiz; bu ona iyi gelecektir. Acele et ki, sıcak basmadan oraya varasın. Anayoldan ayrılma sakın, oraya buraya sapma. Yoksa şişeyi düşürüp kırarsın; büyükannen de şarapsız kalır. Eve girince günaydın demeyi unutma, her köşeye da bakmaya kalkışma\" dedi.\n" +
                "\n" +
                "\"Merak etme\" diyen küçük kız annesiyle vedalaştı.\n" +
                "\n" +
                "Büyükannenin evi köyden yarım saat mesafedeki ormandaydı. Kırmızı Başlıklı ormana dalınca kurtla karşılaştı. Ama onun ne kötü bir hayvan olduğunu bilmediği için korkmadı.\n" +
                "\n" +
                "Kurt: \"İyi günler Kırmızı Başlıklı\" dedi.\n" +
                "\n" +
                "\"Teşekkür ederim, kurt kardeş.\"\n" +
                "\n" +
                "\"Sabah sabah nereye gidiyorsun böyle?\"\n" +
                "\n" +
                "\"Büyükanneme.\"\n" +
                "\n" +
                "\"Ne taşıyorsun önlüğünün altında?\"\n" +
                "\n" +
                "\"Kurabiyeyle şarap. Kurabiyeyi dün yaptık; bu, hasta büyükanneme iyi gelir.\"\n" +
                "\n" +
                "\"Kırmızı Başlıklı, senin büyükannen nerede oturuyor?\"\n" +
                "\n" +
                "\"Ormanda; on beş dakika daha gidersen üç tane kocaman meşe ağacı görürsün. Evi hemen onların önünde; etrafında da fındık ağaçları var.\"\n" +
                "\n" +
                "Kurt: \"Şu körpe kız tam dişine göre; eti, yaşlı büyükanneden daha lezzetli olmalı. Kurnaz davranırsan ikisini de ele geçirirsin\" diye aklından geçirdi.\n" +
                "\n" +
                "Bir süre beraber yürüdüler. Bir ara kurt, \"Kırmızı Başlıklı, etraftaki şu güzel çiçeklere baksana! Kuşların nasıl cıvıldadığını da duymuyorsun galiba? Sanki okula yollanır gibi, almış başını gidiyorsun; oysa orman ne kadar hoş\" dedi.\n" +
                "\n" +
                "Kırmızı Başlıklı gözlerini şöyle bir açtı. Güneş ışınlarının güzel çiçekler arasında nasıl oynaştığını görünce, \"Büyükanneme bir demet çiçek götürsem hoşuna gider. Henüz vakit erken; oraya zamanında varırım\" diye düşündü. Ana yoldan çıkarak çiçek aramaya koyuldu. Birini kopardıktan sonra on dan daha güzel olabilecek İkincisini bulmaya çalışırken ormanın derinliklerine dalıverdi.\n" +
                "\n" +
                "Bu arada kurt doğru büyükannenin evine gitti. Kapıyı çaldı.\n" +
                "\n" +
                "\"Kim o?\"\n" +
                "\n" +
                "\"Benim; Kırmızı Başlıklı. Sana kurabiyeyle şarap getirdim, aç kapıyı.\"\n" +
                "\n" +
                "\"Mandalı bastır! Ben çok halsizim, kalkamıyorum\" diye cevap verdi yaşlı kadın. Kurt mandalı bastırdı, kapı açıldı.\n" +
                "\n" +
                "Hayvan hiçbir şey söylemeden doğru büyükannenin yatağına giderek zavallı kadını yutuverdi. Sonra onun giysilerini üstüne geçirerek başörtüsünü de başına taktı. Daha sonra da yatağa yatarak perdesini çekti.\n" +
                "\n" +
                "Kırmızı Başlıklı da yeterince, hatta taşıyamayacağı kadar çok çiçek topladı. Derken büyükannesini hatırladı ve hemen yola koyuldu. Sokak kapısını açık bulunca şaşırdı, içeri girince bir tuhaflık hissetti. Kendi kendine: \"Bana da ne oldu? Neden içime korku düştü ki? Oysa ben buraya hep seve seve gelirdim\" diye söylendi. Ve \"Günaydın\" diye seslendi. Cevap alamadı. Yatağa yaklaşarak perdesini açtı.\n" +
                "\n" +
                "Büyükanne orada yatmış, başörtüsünü de iyice yüzüne kapatmıştı, yani biraz tuhaf görünüyordu.\n" +
                "\n" +
                "\"Aaa, büyükanne, senin ne kadar büyük kulakların var!\"\n" +
                "\n" +
                "\"Seni daha iyi duyayım diye.\"\n" +
                "\n" +
                "\"Aaa, büyükanne, senin ne kadar büyük gözlerin var!\"\n" +
                "\n" +
                "\"Seni daha iyi görebileyim diye.\"\n" +
                "\n" +
                "\"Aaa, büyükanne, senin ne kadar kocaman ellerin var?\"\n" +
                "\n" +
                "\"Seni daha iyi yakalayayım diye!\"\n" +
                "\n" +
                "\"Ama büyükanne, ağzın ne kadar da büyük!\"\n" +
                "\n" +
                "\"Seni daha iyi ısırayım diye!\"\n" +
                "\n" +
                "Ve kurt, bunu söyler söylemez zavallı kızcağızı yutuverdi.\n" +
                "\n" +
                "Karnı iyice doyduktan sonra da yatağa yattı, uykuya dalarak horlamaya başladı. Bu arada evin önünden bir avcı geçmekteydi. \"Yaşlı kadın nasıl da horluyor; git bir bak bakalım bir şeye ihtiyacı var mı?\" diye aklından geçirdi. Eve girdi ve yatağa yaklaştığında kurdu gördü. \"Seni burda buldum, namussuz! Çoktandır arıyordum\" diye söylendi.\n" +
                "\n" +
                "Tam silahını doğrultmuşken düşündü. Kurt büyükanneyi yutmuş olabilirdi!\n" +
                "\n" +
                "O zaman henüz onu kurtarabilirdi. Ateş etmeyip eline bir makas aldı ve uyuyan kurdun karnını kesmeye başladı. Biraz kesince Kırmızı Başlıklı'nın başı göründü; derken ufak kız dışarı sıçrayıverdi. \"Uüü-üff, ama korktum! Kurdun karnı çok karanlıkmış\" dedi. Derken büyükanne de canlı olarak kurtarıldı; zor nefes almaktaydı.\n" +
                "\n" +
                "Kırmızı Başlıklı hemen kocaman taşlar toplayıp onlarla kurdun karnını doldurdu. Kurt uyandığında yerinden fırlamak istedi, ama taşlar o kadar ağırdı ki, olduğu yere çöküverdi; ölmüştü!\n" +
                "\n" +
                "Üçü de çok sevindi.\n" +
                "\n" +
                "Avcı kurdun postunu yüzüp evine götürdü. Büyükanne Kırmızı Başlıklı'nın getirdiği kurabiyeleri yiyip şarabı içerek kendine geldi. Ama küçük kız kendi kendine:\n" +
                "\n" +
                "\"Bir daha ömrüm boyunca ana yoldan ayrılmam; annem haklıymış\" diye söylendi.\n" +
                "\n" +
                "Bu öyküyü başka türlü de anlatırlar: Bir gün Kırmızı Başlıklı yine büyükannesine kurabiye getirdiğinde bir başka kurt karşısına çıkarak onu ana yoldan uzaklaştırmak istedi.\n" +
                "\n" +
                "Ama küçük kız buna kanmayarak yoluna devam etti ve büyükannesine, kurda nasıl rastladığını, onun kendisine nasıl \"Merhaba\" dediğini, ama bakışlarını hiç beğenmediğini anlattı.\n" +
                "\n" +
                "\"Yani ana yolda olmasaydık herhalde beni yerdi\" diye ekledi\n" +
                "\n" +
                "\"Gel\" dedi büyükanne, \"Şu kapıyı kapayalım da içeri girmesin!\"\n" +
                "\n" +
                "Az sonra kurt kapıyı çalarak, \"Aç kapıyı büyükanne, ben geldim! Kırmızı Başlıklı! Sana kurabiye getirdim\" diye seslendi. Büyükanneyle torunu sustu," +
                " ama kapıyı açmadılar. Bunun üzerine kurt evin etrafında birkaç kez dönendikten sonra dama çıktı; Kırmızı Başlıklı'nın eve dönüşünü bekledi. Küçük kızın " +
                "peşinden giderek onu karanlıkta yemek istiyordu. Ama büyükanne onun niyetini sezdi. Evin önünde büyük bir taş yalak vardı. Torununa dönerek, \"Kovayı al, " +
                "yavrum; dün sucuk kaynattığım suyu al ve yalağı onunla doldur\" dedi. Kırmızı Başlıklı yalağı ağzına kadar doldurdu. Sucuk kokusu kurdun burnuna gelince " +
                "hayvan damdan aşağı baktı. Boynunu o kadar sarkıttı ki, birden dengesini kaybederek taş yalağın içine düştü ve boğuldu. Kırmızı Başlıklı da evine keyifle" +
                " döndü ve kurda artık acımadı.")

        landmarkList.add(kirmiziBaslikliKiz)



        val zencefilliKurabiye=Landmark(" Zencefilli Kurabiye Adam","Evvel zaman içinde, eski küçük bir evde kocasıyla beraber yaşayan, yaşlı bir kadın varmış. Çiftin hiç çocuğu yokmuş. Yalnızlık çekiyorlarmış. Bir gün kadın zencefilli ekmekten bir çocuk yapmaya karar vermiş.\n" +
                "\n" +
                "Kadın: “Kocacığım bugün zencefilli kurabiyeden adam pişireceğim. Tüm malzemeleri hazırlamış. Ardından hepsini una eklemiş, hamuru açmış son olarak da zencefilli kurabiyeden güzel bir adam kesmiş.\n" +
                "\n" +
                "Kadın: “Ne kadar yakışıklı bir zencefilli kurabiyeden adam oldu!” demiş sonrada şimdi de onu fırına verelim. Diyerek pişmesi için onu fırına koymuş. Kısa bir süre beklemiş, ardından tekrar fırının başına gitmiş;\n" +
                "\n" +
                "“Imm, çok nefis kokuyor.” Kremayla Kurabiyenin saçlarını ve ağzını yapmış. Gözleri için şeker, düğmeleri için ise vişne kullanmış. Her şey tamamlandıktan sonra zencefilli kurabiye adam ayağa fırlamış.\n" +
                "\n" +
                "Zencefilli kurabiye adamı koşarken gören yaşlı kadın adeta şoka uğramıştı.\n" +
                "\n" +
                "Zencefilli Kurabiye Adam: “Beni yemeyin” diyerek pencereden dışarı kaçmış.”\n" +
                "\n" +
                "Kadın: “Dur… Bekle…”\n" +
                "\n" +
                "Zencefilli Kurabiye Adam ise “Koş, olabildiğince hızlı koş. Kimse beni yakalayamaz çünkü ben Zencefilli Kurabiye Adamım!” diye bağırıyormuş. Yaşlı kadın peşinden koşmuş ama onu yakalayamamış.\n" +
                "\n" +
                "Zencefilli Kurabiye durmadan koşmaya devam etmiş.\n" +
                "\n" +
                "Kadın: “Dur…” diye bağırmaya devam ediyormuş. ama o hiç durmuyormuş. bu sırada onu koşarken onu bir inek görmüş.\n" +
                "\n" +
                "İnek: “Sen çok taze kokuyorsun. Yenilebilecek kadar iyisin.”\n" +
                "\n" +
                "Zencefilli Kurabiye Adam: “Ben yaşlı bir kadından kaçtım ve senin gibi şişko bir inekten de kaçabilirim! Evet kesinlikle kaçabilirim!” demiş.\n" +
                "\n" +
                "Bu sefer inekte küçük adamı kovalamaya başlamış ama kurabiye adam daha hızlı koşuyormuş. Koşarken de yine sözlerini tekrarlıyormuş: “Koş, olabildiğince hızlı koş. Kimse beni yakalayamaz çünkü ben zencefilli kurabiye adamım.”\n" +
                "\n" +
                "İnek yaşlı kadın ile birlikte zencefilli kurabiye adamın peşinden koşmuş ama yakalamayı başaramamışlardı.\n" +
                "\n" +
                "Bu sefer de onu bir domuz görmüş: Domuz: “Çok lezzetli görünüyorsun! seni hemen yemek istiyorum.”\n" +
                "\n" +
                "Zencefilli kurabiye adam: “Bunun için çaba harcamalısın pis domuz. Beni yakalayamazsın. Yaşlı bir kadından kaçtım. Bir inekten kaçtım ve senden de kaçabileceğim den eminim evet kaçabilirim! İstediğiniz kadar hızlı koşun kimse beni yakalayamaz çünkü ben zencefilli kurabiye adamım.” demiş.\n" +
                "\n" +
                "Domuz da zencefilli kurabiye adamı kovalayan yaşlı kadına ve ineğe katılmış ama oda yakalayamamış.\n" +
                "\n" +
                "Zencefilli kurabiye adam durmadan koşmaya devam etmiş. Koşarken onu bir tavuk görmüş. Tavuk: “Ne güzel bir yemek! Onunla yavrularımı doyulabilirim galiba.” diyerek oda zencefilli kurabiye adamın peşinden koşmuş ama o da yetişememiş.\n" +
                "\n" +
                "“Peşimdekiler ne kadar da yavaş böyle!” diyerek kendisiyle gurur duyuyormuş. Öylece koşarken bir nehir görmüş ve yavaşlamış. Suya girince sırılsıklam olacağından korkmuş. Nehir kenarında su içen bir tilki görmüş.\n" +
                "\n" +
                "Tilki: Bu gün karnımı doyulmak için ne güzel bir yemek! Tilki de zencefilli kurabiye adamın peşinden koşmuş.\n" +
                "\n" +
                "Tilki: “Hey sen genç adam. Sakıncası yoksa arkadaş olabilir miyiz?”\n" +
                "\n" +
                "Zencefilli kurabiye adam ilk kez böyle bir şey duyuyormuş ve çok memnun olmuş. “Evet bay tilki sakıncası yok ama bir şartım olacak”\n" +
                "\n" +
                "Tilki: “Şartın nedir?”\n" +
                "\n" +
                "Zencefilli kurabiye adam: “Nehri geçmeme yardım eder misin?”\n" +
                "\n" +
                "Tilki: “Evet, genç adam. Neden olmasın?” deyince zencefilli kurabiye adam çok rahatlamış.\n" +
                "\n" +
                "Tilki: “Gel bay kurabiye adam. Sırtıma bin ve nehri geçmene yardım edeyim.”\n" +
                "\n" +
                "zencefilli kurabiye adam tilkinin sırtına binmiş. Kurnaz tilki nehrin diğer kıyısına çıktıktan hemen sonra onu havaya atmış ve kocaman ağzını açmış. zencefilli kurabiye adam içeri düşer düşmez tilki ağzını kapatmış.\n" +
                "\n" +
                "Tilki: “Evet gerçekten çok lezzetliydi.” demiş. Bu zencefilli kurabiye adamın sonuydu.")

        landmarkList.add(zencefilliKurabiye)


        val pinokyo=Landmark(" Pinokyo","Çok, çok uzun zaman önce, uzak diyarların birinde küçük ama çok şirin bir kasaba varmış. Bu kasabadaki herkes birbiriyle çok iyi anlaşır, hiç yalan söylemezmiş. Kasabanın bir de çok iyi kalpli marangozu varmış. Adı da Gepetto’ymuş.\n" +
                "\n" +
                "Gepetto Usta çocuklara ahşaptan kukla oyuncaklar yaparak geçinirmiş ama çok fakirmiş. Hayattaki en büyük dileği ise bir çocuğu olmasıymış. \n" +
                "\n" +
                "Hayalini gerçekleştiremediği için kendine ahşaptan bir çocuk yapıp ona çocuğu gibi davranmaya karar vermiş. Ormana gidip bir ağaç parçası bulmuş.\n" +
                "\n" +
                "Ağaç kütüğünü atölyesine getirip şekil vermeye başlamış. Kütüğe her vuruşunda “Ah!” diye sesler gelmeye başlamış.\n" +
                "\n" +
                "Usta marangozun neredeyse gerçek bir çocuğa benzeyen kuklası sonunda bitmiş. Şimdiden onu çok sevmeye başlayan Gepetto Usta ona Pinokyo adını vermiş. Tüm gün çalışan Gepetto yorgunluktan oracıkta uyuyakalmış. Pinokyo da masasında oturuyormuş.\n" +
                "\n" +
                "O sırada bir peri ortaya çıkmış ve: “Ah iyi kalpli Usta, bugüne kadar yaptıklarınla en büyük dileğinin gerçekleşmesini hak ettin. Sana hayalindeki gibi bir çocuk hediye edeceğim.” demiş. Elindeki sihirli değneği ile Pinokyo’ya dokunmuş ve bir anda kukla hareket etmeye başlamış.\n" +
                "\nSabahın erken saatlerinde gerinerek uyanan Gepetto birden yanında ona boncuk gözleri, kırmızı yanaklarıyla bakan şirin mi şirin Pinokyo’yu görünce çok şaşırmış ve ona sarılmış:\n" +
                "\n" +
                "- İnanamıyorum oğlum canlanmış, demiş.\n" +
                "\n" +
                "- Evet babacığım, ben senin oğlunum, demiş Pinokyo.\n" +
                "\n" +
                "Aradan yıllar geçmiş ve Pinokyo büyümüş, artık okula gitme zamanı gelmiş.\n" +
                "\n" +
                "Pinokyo’nun okula gidebilmesi için kalem, defter ve kitaba ihtiyacı varmış. Bunları almak için babasından para istemiş. Oldukça fakir olan ve zor geçinen Gepetto bunları alacak parasının olmadığını oğluna söyleyememiş ve gidip paltosunu satmış.\n" +
                "\n" +
                "- Bu parayı al ve okul için istediklerini al Pinokyo, demiş.\n" +
                "\n" +
                "- Tamam baba, hemen pazara gidip alayım, demiş Pinokyo.\n" +
                "\n" +
                "Babasından parayı alan Pinokyo yola çıkmış ve yolda giderken kocaman bir çadır ve kalabalık görmüş. Hemen yanlarına gidip olan biteni anlamaya çalışmış. Bu bir sirkmiş ve içeride çeşitli gösteriler düzenleniyormuş.\n" +
                "\n" +
                "Hemen içeri girmeye çalışmış ama kapıdaki görevli onu durdurmuş:\n" +
                "\n" +
                "- İçeri girmek için bilet almalısın.\n" +
                "\n" +
                "Pinokyo biraz düşündükten sonra elindeki parayı göstererek:\n" +
                "\n" +
                "- Bana da bilet verir misin?, demiş.\n" +
                "\n" +
                "Biletini alıp içeri giren Pinokyo, heyecanla gösterileri seyretmeye başlamış. Sirk sahibi onun canlı bir kukla olduğunu hemen fark etmiş ve onu yakalayıp kafese kapatmış.\n" +
                "\n" +
                "Çok üzülen Pinokyo ağlamaya başlamış. O sırada onu canlı bir kuklaya çeviren peri gelmiş. Peri, onu kurtaracağını ve parasını geri vereceğini söylemiş. Perinin tek bir şartı varmış: Pinokyo’nun iyi bir çocuk olması ve yalan söylememesi!\n" +
                "\n" +
                "Pinokyo sirkten koşarak çıkmış ve elinde parasıyla yola koyulmuş. Onun elinde para olduğunu gören kurnaz tilki ile paragöz kedi yolunu kesmişler.\n" +
                "\n" +
                "- Ne yapacaksın o parayla?\n" +
                "\n" +
                "- Okul için kitap ve kalem alacağım.\n" +
                "\n" +
                "- Okula gidip de ne yapacaksın? Gel bizi dinle! O parayı tarlaya ekelim daha çok çıksın. Böylece zengin olursun, demişler.\n" +
                "\n" +
                "- Çok iyi fikir, paramı alın ve ekin, demiş Pinokyo.\n" +
                "\n" +
                "Pinokyo’yu kandıran kedi ve tilki, parayı alıp kaçmışlar. Pinokyo bir kez daha parasını kaybetmiş. O sırada peri ortaya çıkmış ve Pinokyo’ya:\n" +
                "\n" +
                "- Neler oldu Pinokyo?\n" +
                "\n" +
                "- Bir kedi ve tilki elimden zorla paralarımı aldı.\n" +
                "\n" +
                "Yalan söyleyen Pinokyo’nun burnu birden uzamaya başlamış.\n" +
                "\n" +
                "- Neler oluyor burnuma böyle?\n" +
                "\n" +
                "- Yalan söylüyorsun ve burnun uzuyor. Bu sana bir ceza! Bir daha yalan söylememeye söz vermiştin.\n" +
                "\n" +
                "Yaptığı hatayı fark eden Pinokyo olanları doğru bir şekilde periye anlatmış. Peri onu affetmiş ve tekrar kurtarmış.\n" +
                "\n" +
                "Pinokyo evine doğru yürümeye başlamış ama şans bu ya karşısına kötü kalpli sirk sahibi çıkmış. Kaçtığı için ona çok sinirliymiş. Pinokyo’yu tuttuğu gibi denize atmış.\n" +
                "\n" +
                "Kocaman bir balina Pinokyo’yu yutmuş. Karanlık, soğuk ve ıslak bir yermiş balinanın midesi. Korkmuş, ıslanmış ve ağlamaya başlamış.\n" +
                "\n" +
                "-Babacığım keşke yanımda olsan, sana sarılsam. Yaptıklarım için o kadar pişmanım ki, demiş.\n" +
                "\n" +
                "Uzun süredir oğlundan haber alamayan Gepetto Usta da Pinokyo’yu arıyormuş. Komşuları Pinokyo’yu en son denize atlarken gördüklerini söyleyince kayığa binip onu aramaya başlamış yaşlı marangoz.\n" +
                "\n" +
                "Gepetto kayığa binince fırtına başlamış ve denize düşmüş. Masal bu ya aynı balina onu da yutmuş. Babasını karşısında gören Pinokyo çok sevinmiş. Baba ve oğlu birbirlerine sarılarak hasret gidermişler.\n" +
                "\n" +
                "Pinokyo tüm olanları babasına anlatmış ve balinanın midesinden çıkmak için bir plan yapmış. Babasına:\n" +
                "\n" +
                "- Cebinde kibrit var mı babacığım?, demiş.\n" +
                "\n" +
                "- Evet, var, demiş Gepetto.\n" +
                "\n" +
                "- Şimdi balinanın midesindeki tüm tahtaları yakalım ve çıkan dumanla birlikte ağzını açınca kaçalım, demiş Pinokyo.\n" +
                "\n" +
                "Pinokyo’nun planı başarılı olmuş ve kaçıp kurtulmuşlar. Tüm bu olanları gören peri, onun iyi bir evlat olduğunu fark etmiş. Ona çok güzel bir hediye vererek onu gerçek bir çocuğa çevirmiş.\n" +
                "\n" +
                "O günden sonra çok dürüst ve çalışkan bir çocuk olan Pinokyo ile babası mutlu bir hayat sürmüşler.")

        landmarkList.add(pinokyo)

        val bremeenMızıkıcıları=Landmark(" Bremen Mızıkacıları","Bir zamanlar, vaktiyle bir adamın bir eşeği varmış. Bu eşek çuvalları bıkmadan usanmadan yıllarca değirmene götürmüş. Fakat artık gücü kalmamış, işe yaramaz bir duruma düşmüş. Sahibi onu boş yere beslemek istemiyormuş. Eşek de işlerin yolunda olmadığını sezmiş, başını alıp yola çıkmış, Bremen yolunu tutmuş. Orada kent çalgıcısı olabileceğini sanıyormuş.\n" +
                "\n" +
                "Eşek böylece az gitmiş, uz gitmiş, dere tepe düz gitmiş; yolda boylu boyunca yatan bir av köpeğiyle karşılaşmış. Hayvan, koşmaktan yorulmuş köpekler gibi soluyup duruyormuş. Eşek sormuş:\n" +
                "– Ne soluyup duruyorsun böyle bakayım, bekçi baba?\n" +
                "\n" +
                "Köpek:\n" +
                "– Sorma, demiş, yaşlandım. Günden güne güçten düşüyorum. Avda koşamıyorum diye sahibim beni öldürmek istedi… Ben de kaçıp kurtuldum. Bundan sonra karnımı nasıl doyuracağım bilmem!\n" +
                "\n" +
                "Eşek:\n" +
                "– Sana bir şey söyleyeyim mi, demiş, ben Bremen’e gidiyorum… Kent çalgıcısı olacağım… Benimle gel, sen de bandoya gir! Ben lavta çalarım, sen de davul…\n" +
                "\n" +
                "Bu öneri köpeğin hoşuna gitmiş. İkisi birlikte yola çıkmışlar. Aradan uzun zaman geçmemiş. Yolun kıyısında bir kedi görmüşler. kedinin suratından düşen bin parça oluyormuş.\n" +
                "\n" +
                "Eşek:\n" +
                "– Ne o? İşin sarpa mı sardı yoksa, yaşlı palabıyık? demiş.\n" +
                "\n" +
                "– İnsanın başında ateşler yanarken nasıl neşeli olur? Artık yaşım ilerledi. Dişlerim kütleşti… Farelerin peşinde koşacağıma sobanın arkasında oturup pinekliyorum. Bu yüzden hanımım beni suya atıp boğmak istedi. Ben kaçıp kurtuldum ama son pişmanlığın yararı olmuyor. Şimdi nereye gideyim?\n" +
                "– Bizimle birlikte gel. Müzikten anladığın bilinir. Oraya varınca kent mızıkacısı olursun!\n" +
                "\n" +
                "Kedi bu sözü hoş karşılamış, onlarla birlikte yola çıkmış.\n" +
                "\n" +
                "Bu üç yurt kaçağı bir çiftliğin önünden geçerken selamlık kapısının üstünde cıyak cıyak öten bir horoz görmüşler; eşek:\n" +
                "– Sesin insanın iliğine kemiğine işliyor… Neyin var kuzum? demiş. Horoz:\n" +
                "\n" +
                "– Havanın güzel olacağını haber verdim. Bugün bizim sevgili hanımımızın günüdür. “Kristkind”ciğin gömleğini yıkamıştı. Onu kurutmak istiyor. Ama yarın pazar, konuklar gelecek. Onun için hanım hiç acımadan aşçı kadına söyledi. Yarın benim çorbamı yiyecekmiş. Nasıl olsa bu akşam kellem uçacak. Bari ben de gırtlağım yırtılıncaya kadar bağırayım dedim.\n" +
                "Eşek:\n" +
                "\n" +
                "– Zavallı albaş, demiş, öyleyse bizimle gel daha iyi. Biz Bremen’e gidiyoruz. Nerede olsan ölümden daha iyisini bulabilirsin. Sesin güzel… Hepimiz bir arada şarkı söylersek hoş bir şey olacak kesin.\n" +
                "Horoz bu öneriyi beğenmiş. Dördü birlikte yola çıkmışlar.\n" +
                "\n" +
                "Bunlar bir günde Bremen’e varamamışlar. Akşam olunca bir ormana gelmişler; burada geceleyelim demişler. Eşekle köpek büyük bir ağacın altına uzanmışlar. Kediyle horoz da dallara çıkmışlar, ama horoz en tepedeki dalları daha güvenli bulmuş, oraya uçup tünemiş. Horoz uykuya dalmadan önce bir kez daha çevresine bakınmış. Uzakta küçük bir ışık görür gibi olmuş, arkadaşlarına seslenmiş: “Işık görünüyor, yakınlarda bir ev olsa gerek!” demiş.\n" +
                "Eşek:\n" +
                "\n" +
                "– Öyleyse kalkalım, hemen oraya gidelim. Burada rahat edilmiyor demiş.\n" +
                "Köpek orada birkaç parça kemik, biraz et bulursa pek hoşuna gideceğini düşünmüş.\n" +
                "\n" +
                "Bunun üzerine ışığın bulunduğu yana doğru yola koyulmuşlar. Yaklaştıkça ışığın parıltısı artmış. Sonunda haydutların barındığı eve gelmişler.\n" +
                "İçlerinde en irisi eşek olduğu için pencereye o yaklaşmış, içeriye bakmış. Horoz sormuş:\n" +
                "\n" +
                "– Neler görüyorsun, babacan?\n" +
                "Eşek:\n" +
                "\n" +
                "– Neler mi görüyorum? demiş. Kurulmuş bir sofra… Üstünde her türlü yiyeek, içecek var… Haydutlar oturmuş, keyif çatıyorlar.\n" +
                "Horoz:\n" +
                "\n" +
                "– Tam bize göre bir iş, demiş.\n" +
                "Eşek:\n" +
                "\n" +
                "– Ah sorma kardeş demiş, şu sofranın başında biz olsak ne olurdu sanki?\n" +
                "Haydutları buradan nasıl kaçıralım? diye her kafadan bir ses çıkmış. Sonunda bir çare bulmuşlar: Eşek ön ayaklarını kaldırıp pencereye dayayacak. Köpek eşeğin sırtına çıkacak. Kedi köpeğin üstüne tırmanacak. Horoz da uçacak, köpeğin tepesine konacak!\n" +
                "\n" +
                "Dedikleri gibi yapmışlar. Sonra biri işaret verince hep bir ağızdan şarkı söylemeye başlamışlar: Eşek anırmış, köpek havlamış, kedi miyavlamış, horoz da ötmüş. Sonra şangur şungur pencereden içeri dalıvermişler!\n" +
                "Haydutlar bu korkunç bağırışmayı duyunca oldukları yerde havaya fırlamışlar. İçeriye herhalde bir hortlak girdi sanmışlar. Evden çıkıp ormana doğru kaçmaya başlamışlar.\n" +
                "\n" +
                "O zaman dört ahbap sofranın başına kurulmuşlar, haydutların artıklarına saldırmışlar. Sanki kırk yıldan beri açmış gibi, yemekleri atıştırmışlar.\n" +
                "Dört çalgıcı işlerini bitirine ışığı söndürmüşler. Herkes kendi keyfine göre rahat edebileceği bir yer aramış: Eşek gübrelerin üzerine uzanmış, köpek kapı arkasına, kedi ocakta sıcak külün yanına, horoz da bir tüneğin üstüne…\n" +
                "\n" +
                "Yol yorgunu oldukları için az sonra da hepsi uykuya dalmış.\n" +
                "Vakit gece yarısını geçmiş. Haydutlar uzaktan bakmışlar, artık evde ışık yanmıyor, her yan da sessiz. Elebaşıları:\n" +
                "\n" +
                "– Boş yere mantara basmamalıydık ama oldu! demiş.\n" +
                "İçlerinden birini oraya yollamış, eve baktırmış. Gönderilen adam her yanı sessiz bulmuş, mutfağa girmiş. Lamba yakmak istemiş. Kedinin parıldayan gözlerini yanık ateş sanmış, kükürtlü bir çöp almış, bunu ateşte tutuşturmak istemiş. Ama kedi şakadan anlar mı? Hemen adamın suratına atılmış, tırmık içinde bırakmış.\n" +
                "\n" +
                "Haydudun korkudan ödü patlamış, arka kapıdan fırlayıp kaçmak istemiş ama oracıkta yatan köpek üstüne saldırmış, bacağını ısırmış. Adam avludan, gübrelere basıp kaçarken eşek de arka bacaklarıyla hatırı sayılır bir çifte savurmuş. Bu gürültülere uyanan horoz da:\n" +
                "– Ö ö rö ö… diye avazı çıktığı kadar ötmeye başlamış.\n" +
                "\n" +
                "Haydut alabildiğine koşarak soluk soluğa elebaşının yanına gelmiş:\n" +
                "– Sormayın demiş, evde korkunç bir cadı oturuyor. Suratıma doğru tısladı, uzun tırnaklarıyla yüzümü gözümü tırmaladı. Kapının önünde bir herif duruyor. Elinde bir kama var. Bacağıma sapladı. Avluda bir karakoncoloz yatıyor. Beni meşe sopasıyla patakladı. Damda da yargıç oturuyor: “Getirin şu keratayı bana!” diye bar bar bağırıyordu. Zor kaçıp kurtuldum ellerinden…\n" +
                "\n" +
                "O günden sonra haydutlar bir daha eve girme gözü pekliğini gösterememişler ama burası dört Bremen mızıkacısının pek hoşuna gitmiş. Artık buradan çıkıp gitmek istememişler.")

        landmarkList.add(bremeenMızıkıcıları)

        val kurtVeKucukOglak=Landmark(" Kurt ve Yedi Küçük  Oğlak","Bir varmış, bir yokmuş. Evvel zaman içinde, kalbur saman içinde, ihtiyar bir keçinin yedi yavrusu varmış. Bir anne çocuklarını nasıl severse o da yavrularını öyle severmiş. Günün birinde keçi, yavrularına yiyecek bulup getirmek için ormana giderken onları çevresinde toplamış:\n" +
                "\n" +
                "– Sevgili çocuklarım demiş; ben ormana gidiyorum. Kendinizi kurttan sakının. Eğer kurt evimize girerse hepinizi kıtır kıtır yer. Bu alçak çok kez türlü kılıklara girer, ama kaba sesinden, kapkara ayaklarından onu hemen tanıyabilirsiniz!\n" +
                "\n" +
                "Küçük oğlaklar:\n" +
                "– Sevgili annemiz, demişler, gözün arkada kalmasın… Güle güle git, güle güle gel… Biz kendimizi koruruz.\n" +
                "\n" +
                "Keçi melemiş, iç rahatlığıyla yola çıkmış.\n" +
                "Aradan çok zaman geçmemiş. Evin kapısını biri çalmış:\n" +
                "\n" +
                "– Sevgili çocuklar diye seslenmiş, kapıyı açın bakayım. Anneniz geldi, hepinize bir şeyler getirdi.\n" +
                "Fakat oğlaklar kurdun kalın sesini tanımışlar; içerden seslenmişler:\n" +
                "\n" +
                "– Sen annemiz değilsin… Onun sesi hem ince, hem de tatlıdır. Senin sesin kalın. Sen kurtsun!\n" +
                "Bunun üzerine kurt bir dükkâna gitmiş, iri bir tebeşir parçası satın almış, bunu yemiş, sesini inceltmiş. Sonra geri dönerek yine kapıyı çalmış:\n" +
                "\n" +
                "– Sevgili çocuklar, kapıyı açın bakayım, demiş; anneniz geldi, hepinize ormandan bir şeyler getirdi.\n" +
                "Kurt kapkara ayaklarını pencereye dayamışmış. Oğlaklar bunu görünce yine bağırmışlar:\n" +
                "\n" +
                "– Sana kapıyı açmayız. Annemizin ayakları seninkiler gibi kara değil. Sen kurtsun!\n" +
                "Kurt yine geri dönmüş, bir fırıncıya gitmiş:\n" +
                "\n" +
                "– Ayağımı bir taşa çarptım demiş; üzerine biraz hamur sürer misin ?\n" +
                "\n" +
                "Fırıncı kurdun ayaklarına hamuru sürmüş. Kurt bu kez değirmenciye koşmuş:\n" +
                "– Ayaklarıma bir parça un serp demiş.\n" +
                "\n" +
                "Değirmenci kendi kendine:\n" +
                "– Kurt yine birini aldatmak istiyor demiş, un vermek istememiş. Fakat kurt:\n" +
                "\n" +
                "– Dediğimi yapmazsan seni yerim! diye bağırınca değirmenci korkmuş, hemen bir avuç un alarak kurdun ayaklarına serpmiş. İnsanlar böyledir zaten!\n" +
                "Bunun üzerine alçak hayvan üçüncü kez eve gitmiş, kapıyı çalmış:\n" +
                "\n" +
                "– Sevgili çocuklar, kapıyı açın bakayım demiş; anneniz geldi, hepinize ormandan bir şeyler getirdi.\n" +
                "Oğlaklar bağrışmışlar:\n" +
                "\n" +
                "– Önce ayaklarını göster de anneciğimiz olup olmadığını anlayalım! demişler.\n" +
                "Kurt ayaklarını pencereye dayamış. Oğlaklar bunların beyaz olduğunu görünce kurdun sözlerine inanmışlar… Kapıyı açmışlar. Bir de ne görsünler?.. Bu giren kurt değil mi? Oğlaklar ne yapacaklarını şaşırmışlar, saklanacak yer aramışlar. Biri masanın altına kaçmış. İkincisi yatağa sokulmuş. Üçüncüsü sobanın içine girmiş. Dördüncüsü mutfağa saklanmış. Beşincisi dolaba girmiş. Altıncısı çamaşır sepetinin altına sokulmuş. Yedincisi de duvar saatinin içine girmiş. Fakat kurt vakit yitirmeden birer birer hepsini yakalayıp tutmaya başlamış. Yalnızca saatin içindeki yedinciyi bulamamış. Karnı da oldukça doyduğu için onu aramaktan vazgeçmiş, çıkıp gitmiş.\n" +
                "\n" +
                "Evin önünde geniş bir çimenlik varmış. Orada bir ağacın altına sırt üstü yatmış, uyumaya başlamış.\n" +
                "Aradan çok zaman geçmeden keçi anne eve dönmüş. Aman Tanrım! Bir de ne görsün? Evin kapısı ardına kadar açık. Masa, sandalyeler devrilmiş. Çamaşır sepeti paramparça olmuş, yatıyor. Yastıklarla yorganlar yerlere atılmış… Keçi anne yavrularını aramış; hiçbir yerde bulamamış. Birer birer adlarını çağırmaya başlamış. Hiçbirinden karşılık alamamış. Sonunda sıra sonuncunun adına gelmiş. O zaman ince bir ses duyulmuş:\n" +
                "\n" +
                "– Duvar saatinin içindeyim, anneciğim!\n" +
                "Keçi, yavrusunu oradan çıkarmış. Küçük oğlak kurdun gelişini, öbür kardeşlerinin hepsini yediğini anlatmış. Keçi annenin, zavallı yavruları için ne kadar gözyaşı döktüğünü kestirebilirsiniz. Sonunda bu acıyla dışarı çıkmış. Küçücük oğlak da birlikteymiş.\n" +
                "\n" +
                "Çayırlığa vardıkları zaman kurdu bir ağacın altında yatar bulmuşlar. Öyle horluyormuş ki, ağacın dalları titriyormuş. Keçi anne kurdu uzun uzun seyretmiş. Karnında bir şeylerin kıpırdadığını, oradan oraya gidip geldiğini görmüş. İçinden:\n" +
                "\n" +
                "– Aman Tanrım, demiş, yoksa kurdun akşam yemeği yaptığı yavrularım hâlâ sağ mı?\n" +
                "\n" +
                "Bunun üzerine küçük oğlak eve kadar koşa koşa giderek makası, iğne-ipliği getirmiş. Keçi anne canavarın karnını yarmış. Daha küçük bir yarık açılır açılmaz oğlaklardan biri kafasını dışarı çıkarmış. Bir parça daha yarınca altısı da arka arkaya fırlayıp çıkmışlar. Hepsi dipdiri sapasağlammışlar. Meğer kurt aç gözlülüğü yüzünden bunları çiğnemeden yutmuşmuş. O andaki sevinci bir düşünün! Hepsi sevgili annelerinin boynuna sarılmışlar. Hoplayıp, sıçramaya başlamışlar. Keçi anne demiş ki:\n" +
                "\n" +
                "– Haydi bakalım, şimdi gidip, taş toplayıp getirin… Uyanmadan şu dinsiz imansızın karnına dolduralım.\n" +
                "\n" +
                "Yedi oğlak çabucak taşları bulup getirmişler; kurdun karnını tıklım tıklım doldurmuşlar. Sonra keçi anne çabucak derisini dikmiş. Bu arada kurt bir şey sezmemiş, yerinden bile kıpırdamamış.\n" +
                "Kurt uykusunu alınca ayağa kalkmış. Karnı taşla dolu olduğu için pek susamışmış. Bir pınarın başına gidip su içmek istemiş. Yürürken oraya buraya kımıldadıkça karnındaki taşlar çarpışmaya, takırdamaya başlamış. Bunun üzerine kurt:\n" +
                "\n" +
                "Şu acayip işe bak!\n" +
                "Karnım bir şeyle dolmuş;\n" +
                "\n" +
                "Yuttuğum altı oğlak\n" +
                "Sanki birer taş olmuş!\n" +
                "\n" +
                "demiş. Pınar başına varınca suya doğru eğilip içmek istemiş. Gel gelelim, karnındaki taşlar yüzünden suya yuvarlanmış. Bağıra bağıra boğulup gitmiş.\n" +
                "Yedi oğlak bunu görünce koşa koşa gelmişler:\n" +
                "\n" +
                "– Kurt öldü! Kurt öldü! diye bağrışmışlar. Anneleriyle birlikte pınarın çevresinde hoplayıp dönmüşler.")

        landmarkList.add(kurtVeKucukOglak)

        val kursunAsker=Landmark(" Kurşun Asker","Yiğit Kurşun Asker Hikayesi. Bir zamanlar, uzak bir ülkede, bir oyuncak evinin içinde tam altı tane kurşun asker yaşarmış. Bunları bir gün alıp bir oyuncakçı dükkanının vitrinine koymuşlardı. Altısı da tüfekleri omzunda esas duruşta duruyordu. Yalnız içlerinden birinin tek ayağı yoktu. Oğlunun doğum günü için armağan almaya çarşıya çıkan bir baba, askerleri görünce çok beğenmiş, hemen dükkana girip onları satın almış, satıcı, askerleri kutuya yerleştirirken birinin tek bacaklı oluşunun nedenini açıklamış babaya. Bunları yapan ustanın kurşunu son askere yetmeyince o da topal kalmış. Baba şaşırmış bu duruma ama bir şey dememiş, kurşun askerleri alıp çocuğuna götürmüş. Doğum gününde eğlenen çocuklar, askerlerle oynayıp eğlenmişler. Oyun oynamaları bitince altı tane kurşun askeri kutularına yerleştirmişler. rafa kaldırıldı. Yarı karanlık kutunun içinde askerlerin canı sıkılıyormuş, Yalnız topal olan kurşun asker kutunun kapağının aralığından dışarıyı görebiliyormuş ve bunu kendisi için bir eğlence gibi görüyormuş.\n" +
                "\n" +
                "Bizim topal kurşun askerin gözüne ilk çarpan, masanın üstündeki oyuncak bir kaleyle kalenin içindeki şato oldu. Şatonun önünde güzel bir prenses heykeli duruyordu. Prenses, kollarını iki yana açıp bir ayağını kaldırmış, aynı dans eder gibiymiş. Topal kurşun asker prensese aşık olmuş. Ağzını bıçak açmaz, bir söz söylemez hale gelmiş. Tek isteği prensesin yanına gitmek, ona kavuşmakmış, başka hiçbir şeyi gözü görmez olmuş. Ertesi gün oyuncakların sahibi olan küçük çocuk, bizim küçük kurşun askeri kutusundan çıkarıp oynamaya başlamış.\n" +
                "\n" +
                "Şimdi hem prensesi daha iyi gören kurşun asker, gözünü ondan ayıramıyormuş. Kurşun askeri prensese bir şey olacak diye o kadar korkuyormuş ki… O sırada hava birden kararmış, şimşekler ve ardından sert bir rüzgâr çıkmış. Rüzgar o kadar Kuvvetli esiyormuş ki, pencerenin yakınında duran kurşun askeri savurup pencereden sokağa yuvarlayıvermiş sokağın bir köşesindeki kaldırımın kenarına düşmüş. Onu kimse görmemiş hatta gelip geçenler, üstüne basacak gibi oluyor,kurşun askerin korkudan yüreği ağzına geliyormuş.\n" +
                "\n" +
                "Rüzgarın ardından yağmur yağıp çukurlara sular birikmiş, sel olup akmaya başlamış. Hava açtığında su birikintisinin başına oynamaya gelen iki çocuk onu görünce o kadar sevinmişler ki. Biri kağıttan bir kayık yapmış, Öteki bizim askeri içine bindirmiş ve iki çocuk sularla oynamaya dalıp bir süre sonra kayıkla askeri unutmuşlar. Kayık suyun içinde yavaş yavaş hareket ederek sürüklenmeye başlamış ve bizim asker yüzen kayığın içinde, silahı omuzunda dimdik duruyormuş. Korkuyu aklından bile geçirmiyormuş, akıp giden yağmur suları sonunda büyük bir ırmağa ulaşınca, kurşun asker , koskoca ırmağın ortasında bir nokta kadar kalmış ve bir süre dalgalara kapılıp ilerlemiş.\n" +
                "\n" +
                "Bu arada yağmur daha hızlı yağmaya başlamış ve kağıttan kayık ıslanınca da içine sular dolmaya başlamış. Böylece ırmağın azgın sularına gömülüvermiş.. Kurşunun ağırlığı onu ırmağın en dibine itiyormuş ve bu karanlık, ıssız soğuk yer artık onu korkutmaya başlamış. Işığa yeniden kavuştuğunda bir evin sıcacık mutfağında ocağın yanında durduğunu görmüş. O sırada sahibi olan çocuk gelip onu bulmuş ve alıp odasındaki yerine koyuş. Kurşun asker oraya geldiği için o kadar mutluymuş ki, ilk işi, prensesi araştırmak olmuş.\n" +
                "\n" +
                "Bir bakmış ki, Prenses, bıraktığı yerde ve iki kolu iki yana açık, bir ayağını kaldırmış dans ediyormuş gibi duruyor ve ona bakıyormuş.Kurşun asker çok mutlu olmuş ki, prensesle bütün gece boyunca birbirlerine sevgiyle bakışıp durmuşlar. Üzerinden birkaç gün geçmiş ama mutluluğu çok uzun sürmemiş. Sahibi olan çocuk bizim kurşun askerden sıkılmış ve artık onunla oynamaz olmuş. Bununla da kalmamış, bizim kurşun askeri alıp alev alev yanan şöminenin içine atmış. Kurşun askerin alevlerden canı çok yanmış ve bir süre sonra erimeye başlamış.\n" +
                "\n" +
                "Yine sevgilisi prensesten ayrılıyormuş işte, en çok da buna üzülüyormuş doğrusu. Tam o sırada açık pencereden giren güçlü bir esinti, prensesi uçurup ateşin içine düşürüvermiş. Bizim kurşun asker, sevinçle kollarını açıp prensesi kucaklamış. Artık onun için yeni bir hayat başlıyormuş.")

        landmarkList.add(kursunAsker)

        val fareliKoyunKavalcısı=Landmark(" Fareli Köyün Kavalcısı"," Bir varmış, bir yokmuş. Evvel zaman içinde, kalbur zaman içinde develer tellal iken, fareler berber iken, ben dedemin beşiğini tıngır mıngır sallarken; ülkenin birinde bir köy varmış. Halkı mutluluk içinde yaşarmış. Günlerden bir gün köyün bütün evlerine fareler dolmuş. Binlerce fare köyün sokaklarında, evlerde dolaşıyorlarmış. Yatak odasına gitseler, mutfağa girseler farelerden geçilmiyormuş. Ne bulurlarsa yiyorlarmış. Halk ne yapacağını şaşırıp kalmış.\n" +
                "\n" +
                "Köy muhtarından bu işe bir çare bulmasını istemişler. Muhtarın da elinden bir şey gelmiyormuş. Böylece köyün adına fareli köy denmiş. Fareli köyün çocukları da, bu pis yaratıklarda bıkmışlar. Bir gün fareli köye bir çalgıcı gelmiş. Muhtara:\n" +
                "\n" +
                "“Eğer bana bir kese altın verirseniz, köyü farelerden temizlerim.” demiş. Bütün köy halkı bu habere sevinmişler. Aralarında hemen çalgıcının istediği bir kese altını toparlamışlar ve muhtara teslim etmişler. Halkın tek istediği bu farelerden kurtulmakmış. Çalgıcı isteğinin kabul edildiğini öğrenince başlamış kavalını çalmaya. Kavaldan öyle tatlı, öyle güzel sesler çıkıyormuş ki, fareler saklandıkları yerlerden akın akın çıkarak çalgıcının yanına geliyorlarmış.\n" +
                "\n" +
                "Kısa bir sürede çalgıcının etrafı binlerce fare ile dolmuş. Köydeki bütün farelerin çalgıcının etrafında toplandığı sırada çalgıcı yürümeye başlamış. Köye gelirken gördüğü dereye doğru yürümüşler. Çalgıcı önde kavalını üflüyor, fareler peşinden geliyormuş. Çalgıcı dere kenarına gelince suyun içine yürümüş. Derede o kadar çok su varmış ki ama çalgıcı karşı kıyıya geçmiş. Farelerde peşinden gelmek isteyince dereye düşen fare suda boğulup ölmüş. Bütün fareler ölünceye kadar çalgıcı kavalını öttürmeye devam etmiş. Çalgıcı bütün farelerin öldüğünü görünce ödülü olan bir kese altını almak için hemen köye geri dönmüş. Fareleri yok eden başarısından sevinç duyduğu için, emin adımlarla yürüyormuş. Sonunda köye varınca:\n" +
                "\n" +
                "“Bir kese altınımı alırım. Bu altınlarla şehre gider, işimi kurarım. Bende zengin insanlar arasına katılır ve rahat yaşamaya başlarım” diye düşünmüş. Bu düşüncelerle muhtarın yanına varan çalgıcı muhtardan ödülünü istemiş. Muhtar oyun bozanlık yapmış.\n" +
                "\n" +
                "“Nasıl olsa farelerden kurtulduk, bir kese altını vermesem olur” diye düşünmüş. Çalgıcıya çeşitli nedenler göstererek altınlarını vermemiş. Çalgıcı kandırıldıgını anlayınca:\n" +
                "\n" +
                "“Ben size bir oyun oynayayım da görün” demiş. Başlamış kavalını çalmaya. Kavalın sesini duyan bütün çoçuklar çalgıcının yanına koşmuş. Çalgıcı da hem kavalını üflüyor, hemde yürümeye başlamış. Köyün bütün çocuklarıda kavalcının peşinden gitmişler. Köyde hiç çocuk kalmamış. Analar babalar kara kara düşünmeye başlamışlar. Köylüler muhtara gidip:\n" +
                "\n" +
                "“Ne yapacağız, ne edeceğiz. Sen çalgıcının hakkı olan bir kese altını vermeliydin. Bak şimdi çocuklarımızı aldı götürdü” demişler. Kavalcı kızgın kızgın, peşinde çocuklarla birlikte ormana varmışlar. Ormanda bir ağacın altında dinlenirken aklına tekrar muhtara gitmek altınlarını bir daha istemek gelmiş. O sırada telaşla yerinden kalkınca kavalını almayı unutmuş. Sihirli kavalı bulan bir çocuk, arkadaşlarının yanına gelmesi için başlamış çalmaya. Kavalın sesini duyan çocuklar hemen ormanda toplanmışlar. Hemen köye, annelerinin babalarının yanına dönmeyi düşünmüşler.\n" +
                "\n" +
                "Kavalı bulan çocuk köyün yolunu biliyormuş. Kavalı çalan çocuk önde diğerleri arkasında köye geri dönmüşler. Anneleri, babaları çok sevinmişler. Şenlikler düzenlemişler. Kırk gün kırk gece bayram etmişler. Tabi bu sırada da köylüler muhtarı azarlamışlar. Çalgıcının hakkını vermesini söylemişler. Hakkını alan çalgıcı da hayallerini gerçekleştirmek için köyden ayrılmış. Onlar ermiş muradına, biz gidelim diğer masalları okumaya.")

        landmarkList.add(fareliKoyunKavalcısı)

        val ucKucukDomuzcuk=Landmark(" Üç Küçük Domuzcuk","Bir gün ormanın birinde üç küçük domuzcuk ve annesi yaşarmış.\n" +
                "\n" +
                "Annesi onlara artık evlerinden ayrılmaları gerektiğini ve kendi hayatlarını kurmaları gerektiğini söylemiş.\n" +
                "\n" +
                "Hepsinin valizi hazırlamış ve onları yolcu etmek için kapının önüne çıkarmış.\n" +
                "\n" +
                "Annesi onlara giderken ne olursa olsun herzaman her işinizi sağlam yapın diye tembihlemiş.\n" +
                "\n" +
                "Üç kardeşten en küçükleri gittikleri yerde samandan ev yapmaya başlamış ve bir günde evi bitirmiş.\n" +
                "\n" +
                "Ortanca kardeş ve büyük kardeş evi görünce büyük olan bu evin sağlam olmadığını kurt gelirse ne yapacağını sormuş küçük kardeşe.\n" +
                "\n" +
                "Çünkü ev samandanmış.\n" +
                "\n" +
                "Küçük kardeş bişey olmaz demiş abisinin uyarısını dikkate almamış.\n" +
                "\n" +
                "Daha sonra küçük kardeşin işi bittiği için oyun oynamaya bol vakti kalmiş. Sürekli oyunlar oynuyormuş.\n" +
                "\n" +
                "Ortanca kardeşte ormanda bulduğu tahtalardan ev yapıyormuş.\n" +
                "\n" +
                "Küçük kardeşinkine göre biraz daha sağlam olmuş. Oda üç günde bitirmiş evini.\n" +
                "\n" +
                "Büyük kardeş evi gördüğünde evin sağlam olmadığını kurt gelirse ne yapacağını sormuş.\n" +
                "\n" +
                "Ortanca kardeşte bişey olmaz diyerek abisinin söylediklerini dikkate almamış.\n" +
                "\n" +
                "Küçük domuzcuk ve ortanca domuzcuk sürekli oyunlar oynuyor büyük domuzcuk ise beton ve tuğladan sağlam evini yapmaya devam ediyormuş.\n" +
                "\n" +
                "Kardeş domuzcuklar niye bukadar çok uğraşıyorsun abi gel bizle oyun oyna ne gerek var diyorlarmış.\n" +
                "\n" +
                "Büyük domuzcuk uzun uğraşlar sonucu evini bitirmiş.\n" +
                "\n" +
                "Bir gün kurt karnı çok aç bi vaziyette küçük domuzcuğun evine gelmiş ve kapıyı çalmış.\n" +
                "\n" +
                "Tık tık tık.\n" +
                "\n" +
                "Kim o diyen domuzcuk kurtun sesini duyunca çok korkmuş.\n" +
                "\n" +
                "Kurt kapıyı açmasını istemiş ama domuzcuk açmamış.\n" +
                "\n" +
                "Kurt eğer kapıyı açmazsan üflerim püflerim demiş ve büyük bir nefes alıp üflemiş.\n" +
                "\n" +
                "Domuzcuğun evide dağılmış ve küçük domuzcuk ortanca domuzcuğun evine zorla kaçmış.\n" +
                "\n" +
                "Abisine başına gelenleri anlatmış.\n" +
                "\n" +
                "Bu sırada kurt ortanca domuzcuğun evine gelmiş ve kapıyı çalmış.\n" +
                "\n" +
                "Merak etme demiş bu eve bişey olmaz.\n" +
                "\n" +
                "Bu sırada kurt yine güçlü nefesiyle üfleyerek tahta evide yıkmış.\n" +
                "\n" +
                "Bu sefer iki domuzcukta büyük domuzcuğun evine kaçmışlar. Abisi onları içeri almış ve kapıyı kilitlemiş.\n" +
                "\n" +
                "Kurt kapıyı çalmış ve büyük domuz kapıyı açmamış.\n" +
                "\n" +
                "Kurt madem kapıyı açmıyorsunuz bende üflerim demiş ve nekadar çok üflediysede evi yıkamamış.\n" +
                "\n" +
                "Ertesi gün evlerine giden domuzcuklar annelerine olanları anlatmışlar ve annesinin onlara söylediği nasihatın nekadar doğru olduğunu görmüşler.\n" +
                "\n" +
                "Mutlaka her işimizi doğru ve sağlam yapmalıyız ki başarılı olalım demişler.")

        landmarkList.add(ucKucukDomuzcuk)

        val ormanCocuk=Landmark(" Orman Çocuğu","Evvel zaman içinde Afrika ormanında hayvanlar ormanın bilge kurallarına bağlı yaşarlarmış. Ormana yakın bir yerde yaşayan birde kabile varmış. Bir gece ormanın topal kaplanı Sher Khan, köylüleri avlamaya karar vermiş. Köye kükreyerek saldırmış.\n" +
                "\n" +
                "Kaplanın yardımcısı olan çakal Tabaqui onu takip ediyordu. Bir adamı yakalayacağı esnada Sher Khan kırmızı çiçeğin üstünden atladı ve yüksek sesle kükredi. Raksha ise yavrularıyla birlikte mağaranın önünde oturmuş olanları izliyordu.\n" +
                "\n" +
                "Anne Kurt “Şu korkak kaplan, en zayıfları avlıyor, yani insanları.”\n" +
                "\n" +
                "Raksha “Sonuçta kaplan topal, ondan geyik avlamasını nasıl bekleyebiliriz?”\n" +
                "\n" +
                "Anne Kurt “Sadece bacağı yanmış gibi görünüyor.” demiş.\n" +
                "\n" +
                "Kükremeler durdu ve ormana yine bir sessizlik çöktü. Kurtlar sohbet ederken çalılıklarda bir hışırtı olduğunu fark ettiler. Baba kurt saldırmak üzere hemen hazırlandı. O anda gelenin köyden kaçmış ve emekleyerek kurtların mağarasına gelen bir küçük çocuk olduğunu görünce;\n" +
                "\n" +
                "Anne Kurt “Bu bir orman çocuğu, ona ben bakacağım, kendi çocuğum gibi büyüteceğim. Adını Mowgli koyuyorum.”\n" +
                "\n" +
                "Raksha, “bence sürü bir insan yavrusunu kabul etmeyecektir.”\n" +
                "\n" +
                "“Ben hallederim.”\n" +
                "\n" +
                "Tabaqui mağaranın arkasında gizleniyordu ve Sher Khan’a insan yavrusundan söz etti. Sher Khan, hemen mağaraya ulaştı: “O insan yavrusu benim avım. Onu hemen bana verin.”\n" +
                "\n" +
                "“Git buradan topal ödlek. O benim çocuğum, sakın ona elini sürme.” Yangında sakatlanmış olan Sher Khan annenin öfkesini görünce oradan uzaklaşırken “Günün birinde o çocuk pençelerime ve ağzıma düşecek.” demiş.\n" +
                "\n" +
                "Ertesi gün, Mowgli’yi kurt sürüsüyle tanıştırdılar. Uzun bir tartışma ve Bagheera’nın onayından sonra Mowgli’yi kabul etti.\n" +
                "\n" +
                "Kaplan Bagheera ve Ayı Baloo ona ormanın kurallarını öğretecek, ancak büyüdüğünde kendi kabilesine dönmesi gerekecekti. Mowgli ormanda, orman yaşamının kurallarını öğrenerek büyüdü. Ayı Baloo ise ona ormanla ilgili tüm bildiklerini, hayvanların dilini konuşmayı, bal bulmak ve balık yakalamak gibi en sevdiği şeyleri de öğretti. Kaplan Bagheera ise ona kendini korumayı öğretti.\n" +
                "\n" +
                "Mowgli ormana iyice bağlanmıştı. Kardeşleri yani yavru kurtlar onu çok seviyordu. Kısa sürede ormandaki tüm hayvanlarla arkadaş olmuştu. Bazıları ona orman çocuğu diye hitap ediyor, bazıları ise ismiyle hitap ediyordu.\n" +
                "\n" +
                "Yıllar geçtikçe kurt sürüsünün lideri olan Akela, eskisi gibi avlanamaz hale geldi. Sher Khan onun bu zayıflığından faydalanmak istedi: “Siz genç kurtlar, artık sürünün lideri olmanızın zamanı geldi. Akela’yı liderlikten alın, bana insan yavrusunu verin. Yoksa sizin bölgenizde avlanır, size tek bir kemik parçası bile bırakmam.” demiş.\n" +
                "\n" +
                "Genç kurtlar Akela’ya liderlikten ayrılmasını söyleyince o, “Mowgli’yi Sher Khan’a veriyorsanız korkaksınız demektir. Eğer Mowgli’nin gitmesine izin verirseniz liderlikten ayrılmayı kabul edeceğim.” demiş.\n" +
                "\n" +
                "Bagheera’nın bu toplantıdan haberi olunca: “Mowgli, artık Sher Khan’a haddini bildirmeliyiz. Karşı koymanın zamanı geldi.”\n" +
                "\n" +
                "Mowgli: “Ama ona bir başıma nasıl karşı koyarım? Bütün sürü şu an Sher Khan’la.”\n" +
                "\n" +
                "“İnsanların köyüne git ve kırmızı çiçeği getir. Kırmızı çiçek onları korkutup kaçıracaktır.”\n" +
                "\n" +
                "“Artık ormandan ayrılıp kendi türümle yaşasam iyi olacak.” demiş.\n" +
                "\n" +
                "Mowgli, Bagheera ve Baloo’ya sarıldı. Hayatında ilk kez gözlerinden yaş akıyordu. Mowgli, kısa bir süre sonra Baloo’nun karnının üzerine uzanmış bir şekilde ağacın üstünde uyuyakaldı.\n" +
                "\n" +
                "Mowgli’yi gören maymun sürüsü onu alıp kaçırdılar. Maymunlar ormanın en deli hayvanlarıydı, hayatlarında kanun kural yoktu. Baloo ve Bagheera uyanınca Mowgli’nin köye doğru yola çıktığını düşündüler. Halbuki Maymunlar Mowgli’yi ormanda ağaçtan ağaca taşıyorlardı.\n" +
                "\n" +
                "Bir süre sonra Chil’i onları fark etti. Mowgli, ona kuşdilinde Baloo ve Bagheera’ya maymunların onu nereye götürdüğünü iletmesini söyledi.\n" +
                "\n" +
                "Maymunlardan biri “Kapa çeneni, bu da başka bir numara senden tüm bu numaraları öğrenmek istiyoruz. Eğer hayvanları kontrol etmeyi öğrenirsek tüm ormana hükmedebiliriz.” dedi.\n" +
                "\n" +
                "Chil Baloo, Bagheera’ya Mowgli’nin kaçırıldığını ve onları soğuk inde saklı tutuklarını söyledi.\n" +
                "\n" +
                "Kaplan Bagheera, “Orası ormanda terk edilmiş bir şehir. O maymunlar hem kurnaz hem tehlikeli. Onlarla tek başımıza savaşamayız. Kaa’dan yardım istemeliyiz.” Yılan Kaa’nın yanına gidip kendilerine yardım etmeye ikna ettikten sonra hep birlikte harabelere gittiler.\n" +
                "\n" +
                "Maymunlar Mowgli’yi devasa bir kubbede saklıyordu. Önce harap olan yere Bagheera girdi. Maymunları ısırıp oraya buraya fırlatmaya başladı. Ama maymunların sayısı çok fazlaydı.\n" +
                "\n" +
                "Ayı Baloo “Sen Mowgliyi bul, ben o kaçık hayvanların icabına bakacağım.” demiş. Sonra da maymunları oraya buraya fırlatmaya başlamış ama maymunların sayısı yine çok fazlaydı. Maymunlar onun karnına oturup onu dövmeye başladığı zaman, Kaa gelerek tıslamaya başlayınca Maymunlar korkarak bir ağaca tırmandılar.\n" +
                "\n" +
                "Kaa Mowgli’yi sakladıkları kubbeyi kırdı ve onu serbest bıraktı:”Ahh harika, bu ne leziz bir et böyle.”\n" +
                "\n" +
                "Kaplan Bagheera “Hayır Kaa, çocuktan hemen elini çek.”\n" +
                "\n" +
                "Kaa Mowgli’yi çözdü. Sonra dans etmeye başladı ve maymunlar bu dansla hipnotize oldu ve maymunları beraberinde götürdü.\n" +
                "\n" +
                "Mowgli “Artık bu orman bana göre değil galiba, biran önce buradan ayrılmalıyım.” diye düşündü.\n" +
                "\n" +
                "Mowgli, Bagheera ve Baloo’ya veda ederek köye doğru yola çıktı. Köylüler önce Mowgli’den korktu: Kimisi “Bu çocuk ormandan gelmiş, düzenbaz olabilir.” Kimisi “Bize büyü yapabilir.” Kimisi “Masum bir çocuğa benziyor. Niye böyle varsayımlarda bulunuyorsunuz? Gel çocuğum, benim yanımda dur.” demiş. Ama en sonunda onu aralarına kabul etmişler.\n" +
                "\n" +
                "Mowgli kısa zamanda köy yaşamını ve dillerini öğrendi. Ona yapacak bir iş verdiler. Hayvanları güdüyordu. Arkadaşları Bagheera ve Baloo onunla ara ara dağda buluşuyorlardı.\n" +
                "\n" +
                "Bir gün gri kurt kardeşi onunla görüşmeye geldi: “Sürünün başı dertte, Sher Khan kurtları teker teker öldürmeye karar vermiş.”\n" +
                "\n" +
                "Mowgli “Beni Sher Khan’a vermeye karar vermiştiniz. Şimdi sizi neden düşüneyim?”\n" +
                "\n" +
                "“Aynı türden değiliz ama annemiz bizi öz kardeş gibi yetiştirdi. Onun intikamını almalıyız.”\n" +
                "\n" +
                "“Ne..Yani.. Annemize ne oldu.”\n" +
                "\n" +
                "” Sher Khan’la dövüşürken öldü.”\n" +
                "\n" +
                "“Nasıl yani, niçin”\n" +
                "\n" +
                "“Mağaraya seni sormaya gelmişti ama annem tek kelime bile etmedi.”\n" +
                "\n" +
                "“Yeterli, artık Sher Khan’ın canını bağışlamam. “\n" +
                "\n" +
                "Mowgli, hayvanlarını Sher Khan’ın saklandığı vadiye götürdü. Kendisi bufalolardan birinin üstündeydi. Vadiye ulaşınca sürünün gerçek lideri Akela’da onlara katıldı.\n" +
                "\n" +
                "Mowgli “Sen hayvanların bir kısmını ters yöne götür. Bende buradan hızlı bir şekilde getireceğim. Sher Khan tuzağa düşecek.” demiş.\n" +
                "\n" +
                "Planladıkları gibi hayvanları Sher Khan’a doğru koşarken bıraktılar. Tüm vadi hayvanların ayak sesleriyle titremeye başladı. Sher Khan hayvanların ayak seslerini duydu ve kaçacak bir yer aradı ancak vadiye dağlar dik duruyordu. O yüzden kaçabileceği hiçbir yer yoktu. Büyükbaş hayvanlar büyük hışımla koşarak geldiler ve Sher Khan’ı ezip geçtiler.\n" +
                "\n" +
                "Boğa Sher Khan’ı çamurun içinde ezdi. Bufalolar üstüne bastı, artık koşmalarına gerek kalmamıştı. Mücadele bitmişti. Köyün ve ormanın düşmanı olan Sher Khan böylece öldü.\n" +
                "\n" +
                "Akela gösterdiği liderlik için onurlandırıldı ve Mowgli ormandan ayrıldı. Bir zaman sonra Mowgli Messua’nın gerçek annesi olduğunu öğrendi. Ormandakilerde köylerde sonsuza kadar mutlu yaşadı.")

        landmarkList.add(ormanCocuk)


        val jackVeFasulyeSirigi=Landmark(" Jack ve Fasulye Sırığı","Evvel zaman içinde kimsenin pek bilmediği bir ülkenin uzak mı uzak bir köyünde, dul bir kadınla oğlu yaşarmış. Öylesine yoksullarmış ki paraları yok denecek kadar azmış. Rosi adını verdikleri bir inekten başka bir şeyleri de yokmuş.\n" +
                "\n" +
                "Kadın her sabah Rosi’nin sütünü sağar, sonra da kasabaya götürür satar, kazandığı parayla yiyecek bir şeyler alıp eve dönermiş. Oğlu Jack ise miskin miskin yatarmış.\n" +
                "\n" +
                "Onlar böyle zar zor geçinip giderken günlerden bir gün Rosi süt vermeyince, Jack ve annesinin bir lokma ekmek satın alacak paraları kalmamıştı.\n" +
                "\n" +
                "İkisini de bir düşüncedir almış. Doluya koymuşlar almamış, boşa koymuşlar dolmamış. Ne yapsak ne etsek derken Rosi’yi satmaya karar vermişler.\n" +
                "\n" +
                "Annesi Jack’e, “Artık Rosi’den bize fayda yok, en iyisi onu kasabaya götür de sat. Eline geçen parayla da ekebilmemiz için buğday tohumu al.” demiş.Jack ineğin yularından tutup isteksiz adımlarla kasabaya doğru yola koyulmuş. Az gitmiş, uz gitmiş dere tepe düz gitmiş, tam kasabaya varacakları sırada karşılarına ihtiyar bir adam çıkıvermiş.\n" +
                "\n" +
                "Bu sevimli ihtiyarın sakalı öyle uzunmuş ki neredeyse yere değecekmiş. Hiç sakal bu kadar uzar mı demeyin, bizim Jack de böyle demiş ama sonunda hiçbir şeyin imkansız olmadığına inanmış.\n" +
                "\n" +
                "Fakat uzunca bir süre şaşkınlığını üzerinden atamamış. Çünkü Rosi bile ihtiyarı görünce hayretinden mölemeye başlamış.\n" +
                "\n" +
                "Uzun sakallı ihtiyar önce keyifli keyifli gülümsemiş. Sonra elindeki fasulye tanesini Jack’e göstererek, “İneğini bana verirsen, ben de sana bu fasulye tanesini veririm.” Demiş.\n" +
                "\n" +
                "Jack, ihtiyarın bu sözleri karşısında ilkin biraz duraksamış. Sonra ihtiyara, “Sen ne söylediğinin farkında mısın? Diye çıkışmış.\n" +
                "\n" +
                "İhtiyar “Hemen sinirlenme, bu öyle senin bildiğin gibi fasulye tanesi değil.”\n" +
                "\n" +
                "Jack “Basbayağı fasulye işte”\n" +
                "\n" +
                "İhtiyar “Beni dinlersen karlı çıkarsın. Çünkü bu fasulye tanesi sihirlidir. Köyüne geri döndüğünde bunu ekersen, bir gecede büyüyüp boyunun göğe kadar uzandığını göreceksin”\n" +
                "\n" +
                "Jack merakla sormuş “Yaaa! Gerçekten doğru mu söylüyorsun,”\n" +
                "\n" +
                "İhtiyar ” Tabiki, şimdi kabul edecek misin önerimi?”\n" +
                "\n" +
                "Jack düşünmüş taşınmış, sonrada burnunu kaşımış. İhtiyara dönüp, “Peki, senin dediğin gibi olsun.” demiş. Bunu duyan Rosi uzun uzun mölemiş." +
                "“Siz kendi yolunuza, ben kendi yoluma” diyerek kötün yolunu tutmuş bizim Jack. “İyi mi yaptım, kötü mü yaptım?” diye düşüne düşüne sonunda köyüne varmış.\n" +
                "\n" +
                "“Anne bak sana ne getirdim” diye seslenmiş annesine, annesi merakla yanına gitmiş, Ardından jack olanları bir bir anlatmış.\n" +
                "\n" +
                "Annesi dinlemiş, o anlatmış. O anlatmış annesi dinlemiş. Dinledikçe kaşlarını çatmış, dudaklarını bükmüş. Sonrada “Hadi ver şu fasulye tanesini” demiş kızgın kızgın.\n" +
                "\n" +
                "Jack elindeki fasulye tanesini çıkarıp annesine uzatmış. Jack ne bilsin başına gelecekleri. Meğer annesinin sevineceğini sanmış. Annesi fasulye tanesini eline aldığı gibi pencereden dışarı fırlatmış.\n" +
                "\n" +
                "“Seni gibi düzenbaz, senin sadece tembel olduğunu sanıyordum. Ama sen akılsızmışsın da…” diye bağırmış.\n" +
                "\n" +
                "Bizim Jack kendisini odasına zor atmış. O gece ne ekmek yemiş, ne de su içmiş. Yorgunluktan oturduğu yerde uyuyakalmış.\n" +
                "\n" +
                "Ertesi gün güneşin ilk ışıklarıyla uyanınca temiz hava almak için pencereyi açmış. Bir de ne görsün! Karşısında kocaman bir fasulye sırığı duruyormuş.\n" +
                "\n" +
                "Pencereyi hızla kapatıp dışarıya fırlamış. Fasulye sırığını aşağıdan yukarıya şöyle bir süzmüş.\n" +
                "\n" +
                "“Bizim ihtiyarın söyledikleri doğruymuş meğer,” demiş hayretle. Sonra da fasulye sırığının nereye kadar uzandığını merak edip tırmanmaya başlamış.\n" +
                "\n" +
                "Tırmandıkça tırmanmış, yükseldikçe yükselmiş. Bir de aşağı bakmış ki her yer küçücük görünüyor.\n" +
                "\n" +
                "“Amma da tırmanmışım ha!” Demiş. Sanki o tırmanıyor fasulye sırığı uzuyormuş. Sonunda kendini bir bulutun üzerinde bulmuş. Bulut kaşını şöyle bir kaldırmış.\n" +
                "\n" +
                "“Üzerimde tepinmekten vazgeç artık, hem sen ne arıyorsun burada?” Demiş.\n" +
                "\n" +
                "Jack kekelemeye başlamış: “Be… Be.. ben burayı merak ettim de…”\n" +
                "\n" +
                "“Öyleyse arkana bak” demiş bulut.Jack arkasına dönünce bir de ne görsün! Taştan yapılmış kocaman bir şato. Buluttan buluta atlayarak şatonun kapısına varmış. Yavaşça kapıyı açıp içeri bakmış. Karşısında bir dev kadın olduğunu görünce biraz irkilmiş tabi. Dev kadın gür bir sesle haykırmış:\n" +
                "\n" +
                "“Sen de kimsin, benim evime izinsiz nasıl girersin?” Bu sözleri duyunca Jack’ın ayakları geri geri gitmiş. Ama sonra cesaretini toplayıp, “Bana verebilecek yiyeceğiniz var mı? Çok acıktım da” demiş\n" +
                "\n" +
                "Dev kadın gülümsemiş. “Hadi içeri gel. Sana yeni yaptığım çöreklerden vereyim.”\n" +
                "\n" +
                "Jack çöreği tam ağzına götürecekmiş ki şato büyük bir gürültüyle sarsılmış. “Eyvah!” demiş dev kadın. “Kocam geliyor. Hemen saklanmalısın. Çünkü benim kocam çocuklara hiç dayanamaz. Bir lokmada yutuverir onları.”\n" +
                "\n" +
                "Jack bunları işitince eli ayağına dolaşmış. Dev kadın: “Çabuk şu fırının arkasına gir.” demiş.\n" +
                "\n" +
                "Jack hızla fırının arkasına saklanmış. Bir yandan da “Dev adam ya beni yakalasa!” diye  düşünüyor, tir tir titriyormuş. Dev, kapıyı sertçe açmış ve neşeli bir şekilde şarkı söylemeye başlamış.\n" +
                "\n" +
                "İnsanları çok severim, kokularını alırım, nerede olduklarını hemen anlarım. Ben iyi bir devim. “Hımm… Burada bir çocuk var galiba. Nerede hadi söyle” demiş karısına.\n" +
                "\n" +
                "Devin Karısı: ” Ne çocuğu, dün akşam yediğin koyun etinin kokusudur.” Dev adeta eşine inanmıştı ama etrafta da kimsecikler yoktu.\n" +
                "\n" +
                "Dev yemeği yedikten sonra altınları saymaya başlamış. Bir.. Üç… Derken uyuyakalmış. Bizim Jack saklandığı yerden çıkarak, devin elinden altın kesesini yavaşça çekmiş. Altınları içine doldurup hızla oradan uzaklaşmış.\n" +
                "\n" +
                "Bulutların üzerinden atlaya zıplaya düşe kalka, fasulye sırığına ulaşmış. Fasulye sırığına sıkıca tutunarak aşağıya inmiş.\n" +
                "\n" +
                "Jack’in annesi altınları görünce hem çok sevinmiş, hem de bu işe bir türlü akıl sır erdirememiş. Aradan günler, haftalar aylar geçmiş.\n" +
                "\n" +
                "Altınlar da suyunu çekmiş. Jack çaresiz yine sırığına tırmanmış. O sırada bulutlar uyuyorlarmış. Bir tanesi gözlerini açmış. “Yine mi sen, yoksa evin şatosuna mı gidiyorsun?”\n" +
                "\n" +
                "“Evet,” diye karşılık vermiş Jack.\n" +
                "\n" +
                "“Biraz dikkatli olsan iyi edersin” demiş bulut. Sonra da “pişman olabilirsin.”\n" +
                "\n" +
                "“Sağ ol, ben ne yaptığımı iyi bilirim.”\n" +
                "\n" +
                "“İyi öyleyse, sen bilirsin benden söylemesi ” demiş bulut.\n" +
                "\n" +
                "Jack’i şatonun kapısında devin karısı karşılamış. “Doğrusu senden biraz kuşkulandım, geçen sefer geldiğinde bir kese altınımız kayboldu.”\n" +
                "\n" +
                "Bunları duyan Jack: “Yaaa, demek öyle!” demiş ama bir yandan da kendini çok kötü hissetmiş. Çünkü devin karısının ona yaptığı iyiliği unutamıyormuş.\n" +
                "\n" +
                "Dev kadın onu içeri almış, sonra da ona güzel bir kahvaltı hazırlamış. Bizim Jack tam yumurtasını ağzına götürecekken, şato şiddetli bir şekilde sallanmaya başlamış. Dev kapıyı açıp içeri girmeden, Jack çabucak fırınına arkasına girivermiş." +
                "Dev yine aynı şarkıyı söylüyormuş. “İnsanları çok severim, kokularını alırım, nerede olduklarını hemen anlarım. Ben iyi bir devim.” diye mırıldanırken karısı onun bir şey sormasına fırsat vermeden,\n" +
                "\n" +
                "“Canım kocacığım! Bu gün sana güzel yemekler yaptım. Hemen kokusunu aldın değil mi? demiş.\n" +
                "\n" +
                "Dev, gevrek gevrek gülmüş. “O kadar çok acıktım ki, anlatamam” demiş. Bu sırada devin elinde bembeyaz bir tavuk varmış, karısı: \n" +
                "\n" +
                "“Onu bana ver de yarın pişireyim,” demiş.\n" +
                "\n" +
                "” Olmaz,” diye bağırmış dev. Hem de öyle bir bağırmış ki bir ara Jack’ın annesi bile başını kaldırıp gökyüzüne bakmış.\n" +
                "\n" +
                "Dev elindeki tavuğu yere bırakmış. Ona “Yumurta” diye emretmiş. Onları izleyen Jack, hayretler içinde kalmış. Çünkü tavuk, altın bir yumurta yumurtlamış.\n" +
                "\n" +
                "“Vay canına!” demiş Jack yavaşça. Çok geçmeden dev uykuya dalmış. Jack fırının arkasından çıktığı gibi tavuğu kapmış.\n" +
                "\n" +
                "Tavuk neye uğradığını şaşırmıştı. Bizim Jack doğruca fasulye sırığının yanına koşmuş. Gökyüzünden aşağıya öyle bir hızlı inmiş ki bir anda kendini bahçede bulmuş.\n" +
                "\n" +
                "Hemen annesine seslenmiş: -“Annee. Annee!.. Sana çok sevineceğin bir süprizim var.” Oğlunun sesini duyan kadın, pencereden başını uzatmış. “Ne var, ne oldu” diye sormuş.\n" +
                "\n" +
                "Jack gururla gülümsemiş. ” Yumurta!” der demez, tavuk altın bir yumurta yumurtlamış.\n" +
                "\n" +
                "Kadın gözlerine inanamamıştı, sonra da Jack’e dönüp, “Bana bak, ben senin çalışmanı istiyorum, çalmanı değil!…” Jack bu işe biraz bozulmuş. Fakat annesinin bu sözlerini hiç umursamamış.\n" +
                "\n" +
                "Gel zaman git zaman derken Jack, yeniden devin şatosuna gitmeyi kafasına koymuştu. Ertesi gün sabah erkenden kalkmış ve annesine görünmeden fasulye sırığına tırmanmaya başlamış.\n" +
                "\n" +
                "Şatoya vardığında etrafta kimsecikler yokmuş. Ne devin karısı, ne de dev… Jack yavaşca kapyı açmış. içerde de kimsecikler görünmüyormuş. Önce saklanacak bir yer aramış. Yine fırının arkasına saklanırsam, beni hemen bulurlar, diye geçirmiş içinden.\n" +
                "\n" +
                "Odanın ortasında dolanıp dururken bir dev heykeli ilişmiş gözüne. Bizim Jack’in gözleri ışık ışık parlamış. Tam O anda şato sallanmaya başlamış. Jack de kendini heykelin arkasına zor atmış.\n" +
                "\n" +
                "Dev her adım atışında yer yerinden oynuyormuş. Sizin de duyduğunuz gibi yine aynı şarkıyı söylüyormuş.  Niye mi? Jack’in kokusunu almış da ondan.\n" +
                "\n" +
                "Bu arada Jack gizlice  devi izliyormuş. Dev gür sesiyle haykırmış: “O çocuk burada. Bu kez onu mutlaka bulacağım!” Onu duyan karısı koşup gelmiş. ” Ne çocuğu, çocuk buradaysa ben niye görmedim?” Diye sormuş.\n" +
                "\n" +
                "Dev önce yeri göğü inleten bir kahkaha patlatmış. Öyle ki arkasına saklandığı heykel devrilecek diye Jack’in ödü kopmuş. Neyse ki böyle bir şey olmamış.\n" +
                "\n" +
                "Dev: “Ben öyle diyorsam, öyledir. Yoksa bana inanmıyor musun?” diye bağırmış.\n" +
                "\n" +
                "Karısı: “Tabi inanıyorum, ama nereye saklanmış olabilir ki” diye sormuş.\n" +
                "\n" +
                "“Şu fırının arkasına bak bakalım” demiş.\n" +
                "\n" +
                "Fırının arkasına bakmışlar, ama bulamamışlar. Aramışlar taramışlar, en sonunda evin altını üstüne getirmişler.\n" +
                "\n" +
                "“Yok, yok, yok… işte” demiş devin karısı. Bu sırada masanın üstünde duran arpa takılmış gözüne “bu da ne” diye sormuş karısı\n" +
                "\n" +
                "“Görmüyor musun, bu bir arp” demiş dev. Sonra da “Çal,” diye emretmiş. arpa.\n" +
                "\n" +
                "Arp kendi kendine öyle güzel melodiler çalıyormuş ki yıldızlar yanıp sönmeye güneş gülümsemeye, ay güneşin etrafında daha hızlı dönmeye başlamış. Bu harika melodilere bulutlar keyiflenmiş, keyiflendikçe dinlemiş.\n" +
                "\n" +
                "Sonunda uykusu gelmiş biraz sonra bu güzel melodilerin yerini devin horultusu almış.Devin derin bir uykuya daldığını gören Jack, masaya tırmanıp sessizce arpı kucaklamış. Küçük  ve hızlı adımlarda kapıya doğru koşmaya başlamış.\n" +
                "\n" +
                "Tam bu şurada hiç beklemediği bir şey olmuş. Ne mi olmuş? “İmdat, kurtarın beni!” Diye bağırmaya başlamış arp.\n" +
                "\n" +
                "Bu sesle uykusundan uyanan dev, Jack’i görünce, “seni gibi hırsız, seni! Burada olduğunu biliyordum. Demek altınlarımı ve tavuğumu sen çaldın ha? Ben şimdi sana gösteririm.” diye çıkışmış.\n" +
                "\n" +
                "Jack soluk soluğa koşuyormuş. Dev de arkasından gidiyormuş. Jack fasulye sırığından aşağı iniyor dev de onu takip ediyormuş.\n" +
                "\n" +
                "Dev aşağı indikçe fasulye sırığı onun ağırlığıyla sallanıyormuş. Sonunda Jack avaz avaz bağırmaya başlamış: “Anneee… Annee!.. Çabuk bana bir balta getir!” Oğlunun acı acı kendisine seslendiğini duyan anne, baltayı kaptığı gibi dışarı fırlamış.\n" +
                "\n" +
                "Fasulye sırığından aşağıya inmeye çalışan devi görünce dizlerinin bağı çözülmüş. Ne yapacağını şaşırmış: Jack çarçabuk baltayı eline alıp bir vuruşta fasulye sırığını ortadan ikiye ayırmış.\n" +
                "\n" +
                "Fasulye sırığı yıkılınca, dev de büyük bir gürültüyle yere yığılmış. Devin öldüğünü gören Jack  Annesine sarılmış.\n" +
                "\n" +
                "Gözyaşlarını tutamayan annesi: “Az kalsın yüreğime inecekti. Bir daha kimsenin malını çalmanı istemiyorum.”\n" +
                "\n" +
                "“Ama bunlar onun malı değil ki. O da başkasının malını çalıyordu.” diye kendini savunmuş Jack. \n" +
                "\n" +
                "Annesi onun bu sözlerine kızmış. “Bütün bunlar, senin yaptıklarının doğru olduğunu göstermez. Çalışıp hak ettiğin kadar kazanmalısın. Sonra da Allah’a şükretmelisin.”\n" +
                "\n" +
                "Jack biraz düşündükten sonra annesinin bu sözlerine hak vermiş. Aradan günler, aylar geçmiş. Dinleyen herkes bu masalın sonuna şaşmış.\n" +
                "\n" +
                "Bizim Jack yakışıklı bir delikanlı olmuş. Gerçekten de o günden sonra durmadan çalışıp çabalamış. O çalıştıkça arp, birbirinden güzel melodiler çalıyormuş. Bütün hayvanlar neşelenip ona eşlik ediyormuş.\n" +
                "\n" +
                "Çok geçmemiş ki arpın ünü bütün ülkeye yayılmış. Çaldığı melodiler, dilden dile dolaşır olmuş. Günlerden bir gün ortalığa bir söylenti yayılmış. Herkes birbirine, “Prenses arpı görmeye gelecekmiş” diyormuş.\n" +
                "\n" +
                "Jack’ın buna inanası gelmemiş. Ne zaman ki prensesi karşısında görmüş, işte o zaman inanmış. Heyecandan dili tutulmuş ve hiçbir şey söyleyememiş. Çünkü prensese aşık olmuştu. Tabi prenses de ona.\n" +
                "\n" +
                "Bizim Jack, ne diyeceğini bilememiş ama arp onun yerine dile gelmiş.\n" +
                "\n" +
                "“Birbirini sevenler evlenip mutlu olsun. Prenses ve Jack benim sesimi duysun” demiş. Bunu duyan prenses ve Jack birbirlerine bakmışlar.\n" +
                "\n" +
                "Jack: “Benimle evlenir misin? Sevgili prensesim” demiş. \n" +
                "\n" +
                "Prenses bu teklifi memnuniyetle kabul etmiş. Dillere destan bir düğünleri olmuş. Arp tatlı tatlı çalmış, onlar dans etmiş. Bunu gören herkes dansa katılmış. \n" +
                "\n" +
                "Yıllar sonra Jack ülkeye kral olmuş. Doğruluktan ve dürüstlükten hiç ayrılmamış. Halkıyla sonsuza dek mutlu bir şekilde yaşamış.\n" +
                "\n" +
                "Söylentiye göre arp hala kimsenin bilmediği bir yerde harika melodiler çalmaktaymış. Onu, yalnız hissetmesini bilenler ve bu masalı okuyanlar duyabilirmiş.")

                landmarkList.add(jackVeFasulyeSirigi)

        val aladdinLambasi=Landmark(" Alaaddinin Sihirli Lambası ","Bir varmış, bir yokmuş, evvel zaman içinde kalbur saman içinde, yer mavi, gök yeşil iken, ben ninemin beşiğini tıngır mıngır sallar iken. Uzak bir köyde Alaaddin adında bir oğlu olan dul bir kadın varmış. Alaaddin ve annesi çok yoksulmuş, hayatları yokluk ve sıkıntı içinde geçiyormuş. Alaaddin para kazanmak için en zor işleri yapıyor, her gün çok uzak bölgelere meyve toplamaya gidiyormuş. Bir gün şehirden uzaktaki bir hurmalıkta yabani hurma toplarken garip bir yabancıyla karşılaşmış.\n" +
                "\n" +
                "Bu iyi giyimli, sakallı adamın başındaki sarıkta parlak bir safir taş varmış. Gözleri simsiyahmış ve bakışları insanın içine işliyormuş. Yabancı, Alaaddin’e bir teklif yapmış:\n" +
                "\n" +
                "– Buraya gel evlat! Gümüş bir para kazanmak ister misin? diye sormuş.\n" +
                "\n" +
                "Alaaddin hayretle;\n" +
                "\n" +
                "– Gümüş bir para mı? Böyle bir şeyi kazanmak için her şeyi yaparım, demiş.\n" +
                "\n" +
                "– Senden bir şey istemiyorum. Sadece benim sığamadığım şu delikten aşağı in,\n" +
                "orada söylediklerimi yaparsan karşılığını alırsın, diye konuşmuş adam.\n" +
                "\n" +
                "Alaaddin, adamın yerdeki ağır taşı kaldırmasına yardım ettikten sonra ufak tefek ve çevik olması sayesinde daracık delikten zorlanmadan geçmiş. İçeride daracık bir merdiven bulmuş ve dikkatle aşağı inmiş.\n" +
                "\n" +
                "Aşağısı parlak taşlarla dolu, büyük bir mağaraymış. Eski bir gaz lambasının cılız ışığı yeraltını hafifçe aydınlatıyormuş. Alaaddin’in gözleri bu yarı aydınlık ortama alışınca, çevresinde olağanüstü bir manzara olduğunu fark etmiş. Ağaçların dallarından ışıl ışıl parlayan mücevherler sarkıyormuş. Mağaranın her tarafında altın testiler ve içlerinde değerli taşlar bulunan mücevher kutularıyla doluymuş. Alaaddin, gözlerine inanamıyormuş. Karşısında gerçek bir hazine varmış. Şaşkınlığını henüz üzerinden atamamışken, yukarıdan gelen sesle irkilmiş:\n" +
                "\n" +
                "– Lamba! Lamba! Lambayı söndür ve sadece onu getir bana! Adamın bu kadar mücevherin arasından sadece değersiz bir lambayı istemesine çok şaşıran Alaaddin, onun bir büyücü olduğunu düşünmüş. Aladdin lambayı almış ve merdivenleri tırmanmaya başlamış. Büyücü:\n" +
                "\n" +
                "– Ver onu bana, demiş. Lambayı almak üzere elini uzatarak tekrar onu hemen ver, diye bağırmış. Lambaya bir an önce kavuşmak isteyen adam;\n" +
                "\n" +
                "– Lambayı hemen vermezsen seni sonsuza kadar burada bırakırım, demiş.\n" +
                "\n" +
                "– Önce dışarı çıkmak istiyorum!\n" +
                "\n" +
                "– Bunu sen istedin! Diyerek deliği kapatmış.\n" +
                "\n" +
                "Parmağındaki yüzüğün fırlayıp aşağıya düştüğünü fark etmemiş. Alaaddin birden ayağının altında bir şey hissetmiş. Yerden alınca, bunun bir yüzük olduğunu fark etmiş. Yüzüğü parmağına takar takmaz mağara gürültüyle aydınlanmış ve Alaaddin’in önünde beliriveren pembe bulutun içinden bir cin çıkmış.\n" +
                "\n" +
                "– Dile benden ne dilersen! Diye konuşmuş cin. Olanlara şaşıran Alaaddin, karşısındaki dev görüntüye bakarak sadece:\n" +
                "\n" +
                "– Evime gitmek istiyorum, diye mırıldanmış.\n" +
                "\n" +
                "Dileği göz açıp kapayıncaya kadar yerine gelmiş. Oğlunu bir anda evin içinde gören annesi, ocağın başından kafasını kaldırarak kapıya bakmış ve kapalı olduğunu görünce hayretle;\n" +
                "\n" +
                "– İçeri nereden girdin? Diye sormuş. Alaaddin, başına gelenleri heyecanla annesine anlatmış. Annesi:\n" +
                "\n" +
                "– Peki ya gümüş para ne oldu? Diye sorunca, Alaaddin lambayı annesine göstermiş. Onca maceradan sonra elinde sadece bu lamba kalmış.\n" +
                "\n" +
                "– Üzgünüm anne, ama elimde sadece bu var, demiş Alaaddin. Annesi;\n" +
                "\n" +
                "– Bu lamba sağlam mı acaba, baksana ne kadar da kirli demiş. Temizlemek için lambayı ovuşturmaya başlamış. Birden lambanın ağzından çıkan dumanlar odayı kaplamış. Dumanlar arasından bir cin belirivermiş ve:\n" +
                "\n" +
                "– Yüzyıllardır bu lambanın içinde yaşıyordum. Siz beni serbest bıraktınız, artık benim efendimsiniz. Dileyin benden ne dilerseniz, diye konuşmuş. Şaşkınlıktan Alaaddin ve annesinin ağzı açık kalmış, tek söz bile edememişler. Cin bir kez daha sözlerini tekrarlamış ve annesinin yemek için bir şeyler hazırlamadığını hatırlayarak;\n" +
                "\n" +
                "– Bize içinde her şeyin bulunduğu bir sofra donat! Diye emretmiş.\n" +
                "\n" +
                "O günden sonra, Alaaddin v annesi çok mutlu olmuşlar. Sihirli lamba sayesinde her istekleri yerine geliyormuş. Yoksulluk günleri geride kalmış. Zamanla Alaaddin de büyümüş, uzun boylu ve yakışıklı bir genç olmuş. Annesi oğlunun iyi bir kızla evlenip yuva kurmasını istiyormuş. Bir gün Alaaddin Pazar yerinden geçerken iki kişinin taşıdığı tahtırevanın içinde Sultanın kızını görmüş ve ona aşık olmuş. Eve gidince olanları annesine anlatmış, annesi de oğlu için saraya gidip Sultanla konuşmaya karar vermiş. Ertesi gün, annesi Sultanın huzuruna çıkmak üzere içi eşsiz mücevherlerle dolu bir kutu hazırlamış. Mücevherlerle dolu kutuyu çok beğenen Sultan kadını huzuruna çağırtmış.\n" +
                "\n" +
                "Kadının geliş nedeni anlaşılınca, Sultanın kızı Yasemin ile evlenme hayalleri kuran Vezir, Sultanı etkileyecek şeyler söylemiş. Sultan da Alaaddin’in annesine oğlunun zenginliğini ve gücünü gösteren bir armağanla huzuruna çıkması gerektiğini söylemiş. Sultan, eğer oğlun kızımla evlenmek istiyorsa, yarın bana kırk köle yollasın. Her köle için değerli taşlarla dolu küpler taşısın. Bu değerli hediyeleri korumak için de peşlerinden kırk asker gelsin, diye sözlerine son vermiş. Bunları duyan kadın üzüntüyle evine geri dönmüş. Sihirli lambanın bu kadar büyük bir isteği karşılaması çok zormuş." +
                "Alaaddin lambayı almış, çok daha kuvvetlice ovuşturmuş, karşısına çıkan cine isteklerini sıralamış. Cin Alaaddin’in isteklerini duyar duymaz üç kez elini çırpmış ve hemen oracıkta eli kolu mücevherlerle dolu kırk köle belirmiş. Peşlerinde de mücevherleri koruyan nöbetçiler varmış. Ertesi gün, sultan gördükleri karşısında hayretler içinde kalmış. Daha önce böylesine büyük bir zenginlik görmemiş. Tam Alaaddin’i kızına eş olarak kabul etmek üzereymiş ki kıskançlıktan ne yapacağını bilemez hale gelen veziri Sultana:\n" +
                "\n" +
                "– Peki kızınız ve damadınız nerede yaşayacaklar Sultanım? Diye sormuş. Bu beklenmedik soru karşısında bir an şaşıran, gözünü para hırsı bürümüş\n" +
                "\n" +
                "Sultan, Alaaddin’e hemen büyük ve görkemli bir saray yaptırmasını söylemiş. Alaaddin, Sultanın isteğini duyar duymaz evine dönmüş; cin ile konuşmuş. Cin göz açıp kapayıncaya kadar kısa bir sürede isteği de yerine getirmiş. Eskiden bakımsız olan topraklarda şimdi görkemli bir saray yükseliyormuş. Artık bu düğüne kimse engel olamazmış Özellikle de Sultan, böyle zengin ve güçlü bir damat bulduğu için herkesten daha mutluymuş. Alaaddin’in inanılmaz şansı ve zenginliğini duymayan kalmamış.\n" +
                "\n" +
                "Bir gün, Alaaddin’in sarayının penceresi altında garip bir satıcı belirmiş. Satıcı, Prenses’e:\n" +
                "\n" +
                "– Eski lambalar alırım! Diye selenmiş. Aladdin’in bu sırrını yalnız annesi biliyormuş, o da kimseye söylememiş. Sultanın Alaaddin ile evlenen kızı Yasemin de bu konuda bir şey bilmiyormuş. Eski lambayı bu yeni lambalardan biriyle değiştirirse Alaaddin’i sevindireceğini düşünmüş. Ama bu lamba o satıcının eline geçince Alaaddin’in hiçbir gücü kalmamış. Lambayı ele geçiren büyücü, lamba cininden, sarayın içindeki prensesle birlikte başka bir yere taşınmasını dilemiş.\n" +
                "\n" +
                "Alaaddin ve Sultan şaşkınmış. Olanların sihirli lambadan kaynaklandığını sadece Alaaddin biliyormuş. Onu inanılmaz bir zenginliğe kavuşturan cini gelmiş, dilek dilemek için bir şansı daha varmış. Hemen yüzüğü bulup parmağına geçirmiş; ovuşturunca ortaya çıkan cine:\n" +
                "\n" +
                "– Beni karımı esir alan büyücünün yanına götür, demiş. Sözünü bitirir bitirmez kendini sarayının içinde bulmuş. Perdenin arkasına saklanmış, karısı büyücüye hizmet ediyormuş. Yavaşça Prenses’e seslenmiş. Alaaddin’in orada bulunduğunu fark eden Prenses:\n" +
                "\n" +
                "Alaaddin buraya nasıl geldin? Diye sormuş. O da karısından sessiz olmasını, orada olduğunu büyücüye fark ettirmemesini istemiş. Elindeki tozu karısına uzatarak bunu büyücünün çayına karıştırmasını söylemiş. Büyücü çayı içer içmez derin bir uykuya dalmış. Alaaddin her yerde sihirli lambayı aramış, ama bulamamış. Mutlaka buralarda bir yerlerde olmalı demiş. Lambanın yardımı olmadan sarayı buraya nasıl taşıyabilirdi ki? Diye sormuş kendi kendine. Horlayan sihirbaza bakmış ve adamın dayandığı büyük yastığın arkasını kontrol etmiş. Lamba oradaymış. Alaaddin hemen lambayı ovuşturmuş. Lambadan çıkan cin, Alaaddin’e:\n" +
                "\n" +
                "– Hoş geldiniz, Efendim! Bunca zamandır beni neden başkasına hizmet etmek zorunda bıraktınız? Diyerek onun gelmesine ne kadar sevindiğini belirtmiş.\n" +
                "\n" +
                "Alaaddin de cine:\n" +
                "\n" +
                "– Neyse ki artık benim yine hizmetimdesin, demiş. Benim yanımda olduğunu\n" +
                "\n" +
                "Bilmek çok güzel, diye eklemiş. Bu kötü kalpli büyücüyü o kadar uzak bir yere gönder ki bizi bir daha bulamasın! Diye emretmiş. Cin memnuniyetle gülümsemiş ve elini çırpar çırpmaz büyücü ortadan kaybolmuş. Olup bitenler yüzünden hayli korkmuş olan Yasemin, Alaaddin’e yaklaşmış ve ona:\n" +
                "\n" +
                "– Neler oluyor, bu cin de neren çıktı? Diye sormuş. Alaaddin de:\n" +
                "\n" +
                "– Sakin ol, artık her şey yoluna girecek, demiş ve en başından başlayarak olanları ona anlatmış. Nihayet her şey eskisi gibiymiş. Alaaddin’le karısı sevinçle birbirlerine sarılmışlar. Yasemin, çok uzaklardaki babasına duyduğu özlemle, Alaaddin’e tekrar geri dönüp dönemeyeceklerini sormuş. Alaaddin, gülümseyerek ona bakmış;" +
                "– Bir mucize sayesinde buraya kadar geldik, aynı mucize sayesinde tekrar ülkemize dönüp sonsuza kadar mutlu yaşayabiliriz, diye cevap vermiş. Bu arada Sultan, kızı damadı ve onların görkemli sarayı ortadan kayboldu diye çok üzülüyormuş. Ancak elinden hiçbir şey gelmiyormuş, çaresizlik içindeymiş. Bu gariplikleri açıklasınlar diye ülkenin ileri gelenlerini saraya çağırmış. Kıskançlık ve kinle dolu vezir sürekli, Alaaddin’in şansının sonsuza kadar sürmeyeceğini biliyordum. Diye konuşuyormuş. Herkes Alaaddin’le Yasemin’i görmekten umudu kesmek üzereymiş ki, çok uzaklardaki Alaaddin, lambayı yine ovuşturmuş, cine:\n" +
                "\n" +
                "– Beni, karımı ve sarayımızı hemen ülkemize geri götür! Diye emretmiş. Bunu duyan cinin parmağının bir hareketiyle saray yerden havalanmış ve gökyüzünde süzülmeye başlamış. Artık geri dönen saray yeniden eski yerine konmuş. Alaaddin ve Yasemin de Sultanla kucaklaşmaya koşmuş. O günden sonra hepsi bir arada mutlu bir şekilde yaşayıp gitmişler…" +
                "")
        landmarkList.add(aladdinLambasi)


        val hanselİleGragel=Landmark(" Hansel ile Gretel","Bir varmış, bir yokmuş evvel zaman içinde Hansel ve Gretel isminde iki sevimli kardeşin, daha çok küçükken kendilerine sürekli çocuk masalları anlatan anneleri, bu dünyadan göçünce, ormanın yakınında bulunan kulübelerinde babaları ile birlikte yalnız yaşıyorlarmış.\n" +
                "\n" +
                "Babaları hem odunculuk yaparak para kazanmaya çalışıyor, hem de çocuklarına bakıyormuş. Tek başına hem iş hem çocuklar ile baş edemeyen baba bir kaç yıl sonra tekrar evlenmiş.\n" +
                "\n" +
                "Oduncunun yeni karısı zengin bir aileden geliyormuş. Ormanın kıyısında yıkık dökük bir kulübede oturmaktan ve yokluk içinde yaşamaktan da nefret ediyormuş. Üstelik üvey çocuklarını da hiç sevmiyormuş.\n" +
                "\n" +
                "Hansel ile Gretel çok soğuk bir kış gecesi yataklarına yatmış, uyumaya hazırlanırken üvey annelerinin babalarına bu kışı nasıl geçineceğiz, çok az yiyeceğimiz kaldı eğer bu çocuklardan kurtulmazsak açlıktan öleceğiz dediğini duymuşlar.\n" +
                "\n" +
                "Babaları bağırarak bu teklife karşı çıkmışsa da, karısı “tartışmaya gerek yok, ben kararımı verdim, yarın onları ormana götürüp bırakacağız.”\n" +
                "\n" +
                "Gretel bunları duyunca ağlamaya başlamış. Abisi Hansel onu teselli etmiş. “Ne olur endişe etme Gretel,  evin yolunu bir şekilde bulup döneriz.” demiş.\n" +
                "\n" +
                "O gece geç saatlerde Hansel gizlice dışarı çıkarak, cebine bir sürü çakıl taşı doldurmuş. Sabah olduğunda ailece ormana doğru yürümeye başlamışlar. Babaları çocuklarına gezmeye gittiğini söylemiş. Yürürlerken Hansel cebindeki çakıl taşlarını kimseye fark ettirmeden yere atıp geçtikleri yolu işaretlemiş.\n" +
                "\n" +
                "Öğle üzeri babaları ve üvey anneleri onlar için bir ateş yakmışlar. Sonra da onlara az bir işleri olduğunu ve hemen geri döneceklerini söyleyip, yanlarından ayrılmış, bir daha da geri gelmemişler.\n" +
                "\n" +
                "Gece olunca, ormanda gece yaşayan hayvanların korkunç sesleri yankılanıyormuş etrafta, kurtlar etrafında uluyorken korkudan tir tir titreyen Hansel ile Gretel ay doğana kadar ateşin yanından ayrılmamış. Sonra da ay ışığında parlayan çakıl taşlarını izleyerek evlerine doğru yürümüşler.\n" +
                "\n" +
                "Çocuklar evlerine döndüklerinde babaları onları bir anda karşısında görmüş ve çok sevinmiş. Üvey anneleri de sevinmiş gibi davranmış ama aslında kararını değiştirmemiş. İçten içe çocukların geri dönmesine çok bozulmuş.\n" +
                "\n" +
                "Üç gün sonra üvey anne onlardan kurtulmayı tekrar denemeyi istemiş. Gece olunca çocukların kapılarını kilitleyerek Hanselin çakır taşı toplamasına izin vermemiş ama Hansel zeki bir çocukmuş. Sabah ormana doğru yürürlerken akşam yemeğinde cebine sakladığı kuru ekmeğin kırıntılarını yere saçıp yine arkasından bir iz bırakmış.\n" +
                "\n" +
                "Öğleye doğru üvey anneleri ve babaları yine bir bahane uydurup çocukları yine ormanda bırakıp gitmişler." +
                "Onların geri dönmediklerini görünce Hansel ve Gretel bu kez hava kararmadan evlerine dönmek istemişler. Ama bu sefer eve geri dönmek için bıraktıkları izi bulamamışlar. Çünkü  kuşlar bütün ekmek kırıntılarını yiyerek bitirmişler.\n" +
                "\n" +
                "Gretel ağlamaya başlamış. Hansel  de umutsuzluğa kapılmış ilk kez, bu defa çocuklar gerçekten kaybolmuşlardı.\n" +
                "\n" +
                "Ormanda üç gün üç gece aç karnına ve korkudan titreyerek dolanıp durmuşlar. Üçüncü gün bir ağacın dalında bembeyaz bir kuş görmüşler. Kuş onlara güzel sesiyle şarkılar söyleyince, onlar açlıklarını unutup kuşun peşine düşmüşler.\n" +
                "\n" +
                "Kuş onları tuhaf bir evin yanına getirmiş. Bu evin duvarları ekmekten, çatısı pastadan ve pençeleri şekerdenmiş. Evin her yanı rengarenk şekerler ile süslüymüş.\n" +
                "\n" +
                "Hansel ve Gretel gözlerine inanamamışlar ev muhteşem lezzetli görünüyormuş. Çocuklar tüm yorgunluklarını unutup, tam Hansel  evin duvarından Gretel  de pencereden bir parça yiyecekken içeriden bir ses duyulmuş.\n" +
                "\n" +
                "Bir bakmışlar kapıda dünya tatlısı yaşlı bir teyze duruyor. Çocuklar başlarına geleni yaşlı kadına anlatınca kadın çok üzülmüş çocuklara acımış ve onları içeri almış. İçerisi evin dışı gibi değilmiş, korkutucu değişik bir evmiş.\n" +
                "\n" +
                "Ama çocuklar yorgun ve aç oldukları için bunu hiç önemsememişler. Yaşlı kadın çocukların önüne çeşit çeşit yemekler ve tatlılar koymuş. Çocuklar daha önce hiç yemedikleri yiyecekleri yemişler. O gece yumuşacık kuş tüyü yataklarda yatmışlar.\n" +
                "\n" +
                "Sabah olduğunda çocuklar uyandıklarında kadın evde yokmuş. Evi merak ettiklerinden dolaşmaya başlamışlar. Koridorun sonunda küçük bir kapı gözlerine ilişmiş.\n" +
                "\n" +
                "Kapıyı açınca içeride sandık dolusu altınlar, değerli hazineler olduğunu görünce çok şaşırmışlar. Hansel içeri girmek istemiş tam da bu sırada duydukları sesle korkmuşlar.\n" +
                "\n" +
                "Çocuklar arkalarına döndüklerinde karşılarında duran cadıyı görmüşler. Yaşlı kadın dikkatsiz çocukları tuzağa düşürmek için evini ekmek ve pastadan yapmış bir cadıymış meğer. Çocuklar evden kaçmayı denemiş ama kapı kilitliymiş.\n" +
                "\n" +
                "Cadı Hansel’i saçlarından tuttuğu gibi çekerek sürüklemiş ve onu demir bir kafese kilitlemiş. Sonrada Gretel’i sürüye sürüye mutfağa götürmüş.\n" +
                "\n" +
                "“Kardeşin çok zayıf ona yemekler pişir, onu şişmanlat. Eti budu yerine gelince ağzıma göre bir yemek olacak. Ama sen hiç bir şey yemeyeceksin, bütün yemekleri o yiyecek. ” demiş.\n" +
                "\n" +
                "Gretel çaresizce cadının söylediklerini yapmış. Neyse ki Hansel akıllı ve soğuk kanlı bir çocukmuş. Gözleri pek iyi görmeyen cadıyı kandırmaya karar vermiş.\n" +
                "\n" +
                "Her gece cadı uyurken kafesin altındaki yeri kazıyor, kardeşinin verdiği yemekleri yemiyor kazdığı yere gömüp saklıyormuş. Cadı ise Hanselin şişmanlayıp şişmanlamadığını anlamak için sabah olunca onu kontrol ediyormuş." +
                "Cadı da mutfağa gidip, Gretele daha fazla yemek yapmasını söylüyormuş. Bu böyle günlerce sürmüştü. Bir gün artık Cadının sabrı taşmış. “Şişman zayıf fark etmez bugün Hansel böreği yapacağım.” Gretele dönmüş “fırına git bakalım hamur tam pişmiş mi bir bak.” Demiş.\n" +
                "\n" +
                "Korku içinde yaşamasına rağmen Gretelin de Hansel gibi hala aklı çalışıyormuş. Cadının onu fırına iteceğini anlamış. “Başımı fırına sokamıyorum! Hamuru pişmiş mi diye göremiyorum.” Diye sızlanmış Gretel,\n" +
                "\n" +
                "Cadı elinin tersi ile hızla onu kenara itmiş ve başını fırına sokmuş. Gretel bütün gücünü toplayıp hızla yaşlı cadıyı fırına itmiş. Sonrada arkadan kapağı kapatmış.\n" +
                "\n" +
                "Gretel Cadının anahtarları sakladığı yeri biliyormuş. Hemen koşup anahtarı aldığı gibi Hanseli kilitli olduğu kafesten kurtarmış." +
                "Fırından çıkan alevler kısa sürede evi kaplamışı. İki kardeş yanmakta olan evden kaçıp tekrar ormana dalmış. Ama nereye gideceklerini hiç bilememişler.\n" +
                "\n" +
                "Bir süre sonra karşılarına bir dere çıkmış. Kocaman bir ördek, önce Hanseli sonra da Greteli karşıya geçirmiş. Çocuklar etrafına bakınınca bulundukları yeri tanımışlar. Hızla hiç durmadan evlerine doğru koşmuşlar.\n" +
                "\n" +
                "Çocuklarını karşısında sağ salim gören baba çooook mutlu olmuştu. Sevinç gözyaşları içinde onları ormanda bıraktıkları zamandan kısa bir süre sonra o acımasız üvey annelerinin ailesinin evine döndüğünü söylemiş. Yaptıkları için çok pişman olduğunu onları çok aramasına rağmen ormanda bulamadığını anlatmış.\n" +
                "\n" +
                "Çocuklar babalarını çok sevdiklerinden hemen onu affetmişler. Şimdi babalarını bir sürpriz daha bekliyormuş. Hansel ceplerinden Gretel de önlüğünün cebinden cadının evinde buldukları altın ve değerli elmasları çıkarmış.\n" +
                "\n" +
                "Babaları gözlerine inanamamıştı. Böylece ailenin tüm sıkıntıları sona ermiş.  O günden sonra da ömürlerini mutluluk ve zenginlik içinde geçirmişler.")

                landmarkList.add(hanselİleGragel)

        val aliceHarikalarDiyarı=Landmark(" Alice Harikalar  Diyarında","Küçük Alice ve ablası, güneşli bir öğleden sonra parka gitmeye karar vermişler. Ablası kitap okumaya başladığında, Alice’in onu beklemekten canı sıkılmış.\n" +
                "\n" +
                "Alice: “Ablam benimle oynamaya söz vermişti. Ama belli ki içinde resim olmayan bir kitap, büyükler için daha ilginç oluyor. Aaah! Büyükleri hiçbir zaman anlamayacağım. O zaman büyüyünce kendimi de anlamayacak mıyım yani? Hımmmm, Aaaah!”\n" +
                "\n" +
                "Tavşan: “Eyvah, eyvah! Çok geç kalacağım!\n" +
                "\n" +
                "Alice: “Konuşan bir tavşan! Bir cep saati, merak ettim, onu takip etmeliyim.” demiş sonra da tavşanın içine girdiği deliğe, tekrar nasıl çıkacağını hiç düşünmeden, tekrar o da girmiş.\n" +
                "\n" +
                "Alice: “Aaaaaa! Ama bir anda her şey değişmiş.” Orası artık bir tavşan deliği değilmiş. Alice kendini derin ve tuhaf bir kuyuya düşerken bulmuş.\n" +
                "\n" +
                "Alice: “Ne kadar da uzun sürdü. Ya bu kuyu çok derin ya da ben çok yavaş düşüyorum. Şimdiye kadar dünyanın çekirdeğine kadar varmış olmalıydım. Aaa! Bir saman yığını? Ne kadar düşünceli. Neresi burası?” diye söylenmeye devam etmiş.\n" +
                "\n" +
                "Alice şimdi, uzun bir koridorun başında duruyormuş. Her yerde minik, kilitli kapılar varmış.\n" +
                "\n" +
                "Alice “Burası çok garip bir yer. Peki, o beyaz tavşan nereye gitti? Ben buradan nasıl çıkarım? Peki ya hiç buradan çıkamazsam?” diye düşünmeye başlamıştı.\n" +
                "\n" +
                "Korku içinde yürümüş ve üç ayaklı cam bir masa görmüş. Masanın üstünde, minik altın bir anahtar varmış. Alice hiç vakit kaybetmeden, o minik altın anahtarın yardımıyla, minik kapıyı açmış. Diğer tarafta ne olduğunu görmek için, dizlerinin üzerine çökmüş. Gördükleri, o kadar güzel şeylermiş ki…\n" +
                "\n" +
                "Alice: “Vay canına, ben bu kadar güzel bir bahçe daha önce hiç görmedim. Ah, keşke bu ufak kapıdan geçebilseydim.” Ama geçememiş.\n" +
                "\n" +
                "Üzgün halde, masanın yanına geri dönmüş. Orada bir şişe görmüş. “Aaa, bu şişeyi daha önce görmedim burada! Acaba ne işe yarıyor?” diyerek Şişedeki sıvıyı içmiş. İçtikçe de küçülmeye başlamış. Bu Alice’in merakını daha da arttırmış. Sanki kapanmakta olan bir teleskop gibiymiş.:\n" +
                "\n" +
                "“Şimdi o kapıdan geçmeyi kolayca başarabilirim! Hayır! Olamaz, anahtarı unuttum. Iııh! Iııh ühühühü neden buraya geldim ben!” diye kendi kendine konuşurken, O sırada masanın altında bulunan, üzerinde “ye beni” yazan ufak cam bir kutu fark etmiş.\n" +
                "\n" +
                "Alice: “Bu, bu, bu ne ki, benim onu yememi istiyor.” O pastayı alıp yiyen Alice bu sefer de büyümeye başlamış. Büyümüş, büyümüş, büyümüş… artık boyu o kadar uzamış ki, kendi ayaklarını bile göremiyormuş. Başı kısa sürede tavana çarpmış. Alice:\n" +
                "\n" +
                "“Aaah! Hayıır! Hayır.” bu nasıl olabilir ki, Alice şimdi anahtarı alabiliyormuş ama, kapıya sığmayacak kadar büyükmüş. Oturmuş ve ağlamaya başlamış. Ağlamış, ağlamış, ağlamış… Gözyaşları koridoru kaplamaya başlamış. Tam o anda, Tavşan: “Ah, Düşes! Onu bekletmeye devam edersem öfkelenecek.”\n" +
                "\n" +
                "Alice: “Aaa, Bay Tavşan, bir dakika lütfen Çok kabasın! Gözünün önündeki kocaman bir kızı bile fark edemeyen bir tavşanın düşes’e ne faydası olabilir ki?” diye söylenmiş\n" +
                "\n" +
                "O anda bir eldiven görmüş, eldiveni takınca yine küçülmüş.\n" +
                "\n" +
                "Tavşan: “Sen ne arıyorsun burada? Eve git ve bana bir çift eldivenle yelpaze getir.”\n" +
                "\n" +
                "Alice: “Eve mi? Hangi eve?”\n" +
                "\n" +
                "Tavşan: “Benim evime, işte şurası, hadi, çabuk!”\n" +
                "\n" +
                "Alice’in kafası çok karışmış ve korkmuş. Tavşana hiç karşı çıkmadan, onun evine doğru yürümeye başlamış. “Beni hizmetçisiyle karıştırmış olmalı” diye düşünmüş. Küçücük, minicik bir odaya girmiş. Odadaki masanın üstünde bir yelpaze, bir çift eldiven ve minik bir şişe varmış.\n" +
                "\n" +
                "Alice: “Ne zaman bir şey yesem veya içsem, mutlaka ilginç bir şey olduğunu biliyorum. Bakalım bu şişe ne yapacak. Bu kadar minik olmaktan sıkıldım. Aaaa, ahhh, hı!” Kafası tavana değiyormuş.\n" +
                "\n" +
                "Alice: “Hıh! Hı, sıkıştım! Ahh elim.”\n" +
                "\n" +
                "Tavşan: “Hım! Evimin penceresinden çıkan bir el var! Aaah, bu bir dev! Evimde bir dev var! İmdaat!”\n" +
                "\n" +
                "Hayvanlar çabucak toplanmış. En küçükleri kertenkele Bill’den eve bacadan girmesini istemişler. Alice ayağını bacadan sokmayı başarmış ve\n" +
                "\n" +
                "Kertenkele: “Auu!!”\n" +
                "\n" +
                "Sonra Tavşan’ın aklına bir fikir gelmiş. Ama pek de akıllıca bir fikir değilmiş.\n" +
                "\n" +
                "Alice: “Aaa, bir pasta! Yine küçülmeme yardım edebilir.” Aynen öyle olmuş. Alice yeteri kadar küçüldüğü anda, evden koşarak çıkmış, bütün hayvanlardan uzağa, ormana kaçmış.\n" +
                "\n" +
                "Alice: “Ah, yapacağım ilk iş normal boyuma geri dönmek olacak.”\n" +
                "\n" +
                "Tırtıl: “Ah, ben sana yardım edebilirim. Gerçi boyun hiç de utanılacak bir şey değildir ama, inanmıyorsan bana bak!”\n" +
                "\n" +
                "Alice: “Ah, e tabi ki ben onu demedim. Siz güzelsiniz.”\n" +
                "\n" +
                "Tırtıl: “Aa, tabi ki öyleyim. Bir taraf seni daha uzun boylu yapacak, diğer tarafsa seni daha kısa boylu yapacak.”\n" +
                "\n" +
                "Alice: “Neyin bir tarafı?”\n" +
                "\n" +
                "Tırtıl: “Mantarın tabi ki canım! Şimdi önemli olan mantar gibi yuvarlak bir şeyin hangi tarafını yemesi gerektiğini anlamakmış.” demiş.\n" +
                "\n" +
                "Alice sonunda, iki kenarından da parçalar koparmış. Sağ elindekini biraz ısırmış ve boynu giderek uzamaya başlamış. Tıpkı bir fasulye sırığı gibi olmuş. Hemen sol elindeki parçadan biraz yemiş. Ama şimdi eskisinden de ufak olmuş.\n" +
                "\n" +
                "O kadar çok yorulmuş ki bu sefer mantar parçalarını azar azar yemeye devam etmiş. Bazen daha uzun oluyormuş, bazen daha kısa oluyormuş. Ta ki kendi normal boyuna gelene kadar bu, böyle devam etmiş.\n" +
                "\n" +
                "Alice: Planımın yarısını artık tamamladım. Ne karmaşık bir gün bu! Bu mantar parçaları yanımda kalsın. Belki yine lazım olabilirler. O tırtıla teşekkür etmeliyim ama çok garip biriydi. Onu neyin öfkelendirdiğini anlamadım.”\n" +
                "\n" +
                "Kedi: “Burada garip olmayan biri var mı tatlım?”\n" +
                "\n" +
                "Alice: “Aah, merhaba, merak ettim, siz her daim öyle sırıtır mısınız?”\n" +
                "\n" +
                "Kedi: “Eevet! Evet tabi ben sırıtan bir kediyim.\n" +
                "\n" +
                "Alice: “Hım, ben ne demek istediğinizi pek anlayamadım da…\n" +
                "\n" +
                "Kedi: “Söyle bana, Çılgın Şapkacı ve Mart Tavşan’ıyla tanıştın mı?”\n" +
                "\n" +
                "Alice: “Çılgın Şapkacı ve Mart Tavşanı mı? Hayır, tanışmadım?”\n" +
                "\n" +
                "Kedi: “Ama, tanışmak zorundasın. Onlar ikisi birden delidir. Aynı senin ve benim gibi.”\n" +
                "\n" +
                "Alice: “Hey! Ben, deli, değilim!”\n" +
                "\n" +
                "Kedi: “Ahahaha! Hem de çok delisin!”\n" +
                "\n" +
                "Bunu söyleyen kedi, ortadan kaybolmuş. Ardında sadece sırıtışını bırakmış. Alice bunu çok tuhaf bulmuş ama, yürümeye devam etmiş. Kendi kendine de içine düştüğü bu Harikalar Diyarı’nı merak ediyormuş. Yürürken Mart Tavşanı ve Çılgın Şapkacı’ya denk gelmiş.\n" +
                "\n" +
                " Bir ağacın altındaki bir masada çay içiyorlarmış. Ayrıca, ortalarında uyuyan bir de fare varmış. İkisi birden dirseklerini farenin üstüne koyuyorlarmış.\n" +
                "\n" +
                "Alice: “Bana çok rahatsız görünüyor. Ama, belki fare sorun etmiyordur çünkü uykusu ağırdır.”\n" +
                "\n" +
                "Çılgın Şapkacı: “Yer yok, yer yok!”\n" +
                "\n" +
                "Alice: “Ama, büyük bir masa bu, bir sürü yer var işte!\n" +
                "\n" +
                "Çılgın Şapkacı: “Senin saçının kesilmesi lazım.”\n" +
                "\n" +
                "Alice: “Sen çok kabasın!”\n" +
                "\n" +
                "Şapkacı: “Söylesene, bir kara karga neden çalışma masasına benzer?”\n" +
                "\n" +
                "Alice: “Aa, been, bilmiyorum.”\n" +
                "\n" +
                "Şapkacı: “İşte o yüzden sana buraya oturma dedim ihihihi!”\n" +
                "\n" +
                "Alice: “Sırf senin bilmeceni bilemedim diye mi? Peki, gidiyorum. Ama önce, bana cevabı söyle!”\n" +
                "\n" +
                "Şapkacı: “Bilmiyorum, maalesef, hiçbir fikrim yok.”\n" +
                "\n" +
                "Mart Tavşan’ı: “Ben bile bilmiyorum.”\n" +
                "\n" +
                "Alice: “Ah, ben bunun kadar aptal bir çay partisine hiç katılmadım!”\n" +
                "\n" +
                "Alice yolda yürürken, bir ağaçta başka bir kapı bulmuş. Her zamanki gibi dikkatle içeri girmiş. Kendini bir kez daha o uzun koridorda bulmuş. Koridorda minik kilitli kapılar ve camdan küçük bir masa varmış.\n" +
                "\n" +
                "Alice: “Bu defa daha başarılı olacağım.” diyerek küçük altın anahtarı alıp kapıyı açmaya başlamış. Kapının arkasında yine güzel bir bahçe varmış. Sonra, cebindeki mantarları çıkarmış, birazını yemiş.\n" +
                "\n" +
                "Boyu yaklaşık 30 santime düşmüş. O minik kapıdan yürüyerek geçmiş. Bahçede her türden güzel çiçek ve bitki varmış. Bir yerde ise oyun kâğıtlarına benzeyen bahçıvanlar bulunuyormuş. Daha da şaşırtıcı olansa beyaz gülleri kırmızıya boyamalarıymış.\n" +
                "\n" +
                "Alice: “Lütfen söyler misiniz bana, neden boyuyorsunuz o gülleri?”\n" +
                "\n" +
                "Bahçivan: “Ah, kraliçe bize kırmızı gül dikmemizi emretti. Ama biz yanlışlıkla beyaz gül diktik. Kraliçe bunu öğrenirse, hepimizin kellesi gider!”\n" +
                "\n" +
                "Diğer bahçivan: “Hişt, kraliçe geldi!”\n" +
                "\n" +
                "Kraliçe: “Au, bu da kim?”\n" +
                "\n" +
                "Alice: “Benim adım Alice majesteleri.”\n" +
                "\n" +
                "Kraliçe: “Hım, peki ya bunlar kim?”\n" +
                "\n" +
                "Alice: “Nereden bileyim?”\n" +
                "\n" +
                "Kraliçe tam da o anda öfkeden deliye dönmüş.\n" +
                "\n" +
                "Kraliçe: “Kellesini uçurun!”\n" +
                "\n" +
                "Muhafız: “Ama, ama o daha bir çocuk!”\n" +
                "\n" +
                "Kraliçe: “Hım, seni affediyorum.”\n" +
                "\n" +
                "Hakim: “Duruşma, başlamıştır.”\n" +
                "\n" +
                "Alice: “Ne duruşması?”\n" +
                "\n" +
                "Bahçivan: “Biri kraliçenin mutfağından bir turta çaldı. Bu kişi Kupa Valesi diye şüpheleniyoruz.”\n" +
                "\n" +
                "Davanın jüri üyeleri arasında bazı kuşlar ve hayvanlar varmış. Hepsi de hararetle bir şeyler yazıyorlarmış.\n" +
                "\n" +
                "Kraliçe: “Suçlamayı okuyun!”\n" +
                "\n" +
                "Biri söz alarak: “Imm, kupa kızı bir miktar turta yaptı. Güzel bir yaz günüydü. Kupa Valesi ise o turtaları çaldı ve çok uzaklara götürdü. Çok uzaklara!\n" +
                "\n" +
                "Kraliçe: “Çok güzel! İlk tanığı çağırın!”\n" +
                "\n" +
                "İlk tanık Şapkacı imiş. Bir elinde bir çay fincanı, diğer elinde bir dilim tereyağlı ekmek ile gelmiş. O kadar gerginmiş ki yapabildiği tek şey, orada dikilip gevelemek olmuş.\n" +
                "\n" +
                "Kraliçe: Çok zayıf bir konuşmacısın, gidebilirsin, diğer tanığı çağırın.”\n" +
                "\n" +
                "Diğer tanık, bizzat Alice’in kendisiymiş. Ama Alice’de bir değişiklik varmış. Çok büyüdüğünün farkına varmadan, ayağa kalkmış. Duruşmayı izlemeye gelen bütün hayvanlar yere düşmüş. Kraliçe çok öfkelenmiş.\n" +
                "\n" +
                "Kraliçe: “Uçurun kellesini!”\n" +
                "\n" +
                "Alice’in artık daha fazla sabredecek hali kalmamış.\n" +
                "\n" +
                "Alice: “Aaaah! Seni kim ciddiye alır? Sürekli o sözcüğü söylüyorsun! Siz, alt tarafı bir kâğıt destesisiniz.”\n" +
                "\n" +
                "Oyun kâğıtları, bu sözün üzerine havalanmışlar ve Alice’in üstüne çullanmışlar. Alice yarı korkudan, yarı öfkeden çığlık atmış. Kâğıtları uzaklaştırmaya çalışmış. Kısa süre sonra Alice: “Ah, ah, ah! Defolun! Ah! Yapraklar! Kâğıtlar nerede? Kraliçe nerede? Hım, rüya mıymış? Hım, ne harika bir rüyaydı. Hemen gidip ablama anlatmam lazım.\n" +
                "\n" +
                "Evet, gerçekten müthiş bir rüyaymış. Yoksa değil miymiş?")

        landmarkList.add(aliceHarikalarDiyarı)

        val alibabaVeKirkHaramiler=Landmark(" Ali Baba ve Kırk  Haramiler","Uzak ülkelerin birinde, çok eskiden Ali Baba adında bir adam yaşarmış. Ali Baba bir oduncuymuş. Dağdan kestiği odunları şehirde satarmış. Geçimini bununla sağlarmış. Ali Baba iyi bir insanmış. Karısı da onun kadar iyi biriymiş. Karı koca mutlu bir yaşantı sürmekteymişler. Bunların tek sıkıntıları yoksul olmalarıymış. Ali Baba'nın bir kardeşi varmış. Adı Kasım olan bu adam çok zenginmiş. Ama aynı zamanda pek cimriymiş.\n" +
                "\n" +
                "Bir sabah, Ali Baba eşeğini almış. Her zamanki gibi dağa gitmiş. Ormana ulaştığında garip bir durumla karşılaşmış. Az ötede, gittikçe yaklaşan bir toz bulutu görmüş. Çok meraklanmış. Eşeğini bir ağaca bağlamış. Yüksekçe bir yere çıkmış. Bir kayaya gizlenerek toz bulutunu izlemeye koyulmuş. Az sonra, bulutun içinden kırk atlı çıkmış. Adamların hepsi silâhlılarmış. Terkilerinde de birer çuval asılıymış.\n" +
                "\n" +
                "Ali Baba atlıların kimler olduğunu anlamakta gecikmemiş. Bunlar ünlü Kırk Haramilermiş. Bu hırsızlar yıllardır yasa tanımıyor ve çevreye kan kusturuyorlarmış. Ali Baba çok korkmuş. Hemen oradan kaçmak istemiş. Ancak yakalanmak korkusuyla yerinden kımıldayamamış. O sırada, Kırk Haramilerin reisi öne çıkmış. Kalın bir sesle:\n" +
                "\n" +
                "- Açıl susam açıl, diye bağırmış.\n" +
                "\n" +
                "Bu komutla haydutların önündeki kayadan bir gümbürtü kopmuş. Koca kaya gümbürdeyerek açılmış. Arkada bir geçit belirmiş. Haydutlar, atlarıyla birlikte bu mağaraya girmişler. Onların ardından koca kaya yine gürüldeyerek kapanmış.Olanları izleyen Ali Baba, büyük bir şaşkınlık içindeymiş. Ayağa kalkmak istemiş. Ancak bunu başaramamış. Korkudan dizlerinin bağı çözülmüş.\n" +
                "\n" +
                "Bir süre sonra, kaya yine büyük bir gürültüyle açılmış. Haramiler dışarı çıkmışlar. Bu kez atlarının terkilerindeki çuvallar yokmuş. Çuvalları içeride bırakmışlarmış.\n" +
                "\n" +
                "Haramilerin reisi:\n" +
                "\n" +
                "- Kapan susam kapan, diye bağırmış.\n" +
                "\n" +
                "Bu söz üzerine mağaranın kapısı tekrar kapanmış. Kırk haramiler atlarını mahmuzlayarak, büyük bir hızla oradan uzaklaşmışlar.Haydutlar iyice uzaklaşınca Ali Baba gizlendiği yerden çıkmış. Susam kayasının önüne gelmiş. Aynı şeyi kendisinin yapıp yapamayacağını merak ediyormuş:\n" +
                "\n" +
                "- Açıl susam açıl, demiş korka korka ve yavaşça.O anda kaya gürüldeyerek açılmış. Ali Baba, korku ve merak içinde mağaraya girmiş. Bir süre gözlerinin karanlığa alışmasını beklemiş. O sırada, arkadaki kaya tekrar gürültüyle kapanmış. Gördüklerinin karşısında neredeyse, Ali Baba'nın dili tutulacakmış. \n" +
                "\n" +
                "İçerisi çuval çuval altın doluymuş. Ali Baba çektiği para sıkıntısını hatırlamış. Kendi kendine:\n" +
                "\n" +
                "- Çuvalların üzerinden birer avuç altın alırsam haydutların bundan haberi bile olmaz, demiş.\n" +
                "\n" +
                "Ali Baba hemen harekete geçmiş. Dışarıdaki eşeğini mağaraya getirmiş. Çuvalların her birinden birer avuç altın almış. Eşeğin sırtındaki heybenin gözlerine doldurmuş. Orada daha fazla oyalanmadan dışarı çıkmış. Yolda, heybelerin üzerine birkaç kuru odun parçası koymuş. Böylece altınları gizlemiş. Sonra da sevinç içinde şehrin yolunu tutmuş.Bir süre sonra, Ali Baba evine gelmiş. Eşine başından geçenleri anlatmış. Yıllarca sıkıntı çeken kadın rahat edeceğini düşünerek sevinmiş.Yemekten sonra Ali Baba altınların ne kadar olduğunu merak etmiş:\n" +
                "\n" +
                "- Acaba burada ne kadar altın var dersin hanım, diye sormuş.\n" +
                "\n" +
                "Ali Baba'nın karısı:\n" +
                "\n" +
                "- Bunu bilmenin bir yolu var. Ben şimdi giderim. Kasımlardan teraziyi alır gelirim. Tartar öğreniriz, demiş.Ali Baba bu öneriyi kabul etmiş. Kadın, Kasımlara gitmiş. Kapıyı Kasım'ın hanımı açmış. Aşağılayıcı bir tavırla:\n" +
                "\n" +
                "- Yine ne istiyorsun, diye sormuş.\n" +
                "\n" +
                "Ali Baba'nın karısı:\n" +
                "\n" +
                "- Terazinizi istiyorum yenge. İşimiz bitince hemen getiririm, demiş.\n" +
                "\n" +
                "Kasım'ın eşi içeriye gitmiş. Teraziyi almış. Bu arada durumdan kuşkulanmış. Terazinin altına biraz bal sürmüş. Sonra getirip Ali Baba'nın karısına vermiş.Ali Baba ile karısı, evlerinde altınları tartmışlar ve miktarını bulmuşlar.\n" +
                "\n" +
                "Ali Baba ahırda bir çukur kazmış. Altınların bir kısmını buraya gömmüş.Ali Baba'nın karısı da teraziyi geri vermeye gitmiş. Kasım'ın kuşkucu karısı teraziyi almış. Sonra bal sürdüğü yere bakmış. Tabii hayretten donakalmış. Çünkü terazinin dibine bir altın yapışmış:\n" +
                "\n" +
                "- Demek, yoksul Ali Baba altınlarını tartabilecek kadar zenginmiş ha, demiş. Hemen koşmuş, olanları kocasına anlatmış.\n" +
                "\n" +
                "Ertesi gün, Kasım Ali Baba'nın kapısına dayanmış:\n" +
                "\n" +
                "- Artık terazi ile altın tartabilecek kadar zenginleşmişsin kardeşim. Hayrola, demiş.\n" +
                "\n" +
                "Ali Baba anlamazlıktan gelmiş. Fakat Kasım vazgeçecek gibi değilmiş. Karısının, terazinin altında bulduğu altını anlatmış. Ali Baba daha fazla gizleyememiş. Başından geçenleri bir bir anlatmış ona. Bu arada mağaranın bulunduğu yeri de tarif etmiş.Kasım evine dönmüş. Evde eşi onu merak içinde beklemekteymiş. Ali Baba'nın yaşadıklarını o da öğrenmiş. Sonra neşe içindeki kocasına:\n" +
                "\n" +
                "- Hemen sen de oraya git. Mağarayı boşalt Kasımcığım, demiş.\n" +
                "\n" +
                "Zaten, Kasım karısının sözünden dışarı çıkmazmış. Hemen katırlarını ahırdan çıkarmış. Sırtlarına heybeleri yerleştirmiş. Ardından mağaraya doğru yola çıkmış. Bir süre sonra susam kayasının önüne gelmiş. Var gücü ile bağırmış:\n" +
                "\n" +
                "- Açıl susam açıl!\n" +
                "\n" +
                "Koca kaya gürüldeyerek açılmış. Kasım içeriye girmiş. O girer girmez kapı kapanıvermiş. Kasım, gözleri karanlığa alışana kadar beklemiş. Sonra gördükleri karşısında şaşkına dönmüş. Hemen koşmuş. Altınların üzerine atlamış. Sevinç içinde yuvarlanmış, taklalar atmış. Nice sonra aklına haramiler gelmiş. Korkmuş, hemen kapıya koşmuş. Kapının önüne gelince o büyülü cümleyi anımsamaya çalışmış. Ama bir türlü başaramamış:\n" +
                "\n" +
                "- Açıl buğday açıl. Saçıl arpa saçıl! Hay Allah neydi acaba, diye kendi kendine söylenmeye başlamış.\n" +
                "\n" +
                "Kasım, çok zorlamış ama büyülü cümleyi bir türlü anımsayamamış. Bu arada da zaman su gibi akmış. Haramiler aniden çıka gelmişler. Kapının önünde bir sürü katır görmüşler. Tabii içeride birinin olduğunu anlamışlar.\n" +
                "\n" +
                "Haramilerin reisi dışardan:\n" +
                "\n" +
                "- Açıl susam açıl, diye bağırmış.\n" +
                "\n" +
                "Bunu duyan Kasım hemen oracığa saklanmış. Ancak haydutların Kasım'ı bulmaları uzun sürmemiş. Üstelik, hemen orada cezasını vermişler. Daha sonra, haramiler getirdikleri çuvalları mağaraya boşaltmışlar. Hiç beklemeden yeni soygunlar için yola çıkmışlar.\n" +
                "\n" +
                "Öte yanda, Kasım'ın dönmemesi Ali Baba'yı endişelendirmiş. Kuşku ile yola koyulmuş. Susam mağarasına gitmiş. Ama orada yaralı ve baygın kardeşi ile karşılaşmış. Çok üzülmüş. Onu sırtına almış. Şehre götürmüş. Bir doktorda tedavi ettirmiş.Haydutlar döndüklerinde Kasım'ı bulamamışlar. Susam mağarasının bir başkası tarafından da bilindiğini anlamışlar. Burayı bileni bulmak gerektiğini düşünmüşler. Birkaç arkadaşlarını şehre göndermişler. Şehre inenler sorup soruşturmuşlar. Son günlerde kimlerin tedavi edildiğini araştırmışlar. Kasım'ın tedavi gördüğünü ve Ali Baba'nın fazlaca para harcadığını öğrenmişler. Bunun üzerine Ali Baba'nın evinin kapısına tebeşirle (x) işareti koymuşlar. Böylelikle geri geldiklerinde işaretli evi kolayca bulacaklarmış.\n" +
                "\n" +
                "Ali Baba, evine bir hizmetçi kız almışmış. Bu kız çok akıllıymış. Kız kapıdaki işareti görmüş. Bu durumdan şüphelenmiş. Komşu evleri de aynı şekilde işaretlemiş.O akşam, haramiler topluca şehre gelmişler. Ali Baba'nın evine koydukları işareti aramışlar. Fakat kapıların hepsinde aynı işareti görünce şaşırmışlar. Gerisin geri dönmüşler.\n" +
                "\n" +
                "Ertesi sabah haramilerin reisi bir plân yapmış. Katırlara küpleri yüklemiş. Küplerin içine adamlarını yerleştirmiş. Kendisi de atına binmiş. Şehrin yolunu tutmuş. Sora sora Ali Baba'nın evini bulmuş ve ona:\n" +
                "\n" +
                "- Ben bir yağ tüccarıyım. Beni bu akşam evinizde konuk eder misiniz, diye sormuş.\n" +
                "\n" +
                "İyi yürekli Ali Baba, haydutların reisini tanıyamamış. Onu evine davet etmiş. Haydutların içinde bulunduğu küpleri bahçesine taşıtmış.Akşam karanlığında, akıllı hizmetçi küpleri yoklamış. Küplerin içinde haramilerin saklı olduğunu anlamış. Hemen mutfaktaki yağları kızdırmış. Küplerin içine boşaltmış. Haydutlar kızgın yağın içinde haşlanmışlar.Haramilerin başı gece yarısında harekete geçmiş. Amacı küplere sakladığı adamlarını çıkarmakmış. Ama hepsinin haşlanmış olduğunu görmüş. Artık yapacak bir şey yokmuş. Çareyi oradan kaçmakta bulmuş.\n" +
                "\n" +
                "Ali Baba, ertesi sabah konuğunu yatağında bulamamış. Merak etmiş. Hizmetçiden akşam neler olduğunu öğrenmiş. Şaşkına dönmüş. Hayatını kurtardığı için akıllı kıza teşekkür edip hediyeler vermiş. Çevredekiler de Kırk Haramilerden kurtuldukları için rahata kavuşmuşlar.")
        landmarkList.add(alibabaVeKirkHaramiler)

        val parmakKiz=Landmark(" Parmak Kız","Çok eski zamanların birinde güzel bir kadın yaşarmış. Bu kadın, küçük bir çocuğunun olmasını çok istiyormuş.\n" +
                "\n" +
                "Günler bu şekilde geçip giderken bir gün ihtiyar bir kadınla karşılaşmıştı. Ona çocukları çok sevdiğini anlatmış.\n" +
                "\n" +
                "İhtiyar kadın: “Sen iyi birine benziyorsun. İstersen sana yardım edebilirim\n" +
                "\n" +
                "Kasın “nasıl yardım edeceksiniz” diye sormuş\n" +
                "\n" +
                "İhtiyar kadın cebinden çıkardığı arpa tanesini ona uzatarak “al şu arpa tanesini, bu senin bildiğin tanelerden değil! Onu bir yere ek ve bekle” demiş.\n" +
                "\n" +
                "Kadın sevinçli bir şekilde ihtiyara teşekkür ederek arpa tanesini almış ve doğruca eve giderek arpa tanesini bir tabağın içine ekmiş.\n" +
                "\n" +
                "Meraklı bir şekilde her gün onu izleyerek ne olacağını beklemiş. Bir sabah uyandığında toprağın içinden laleye benzeyen bir çiçek çıktığını görmüş. Bu güzel çiçeğin yaprakları sımsıkı kapalıymış. Sanki içinden biri çıkacak gibiymiş.\n" +
                "\n" +
                "Kadın sevinçle, “Allah’ım! Ne kadar da güzel bir çiçek”, diyerek çiçeğin sarı ve kırmızı yapraklarını okşarken yapraklar birden açılmıştı.\n" +
                "\n" +
                "Kadın gözlerine inanamıyordu! Çiçeğin tam ortasında minicik, parmak kadar bir kız oturuyormuş.Kadın sevgiyle onu eline alarak okşamış, parmak kız da annesini öpmüş, sonra da “Anneciğim, anneciğim,” diyerek onun parmağına sarılmış.\n" +
                "\n" +
                "Kadın dileğine kavuştuğundan çok mutluymuş. Küçük kıza “Parmak Kız” adını vermiş.\n" +
                "\n" +
                "Parmak Kız’a ceviz kabuğundan bir yatak yaparak çiçeğin yaprakları da ona yorgan yapmış.\n" +
                "\n" +
                "Parmak Kız geceleri orada uyuyor, sabahları ise masanın üzerinde oyunlar oynuyormuş. Kadın, Parmak Kız sıkılmasın diye de bir tabağa su koyarak içine koyduğu büyük bir yaprağın üzerine onu oturtmuş. Eline de bir kibrit çöpü vermiş.\n" +
                "\n" +
                "Artık Parmak Kız’ın bir kayığı varmış. Parmak Kız güzel ve tatlı sesiyle kadına şarkılar söylüyor beraber güzel vakitler geçiriyorlarmış.\n" +
                "\n" +
                "Sesi o kadar güzelmiş ki sesini duyan hayvanlar pencerenin önüne toplanırlar öylece onu dinlerlermiş.\n" +
                "\n" +
                "Bir gece Parmak Kız mışıl mışıl uyurken, kırık olan pencereden içeriye bir kurbağa girmiş. Bu kurbağa çok çirkin ve kocamanmış. Masanın üstünde yatağında mışıl mışıl uyuyan Parmak Kız’ı görünce:.” Vıral, vıral. Ne kadar da güzel bir kız. Tam benim oğluma layık bir eş” diye düşünmüş.\n" +
                "\n" +
                "Barbie Parmak Kız’ı uyuduğu ceviz kabuğuyla sarsmadan kucağına almış ve zıplaya zıplaya onu dereye götürmüş.\n" +
                "\n" +
                "Kurbağa ailesinin evi deredeymiş. Kurbağanın oğlu annesinin yanına koşarak ceviz kabuğunun içinde uyuyan Parmak kadar küçük Kız’a bakmış.\n" +
                "\n" +
                "Sevinçle: “Vıral, vıral! Yaşasın, ne kadar da güzel bir kız.\n" +
                "\n" +
                "“Vıral, sus! Uyanırsa kaçabilir. Onu hemen derenin ortasındaki şu nilüferin üzerine koyalım. Hadi bana yardım et,” diye uyarmış annesi.\n" +
                "\n" +
                "Birlikte Parmak Kız’ı geniş yapraklı çiçeğin üzerine bırakmış ve düğün hazırlıkları için oradan ayrılmışlar.\n" +
                "\n" +
                "Zavallı Parmak Kız, uykudan uyanınca etrafına bakınmış, daha önce görmediği bir yerde olduğunu anlayınca “aman Allah’ım! Ben neredeyim, burası neresi” diyerek ağlamaya başlamış.\n" +
                "\n" +
                "Bu sırada Anne kurbağa ile çirkin oğlu gelmiş. Anne kurbağa: “Vırak, ağlama! Bak sana sevgili kocanı tanıtayım. Bataklığın altında ikiniz için bir ev hazırladık. Düğününüzü yapar yapmaz yeni evinize taşınırsınız.” Demiş.\n" +
                "\n" +
                "Çirkin kurbağa çok mutluymuş. “Vırak, vırak, yaşasın” demiş.\n" +
                "\n" +
                "İhtiyar kurbağa ile çirkin oğlunun yapacak çok işleri varmış. O yüzden hemen oradan ayrılmışlar.\n" +
                "\n" +
                "Parmak Çocuk duyduklarına inanamayıp hüngür hüngür ağlamaya başlamıştı. Derede yaşayan küçük balıklar suyun yüzeyine çıkıp Parmak Kız’a bakmışlar.\n" +
                "\n" +
                "“Ne kadar da güzel bir çocuksun, ağlama biz sana yardım ederiz.” Diyerek yaprağın sapını ısırmaya başlamışlar.\n" +
                "\n" +
                "Çok geçmeden yaprak çiçekten kopmuş, suyun akıntısına kapılarak yabancı bir ülkeye kadar sürüklenmiş. En sonunda bir ağacın dalına takılarak durmuş.\n" +
                "\n" +
                "Çok geçmeden bir kelebek Parmak Kız’ı görmüştü. Rengarenk kanatlarını çırparak yanına yaklaşmış.“Hey, tatlı kız merhaba benimle arkadaş olur musun?” Demiş.\n" +
                "\n" +
                "Parmak Kız kelebeği çok sevmiş, hemen elbisesinin kuşağını çözerek bir ucunu kelebeğe uzatmış. Diğer ucunu da yaprağın sapına bağlamış. Böylece yaprak, suyun üzerinde sanki uçuyormuş gibiymiş.\n" +
                "\n" +
                "İşte tam da o sırada orada uçan bir mayıs böceği onları görünce Parmak Kız’ tuttuğu gibi uçarak bir ağacın dalına konmuş.\n" +
                "\n" +
                "Zavallı Kelebeğin ise hiçbir şeyden haberi yokmuş. Mutluluk içinde uçarak oradan uzaklaşmıştı.\n" +
                "\n" +
                "Mayıs böceği Parmak Kız’a çiçek tozu ikram etmiş, sonrada “sen bana hiç benzemiyorsun, ama çok güzelsin.” Demiş.\n" +
                "\n" +
                "Diğer dişi mayıs böcekleri kızı merak ettiklerinden hemen kızcağızın çevresini sarmışlar ve onunla alay edercesine “Aaa, ne ilginç bir kız! Bakın antenleri bile yok. Ayakları da sadece iki tane. Ne kadar da çirkin. Evet, çok çirkin…” Demişler. Sonra da gülerek oradan ayrılmışlar.\n" +
                "\n" +
                "Parmak Kız’ı getiren mayıs böceği onların söylediklerine üzülmüş. Onu çok sevdiği halde götürüp bir papatyanın üzerine koymuş.\n" +
                "\n" +
                "Parmak Kız, bütün yaz ormanda tek başına kalmıştı. Zaman öyle çabuk geçmişti ki, havaların soğumasıyla birlikte üşümeye başlamıştı.\n" +
                "\n" +
                "Kızcağız çok küçük olduğundan kar taneleri ona kartopları gibi görünüyormuş. Yapraklara sarılarak soğuktan korunmaya çalışmışsa da çok üşüyormuş.\n" +
                "\n" +
                "Bir gün kendini sıcak tutacak bir yer ararken toprağın üzerinde bir delik görmüş. Deliğin içinde bir kapı olduğunu görünce merakla kapıyı çalmış.\n" +
                "\n" +
                "Kapıyı ihtiyar bir tarla faresi açmış, karşısında üşüyen kızı görünce “gel yavrucuğum, dışarısı çok soğuk, epey üşümüşsündür.” Diyerek onu içeri almış.\n" +
                "\n" +
                "İhtiyar fare çok iyi kalpliymiş hemen ona biraz yiyecek getirerek bir güzel karnını doyurmasını sağlamış. İçerisi sıcacık olduğu için hemen ısınmıştı.\n" +
                "\n" +
                "Tarla faresi: “Yavrucuğum, istersen bu kışı burada benimle geçirebilirsin, hem bana arkadaşlık etmiş olursun, hemde bana masallar anlatırsın.” demiş.\n" +
                "\n" +
                "Parmak Kız, ihtiyar farenin teklifini memnuniyetle kabul etmiş. Aradan günler haftalar geçmişti. Bir gün ihtiyar fare “bugün bir misafirimiz gelecek, o çok zengin biri, ben senin yerinde olsam, onunla tanışır ve hatta onunla evlenirdim.” Demiş.\n" +
                "\n" +
                "Kız epey bir düşünmüş ve sonunda zengin komşularıyla evlenmeye karar vermişti.\n" +
                "\n" +
                "Bu zengin komşuları bir köstebekmiş. Fareyi ziyarete gittiğinde şarkı söyleyen Parmak Kız’ın sesini duymuş ve ona hayran kalmıştı.\n" +
                "\n" +
                "Köstebek, fareyi ve Kız’ı evine davet etmiş. Evi farenin evine çok yakınmış. Köstebek: “İstediğiniz zaman evime gelebilirsiniz. Ancak yolda bir kuşla karşılaşırsanız sakın ondan korkmayın, uyuşmuş hareket edemeyecek kadar halsiz bir kuştur.” Demiş.\n" +
                "\n" +
                "Üç gün sonra Parmak Kız ile fare, köstebeği ziyaret etmek için evleri bağlayan tünelden geçerken yerde yatan kuşla karşılaşmışlar.\n" +
                "\n" +
                "Parmak Kız onu görünce çok üzülmüştü o sırada köstebek de onları karşılamak için gelmişti. Köstebek kuşa bir tekme atmış. “Gökyüzünü, ışığı ve güneşi hiç sevmiyorum ben karanlık ne güzel değil mi ihtiyar dostum”\n" +
                "\n" +
                "“Haklısın dostum, Ama yine de çok güzel bir yaratık,” diye karşılık vermiş ihtiyar fare.\n" +
                "\n" +
                "Parmak Kız hiçbir şey söylemeden ve onlara fark ettirmeden kuşun kanatlarını okşamış, sonrada kuşu sevgiyle öpmüş.\n" +
                "\n" +
                "Ertesi gün kız hemen kuşun yanına giderek başını kuşun göğsüne koymuş. O anda kuşun kalbinden gelen sesi duyunca mutlu olmuş. Çünkü kuş hala yaşıyordu sadece soğuktan uyuşup kalmıştı.\n" +
                "\n" +
                "Parmak çocuk farenin evinden getirdikleriyle kuşun üzerini güzelce örtmüş. Kuş, ısındıkça kendine geliyordu. Bir süre sonra gözlerini açınca “sana teşekkür ederim tatlı kız, biraz daha ısınırsam eskisi gibi uçabilirim.” Demiş sevinçle.\n" +
                "\n" +
                "Parmak Kız ona yiyeceğinden ve suyundan götürerek kış boyunca kuşa bakmış.\n" +
                "\n" +
                "Fare ile köstebeğin kızın yaptıklarından haberi yokmuş. Havalar ısınmaya başlayınca kuş iyice iyileşince gagasıyla, dışarıya açılan bir delik açarak dışarıya çıkmış.\n" +
                "\n" +
                "Epey bir zamandır güneş yüzü görmediğinden “cik, cik, cik, güneşi görüyorum, Allah’ım! Çok mutluyum. Yine eskisi gibi göklerde uçabileceğim.” Demiş.\n" +
                "\n" +
                "Parmak Kız da kuşla birlikten dışarıya çıkmıştı. Dışarısı o kadar aydınlık ve güzelmiş ki, neredeyse her şeyi unutmuş.Çevresindeki rengarenk çiçeklere, ağaçlara, şırıl şırıl akan minik dereye bakmış. Gökyüzünde kuşlar cıvıl cıvıl ötüyor, adeta ona el sallıyormuş.\n" +
                "\n" +
                "Kuş, Kız’a tekrardan teşekkür ettikten sonra kendisiyle gelmesini istemiş. Ama kız, ihtiyar fareyi üzmek istemediğinden “hayır, güzel kuş, şimdi seninle gelemem ama belki başka bir zaman” diyerek ona el sallamış.\n" +
                "\n" +
                "Kuş” cik, cik, Allah’a ısmarladık, seni hiç unutmayacağım, cik, cik, cik,” diyerek uçup gitmiş.\n" +
                "\n" +
                "Kız, kuşun arkasından uzun süre bakmış, ondan ayrılmak onu üzmüştü, ağlayarak bağırmış: “Güle güle, güzel kuşum güle güle, seni çok seviyorum.” demiş.\n" +
                "\n" +
                "Kuş gözden kaybolduktan sonra, kız farenin yanına gitmiş ve ona üzgün olduğunu belli etmemiş.\n" +
                "\n" +
                "İhtiyar fare: “Sana çok iyi bir haberim var. Köstebek seninle evlenmek istiyormuş. Zaten sen de onu beğenmiştin. Hemen hazırlıklara başlamalıyız. Giyecek güzel elbiseler yapmalıyız.” demiş.\n" +
                "\n" +
                "Parmak Kız: “Ama ben elbise yapmayı bilmem ki,” diye karşılık vermiş.\n" +
                "\n" +
                "İhtiyar fare gülümsemiş sonrada “Sen hiç merak etme, örümcek dostlarımız bu konuda bize yardım ederler, onlar çok iyi örgü örerler.” demiş.\n" +
                "\n" +
                "İhtiyar farenin dört örümcek arkadaşı kız için elbiseler hazırlamaya başlamışlardı bile, O ise mecburiyetten onlara yardım ediyor ama çok mutsuzmuş.\n" +
                "\n" +
                "Çünkü hem köstebeği sevmiyor hemde onunla evlenirse bir daha gökyüzünü göremeyecekmiş.\n" +
                "\n" +
                "Parmak Kız her gün çaktırmadan dışarıya çıkıyor, kuşun bir gün onu götürmek için gelmesini bekliyormuş.\n" +
                "\n" +
                "Günler böylece gelip geçerken, düğün günü de çok yaklaşmıştı. Artık dışarıdaki herkesle vedalaşma zamanı geldiğini biliyordu. Gözyaşlarıyla “Allah’a ısmarladık pırıl pırıl parlayan güzel güneş. Sizi çok seviyorum güzel kuşlar ağaçlar, çiçekler…” Demiş.\n" +
                "\n" +
                "Sonrada bir çiçeğe sıkıca sarılarak hüngür hüngür ağlarken “cik cik, cik” sesleri duyulmuş. Kız, yardım ettiği kuşu karşısında görünce mutluluktan uçacak gibi olmuş.\n" +
                "\n" +
                "Koşarak kuşun kanadına sarılmış. “Ah güzel kuş, bir daha gelmeyeceksin, beni unuttun sanmıştım” demiş.\n" +
                "\n" +
                "Kuş gülümseyerek “hadi tatlı kız hazırlan seni çok güzel yerlere götüreceğim. O kötü kalpli köstebekle evlenip onun kapkara, ışıksız evinde yaşayamazdın zaten” demiş.\n" +
                "\n" +
                "Kız çok mutluydu hemen kuşun sırtına oturarak ona sıkıca sarılmış. Kuş uçmuş, ağaçları, dağları, dereleri, ırmakları geçmiş.\n" +
                "\n" +
                "Yukarıdan bakınca her yer çok daha güzel görünüyormuş. Köstebeği ve toprağın altındaki yuvayı hemen unutmuştu. Sevinçle kuşa daha sıkı sarılmış.\n" +
                "\n" +
                "İşte böylece uçarak çok güzel bir ülkeye varmışlar. Güneş orada her zamankinden daha çok parlakmış. Gökyüzü daha mavi, sular daha tatlı, çiçekler daha renkliymiş.\n" +
                "\n" +
                "Parmak Kız: “Allah’ım burası dünyanın en güzel yeri olmalı! Burada yaşamayı çok isterim.” demiş.\n" +
                "\n" +
                "Kuş başını ona doğru çevirmiş “cik, cik, cik, öyle ise seni şu güzel çiçeklerin üzerine bırakayım.” Diyerek aşağıya doğru süzülüp, onu beyaz bir çiçeğin üzerine bırakmış. Sonra da çok uzaklara doğru uçarak yoluna devam etmiş.\n" +
                "\n" +
                "Parmak Kız çevresindeki güzelliklere hayran kalmıştı. Birden boyu kendisi kadar olan bir prensle karşılaşmış. Prens çok yakışıklıymış. Başında tacı ve omuzlarında iki kanadı varmış.\n" +
                "\n" +
                "Sonra çevresinde daha başka minik kızlar ve adamlar görmüş. Çok şaşırmış. Prens, Parmak Kız’ın yanına gelerek “Ben bu ülkenin kralıyım. Ülkeme hoş geldiniz. Peki ya siz kimsiniz.” Diye sormuş.\n" +
                "\n" +
                "Kız ona başından geçen olayları bir bir anlatmış. Minik Prens başındaki tacı çıkararak ona uzatmış. “Sizi görür görmez hayran kaldım, benimle evlenip, kraliçem olur musunuz? diye sormuş.\n" +
                "\n" +
                "Parmak Kız mutluluktan uçacak gibiymiş, o anda aklına çirkin kurbağa, mayıs böceği ve köstebek gelmiş. Şimdi ise tıpkı kendisine benzeyen biri ile evlenecekmiş.\n" +
                "\n" +
                "“Evet prensim, bu teklifiniz beni çok mutlu etti.” Diyerek prensin evlenme teklifini kabul etmiş.\n" +
                "\n" +
                "Çiçeklerin üzerindeki kızlar ve oğlanlar çok mutlu olmuş, artık onların da bir kraliçesi varmış.\n" +
                "\n" +
                "Parmak Kız’a dünyanın en güzel kanatlarından takmışlar. Yeni kanatlarıyla çok güzel görünüyormuş.\n" +
                "\n" +
                "Parmak Kız ile prensin düğününe herkes katılmış. Dünyanın en güzel düğünü o gün yapılmış. Artık kimse ona Parmak Kız demiyormuş. Onun adı artık Çiçeklerin Kraliçesi’ymiş.")

                landmarkList.add(parmakKiz)

        val findikkiran=Landmark(" Fındıkkıran ","Bir varmış bir yokmuş evvel zaman içinde karlı bir yılbaşı sabahı, büyük bir mavi kapı çalınmış…\n" +
                "\n" +
                "Anne: “Clara! Lütfen kapıya bakar mısın?” diye seslenmiş. Clara heyecanla merdivenlerden aşağı koşarken özel birini görmeyi umuyormuş ve gelen kişi gerçekten de özelmiş. \n" +
                "\n" +
                "Clara: “Aaa Jack amca!”\n" +
                "\n" +
                "Jack: “Ho! Ho! Ho! Mutlu yıllar küçük hanım.”\n" +
                "\n" +
                "Clara: “Ha..Ha..Haha… Ben artık küçük değilim amca!”\n" +
                "\n" +
                "Jack: “Ne fark eder ki?  Sen her zaman benim küçük prensesim olacaksın ama galiba sen haklısın. Artık kocaman bir kız oldun. Ah… O zaman yılbaşı oyuncağını geri alayım.”\n" +
                "\n" +
                "Clara: “Ha… Unut az önce dediğimi! Ben küçüğüm,  geçen yılbaşı bana yaptığın küçük balerin kadar küçüğüm.”\n" +
                "\n" +
                "Jack Ho..Ho..Hoho… diye gülmüş. Jack oyuncakçıymış. Her yıl Clara ve Fritz için canlı gibi duran oyuncaklar yaparmış.\n" +
                "\n" +
                "Clara bütün oyuncaklarını çok severmiş ve onları dolabında saklarmış. Kurşun Askerleri, bir korsanı, bir balerini, binicileri, tankları, kamyonetleri ve daha bir sürü oyuncağı varmış. Diğer taraftan Fritz’se oyuncaklarına hiç bakmazmış.  Oyuncakları hep yerlerdeymiş.\n" +
                "\n" +
                " Fritz: “Bu yıl bana hangi oyuncağı yaptın acaba amca?”\n" +
                "\n" +
                "Jack: “Bu yıl sana çok özel bir şey getirdim. Oyuncaklarınızı açmak için gece olana kadar bekleyeceksiniz.”\n" +
                "\n" +
                "Clara: “Aaa Amca Lütfen! Geceye daha çok var. Lütfen! Lütfen! İzin ver şimdi açalım.”\n" +
                "\n" +
                "Jack: “Ha..Ha..Haha…Çocuklar! Size hayır diyeceğimi biliyorsun. Peki! Hem zaten ben bu yılbaşı gecesinin sihirli olduğunu düşünüyorum.”\n" +
                "\n" +
                "Clara: “Aaa… Amca! O kadar da küçük değiliz. Sihir diye bir şey olmadığını biliyoruz.”\n" +
                "\n" +
                "Jack: “Yaa.. O kadar da emin olmayın çocuğum. Nede olsa bugün yılbaşı.”\n" +
                "\n" +
                "Fritz: “Yaa.. Boş laflarınız uykumu getirdi. Hediyelerimizi açabilir miyiz artık?”\n" +
                "\n" +
                "Jack: “Ha..Ha..Haha… Tabi ki! Bu seninki ve buda seninki.”\n" +
                "\n" +
                "Fritz  kendi hediyesini açtığında içinde fare kralı görmüş. Fare ön dişleriyle çok ürkünç görünüyormuş. “Gerçek gibi görünüyor. Clara! Baksana savaştan sanki az önce dönmüş gibi görünüyor bu.” demiş.\n" +
                "\n" +
                "Ama Clara onu dinlemiyormuş. Kendi oyuncağına bakmakla meşgulmüş. Onun oyuncağı Fındıkkıranmış. Uzun, papağan gibi bir burnu varmış. Kafası ise vücudundan  daha büyükmüş. Ama bu oyuncakta değişik bir hava varmış ve Clara gözlerini ondan alamıyormuş…\n" +
                "\n" +
                "Fritz: “Hahaha!  Ne kadar da çirkin!”\n" +
                "\n" +
                "Clara: “Hiç kimse çirkin değildir. Sadece değişik görünüyor.”\n" +
                "\n" +
                "Fritz: “Ahaha… Yani çirkin.”\n" +
                "\n" +
                "Clara: “Değişik çirkin demek değildir. Benim fındıkkıranım çirkin değil. “\n" +
                "\n" +
                "Jack: “Kavga etmeyin çocuklar! Clara haklı Fritz . Değişik çirkin demek değildir. Bende işte bu yüzden bu oyuncağı sana getirdim Clara. Fındıkkıran’ın uzun burnunu ve koca kafasının ötesindeki güzelliği göreceğini biliyordum. O cesur bir gençti! Tipi eskiden böyle değildi onun.”\n" +
                "\n" +
                "Fritz: “Ne demek istiyorsun! Yoksa Fındıkkıran Masalı mı var? Mutlaka anlat bize.”\n" +
                "\n" +
                "Jack Amca: “Ha..Ha..Haa… Tabi ki! Gelin şöyle yanıma oturun ben size fındıkkıran hikayesini anlatayım. Şimdi çok iyi dinleyin.”\n" +
                "\n" +
                "“Bir zamanlar bir kraliçe varmış… Kalenin çok çok temiz olmasını istermiş… Elinde bir yelpaze ve bir ayna taşırmış, bakmak için. Yüzü olabildiğince güzel mi diye bakarmış. Ama talihsiz bir günde, talihsiz bir olay olmuş, hizmetçisi tökezlemiş ve halıyı kirletmiş. Masanın arkasındaki duvara krema sıçramış…”\n" +
                "\n" +
                "“Kraliçe aşırı öfkelenmiş ve bağırmış. “Ağhhh! Ne cüretle kalemin güzelliğini mahfedesin! Nöbetçiler! Atın onu dışarı!” diye emretmiş.\n" +
                "\n" +
                "Bu karar hizmetçiyi çok kızdırmıştı. Hizmetçi: “Siz sadece kendinizi düşünüyorsunuz! Yanınızda çalışan insanları düşünmüyorsunuz! Güzelliğin her şey demek olmadığını anlamıyorsunuz! Bu günden ötürü hep pişmanlık duyacaksınız ama şimdi göreceksiniz! Sizi lanetliyorum! Burnunuz daha uzun, kafanızsa daha büyük olacak ancak en sert fındığı kırdığınız zaman eski halinize geri döneceksiniz.” demiş.  \n" +
                "\n" +
                "Kraliçe tahtına oturmuş ve ağlamış. “Yüzüm! Ben şimdi ne yapacağım? Ben fındık kırmayı bilmiyorum! En sert fındığı nasıl kırabilirim?” diye söylenirken yanına Fındıkkıran gelmiş…\n" +
                "\n" +
                "Fındıkkıran: “Ben sizin yerinize kırarım Kraliçem.” demiş. Böylece Fınfıkkıran en sert fındığı kırmış ve lanet o anda yok olmuş.\n" +
                "\n" +
                "Ama… Fındıkkıran: “Yüzüme ne oldu!” diye söylenmiş. Fındıkkıran’ın burnu giderek uzamış ve kafası da giderek büyümüş! Ama Kraliçe hiç oralı olmamış…\n" +
                "\n" +
                "Kraliçe: “Ooo çok çirkinsin! Artık benim güzel kaleme yakışmıyorsun! Git burdan!” diye emir verince Fındıkkıran kaleden kovulmuş…\n" +
                "\n" +
                "Clara: “Ama bu haksızlık! Kraliçe çok acımasızmış!”\n" +
                "\n" +
                "Jack: “Haklısın! Fındıkkıran’ın niye öyle göründüğünü artık biliyorsun.\n" +
                "\n" +
                "Fritz: “Onun değil! O Fınfıkkıran’ı ben istiyorum!”\n" +
                "\n" +
                "Clara: “Ama sen onu beğenmemiştin! Ayrıca amca onu bana verdi, sen kendi oyuncaklarınla ilgilen.” demiş.\n" +
                "\n" +
                "Ama Fritz oralı olmamıştı. Oyuncağı o kadar çok istiyormuş ki onun için dövüşmeye başlamış. İkiside tüm güçleri ile oyuncağa atlamışlar ve Fındıkkıran’ın kolu çıkınca, Fritz oyuncağı bırakmış. “Ben çok özür dilerim!\n" +
                "\n" +
                "Clara: “Fındıkkıran’ım!”\n" +
                "\n" +
                "Jack: “Hayır çocuklarım! Bugün yılbaşı! Sihir vakti! Merak etmeyin Fındıkkıran düzelecek, ben onu onarırım ama sizde onu sabaha kadar yılbaşı ağacının altında tutacaksınız tamam mı? Sihir ancak o zaman fayda eder. Hadi bakalım al şunu. Ben şimdi gidiyorum. Fındıkkıran’ına iyi bak Clara.”\n" +
                "\n" +
                "Clara o gece uyku uyuyamamış. Fındıkkıranı düşünüp durmuş. Sonunda onun yanına gitmiş ve onu kucaklamış. Kucağına yatırmış ve kendi de uykuya dalmış. Bir süre sonra bir gürültü duymuş, gözlerini açtığında fare kralın canlandığını görmüş.\n" +
                "\n" +
                "Fare kılıcını çekmiş ve Clara’ya yaklaşmış! Bir anda arkasından bir sürü fare gelmiş, fareler Clara’ya saldıracakmış! Clara onları kaçırmak için ayağa kalkmış. Ama o anda kendisi de fareler kadar küçük olduğunu fark etmiş. Korkudan titremeye başlamış. Tam o anda Fındıkkıran canlanmış.\n" +
                "\n" +
                "Fındıkkıran Clara’nın odasına koşmuş ve dolabın önünde durmuş. “Dinleyin! Claranın başı dertte! Ona yardım etmeliyiz! Gelin! Beni takip edin! Herkes Clara’yı kurtarmak için aşağı koşmuş. Aşağı indiklerinde farelerle oyuncaklar arasında bir savaş başlamış. Clara kaçmış  ve yılbaşı ağacının arkasına saklanmış. Oyuncaklar cesurca savaşmışlar ama sayılar farelere kıyasla çok azmış.\n" +
                "\n" +
                " Fındıkkıran çok kötü yaralanmış. Fareler giderek etrafını sarmış.\n" +
                "\n" +
                "Clara: “Olamaz! Fındıkkıranım!” diyerek ayakkabısını fare krala fırlatmış ve fare kıralı vurmuş. Bütün fareler krallarının düştüğünü görmüş ve kaçmış! Oyuncaklarda savaşı kazanmış.\n" +
                "\n" +
                "Clara: “Ah! Fındıkkıran! Hayır! Lütfen, lütfen aç gözlerini…”\n" +
                "\n" +
                "Clara ağlarken yılbaşı ağacı pırıl pırıl parlamaya başlamış. Clara: “Ne? Fındıkkıran genç bir prense dönüşmüş.”\n" +
                "\n" +
                "Clara: “Kimsin sen?”\n" +
                "\n" +
                "Fındıkkıran: “Yoksa beni tanımadın mı? Ben Fındıkkıran’ım. Sen o laneti bozdun Clara. Uzun burnumun ve büyük kafamın ötesindeki güzelliği gördün.”\n" +
                "\n" +
                "Clara tek kelime edemeden önce piyano güzel bir melodi çalmaya başlamış. Ondan sonra olanlarsa, gerçekten de sihirliymiş. Clara Fındıkkıran’la danslar etmiş.\n" +
                "\n" +
                "Anne: “Clara sabaha kadar burada mı uyudun?”\n" +
                "\n" +
                "Clara: “Ne? Fare kral nerede? Ya Fındıkkıran’ım.”\n" +
                "\n" +
                "Anne: “Fındıkkıran elinde ya, sen iyi misin tatlım?”\n" +
                "\n" +
                "Jack: “Herkese günaydın, Clara yoksa sabaha kadar ağacın altında mı uyudun sen?”\n" +
                "\n" +
                "Clara: “Amca! Fındıkkıran! O genç bir prens. Dün gece canlandı, fare kralda canlandı ve onlar savaştılar ve bütün şekerler dans etti!”\n" +
                "\n" +
                "Fritz: “Şekerler dans etti ve fareler savaştı mı? Ah.. Kendimi suçlu hissediyorum. Ablamın oyuncağını kırdım ve ablam aklını kaybetti.”\n" +
                "\n" +
                "Jack: “Ha..Ha..Haha… Clara, istersen Fındıkkıran’ ını dolabına kaldır? Sonra da kahvaltı için aşağı gel.”\n" +
                "\n" +
                "Clara: “Peki amca” demiş. Clara kimsenin ona inanmamasını dert etmemiş. Çünkü biliyormuş ki büyüyene kadar Fındıkkırana inanacakmış. Büyüdüğü zaman da günün birinde onu bulacağını ve beraber mutlu olacaklarını biliyormuş.\n" +
                "\n" +
                "Odasına çıkan Clara Fındıkkıranı dolabına koymuş ve ailesinin yanında olmak için aşağıya inmiş. Nede olsa yılbaşı zamanıymış! Sihir vaktiymiş!")

            landmarkList.add(findikkiran)

        val peterPan=Landmark(" Peter Pan","Eski zamanlarda Londra’da yaşayan Darling ailesi varmış. Darling ailesinin çocukları arasında Michael, John ve Wendy varmış. Wendy ailenin en büyük kızlarıymış. Wendy kardeşlerine çok düşkün ve sevgi dolu bir kızmış. Kardeşlerine yalnız kaldıkları zaman gözü gibi bakar ve korurmuş. Çocukların bakımı için bir dadıları varmış. Bu dadı oldukça büyük olan Newfoundland’a özgü bir köpekmiş. Bu büyük fakat bir o kadar muhteşem dadı olan köpeğin adı Nana imiş.\n" +
                "\n" +
                "\n" +
                "Günlerden bir gün Darling ailesinin ebeveynleri partiye gitmek için hazırlıklara başlamışlar. Çocuklara seslenerek çıkacaklarını söylemişlerdir. Yukarıdan aşağı inen John, Michael ve Wendy annelerine sarılarak yolcu etmiş. Bir zaman sonra çocukların uykusu gelmiş ve odalarında mışıl mışıl uykuya dalmışlar. Tam o sırada çatıdan muhteşem bir ışık düşüvermiş.\n" +
                "Işıkla birlikte Peter Pan ve Tinkerbell pencerenin önüne gelmiş. Peter Pan hemen vakit kaybetmeden usulca pencereyi açmış ve eve girmiş. Tinkerbell’e dönerek ses yapmaması gerektiğini söylemiş. Tinkerbell, Peter Pan’a ait olan gögeye ulaşmak için çekmeceyi açmış ve Peter Pan gölgesini gizlendiği yerde yakalamış.\n" +
                "Gölgesine bakarak sonunda yakaladım seni diyerek söylenmiş. O kadar fazla uğraşmasına rağmen gölgesini bir türlü bağlayamamış. Wendy ise uyanmış ve olanları hayretle izleyerek Peter Pan’a bakmış. Peter Pan yakalanmanın verdiği heyecan ve korku ile hayıflanmış. Wendy, Peter Pan’a kim olduğunu sormuş ve odalarında ne işinin olduğunu tedirginlikle sormuş.\n" +
                "\n" +
                "\n" +
                "Peter Pan ise hemen kendisini tanıtmaya başlamış ve gölgesini bağlamaya çalıştığından bahsetmiş. Wendy ise ona yardım edebileceğini söylemiş. Bir iğne ve ipliğe ihtiyacı vardı ve gölgeyi dikebileceğini düşündü. Wendy iğne ve iplikle gölgeyi dikerken, Peter Pan ona hayali ülkeden bahsetti. Peter Pan anlatmaya başladı.\n" +
                "Peter Pan, Wendy’e hayali ülkeden bahsediyor ve kayıp çocukların orada yaşadığından, kendisinin ise kayıp çocukların lideri olduğundan bahsediyordu. Her çocuğun kayıp olma hikayesi farklıydı. Bu hikayeleri şaşkınlıkla dinleyen Wendy, Peter Pan ile arkadaş oldu. Tinkerbell bu arkadaşları oldukça kıskanmış.\n" +
                "Wendy ise Peter Pan’in bahsettiği ülkeyi çok merak etmiş ve kardeşleriyle oraya gidebilmesinin mümkün olup olmadığını sormuş. Peter Pan ise gelmek isteyip istemediğini sormuş. Peter Pan’a göre kardeşlerine orada göz kulak olarak masallar anlatabileceğinden bahsetmiş. Bu sırada Wendy gölgeyi dikmişti ve gölgesinin artık kaçamayacağını söyledi. John ve Michael hala uyuyordu ve Wendy onları uyandırmaya gitmiş.\n" +
                "Bu sırada Peter Pan, Wendy’e bu yardımı için teşekkür etmiş ve cevizden bir kolye hediye etmiş. Wendy bu sırada uyandırdığı John ve Michale’i Peter Pan ile tanıştırmış. John ve Michael, Peter Pan’i gördüklerine çok sevinmişler. Üç kardeşte Peter Pan ile yolculuk yapmak için sabırsızlanmışlar. Peter Pan uçmaya hazırlanmış, kardeşler ise uçamayacaklarını söylemiş. Peter Pan inanırlarsa uçabileceklerini söylemiş ve Tinkerbell’den peri tozu istemiş. Tinkerbell önce peri tozu konusunda tereddüt etmiş olsa bile daha sonra peri tozunu serpmiş." +
                "Peri tozu ile hep birlikte uçarak yolculuklarına başlamışlar. Yolculuklarına Londra’da bulunan saat kulesini seyrederek başladılar. Yukarıdan bambaşka gözüküyordu ve kısa süre sonra bulutların üstüne çıkmışlardı. Güneş doğuyor ve bulutların üzerinden dünya üzerindeki en büyük binayı görüyorlardı. Yolcukları bir müddet devam ettikten sonra Peter Pan’in bahsettiği hayali ülkeye ulaşmışlar.\n" +
                "Manzara muhteşemdi, bulutların üzerine oturup bir müddet manzarayı seyrettiler. Peter Pan, denizkızı gölünü gösterdi. Bir yerden duman yükseliyordu ve Wendy bu dumanın ne olduğunu merak etti. Peter Pan ise yerlilere ait bir kamp olduğunu söyledi. Peter Pan, Wendy’e göstererek, kaptan James kanca ve korsanların yaşadığı gemiyi görmemezlikten gelmemesi konusunda uyardı.\n" +
                "\n" +
                "\n" +
                "Kaptan Kanca Jolly Roger isimli gemide yaşarmış. Peter Pan biraz Kaptan Kanca’dan bahsetmeye başlamış. Kanca’nın; korsanlar arasında yaşamış olan en kötü ve tehlikeli korsan olduğunda n fakat timsahtan korktuğundan bahsetmiş. Wendy nedenini sormuş ve Peter Pan sözlerine devam etmiş.\n" +
                "Kaptan Kanca ile bir gün dövüştüğü esnada kılıcıyla Kanca’nın elini kestiğini, bir timsahın elini ısırdığını ve yemek için hızla yakalamaya çalıştığını anlatmış. Timsah sadece kolundaki saati yutmuş ve timsahın midesinden gelen tik tok sesleri ile Kanca timsahın kendisine yaklaştığını anlarmış. Bu sırada Korsanlar dürbün ile etrafı gözlemlerken Peter Pan ve arkadaşlarını görmüş. Hemen Kaptan Kanca’ya haber verdi.\n" +
                "Kaptan Kanca ise hızla gelerek inanamadı ve eline dürbünü alarak kendisi baktı. Kaptan Kanca hemen güvertede bulunan korsanlarına talimat vererek Peter Pan’i nişan alarak toplarla vurmasını emretmiş. Kaptan Kanca sürekli Peter Pan’i elinden kaçırdığı için oldukça öfkeliymiş ve bu sefer elinden kaçamayacağını düşünmüş. Olaydan habersiz olan Peter Pan ve arkadaşları birden kendilerine doğru gelen bir top gördüler.\n" +
                "Wendy ve kardeşleri bunun oyun amaçlı kullanılan top olduğunu zannetti ve Peter Pan’a oynamayı teklif ettiler. Peter Pan ise onun bir top değil top mermisi olduğunu söylemiş. Peter Pan hemen arkadaşlarına dağılması gerektiklerini söylemiş ve Tinkerbell’den çocukları güvenli bölgeye götürmesini istemiş. Tinkerbell ise hiç hoşlanmadığı Wendy’den kurtulmak için kötülük düşünmüştü. Wendy’e dönerek kalmasını ve döndüğünü kendisini alacağını söylemiş. Wendy ise Tinkerbell’e güvenerek kardeşlerini teslim etmiş." +
                "John ve Michael’in elinden tutan Tinkerbell onları hemen sahile indirdi. Wendy bu sırada top mermilerinden kaçmaya çalışıyordu. Peter Pan ise Kaptan Kanca’nın yanına gelmişti. Kanca’ya öfkeli bir şekilde bakarak diğer koluna da kanca isteyip istemediğini sordu. Peter Pan kaçarken Kaptan Kanca’ya yakalamasını söyledi ve Kanca silahını çıkararak ateş etmeye başladı. Peter Pan hızlı şekilde mermilerden kaçmayı başardı.\n" +
                "Tinkerbell ise kayıp çocuklardan yardım istedi. Beş kayıp olan çocuk vardı. Bunların ismi Çetin Ceviz, Patron, Sıska, Kıvırcık ve İkizler’di. Tinkerbell çocuklara dönerek Peter Pan’in Wendy isimli bir kuşu öldürmesini istedi yalanını söylemiş. Çocuklar liderleri olan Peter Pan’in verdiği talimat üzerine kuşu vurmak için hedef almışlar. Hepsi birden oklarını Wendy’e doğrultarak Wendy’e doğru fırlatmış.\n" +
                "Wendy ise o sırada kardeşlerini ve arkadaşı Peter Pan’i bulmaya çalışıyordu. Patron, Wendy’i tam göğsünden vurmuş ve Wendy çalıların arasına düşmüş. Kayıp çocuklar hızla vurdukları kuşu görmek için koştu ve Tinkerbell’de onlarla birlikte koşmaya başladı. Peter Pan bu sırada Kanca ile kılıç dövüşüne başladılar.\n" +
                "O sırada tik tok şeklinde bir saat sesi geldi ve Kanca’nın dikkati dağıldı. Timsah oldukça açtı ve Kaptan Kanca’yı yemek istiyordu. Kaptan Kanca o kadar korkmuştu ki hemen gemiye koşmaya başlamıştı. Wendy ise yerde yatarken kayıp çocuklar onun ne kadar güzel olduğundan bahsediyordu ve Tinkerbell’e dönerek neden öldürmesi gerektiğini söylediği konusunda sorular soruyorlardı. Peter Pan, John ve Michael’in yanına gelerek Wendy’e oku kimin fırlattığını sordu. Tinkerbell hızla ağaca doğru uçtu.\n" +
                "\n" +
                "\n" +
                "Kayıp çocuklar ise Wendy’i öldürmeyi, Tinkerbell’in Peter Pan’dan aldığı talimatı söylemesiyle yaptıklarını söylemişler. Peter Pan, Tinkerbell’e oldukça öfkelenerek bir daha görmek istemediğini söylemiş. Wendy’nin uyanması için gözlerini açmasını isteyen Peter Pan, Wendy’nin göğsüne saplanan oku çıkartmış ve kan olmadığını görmüş. Bu nasıl olur diye düşünürken, Wendy’e hediye ettiği ceviz kolyeye saplandığını fark etmiş. Wendy olayın şokuyla bayılmış ve yavaşça gözlerini açmış. Peter Pan’e her yerde onu aradığını söylenmeye başlamış. Peter Pan’dan bir masal anlatmasını istemiş. Peter Pan masalını anlatmaya başlamış.\n" +
                "Günün yorgunluğunun ardından dinlenmişler ve ertesi gün denizkızı gölünü ziyarete gitmişler. Denizkızları çok güzellerdi ve Peter Pan onların arkadaşıydı. O sırada çocuklardan biri bağırmaya başladı. Korsanların olduğunu görünce hemen gizlenmelerini söyledi. Peter Pan ve Wendy korsanlar tarafından bağlanan yerlilerin prensesi Lily’i fark ettiler.\n" +
                "Korsanlar Lily’i bir kayanın üzerine bırakmışlar ve bunu gören Peter Pan hemen korsanların yanına giderek Korsan Kanca’nın sesini taklit etmiş. Korsanlara prensesi bir kayanın üzerine bırakmalarını emretmiş ve korsanlar prensesi bırakmış. Lily hemen yerli kampına geri dönmüş. Kaptan Kanca ise olanları çok sonra öğrenmiş ve korsanlarını kandırdığı için çok öfkelenmiş. Kaptan Kanca artık Peter Pan’a bir ders vermek istiyormuş.\n" +
                "Peter Pan, Wendy ve kardeşlerinin eve dönmek istemelerine üzülmüş. Çocuklar artık masal anlatacak bir arkadaşları olmadığı için üzgün olsa da ailelerini ve evlerini de özlemişler. Ertesi sabah eve dönmek için yola çıkan Wendy ve kardeşleri, yakında gizlenen korsanları fark etmemiş ve onların tuzağına düşmüşler.\n" +
                "\n" +
                "Kaptan Kanca; Wendy ve kardeşlerini bağlamış. Peter Pan gitmelerine üzüldüğü için onları yolcu bile etmemişti. Tinkerbell onları ağaçtan gördü, Peter Pan’a hemen giderek ona olanları anlattı. Çocukları timsaha yemek yapma planında olan kötü kalpli korsan, timsahın bu şekilde peşini bırakacağına inanıyordu. Peter Pan o sırada Kaptan Kanca’yı buldu ve kılıçları çektiler. Kaptan Kanca dengesini kaybetti ve denize düştü.\n" +
                "Timsah ise onu bir lokmada yuttu. Çocuklar Peter Pan’a hayran kaldılar ve masallardaki kadar cesur olduğunu herkese anlatacaklarını söylediler. Birlikte Londra’ya gittiler, anne ve babası çocuklarına kavuşunca çok sevindiler. Kayıp çocuklarla birlikte yaşamak isteyen çocuklar birlikte yaşamaları için anne ve babasından izin aldılar.\n" +
                "Anne ve babası bu duruma izin verdi fakat Peter Pan’a tekrar kalmak isteyip istemediğini sordular. Peter Pan ise asla büyümeyeceğini ve hayali ülkesinde yaşamaya devam edeceğini söylemiş. Peter Pan ve Tinkerbell hayali ülkeye doğru yol alırken, Wendy ve çocuklara el sallamış ve kendisini unutmamalarını söylemiş.")
        landmarkList.add(peterPan)


        val goldilocksVeUcAyı=Landmark(" Goldilocks ve Üç Ayı","Bir varmış, bir yokmuş, evvel zaman içinde büyük bir ormanın kıyısında altın saçlı bir kız yaşarmış. Bu güneş gibi parlak saçlı kızın adı Goldilocks’muş. Öyle güzel sarı saçları varmış ki herkes ona hayranmış fakat bu tüm sevimliliğine rağmen Goldilocks bazen yaramaz bir kız olabiliyormuş.\n" +
                "\n" +
                "Her akşam annesinin yanına gider kendisine çocuk masalları okuması için ısrarcı olurdu. Annesi ise işini bitirdikten sonra bir süre Goldilocks’ a Masallar anlatırdı. Her sabah da oyun oynamak için dışarı çıktığında annesi ona hep aynı şeyleri söylemek zorunda kalıyormuş: “Kızım lütfen arka bahçede oyna, sakın ormanın içine girme.” dermiş.\n" +
                "\n" +
                "Annesi ormanın derinliklerinde bir kulübede yaşayan bir ayı ailesi olduğunu biliyormuş. Bu ayı ailesinde, iri yapılı baba ayı, orta boylu anne ayı ve küçük yavru ayı varmış. Anne ayı her sabah erkenden kalkıp ve kahvaltıda yemek için yulaf lapası hazırlarmış.\n" +
                "\n" +
                "Bir sabah küçük yavru ayı erkenden kalkmış, yulaf lapasını yemek istemiş ama yulaf lapası çok sıcakmış. Küçük sevimli ayıcık: “Annecim yulaf lapası soğuyana kadar ormanda gezmeye çıkalım mı?” demiş. Anne ayı, baba ayı ve yavru sevimli ayı, yulaf lapalarını masada bırakıp, ormanda gezmeye gezintiye çıkmışlar.\n" +
                "\n" +
                "Aynı sabah Goldilocks annesinin ona kahvaltı hazırlamasını beklerken arka bahçede oynuyormuş. Fakat sürekli aynı bahçende oynamaktan sıkılmıştı. Ormanın derinliklerini de çok merak etiğinden: “Ormanın derinliklerini biraz gezsem ne olabilir ki?” diye kendi kendine konuşmuş.\n" +
                "\n" +
                "Önce etrafına bakınmış, kimseleri göremeyince birden ormana doğru koşmaya başlamış. Yorulunca durup çevresini seyretmeye başlamış.\n" +
                "\n" +
                "Goldilocks; “Ne güzel bir orman, çiçekler, ağaçlar neden daha önce gelmedim ki sanki ormana.” demiş. Ormanın derinliklerine doğru ilerlemeye başlamış.\n" +
                "\n" +
                "Bu arada Ayı ailesi ormanda gezerken yavru ayı bir ağacın dalında asılı duran arı kovanını görmüş. Yavru ayı: “Ne kadar büyük bir arı kovanı içi bal doludur şimdi onun. Babacım biraz bal yiyebilir miyiz?”\n" +
                "\n" +
                "Baba ayı: “Yavrum o arı kovanı arılara ait, orası onların evi.”\n" +
                "\n" +
                "Anne ayı: “Ev sahipleri yokken kimsenin evine girip yiyeceklerini yiyemeyiz.”\n" +
                "\n" +
                "Yavru ayı: “Haklısınız, kahvaltımı yapmak için eve gidene kadar beklemem gerekecek sanırım.” demiş.\n" +
                "\n" +
                "Ormanda tek başına yürümeye devam eden Goldilocks o kadar çok yol yürümüş ki sonunda yolunu kaybetmiş. Geri dönmeye çalışmış ama yürüyüş yolunu bir türlü bulamamış. Hem iyice yorulmuş, hemde karnı açıkmış. Yorgunluktan ağlayacakmış artık biraz daha yürümüş ve sonunda yol bitmiş." +
                "Karşısında ağaçların arasında ayı ailesine ait kulübeyi görmüş, sessizce eve yaklaşmış, etrafında dolaşmış kimseyi görememiş yavaşça kapıyı tıklatmış ama kapıyı açan olmamış. Pencereden içeri bakmış içeride masanın üzerinde dumanı halen tüten üç kase görmüş. Tekrar kapıya gitmiş ve bu sefer hızlıca çalmış.\n" +
                "\n" +
                "O anda aralık olan kapı açılıvermiş. Goldilocks sevinmiş kafasını uzatıp içeri seslenmiş, cevap gelmeyince içeri girmiş, masaya yaklaşmış. Masada biri büyük biri orta ve küçük boy üç kase yulaf lapası duruyormuş.\n" +
                "\n" +
                "Çok aç olduğundan en büyük kasedeki yulaf lapasını yemek istemiş. Kaşığını ağzına götürdüğü anda ağzı yanmış. Çünkü yulaf lapası çok sıcakmış. Hemen yanında ki orta kaseden bir kaşık yemiş ama oda çok soğuk olduğu için onuda yemekten vazgeçmiş, üçüncü ve en küçük kaseye kaşığını daldırmış.\n" +
                "\n" +
                "Goldilocks: ” Imm bu ne çok sıcak nede çok soğuk, bu ılık yulaf lapası tam bana göre.” En küçük kasedeki ılık yulaf lapasını yemiş bitirmiş.\n" +
                "\n" +
                "Kahvaltısını bitirip karnı doyunca şöminenin yanında üç sandalye görmüş, yorgun olduğu için biraz oturmak istemiş. Salonda Üç sandalye varmış. Üç sandalyeden biri büyük biri orta ve diğeri de küçükmüş.\n" +
                "\n" +
                "Goldilocks İlk olarak büyük sandalyeye oturmayı denemiş ama üstüne bile çıkmayı başaramamış. Orta boy sandalyeyi denemiş ama bu sandalye de çok sertmiş rahat edememiş. Bu sefer üçüncü küçük olan sandalyeye oturmuş. Bu sandalye çok yumuşakmış tam istediği gibi rahat boyuna uygunmuş. Ama oda ne çatır diye bir sesle kırılıvermiş.\n" +
                "\n" +
                "Goldilocks kendini yerde bulmuş ne yapacağını bilememiş. Yandaki odaya girmiş burada da üç tane yatak varmış biri büyük biri orta ve diğeri de küçük olan üç yatak.\n" +
                "\n" +
                "Hemen ilk olarak büyük olan yatağı denemiş önce, ama bu yatak çok sertmiş ve boyuna göre çok büyükmüş. İkinci yataksa boyundan biraz büyükmüş ama onun için fazla yumuşakmış, üçüncü yatağa yatmış. Hem boyuna tam gelmiş, hemde oldukça rahatmış. Hatta öyle rahatmış ki Goldilocks yatağa uzandığı gibi uyuyuvermiş.\n" +
                "\n" +
                "Goldilocks uykudayken ev sahipleri ayı ailesi eve geri dönmüş baba ayı şömine için ormanda çalı, çırpı anne ayı ise taze meyveler toplamış. Yavru ayıcık ise bir an önce eve girip yulaf lapasını yemek istiyormuş.\n" +
                "\n" +
                "Eve geldiklerinde hepsi çok aç olduğu için masaya oturmuşlar, baba ayı kasesine bir bakmış ve homurdanarak “biri benim yulaf lapamın tadına bakmış.” demiş.\n" +
                "\n" +
                "Anne ayı da kasesine bakmış “biri benim de kasemden tatmış.” Yavru ayıcık kasesine bakmış ve ağlamaya başlamış; “biri benim de yulaf lapamın tadına bakmış. Hatta tadına bakmakla kalmamış hepsini bitirmiş.” Masadan kalkıp etrafa bakınmaya başlamışlar.\n" +
                "\n" +
                "Baba ayı şöminenin yanındaki büyük sandalyesini fark etmiş; “Birisi benim sandalyeme oturmuş. Baksanıza yeri değişmiş.”\n" +
                "\n" +
                "Anne ayı da kızgın ses tonuyla söylenmiş; “Biri benim de sandalyeme oturmuş. Yavru ayıcık bu sefer hıçkırarak ağlamaya başlamış; biri benim de sandalyeme oturmuş, hatta oturmakla kalmamış sandalyemi kırmış.” demiş\n" +
                "\n" +
                "Ayı ailesi merakla yatak odasına gitmişler. Odada yatan Goldilocksu görünce, Baba ayı: “Biri benim yatağıma uzanmış, baksanıza yatak bozulmuş.”" +
                "Anne ayı: “Biri benim de yatağıma yatmış.”\n" +
                "\n" +
                "Yavru ayıcık: “Biri benim de yatağıma yatmış ve hatta halen biri benim yatağımda yatıyor!”\n" +
                "\n" +
                "Baba ayıcık yavru yatağının yanına gelmiş gerçekten de yatağın içinde birinin yattığını görmüş. Yavaşça örtüyü kaldırmış yatağın içinde uyuyan minik kız çocuğunu görünce çok şaşırmışlar.\n" +
                "\n" +
                "Baba ayı: “Bizim kulübenin içinde ne işi var ki bu küçük insanın.”\n" +
                "\n" +
                "Yavru ayı: “Söyleyin bu kıza kalksın hemen yatağımdan! “\n" +
                "\n" +
                "Yavru ayının ağlamasıyla irkilerek uyanan Goldilocks karşısında üç tane ayı görünce çok korkmuş hemen Yatak’tan fırladığı gibi dışarı koşmuş ve arkasına bakmadan koşmaya devam etmiş. Koşmaktan nefessiz kalmış ama durmamış. Ne yöne gideceğini de bilmiyormuş üstelik tam bu sırada karşıdan gelen anne ve babasını görmüş.\n" +
                "\n" +
                "Anne ve babası Goldilocks merak edip, onu aramaya çıkmışlar. Goldilocks anne ve babasını görünce çok sevinmiş koşup hemen annesine sarılmış.\n" +
                "\n" +
                "Goldilocks : “Anne, Annecim”\n" +
                "\n" +
                "Annesi: ” Kızım çok merak ettim seni, iyi misin?”\n" +
                "\n" +
                "“Bir daha sizin sözünden çıkmayacağım anneciğim, sizden habersiz bir yere gitmeyeceğim.” demiş. Goldilocks anne ve basına sımsıkı sarılmış. O günden sonra söz verdiği gibi anne ve babasından izinsiz hiçbir şey yapmamış, uslu ve sevimli bir kız olmuş.")
        landmarkList.add(goldilocksVeUcAyı)

        val ozBuyucusu=Landmark(" Oz Büyücüsü","Bir zamanlar Amerika’da amca ve yengesiyle ıssız bir evde yaşayan Dorothy adlı tatlı bir kız varmış. Amcası ve yengesi çok çalışkan insanlarmış ama Dorothy’ye hiç güler yüz göstermez ve onunla hiç konuşmazlarmış.\n" +
                "\n" +
                "Bu durum Dorothy’i epey mutsuz ediyormuş çünkü o konuşmayı çok seviyormuş. Neyse ki ona arkadaşlık eden ve onu eğlendiren Toto adında küçük, siyah bir köpek varmış.\n" +
                "\n" +
                "Bir sabah gök yüzü kararmış ve sert bir rüzgar esmeye başlamış. Bütün ev şiddetli bir şekilde sallanmadan önce sadece köpeğini kucağına alabilmiş.\n" +
                "\n" +
                "Dorothy evin zangır, zangır sallanmasından çok korkmuştu. Sonra ev temellerinden ayrılmaya, havalanmaya başlamış ve şiddetle esen rüzgarın önünde savrulup gidiyormuş.\n" +
                "\n" +
                "Biraz zaman geçtikten sonra kız uykuya dalmış. Ev bir süre sonra Munchkin denen, meyve ağaçlarıyla dolu, çok güzel yere bir konmuş.\n" +
                "\n" +
                "Evin hızlıca yere çarpması kızı uyandırmış. Karşısında meyve dolu ağaçları, çiçekleri ve kuşları görünce çok şaşırmış.\n" +
                "\n" +
                "Nerede olduğunu merak ederken hoş bir ses: “Munchkin’e hoş geldin! Demiş.\n" +
                "\n" +
                "Dorothy sesin geldiği yere bakmış ama kimseyi görememişler.\n" +
                "\n" +
                "Dorothy, Toto ve Korkuluk yürümeye devam etmişler, bir süre ilerledikten sonra derin bir inleme sesi duymuşlar. Sesin geldiği tarafa yönelmişler ve tenekeden yapılmış bir adama rastlamışlar.\n" +
                "\n" +
                "Teneke Adam’ın eklemleri paslanmış ve Dorothy’den eklemlerini yağlamasını rica etmiş. Dorothy adamın kulübesinden yağ şişesini almış ve eklemlerini yağlamış. Teneke Adam Dorothy’ye teşekkür etmiş. Adam, onlarla konuşurken nereye gittiklerini sormuş.\n" +
                "\n" +
                "Dorothy ona her şeyi anlatmış. Teneke Adam da bir kalp istiyormuş ve o da onlara katılmış. Gurup biraz daha büyümüş ve ormanın derinliklerine ulaşınca bir aslanla karşılaşmışlar.\n" +
                "\n" +
                "Aslan Korkuluk ve Teneke Adam’a birer pençe indirmiş. Tam Toto’ya da vurmaya kalkışacakken Dorothy aslanın burnuna bir tokat atmış ve onu ‘‘Korkak!’’ diye azarlamış.\n" +
                "\n" +
                "Aslan utançla başını öne eğmiş ve Dorothy’ye hak vermiş. Cesur olmak istediğini anlatmış. Aslan da onlara katılmış. Sonunda Dorothy ve arkadaşları Oz Büyücüsü’nün sarayına ulaşmışlar.\n" +
                "\n" +
                "Sarayın görkemini görünce dehşete düşmüşler. Oz Büyücüsü tehlikeli bir büyücü de olabilirmiş pekala… İçeri girmeye çekinmişler. Kendilerini koridora açılan büyük bir holde bulmuşlar.\n" +
                "\n" +
                "Oz Büyücüsü’nün olduğu başka büyük bir hole ulaştırmış.\n" +
                "\n" +
                "Geliş amaçlarını açıklamışlar. Büyücü dördüne de yardım etmeye hazırmış ama bir şartla… Onlardan batının kötü cadısını öldürmelerini istemiş. Görevi yerine getirme konusunda anlaşmışlar.\n" +
                "\n" +
                "Kötü cadı, onların geleceğini haber alınca onları avlaması için kurtları yollamış. Dorothy ve arkadaşları kurtların saldırılarından kendilerini kurtarmışlar.\n" +
                "\n" +
                "Kötü cadı, başarısızlığından çılgına dönmüş. Ertesi sefer, kanatlı maymunlar yollamış. Dorothy ve arkadaşları bu maymunları görünce korkmuşlar ama korkuluk ve Teneke Adam yine cesurca savaşmışlar.\n" +
                "\n" +
                "Maymunlar kaçmak zorunda kalmışlar ama Korkuluk ve Teneke Adam fena yaralanmışlar. Dorothy ve arkadaşları daha sonra cadının emriyle hareket eden bir gurup karga ve kocaman iğneli siyah arıların saldırılarına maruz kalmışlar.\n" +
                "\n" +
                "Yaralarına rağmen Korkuluk ve Teneke Adam bu saldırıları atlatmış ve sonra kötü cadının sarayına ulaşmışlar.\n" +
                "\nCadı onları karşısında görünce kendini kaybetmiş ve sinirli bir şekilde: “Hepiniz benim esirimsiniz.” Demiş.\n" +
                "\n" +
                "Dorothy ve arkadaşları yolculuktan ve mücadelelerden sonra çok yorgun oldukları için cadıya karşı koyamamışlar ve dediklerini yapmışlar.\n" +
                "\n" +
                "İyi cadının verdiği altın ayakkabı hala Dorothy’nin ayaklarındaymış.\n" +
                "\n" +
                "Kötü cadı bu ayakkabıların gücünün farkındaymış ama Dorothy’yi koruyan sihirli öpücük yüzünden ayakkabıları zor da kullansa alamıyormuş. Altın ayakkabıları Dorothy’den güvenli bir şekilde almanın yolarını arıyormuş.\n" +
                "\n" +
                "Dorothy ve arkadaşlarını birkaç gün esir tutmuş. Dorothy, cadıyla kaldıkları süre boyunca cadının sudan uzak durduğunu fark etmiş. Onun ıslanmaktan hoşlanmadığını anlamış.\n" +
                "\n" +
                "Bir gün cadıyla Dorothy’yle aşağılayıcı bir dille konuşmuş. Çok sinirlenen küçük kız, bir kova suyu cadının üzerine boca etmiş.\n" +
                "\n" +
                "Şaşırtıcı bir şekilde cadı korkudan ağlamaya ve erimeye başlamış. Ondan geriye kalan çamurlu su birikintisi olmuş. Küçük kız yanlışlıkla cadıyı öldürdüğünü anlamış.\n" +
                "\n" +
                "Kız hemen cadının büyülü şapkasını almış çünkü büyülü gücün farkındaymış. Artık Oz Büyücüsü’ne gitme zamanı gelmiş.\n" +
                "\n" +
                "Maymunlara kendilerini Oz Büyücüsü’nün yanına götürmelerini emretmiş. Büyücüyü yaşlı ve sıradan bir adam olarak görmüşler.\n" +
                "\n" +
                "Söz verdiği gibi Teneke Adam’a saatten bir kalp vermiş. Yaşlı adam, beyni vererek sözünü tutmuş. Korkuluk isteği yerine getirildiği için kendini çok mutlu hissetmiş.\n" +
                "\n" +
                "Yaşlı adam aslana, bir ilaç vermiş. İlacı içince aslan kendini, cesaret dolu hissetmiş. Dorothy de isteğinin yerine getirilmesini istiyormuş.\n" +
                "\n" +
                "Yaşlı adam, kötü cadıdan aldığı şapkanın kendisini iyi cadıya götüreceğini, bundan sonrasını onun bileceğini söylemiş.\n" +
                "\n" +
                "Maymunlara kendilerini iyi cadının yanına götürmelerini emretmiş. Kısa süre sonra iyi cadının yanına varmışlar. İyi cadı, Dorothy, Korkuluğa, Teneke Adam’a, koca aslana ve iyi cadıya ‘‘Hoşça kal!’’ deyip evine dönmüş.\n" +
                "\n" +
                "Dorothy’nin yengesi onu sevinçle kucaklamış. Dorothy bütün olanları anlatmış. Altın ayakkabılardan, güvenlik öpücüğünden ve büyülü şapkadan bahsederken yengesi ona inanıp inanmaması gerektiğini düşünüyormuş.\n" +
                "\n" +
                "Gerçek her neyse Dorothy’yi tekrar sağ salim görmekten mutluymuş.")

        landmarkList.add(ozBuyucusu)

        val heidi=Landmark(" Heidi","Babası o daha küçükken ölmüş.\n" +
                "\n" +
                "Heidi’ye teyzesi bakıyormuş.\n" +
                "\n" +
                "Bir zaman sonra teyzesi Heidi’ye bakamaz olmuş.\n" +
                "\n" +
                "Onu dağlarda yaşayan Alpöhi dedesinin yanına götürmeye  karar vermiş.\n" +
                "\n" +
                "Heidi daha önce dedesini hiç görmemiş.\n" +
                "\n" +
                "Alpöhi dede Alp dağlarında tahta kulubesinde yaşayan aksi birisiymiş.\n" +
                "\n" +
                "Heidi yi görünce sevinmiş ama bunu ona belli etmemiş.\n" +
                "\n" +
                "Heidi ise teyzesi gidince hüzünlenmiş.\n" +
                "\n" +
                "Teyzesi başka bir şehirde iş bulmuş.\n" +
                "\n" +
                "Heidi dedesiyle baş başa kalmış.\n" +
                "\n" +
                "Dedesi Heidi’ ye evin çatısında güzel bir oda hazırmış.\n" +
                "\n" +
                "Dedesini yeni tanıyan Heidi onu çok sevmiş bundan sonra çok güzel günler onu bekliyormuş.\n" +
                "\n" +
                "Heidi akşam olunca uyumaya odasına gitmiş ve sabaha kadar deliksiz uyumuş  güzel rüyalar görmüş.\n" +
                "\n" +
                "Sabah uyandığında da çok güzel bir köpek   ile tanışmış.Adı josephmiş.\n" +
                "\n" +
                "Daha sonra Alp dağlarında gezmeye giden Heidi keçilerini otlatan Peterle tanışmış.\n" +
                "\n" +
                "Heidi ben burada dedemin yanında yaşıyacağım artık demiş.\n" +
                "\n" +
                "Peter i çok sevmiş.Bundan sonraki günlerde  Peter keçilerini otlatırken Heidiyi de yanına alıyormuş.\n" +
                "\n" +
                "Birlikte dağlarda koşmuşlar, Peter ona keçi çobanlığını öğretmiş yeni şeyler ile çok mutlu oluyormuş.\n" +
                "\n" +
                "Dedeside Heidiyi çok seviyor ama bunu belli etmiyormuş.\n" +
                "\n" +
                "Heidi yaz boyu dağlarda koşup oynarken bir yandan da dedesine yardım ediyormuş.\n" +
                "\n" +
                "Heidi dedesinin ona küçük ekmekler pişirmesini çok seviyormuş.\n" +
                "\n" +
                "Heidi deküçük ekmeklerden Peter’in yaşlı annesine de götürürmüş.\n" +
                "\n" +
                "Peter’in annesi de ona keçi sütü verirmiş.\n" +
                "\n" +
                "Yavaş yavaş yaz bitmeye kışta gelmeye başlamış.\n" +
                "\n" +
                "Peter de okula başlamış.\n" +
                "\n" +
                "Heidinin de bu duruma canı çok sıkılmış.\n" +
                "\n" +
                "Heidi de  okula gitmek istiyormuş.\n" +
                "\n" +
                "Bir gün teyzesi Heidi yi almaya gelmiş.\n" +
                "\n" +
                "Heidi hem çalışıp hemde okula gidecekmiş.\n" +
                "\n" +
                "Alpöhi dedesi önce kızmış izin vermemiş ama düşünce Heidinin geleceği için şehre gidip okula gitmesi daha iyi olacağını düşünmüş.\n" +
                "\n" +
                "Heidi dedesinin yanından ayrılmak istemiyormuş ona çok alışmış.\n" +
                "\n" +
                "Ama teyzesi ona istediği zaman dedesini görebileceğini söyleyince Heidi gitmeyi kabul etmiş.\n" +
                "\n" +
                "Heidi ve teyzesi trene binerek uzun bir şehir yolcuğuna başlamışlar.\n" +
                "\n" +
                "Yolculuk bitince şehirdeki büyük bir köşke gelmişler.\n" +
                "\n" +
                "Heidi bu kadar büyük bir köşk gördüğü için çok şaşırmış burada kalacağı için sevinmiş.\n" +
                "\n" +
                "Evde Clara isminde onun yaşlarında bir kız çocuğu varmış.\n" +
                "\n" +
                "Clara küçükken trafik kazası geçirmiş o yüzden yürüyemiyormuş ve tekerlekli sandalyede yaşamını devam ettiriyormuş.\n" +
                "\n" +
                "Zaten teyzesi Claraya arkadaş olması için Heidi’yi getirmiş.\n" +
                "\n" +
                "Clara ile Heidi çok iyi birer arkadaş olmuşlar.\n" +
                "\n" +
                "Birbirlerini çok sevmişler.\n" +
                "\n" +
                "Heidi daha öncede şehirde yaşamadığı için şehir yaşamına pek uyum sağlayamıyormuş Clara da ona çok gülüyormuş.\n" +
                "\n" +
                "Clara’nın babaannesi çok sert  ve kuralcıymış.\n" +
                "\n" +
                "Heidiye yemek yemesini,çatal kaşık tutmasını,sofrada nasıl oturulacağına kadar birçok şey öğretmiş.\n" +
                "\n" +
                "Heidi şehir insanları gibi giyinmeye başlamış ama kendini rahat hissedemiyormuş.\n" +
                "\n" +
                "Clara da Heide’ye okuma-yazma öğretiyor birlikte güzel vakit geçiriyorlarmış.\n" +
                "\n" +
                "Ama Heidi dedesini, Alp dağlarını, peter’i ve köpeği  joseph’i çok özlüyormuş.\n" +
                "\n" +
                "Artık yemek bile yiyemez olmuş.\n" +
                "\n" +
                "Bu duruma Claranın babaanesi ve babası çok üzülmüşler ve onu tekrar dedesinin yanına götürmeye karar vermişler ama Clara bu duruma üzülmüş.\n" +
                "\n" +
                "Babaannesi eğer Heidi’yi seviyorsan onun mutlu olmasını istiyorsan ona yardımcı olmalısın demiş.\n" +
                "\n" +
                "Vedalaşma zamanı gelmiş ve Heidi’nin teyzesi Clara’ya seneye Heidi’yi ziyaret gidebileceğini söylemiş.\n" +
                "\n" +
                "Heidi şehir giysilerini çıkarmış ve  Dağlara geri dönmüş Heidi koşarak önce Peterlere gitmiş ve Claranın gönderdiği ekmekleri Peter’in annesine vermiş.\n" +
                "\n" +
                "Daha sonra koşarak dedesinin yanına giden haydi onu görünce çok sevinmiş ve ona sarılarak çok özlediğini söylemiş.\n" +
                "\n" +
                "Tekrar dedesiyle berabermiş artı. Aradan belli bir zaman geçtikten sonra Clara ona mektup  yazmış. Heidi seni görmeye geleceğim diye. Heidi çok sevinmiş.\n" +
                "\n" +
                "Clara Alp dağlarına Heidi’nin yanına geldiğinde Peter ile de tanışmış. Onuda çok sevmiş.\n" +
                "\n" +
                "Peter fazla sıcak davranmıyormuş Clara’ya çünkü Heidi’yi yine yanına şehre götüreceğinden korkuyormuş.\n" +
                "\n" +
                "Peter, Clara ve Heidi birlikte Alp dağlarının kırlarında çok  güzel  eğleniyorlarmış.\n" +
                "\n" +
                "Temiz hava ve yiyecekler Clara’ya çok iyi geliyormuş.\n" +
                "\n" +
                "Clara ile Heidi’nin iyi arkadaş olması Peter’in hoşuna gitmemiş ayrıca Clara’yı tekerlekli sandalyesine oturup kalkarken yardım etmesi hoşuna gitmiyormuş.\n" +
                "\n" +
                "Peter tekerlekli sandalyeyi alıp dağın yüksek ucundan aşağı atıvermiş.\n" +
                "\n" +
                "Clara sandalyesiz kalmış.\n" +
                "\n" +
                "Bu sayede Clara’nın gideceğini düşünmüş ama bu seferde Heidi ona destek olarak yürümesine yardımcı olmuş temiz havada iyi geliyormuş.\n" +
                "\n" +
                "Heidi’nin sayesinde Clara artık yürümeye başlamış.\n" +
                "\n" +
                "Clara çok mutlu olmuş Heidi’ye çok teşekkür etmiş.\n" +
                "\n" +
                "Bir kaç gün sonra Clara’nın babası ve büyükannesi onu ziyarete  gelmişler.\n" +
                "\n" +
                "Clara’nın yürüdüğünü gördüklerinde çok sevinmişler.\n" +
                "\n" +
                "Heidi’ye ve dedesine çok teşekkür etmişler o sırada Peter yaptıklarından pişman olup sandalyeyi dağdan attığını itiraf etmiş.\n" +
                "\n" +
                "Herkesten özür dilemiş yaptığının yanlış olduğunu anlamış.\n" +
                "\n" +
                "Heidi onu  affetmiş,  Clara da affetmiş.\n" +
                "\n" +
                "Bak sayende yürüyorum demiş.\n" +
                "\n" +
                "Clara ve ailesinin gitme zamanı gelmiş ve seneye tekrar geleceklerinin sözünü  vermişler.\n" +
                "\n" +
                "Yeni yıla kadar herkes mutlu ve huzur dolu yaşamlarına devam etmişler.")

        landmarkList.add(heidi)

        val mutluPrens=Landmark(" Mutlu Prens","Mutlu Prens’in heykeli, uzun bir sütunun tepesinde, şehrin ta üzerinde yükseliyordu. Baştan aşağı ince altın varaklarla kaplıydı, gözleri iki parlak safirdi, kılıcının kabzasında da iri kırmızı bir yakut parıldıyordu.\n" +
                "\n" +
                "Herkes çok hayrandı ona. “Bir rüzgârgülü kadar güzel,” dedi sanat beğenisiyle ün kazanmak isteyen Şehir Meclisi üyelerinden biri; “ama onun kadar yararlı değil,” diye de ekledi, kendisini aklı havalarda sanacaklarından korkarak, aslında öyle biri değildi.\n" +
                "\n" +
                "Duyarlı bir anne, aydedeyi isterim diye ağlayan küçük oğluna, “Neden Mutlu Prens gibi olamıyorsun?” diye sordu. “Mutlu Prens hiçbir şey için ağlamayı aklının ucundan bile geçirmez.”\n" +
                "\n" +
                "Hayalleri yıkılmış bir adam harikulade heykele bakıp, “Hiç değilse dünyada epeyce mutlu birisi var,” dedi.\n" +
                "\n" +
                "Yetimhane öğrencileri parlak kızıl renkli pelerinleri, temiz beyaz önlükleriyle kiliseden çıkarlarken, “Tıpkı bir meleğe benziyor,” dediler.\n" +
                "\n" +
                "“Nereden biliyorsunuz?” dedi aritmetik öğretmeni, “Hiç melek görmediniz ki.”\n" +
                "\n" +
                "“Ah! Gördük, rüyalarımızda,” diye cevap verdi çocuklar. Bunun üzerine aritmetik öğretmeni kaşlarını çatıp kızgın bir yüz ifadesi takındı, çünkü çocukların düş görmelerini onaylamazdı.\n" +
                "\n" +
                "Bir gece şehrin üzerinden küçük bir kırlangıç geçti uçarak. Arkadaşları altı hafta önce Mısır’a gitmişlerdi ama o geride kalmıştı, çünkü güzeller güzeli bir kamışa tutkundu. Ona ilkbaharın ilk günlerinde, sarı bir pervanenin peşinde nehir aşağı uçarken rastlamıştı. Kamış’ın ince beli o kadar gönlünü çelmişti ki durup konuşmuştu onunla.\n" +
                "\n" +
                "“Seni seveyim mi?” dedi Kırlangıç, hemen sadede gelmekten hoşlanırdı. Kamış ise boynunu iyice bir eğdi. Bunun üzerine Kırlangıç onun etrafında döndü de döndü, kanatlarını suya değdiriyor, suda gümüş halkacıklar yapıyordu. Muhabbetini böyle gösteriyordu işte. Aşkları bütün yaz sürdü.\n" +
                "\n" +
                "“Gülünç bir bağlılık bu,” diye cıvıldaştı öteki kırlangıçlar; “Kamış Hanım beş parasız, ayrıca çok fazla akrabası var!” Gerçekten de ırmak kamış doluydu. Sonra, sonbahar geldiğinde bütün kırlangıçlar uçup gitti.\n" +
                "\n" +
                "Arkadaşları gittikten sonra Kırlangıç kendini yalnız hissetti ve sevgilisinden usandı. “Sohbeti yok,” dedi, “ayrıca korkarım cilve yapmaktan başka bir şey bilmiyor, durmadan rüzgârla cilveleşip duruyor.” Gerçekten de ne zaman rüzgâr esse, Kamış çok zarif hareketlerle eğilip bükülüyordu. “Yerine de çok düşkün,” diye sürdürdü sözünü, “oysa ben yolculuk etmeyi seviyorum, bu yüzden karımın da yolculuktan hoşlanması gerekir.”\n" +
                "\n" +
                "Sonunda, “Benimle uzaklara gelir misin?” dedi ona, fakat Kamış başını iki yana salladı, o kadar bağlıydı yerine.\n" +
                "\n" +
                "“Aşkımı hafife aldın!” diye bağırdı Kırlangıç. “Ben de Piramitler’e gidiyorum. Hoşça kal!” dedi ve uçup gitti.\n" +
                "\n" +
                "Bütün gün uçtu, gece olduğunda şehre vardı. “Nerede konaklasam?” dedi; “Umarım kent beni ağırlamak için hazırlık yapmıştır.” Sonra uzun sütunun üzerindeki heykeli gördü. “Burada konaklayacağım,” dedi; “güzel bir konumu var, temiz hava bol.” Böyle diyerek Mutlu Prens’in ayaklarının arasına kondu.\n" +
                "\n" +
                "Çevresine bakındı, “Altından bir yatak odam var,” dedi kendi kendine alçak sesle ve uyumaya hazırlandı; fakat başını tam kanadının altına sokarken üzerine büyük bir su damlası düştü. “Ne garip şey!” diye bağırdı; “Gökyüzünde tek bir bulut yok, yıldızlar berrak, ışıl ışıl, gene de yağmur yağıyor. Avrupa’nın kuzeyinin iklimi gerçekten de feci. Kamış yağmuru çok severdi, ama sadece bencilliğinden.”\n" +
                "\n" +
                "Derken bir damla daha düştü.\n" +
                "\n" +
                "Kırlangıç, “Yağmurdan korumayacaksa heykel dediğin ne işe yarar? İyi bir baca altı aramalı,” dedi ve uçup gitmeye karar verdi.\n" +
                "\n" +
                "Ama daha kanatlarını açamadan üçüncü bir damla düştü. Kırlangıç başını kaldırıp yukarı baktı ah, bir de ne görsün!\n" +
                "\n" +
                "Mutlu Prens’in gözleri yaşlarla doluydu ve altın yanaklarından yaşlar süzülüyordu. Yüzü ay ışığında o kadar güzeldi ki Kırlangıç’ın içi acımayla doldu.\n" +
                "\n" +
                "“Kimsin sen?” dedi.\n" +
                "\n" +
                "“Ben Mutlu Prens’im.”\n" +
                "\n" +
                "“O zaman neden ağlıyorsun?” diye sordu Kırlangıç; “Sırılsıklam ettin beni.”\n" +
                "\n" +
                "“Ben canlıyken ve yüreğim insan yüreğiyken,” diye cevap verdi heykel, “gözyaşlarının ne işe yaradığını bilmezdim, çünkü üzüntünün girmesine izin verilmeyen Kaygısızlık Sarayı’nda yaşardım. Gündüzleri arkadaşlarımla bahçede oyun oynardım, akşamsa Büyük Salon’da dansın başını çekerdim. Bahçenin etrafında çok gösterişli bir duvar vardı, fakat hiçbir zaman o duvarın gerisinde ne olduğunu merak etmedim, çevremdeki her şey o kadar güzeldi ki. Saray’dakiler Mutlu Prens derlerdi bana, gerçekten de mutluydum, eğer zevk içinde yaşamak mutluluksa. Öyle yaşadım ve öyle öldüm. Sonra da, ben öldükten sonra heykelimi buraya, böyle yükseğe diktiler; şehrimin bütün çirkinliğini, şehrimdeki bütün yoksulluğu görebileyim diye ve kalbim kurşundan da olsa ağlamamak elimden gelmiyor.”\n" +
                "\n" +
                "“Ne! Som altından değil mi bu?” dedi Kırlangıç kendi kendine. Şahsi fikirlerini yüksek sesle dile getirmeyecek kadar nazikti.\n" +
                "\n" +
                "“Çok uzaklarda,” diye sözünü sürdürdü heykel alçak sesle, şarkı söyler gibi, “çok uzaklarda küçük bir sokakta yoksul bir ev var. Pencerelerden biri açık ve açık pencereden masaya oturmuş bir kadın görüyorum. Yüzü zayıf ve ince, iğneden delik deşik olmuş nasırlı, kırmızı elleri var, çünkü o bir terzi. Kraliçe’nin nedimelerinin en güzelinin gelecek Saray balosunda giyeceği atlas elbiseye çarkıfelek çiçekleri işliyor. Odanın köşesinde bir yatakta küçük oğlu hasta yatıyor. Ateşi var ve portakal istiyor. Annesi ona nehir suyundan başka bir şey veremiyor, onun için de ağlıyor. Kırlangıç, Kırlangıç, küçük Kırlangıç, ona kılıcımın kabzasındaki yakutu götürür müsün? Benim ayaklarım bu kaideye yapışık, bir yere kımıldayamıyorum.\n" +
                "\n" +
                "“Mısır’da bekliyorlar beni,” dedi Kırlangıç. “Arkadaşlarım Nil boyunca aşağı yukarı uçup duruyor, kocaman lotus çiçekleriyle konuşuyorlar. Çok geçmeden büyük Kral’ın lahtinde uykuya çekilecekler. Kral’ın kendisi de orada, boyanmış tabutunda uyuyor. Sarı ketenlere sarmışlar onu, baharatlarla mumyalanmış. Boynunda soluk yeşil yeşim taşlarından bir zincir var, elleri kurumuş yapraklara benziyor.”\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “benimle bir gece kalıp ulağım olamaz mısın? Oğlancık o kadar susamış, annesi o kadar üzüntülü ki.”\n" +
                "\n" +
                "“Oğlan çocuklarından hoşlandığımı söyleyemem,” diye cevap verdi Kırlangıç. “Geçen yaz, nehirde yaşarken iki tane yaramaz çocuk vardı, değirmencinin oğulları, bana hep taş atarlardı. Beni hiç vuramadılar tabii; biz kırlangıçlar çok uzaklara uçabiliriz, hem ayrıca ben çevikliğiyle ünlü bir aileden geliyorum; ama gene de bu bir saygısızlık belirtisiydi.”\n" +
                "\n" +
                "Fakat Mutlu Prens o kadar üzgün görünüyordu ki küçük Kırlangıç söylediklerine pişman oldu. “Burası çok soğuk,” dedi; “ama seninle bir gece kalıp ulağın olacağım.”\n" +
                "\n" +
                "“Teşekkür ederim, küçük Kırlangıç,” dedi Prens. Böylece Kırlangıç, Prens’in kabzasındaki yakutu koparıp aldı ve gagasında yakutla şehrin damları üzerinden uçup gitti.\n" +
                "\n" +
                "Beyaz mermerden melek heykellerinin olduğu katedral kulesinin yanından geçti. Saray’ın yanından geçti, dans edenlerin seslerini duydu. Balkona yanında sevgilisiyle güzel bir kız çıktı. “Ne kadar güzel yıldızlar!” dedi adam kıza; “Aşkın gücü ne kadar güzel!”\n" +
                "\n" +
                "“İnşallah elbisem Kraliyet Balosu’na yetişir,” diye cevap verdi kız; “üzerine çarkıfelek çiçekleri işlenmesini istedim; ama terziler o kadar tembel ki.”\n" +
                "\n" +
                "Kırlangıç nehrin üzerinden geçti ve gemilerin direklerine asılı fenerleri gördü. Getto’nun üzerinden geçti ve birbirleriyle pazarlık edip bakır terazilerde para tartan yaşlı Yahudileri gördü. Sonunda yoksul eve vardı ve içeri baktı. Küçük çocuk ateşler içinde bir o yana bir bu yana dönüp duruyordu, anasıysa uyuyakalmıştı, o kadar yorgundu. Sıçrayıp içeri girdi Kırlangıç ve yakutu masaya, kadının yüksüğünün yanına koydu. Sonra usulca yatağın çevresinde uçtu, oğlanın alnını kanatlarıyla serinletti.\n" +
                "\n" +
                "“Nasıl da serinledim!” dedi oğlan, “Herhalde iyileşiyorum,” ve tatlı bir uykuya daldı.\n" +
                "\n" +
                "Sonra Kırlangıç yeniden uçup Mutlu Prens’in yanına döndü ve ona yaptığını anlattı. “Garip şey,” dedi, “içim sımsıcak, oysa hava ne kadar soğuk.”\n" +
                "\n" +
                "“İyi bir davranışta bulundun da ondan,” dedi Prens. Küçük Kırlangıç düşünmeye başladı, sonra uyuyup kaldı. Düşünmek hep uykusunu getirirdi.\n" +
                "\n" +
                "Şafak söktüğünde nehre uçup orada yıkandı. Köprüden geçmekte olan Kuşbilim Profesörü, “Ne kadar da dikkat çekici bir olay!” dedi. “Kış ortasında bir kırlangıç!” Yerel gazeteye bunun hakkında uzun bir mektup yazdı. Herkes yazıyı konuştu, yazı kimsenin bilmediği bir sürü kelimeyle doluydu çünkü.\n" +
                "\n" +
                "“Bu gece Mısır’a gidiyorum,” dedi Kırlangıç; bunu düşününce de çok sevindi. Şehrin bütün anıtlarını dolaştı ve kilisenin kulesinin tepesinde uzun süre oturdu. Nereye gitse serçeler cıvıldaşıyor ve birbirlerine, “Ne seçkin bir yabancı!” diyorlardı, bu pek hoşuna gitti.\n" +
                "\n" +
                "Ay gökyüzünde yükseldiğinde uçup Mutlu Prens’e geri döndü. “Mısır için bir siparişin var mı?” diye bağırdı. “Birazdan yola çıkıyorum da.”\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “benimle bir gece daha kalmaz mısın?”\n" +
                "\n" +
                "“Mısır’da bekleniyorum,” diye cevap verdi Kırlangıç. “Yarın arkadaşlarım İkinci Çavlan’a uçacaklar. Orada büyük sazların arasında suaygırı diz çökmüş oturur, büyük granitten bir tahtta ise Kral Memnon. Tüm bir gece boyu yıldızları seyreder, sonra sabah yıldızı ışıyınca da bir sevinç çığlığı atar, sonra susar. Öğle vakti sarı aslanlar su kenarına su içmeye inerler. Yeşil beril taşları gibi gözleri vardır ve kükremeleri çavlanın sesini bastırır.”\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “şehrin öteki yanında, çok uzaklarda bir çatı katında bir delikanlı görüyorum. Üzeri kâğıtlarla örtülü masasının üzerine eğilmiş, yanındaki sürahinin içinde bir demet solmuş menekşe var. Saçları kumral ve dalgalı; dudakları nar kırmızısı ve kocaman, hülyalı gözleri var. Tiyatro müdürüne vereceği oyunu bitirmeye çalışıyor; ama artık yazamayacak kadar üşümüş. Ocakta ateş yok ve açlıktan iyice zayıf düşmüş.”\n" +
                "\n" +
                "“Seninle bir gece daha kalacağım,” dedi Kırlangıç, gerçekten yufka yürekliydi. “Ona da bir yakut götüreyim mi?”\n" +
                "\n" +
                "“Heyhat! Yakutum yok artık,” dedi Prens; “bir tek gözlerim var. Onlar bin yıl önce Hindistan’dan getirilmiş eşi bulunmaz birer safir. Birini çıkar ve onu o delikanlıya götür. Kuyumcuya satar, yiyecek ve yakacak alır, oyununu bitirir.”\n" +
                "\n" +
                "“Sevgili Prens,” dedi Kırlangıç, “bunu yapamam,” ve ağlamaya başladı.\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “sana dediğimi yap.” Bunun üzerine Kırlangıç Prens’in gözünü çıkardı ve öğrencinin tavan arası odasına uçtu.\n" +
                "\n" +
                "İçeri girmek kolay oldu, çünkü çatıda bir delik vardı. Bu delikten ok gibi içeri daldı, odaya girdi. Delikanlı başını ellerinin arasına almıştı, onun için kuşun kanat çırpmasını duymadı, başını kaldırdığında güzel safirin kurumuş menekşelerin üzerinde durduğunu gördü.\n" +
                "\n" +
                "“Değerimi anlamaya başlıyorlar,” diye bağırdı; “büyük bir hayranım yollamış bu safiri. Artık oyunumu bitirebilirim.” Yüzü mutlulukla aydınlandı.\n" +
                "\n" +
                "Ertesi gün Kırlangıç uçup limana gitti. Büyük bir teknenin seren direğine oturup, gemicilerin halatlarla geminin ambarındaki büyük sandıkları boşaltmalarını seyretti. “Ha gayret!” diye bağırıyorlardı her bir sandığın yukarıya çıkışında.\n" +
                "\n" +
                "“Mısır’a gidiyorum ben!” diye bağırdı Kırlangıç, ama hiç kimsenin umurunda değildi, ay gökte yükseldiğinde yeniden Mutlu Prens’in yanına uçtu.\n" +
                "\n" +
                "“Hoşça kal demeye geldim,” diye bağırdı.\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “benimle bir gece daha kalmaz mısın?”\n" +
                "\n" +
                "“Kış geldi,” diye cevap verdi Kırlangıç, “yakında insanın iliklerine işleyen kar yağacak. Mısır’da güneş yeşil palmiye ağaçlarını ısıtıyordur, timsahlar çamurda yatmış tembel tembel etrafı seyrediyorlardır. Arkadaşlarım Balbek Tapınağı’na yuva yapıyorlardır, pembeli beyazlı kumrular onları seyrediyor, birbirlerine gurulduyorlardır. Sevgili Prens, senden ayrılmalıyım artık, ama seni hiç unutmayacağım, gelecek bahar sana yoksullara verdiğin taşların yerine iki güzel değerli taş getireceğim. Yakut kırmızı güllerden de kırmızı olacak, safir ise engin denizler kadar mavi olacak.”\n" +
                "\n" +
                "“Aşağıdaki meydanda,” dedi Mutlu Prens, “küçük bir kibritçi kız var. Kibritleri oluğa düşmüş, ıslanmışlar. Eğer eve para götürmezse babası onu dövecek, ağlıyor. Ne ayakkabısı var ne de çorabı, küçücük başı ise açık. Öbür gözümü de çıkarıp ona ver, babası onu dövmesin.”\n" +
                "\n" +
                "“Seninle bir gece daha kalırım,” dedi Kırlangıç, “ama gözünü çıkaramam. O zaman tamamen kör olursun.”\n" +
                "\n" +
                "“Kırlangıç, Kırlangıç, küçük Kırlangıç,” dedi Prens, “sana dediğimi yap.” Kırlangıç bunun üzerine Prens’in öteki gözünü de çıkardı ve gagasında safirle ok gibi aşağı fırladı. Kibritçi kızın önünde bir pike yapıp safiri onun avcuna bıraktı. “Ne güzel bir cam parçası!” diye bağırdı küçük kız ve gülerek eve koştu.\n" +
                "\n" +
                "Sonra Kırlangıç yeniden Prens’in yanına geldi.\n" +
                "\n" +
                "“Körsün artık,” dedi, “bunun için artık hep seninle kalacağım.”\n" +
                "\n" +
                "“Hayır, küçük Kırlangıç,” dedi zavallı Prens, “Mısır’a gitmelisin.”\n" +
                "\n" +
                "“Hep yanında kalacağım,” dedi Kırlangıç ve Prens’in ayaklarının dibinde uykuya daldı.\n" +
                "\n" +
                "Ertesi gün boyunca Prens’in omzundaydı ve ona yabancı ülkelerde gördüklerini anlattı. Ona Nil Nehri’nin kıyısında uzun sıralar halinde durup gagalarıyla mercanbalığı avlayan balıkçılları anlattı; dünyanın kendisi kadar eski olan, çölde yaşayan ve her şeyi bilen Sfenks’i; develerinin yanı başında ağır ağır yürüyen ve amber tespihler çeken tacirleri; abanoz gibi kapkara olan ve büyük bir kristale tapan Ay Dağları Kralı’nı; bir palmiye ağacında uyuyan ve kendini yirmi rahibe ballı çörekle besleten büyük, yeşil yılanı; kocaman, yassı yaprakların üzerinde büyük gölü aşan ve hep kelebeklerle savaş halinde olan pigmeleri anlattı.\n" +
                "\n" +
                "“Sevgili küçük Kırlangıç,” dedi Prens, “bana akla hayale sığmaz şeyler anlatıyorsun, ama erkeklerle kadınların çektikleri acılardan daha akla hayale sığmaz bir şey yoktur. Yoksulluktan daha büyük bir sır yoktur. Uç kentimin üzerinde, küçük Kırlangıç, uç da bana orada neler gördüğünü anlat.”\n" +
                "\n" +
                "Bunun üzerine Kırlangıç büyük kentin üzerinde uçtu, zenginlerin güzel evlerinde eğlendiklerini, dilencilerin kapılarda bekleştiklerini gördü. Karanlık yollara uçup, bitkin yüzleriyle zifiri sokaklara bakan aç çocukları gördü. Bir köprünün kemeri altında iki oğlan çocuğu birazcık ısınabilmek için koyun koyuna yatmışlardı. “Nasıl da açız!” dediler. “Burada yatmak yasak!” diye bağırdı gece bekçisi, kalkıp yağmura çıktılar.\n" +
                "\n" +
                "Kırlangıç gerisingeri uçtu ve Prens’e gördüklerini anlattı. “İnce altın varaklar var üzerimde,” dedi Prens, “onları bir bir söküp şehrimin yoksullarına vermelisin; yaşayanlar her zaman altının kendilerine mutluluk getireceğine inanırlar.”\n" +
                "\n" +
                "Kırlangıç, altın varakları yaprak yaprak söktü, ta ki Mutlu Prens donuk ve kurşuni bir renk alıncaya kadar. Yaprak yaprak altınları yoksullara götürdü, çocukların yüzlerine bir pembelik geldi, güldüler, sokaklarda oyunlar oynadılar. “Artık ekmeğimiz var!” diye bağrıştılar.\n" +
                "\n" +
                "Sonra kar yağdı, kardan sonra don geldi. Sokaklar gümüşlendi sanki, öylesine parlak, pırıl pırıldılar; evlerin saçaklarında kristal hançerler gibi uzun buz sarkıtları asılıydı, herkes kürklere büründü, küçük oğlan çocukları parlak kırmızı şapkalar giyip buzda paten kaydılar.\n" +
                "\n" +
                "Zavallı küçük Kırlangıç üşüdükçe üşüdü, ama Prens’in yanından ayrılmadı, onu öyle çok seviyordu ki. Fırıncı başka yere bakarken fırının kapısı önündeki ekmek kırıntılarını çaldı, kanatlarını çırparak ısınmaya çalıştı.\n" +
                "\n" +
                "Ama en sonunda öleceğini anladı. Ancak son bir kere daha uçup Prens’in omzuna konacak gücü kalmıştı. “Hoşça kal, sevgili Prens!” diye mırıldandı, “Elini öpmeme izin verir misin?”\n" +
                "\n" +
                "“Nihayet Mısır’a gidecek olmana seviniyorum, küçük Kırlangıç,” dedi Prens, “burada çok uzun kaldın; ama beni dudaklarımdan öpmelisin, çünkü seni seviyorum.”\n" +
                "\n" +
                "“Gittiğim yer Mısır değil,” dedi Kırlangıç. “Ölüm’ün evine gidiyorum. Ölüm, Uyku’nun kardeşidir, öyle değil mi?”\n" +
                "\n" +
                "Sonra Mutlu Prens’i dudaklarından öptü ve ayaklarının dibine düşüp öldü.\n" +
                "\n" +
                "O anda heykelin içinden garip bir çatırtı geldi, sanki bir şey kırılmıştı. İşin gerçeği şu ki kurşun kalp çat diye ortadan ikiye ayrılmıştı. Yaman mı yaman bir don vardı.\n" +
                "\n" +
                "Ertesi sabah erken saatlerde Belediye Başkanı aşağıdaki meydanda, Şehir Meclisi üyeleri ile birlikte yürüyüşe çıkmıştı. Sütunun yanından geçerlerken, başını kaldırıp heykele baktı ve “Bakın hele! Nasıl da perişan bir hali var Mutlu Prens’in!” dedi.\n" +
                "\n" +
                "“Gerçekten de, çok perişan,” diye bağırdılar Şehir Meclisi üyeleri, her konuda Belediye Başkanı ile fikir birliği içindeydiler; heykelin yakınına geldiler.\n" +
                "\n" +
                "“Kılıcının yakutu düşmüş, gözleri gitmiş, artık altın yaldızlı da değil,” dedi Belediye Başkanı; “aslını isterseniz, dilenciden farkı yok!”\n" +
                "\n" +
                "’’Dilenciden pek farkı yok,” dedi Şehir Meclisi üyeleri.\n" +
                "\n" +
                "“Ayaklarının dibinde bir de ölü bir kuş var!” diye sözünü sürdürdü Belediye Başkanı. “Kuşların burada ölmelerinin yasak olduğunu açıklayan bir bildiri yayımlamalıyız.” Şehir Kâtibi de bunu not etti.\n" +
                "\n" +
                "Böylece Mutlu Prens heykelini indirdiler. “Artık güzel olmadığına göre yararlı da değil,” dedi Sanat Profesörü üniversitede.\n" +
                "\n" +
                "Sonra heykeli bir fırında erittiler ve Belediye Başkanı elde edilen madenle ne yapılacağını kararlaştırmak üzere bir toplantı düzenledi. Toplantıda, “Elbette, başka bir heykel dikmeliyiz,” dedi, “bu da benim heykelim olmalı.”\n" +
                "\n" +
                "“Hayır, benim heykelim, benim heykelim,” dedi Şehir Meclisi üyelerinin her biri, kavga etmeye başladılar. Son gelen haberlere göre hâlâ kavga ediyorlarmış.\n" +
                "\n" +
                "“Ne garip iş!” dedi dökümevindeki ustabaşı. “Kırık kurşun kalp bir türlü erimiyor. Atalım gitsin.” Kalbi, ölü Kırlangıç’ın da üzerinde yattığı bir çöp yığınının üzerine fırlatıp attılar. “Bana şehirdeki en değerli iki şeyi getir,” dedi Tanrı, meleklerinden birine; Melek de ona kurşun kalbi ve ölü kuşu getirdi. “Doğru olanı seçtin,” dedi Tanrı, “çünkü Cennet Bahçemde bu küçük kuş sonsuza kadar şakıyacak, altın şehrimde de Mutlu Prens beni övecek.")

        landmarkList.add(mutluPrens)

        val kiralinYeniGiysileri=Landmark(" Kıralın Yeni Giysileri","Bir varmış, bir yokmuş, evvel zaman içinde yüksek dağların arkasında bulunan hasbal devletinde giyinip kuşanmayı çok seven bir imparator yaşarmış.\n" +
                "\n" +
                "Her yeni çıkan elbiseleri için neredeyse parasının büyük çoğunluğunu harcarmış.\n" +
                "\n" +
                "Öyle bir elbise merakı varmış ki neredeyse her bir saatte farklı bir elbise giyinip, aynanın karşısına geçer ve kendine bakar, sonrada “ne kadar yakışmış.” dermiş.\n" +
                "\n" +
                "Elbise merakı yüzünden ülkenin işlerinden neredeyse hiç haberi olmaz. Olsada hiç karışmazmış.\n" +
                "\n" +
                "Halkıyla görüşmesi de yalnızca yeni almış olduğu o pahalı ve güzel elbiseleri onlara göstermek için olduğundan, kısa süreli görüşmeler yaparmış.\n" +
                "\n" +
                "Günlerden bir gün Hasbal ülkesine gelen iki yabancı, saraya giderek:\n" +
                "\n" +
                "“Sayın imparatorumuz giyinmek size çok yakışıyor biz dünyanın en ünlü terzileriyiz. Eğer müsaadeniz olursa sizin için dünyada eşi benzeri olmayan dünyanın en güzel giysilerini dikmek istiyoruz.\n" +
                "\n" +
                "Bir süre duraksadıktan sonra sözlerine devam eden terziler\n" +
                "\n" +
                "“Ancak bu dikeceğimiz giysilerin bir özelliği var. Yalnızca akıllı insanların farkına varabileceği türden bir elbisedir bu, akılsız ve beceriksiz olan kişiler bu giysileri göremez.” demişler.\n" +
                "\n" +
                "Bu sözlere inanan Kral Yeni Kıyafetler ile daha güzel olacağının hayalini kurmuş\n" +
                "\n" +
                "Kral o iki terziye: “Demek bu giysileri ancak akıllı insanlar görebilir. Vaybe nasıl bir elbiseymiş onu çok merak ettim açıkçası, hemde etrafımda olanlardan kimin akıllı, kimin akılsız olduğunu anlayabilirim bu sayede.” demiş\n" +
                "\n" +
                "Hep beraber gülümsemişler. Terzilerden uzun boylu olanı\n" +
                "\n" +
                "“Tabiki efendim, üstelik bu giysileri diktikten sonra onlara hayran kalacaksınız, lakin başka bir sıkıntı var bunun için çok fazla altın harcamak gerekebilir.” demişler\n" +
                "\n" +
                "Bunun üzerine biraz düşünen imparator: “O benim için sorun değil!” demiş, sonrada hemen vezire emir vererek, terzilere istediği her şeyin verilmesini ve güzel bir şekilde ağırlanmasını emretmiş.\n" +
                "\n" +
                "İki terzi odalarına yerleştirilmiş ve istedikleri iki dokuma makinesi ile ipekli, altın sırmalı kumaşlar getirilmiştir.\n" +
                "\n" +
                "Günler günleri kovalarken kral sabırsızlıkla bu terzilerin dikecekleri elbiseleri beklerken, kraliyet mensupları ise terzilerin yaptığı giysileri görüp göremeyeceklerini merak ediyormuş.\n" +
                "\n" +
                "Neredeyse kral bile kendi kendine: “Acaba ben o elbiseleri görebilir miyim, ya göremezsem ancak ben çok akıllı olduğumdan kesin görürüm” diye düşünüyormuş.\n" +
                "\n" +
                "Sabırsız davranan kral en yaşlı vezirini çağırtarak terzilerin yapmış oldukları elbiselerin hangi aşamada olduğunu görmesini istemiş.\n" +
                "\n" +
                "Böylece hem vezirin akıllı olup, olmadığını ölçecek hemde krala elbise hakkında bir ön bilgi verecekmiş.\n" +
                "\n" +
                "Vezir, Kralın yeni kıyafetleri hakkında bilgi edinmek için terzilerin bulunduğu odaya gitmiş, çalışıyor gibi davranan adamlara bakmış lakin ortada görünen hiçbir giysi olmadığını görünce de çok şaşırmış.\n" +
                "\n" +
                "Gözlerini ovmuş ancak yine de hiçbir şey göremiyormuş, bunun üzerine vezir kendi kendine: “Aman Allah’ım! Yoksa ben akılsız ve beceriksiz bir insan mıyım?” Diye düşünmüş.\n" +
                "\n" +
                "Terziler ellerinde bir şeyler varmış gibi vezire yanaşarak şöyle demişler: “Saygı değer vezir hazretleri kumaşı beğendiniz mi?” demişler.\n" +
                "\n" +
                "Hiçbir şey görmediği halde sözde uyanıklık yapan vezir: “Çok güzel yapmışsınız elinize sağlık demiş, böyle güzel kumaşlar görmemiştim, hemen şimdi imparatorumuza ne kadar güzel kumaşlar ürettiğinizi anlatacağım.” demiş,\n" +
                "\n" +
                "Adamlar: “Efendim gördüğünüz gibi bu kumaşlar daha işlenip elbise haline getirilecek daha çok eksikliklerimiz var bunun için biraz daha ipek ve altın gerekmektedir.” demişler\n" +
                "\n" +
                "Vezir de “Tabiki Kralımızın emridir ne ihtiyacınız varsa karşılanacak istekleriniz temin edilecek.” demiş.\n" +
                "\n" +
                "Vezir imparatorun yanına giderek ona: “Yüce kralım! Dedikleri gibi varmış gerçekten, bu terziler bu işin ustaları hayatımda hiç bu kadar güzel dokumuş kumaş görmedim. Şuna inanıyorum ki bu elbiseyi bitirdikleri zaman üzerinizde daha da güzel duracak.” demiş,\n" +
                "\n" +
                "Bu sözler karşısında epey memnun kalan Kral, kendi kendine “demek benim vezirim akıllıymış.” diye düşünmüş.\n" +
                "\n" +
                "Bir sonraki gün Kral en çok güvendiği adamlardan birini huzuruna çağırarak, ona terzilerin işlerinin ne aşamada olduğunu öğrenmesi için onların yanına gitmesini istemiş.\n" +
                "\n" +
                "O da İmparatorun yeni giysileri hakkında bilgi almak için terzilerin odasına gitmiş. Vezirin başına gelenlerin aynısı onun da başına gelmiş, terzilerden bir tanesi adama yaklaşarak\n" +
                "\n" +
                "“Baksanıza efendim bu kumaşın asaletine güzel değil mi? Artık elbisenin bitmesine çok az kalmış. Biraz daha altın ve değerli taşa ihtiyacımız olacak, o eksiklikleri de giderirseniz kısa bir süre içerisinde, süslemesini bitiririz ve efendimiz kral’a elbiseyi takdim ederiz.” demiş.\n" +
                "\n" +
                "Kralın en çok güvenmiş olduğu adam öylece bakakalmış çünkü hiçbir şey göremiyormuş. O an tek düşündüğü şey bunu Krala nasıl anlatacağıydı.\n" +
                "\n" +
                "Çünkü kendi kendine “ben akılsız biri miyim? Nasıl oluyor vezir gördüğü halde ben bir şey göremiyorum.” diye düşünceler içerisindeyken terzilerden bir tanesinin “Efendim” demesi üzerine kendini toparlayan adam,\n" +
                "\n" +
                "“Gerçekten çok güzel olmuş elinize sağlık hele o süslemeler varya harika ama biraz daha altın ve değerli taşa ihtiyacınız var. Hemen temin ettirmek için hemen Kralın huzuruna çıkacağım.” demiş\n" +
                "\n" +
                "Düşünceler içerisinde Kralın yanına giden adam ona:\n" +
                "\n" +
                "“Efendim dil ile anlatılmasının imkansız olduğu bir güzellikte olan o kumaşlardan harikulade bir elbise yapmışlar. Gerçekten de o güzel elbise size yakışacak.” demiş.\n" +
                "\n" +
                "Bir sonraki gün çevresindeki dostlarını toplayarak onlarla beraber elbiseyi görmek için terzilerin çalışma odasına gitmişler.\n" +
                "\n" +
                "Terziler Kralın geldiğini görünce sanki ellerinde, özenle tutmuş olan bir elbise varmış gibi davranarak,\n" +
                "\n" +
                "“Hoş geldiniz değerli kralım, şeref verdiniz bizde o eşi benzeri olmayan elbisenizi daha yeni bitirdik, bakın efendim beğendiniz mi?” Diye sorduklarında\n" +
                "\n" +
                "Hiçbir şey göremeyen Kral, kendi kendine demek ben akıllı değilim düşüncesi içerisine girmiş ve öylesine üzülmüş ki, başkaca hiçbir şey söylememiş.\n" +
                "\n" +
                "Düzenbaz olan terziler tekrardan kral’a: “Yoksa bu güzelim elbiseyi beğenmediniz mi Efendim?”\n" +
                "\n" +
                "Kral terzilere bakarak: “Hayır, gerçekten de harika bir elbise dikmişsiniz, elinize sağlık.”\n" +
                "\n" +
                "Yakın dostlarına dönen Kral: “Sizce nasıl bir elbise olmuş?” diye seslenince\n" +
                "\n" +
                "Hiçbir şey göremeyen yakın dostlarıda şaşkınlık içerisindeydiler ama hepsi bir ağızdan “evet, evet  çok güzel! Bir elbise size de çok yakışacak” demişler.\n" +
                "\n" +
                "Bunun üzerine imparator da kendisinin görmediği ama çok güzel olan bir elbise olduğuna da iyice inanmış.\n" +
                "\n" +
                "Kral: “Bence bu güzel elbiseyi bütün halkım görmeli. Hemen tören hazırlıklarına başlansın, törenin son günü yeni elbisemi giyeceğim.” demiş\n" +
                "\n" +
                "Bu arada kendi kendine böylece hem güzel elbisemi göstereceğim, hemde kimin akıllı kimin akılsız olduğundan da emin olacağım diyormuş.\n" +
                "\n" +
                "Tören düzenlenmişti, törenin son günü tüm halk meydanları doldurmuştu. herkesin dilinde Kralın Yeni Giysileri varmış.\n" +
                "\n" +
                "Giysilerin konuşulmasındaki asıl sır, giysilerden çok kimin akıllı kimin akılsız olduğunu merak etmeleriymiş.\n" +
                "\n" +
                "Kralda daha o görmediği kıyafetleri giysileri giyeceği için heyecanlanmış.\n" +
                "\n" +
                "Düzenbazlar ellerinde giysiler varmış gibi özenle Kralın odasına girmiş. Sonra da ona elbiselerini giydirircesine davranmışlar sergiledikten sonra Kralı aynanın önüne götürerek:\n" +
                "\n" +
                "“Sayın Kralım bu elbiseler gerçekten size çok yakıştı herkes size hayran kalacak.” demişler.\n" +
                "\n" +
                "Hiçbir şey göremeyen kral üzerinde giysileri olmadığı için üşümeye başlamıştı. Ancak kimseye bir şey söyleyemediğinden, tacını başına taktığı gibi kendinden emin adımlarla halkın önüne çıkmış.\n" +
                "\n" +
                "İmparatoru elbisesiz iç çamaşırlarıyla gören halk, çok şaşırmıştı. Ama korkularından bir şey diyememişler.\n" +
                "\n" +
                "Herkes: “Korkudan çok güzel bir elbise size çok yakışmış.” diye sesleniyormuş,\n" +
                "\n" +
                "İşittikleri Kral’ı  çok mutlu etmiş ancak kendisini iç çamaşırlarıyla görmesi dolayısıyla mutsuz ve huzursuzmuş.\n" +
                "\n" +
                "Kendi kendine Galiba elbisemde çok ince olduğundan üşüyorum en iyisi bundan sonra terzilere söyleyeyim de daha kalın dokusunlar diye düşünceler içerisindeyken kalabalığın içerisinden yükselen bir ses üzerine herkesin tüm düşünceleri birden yok olmuş.\n" +
                "\n" +
                "“Baksanıza niye Kral çıplak, kimse hiçbir şey söylemiyor, diye bağıran genç ve cesur çocuktan cesaret alan ahali o anda birbirleriyle konuşmaya başladılar.\n" +
                "\n" +
                "Artık halkın içinden de sesler yükselmeye başlamış: “Evet, evet, gerçekten de imparator çıplak…”\n" +
                "\n" +
                "Bu sözler üzerine Kral beyninden vurulmuşçasına törenin bittiğini söyleyerek saraya koşmuş ve utancından uzun bir süre halkın karşısına çıkamamıştı.\n" +
                "\n" +
                "İki düzenbaz ise ülkeden çıkmak üzereyken yakalanarak hapse atılmışlar.\n" +
                "\n" +
                "Bu durum kral ve çevresindekilere de büyük bir ders olmuş. O günden sonra elbiselerinden çok halkına daha zaman ayırarak onlara hizmet etmiş ve sevilen bir kral olmayı başarmıştır.")

        landmarkList.add(kiralinYeniGiysileri)

        val guliverinGezileri=Landmark(" Güliverin Gezileri","Lemuen Gulliver İngiltere’nin Nottinghamshire kentinde doğdu. Ailesi orta sınıf bir aileydi, Gulliver’in doğumuna çok sevinmişlerdi. Gulliver’in ailesi onun bir cerrah olmasını istiyorlardı. Ancak Gulliver çoğunlukla gezmeyi ve denizleri  keşfetmeyi hayal ediyordu.\n" +
                "\n" +
                "Güliver: “Ah denizleri  gezmeyi ve daha önce kimsenin keşfetmediği yerleri keşfetmeyi o kadar çok istiyorum ki!” keşke bir gezebilsem diye düşünüyordu.\n" +
                "\n" +
                "Seyahat etmek için kendisini yönlendiren birisi olmayınca, Gulliver ailesinin tavsiyesine uydu ve cerrah oldu. Gulliver İngitere’nin en iyi doktorlarından biriydi. Hastalarıyla yakından ilgileniyordu ve onları iyi tedavi ediyordu. Ama kalbi ve ruhu, her zaman denizlerden yanaydı. Acaba bir gün Pırıl, pırıl sulara yelken açabilecek miyim? Diye  sürekli merak ediyordu.\n" +
                "\n" +
                "Aradan yıllar geçmiş, Gulliver evlenmiş ve iki çocuğu da olmuştu. Çocuklarının üzerine titreyen bir baba ve sevecen bir eş olmuştu. Ama hayalini yaşamayı çok istiyordu.\n" +
                "\n" +
                "Bir gün eşi: “Hayatım, sorun ne? Niçin öyle üzgün görünüyorsun.”\n" +
                "\n" +
                "Güliver: “Bir gemide kaptanlık görevi teklif edildi. Kabul etmeyi istiyorum ama, hem seni hem de çocukları düşünüyorum.”\n" +
                "\n" +
                "Eşi: “Her zaman kalbinin sesini dinlemelisin. Denizlere açılmak seni mutlu ediyorsa o zaman o işi kabul etmelisin. Ama bana söz vermeni istiyorum. Sağ salim eve geri döneceksin.”\n" +
                "\n" +
                "Gulliver: “Çok teşekkür ederim tatlım.” dedikten sonra ailesine veda  etti ve güney  denizlerine yelken açtı. Kendisini dünyanın en mutlu insanı olarak görüyordu. Ama onu bekleyen zorlukların hiçbirinin farkında değildi.\n" +
                "\n" +
                "Bir gece denizde bir fırtına çıktı! Adeta deniz öfkeyle kabarmış, dalgalar gemiyi vurmaya başlamıştı. Gemi kısa bir sürede parçalanarak batmaya başladı. Gulliver ise boğulmaktan kurtulmak için yüzebildiği kadar yüzdü.\n" +
                "\n" +
                "Tam hayatının sona erdiğini düşündüğü sırada,  büyük bir dalga onu denizin dibine doğru batırdı. Neyse ki bu olay Gulliver’in sonu değildi, bir adanın sahiline sürüklenmişti. Gözlerini açtığında sırtında bir şey hissediyor ama kalkamayacak kadar yorgundu. Bir süre sonra kendine gelen Gulliver gözlerini açınca:\n" +
                "\n" +
                "“Ah! Aşırı yorgunum. Ne! Niye kumsala bağlıyım ben?  Ay saçım!” diye sızlanmış. Aşağı doğru bakınca serçe parmağının boyunda minik bir adam görüp şoke oldu.\n" +
                "\n" +
                "Gullıver: “Yoksa ben öldüm mü? Cennetteki insanlar niye bu kadar küçük!” \n" +
                "\n" +
                "Küçük Adam: “Dev, biz Lilliput’luların adasında ne arıyorsun sen ?  Buraya bizi yemeye mi gedin?”\n" +
                "\n" +
                "Gulliver: “Nee!  Hayır.”\n" +
                "\n" +
                "Küçük adam : “Buraya adamızı çalmaya mı geldin?”\n" +
                "\n" +
                "Gulliver: “Ne adası?\n" +
                "\n" +
                "Küçük Adam: “Lilliput’ların adası! Dur! Bunu zaten söyledim sana! Yoksa Blefuscu’lar mı yolladı seni?” \n" +
                "\n" +
                "Gulliver : “Ne ’Coo’ mu?”\n" +
                "\n" +
                "Küçük Adam: “Dev!  Niyetini söyle bana…”\n" +
                "\n" +
                "Gulliver: “Benim adım Lemuel Gulliver, dev değilim! Yalnızca yorgunum. Buraya nasıl geldiğimi de hiç bilmiyorum. Son hatırladığım şey güney denizinde gemi kazası  geçirdiğim ve boğuluyordum.”\n" +
                "\n" +
                "Asker Gulliver’in yalan söylemediğini anlamıştı…Küçük Adam: “Dev Gulliveri şehire götürelim ve onun kaderine kral karar versin.” demiş.\n" +
                "\n" +
                "Liliputlar’ın Gulliveri taşımak için  yaptıkları büyük arabayı çekmek üzere toplam 300 at getirildi. Gulliver şehrin içinden geçirildi.\n" +
                "\n" +
                "Hala gözlerine inanamıyordu. Gulliver: “Burası gerçektende Lilliput’luların adası! Ve bana sanki farklıymışım gibi bakıyorlar! Çok tuhaf! Biri size farklı geliyorsa sizde o kişiye  farklı geliyorsunuz demek ki!” diye düşünmüş.\n" +
                "\n" +
                "Küçük Adam: “Majesteleri! Bu adam bize zarar vermeyeceğini söylüyor. Hatta, gemisinin açık denizde imha olduğunu  ve o nedenle kaybolduğunu söylüyor.”\n" +
                "\n" +
                "Küçük Kral: “Ona öylece güvenemeyiz! O bizim için bir tehdittir. Bizi yemesi için  Blefuscu’lar tarafından gönderildiyse ne olacak!” \n" +
                "\n" +
                "Küçük Adam: “Eh…Majesteleri , bu adam Blefuscu’yu bilmiyor, oraya şey diyor ‘Coo’!” \n" +
                "\n" +
                "Küçük Kral: “Söyle bana Redresaal, sence bu adama güvenebilir miyiz?”\n" +
                "\n" +
                "Redresaal: “Eh.. Korkmuş ve kafası  karışmış görünüyor majesteleri, sonuç itibarı ile o bizim konuğumuz.  Ona kendisini  kanıtlaması için bir fırsat vermeliyiz.” demiş.\n" +
                "\n" +
                "Kral Gulliverin üstüne tırmandı. Kral bu büyük suratlı büyük adama temkinli yaklaşıyordu. Gulliver: “Bu adam kral olmalı, ona karşı nazik olmalıyım.” diye düşünmüş sonrada “İngiltereden majestelerine en yüce saygılarımla! Benim adım Lemuel Gulliver. Ben pek çok uzak ülkeleri ziyaret  ettim majesteleri. Ama sizin krallığınız ayak bastığım ülkeler içinde en güzel ada diyebilirim.”\n" +
                "\n" +
                "Kral: “Burası Lilliput’luların adasıdır! Bizler sana belki küçük gelebilirsiniz.  Ama hepimiz güçlü birer savaşçıyız.”\n" +
                "\n" +
                "Halk: “Yaşasın Kralım Yaşasın…Seni  Seviyoruz… Evet…. “\n" +
                "\n" +
                "Gulliver: “Ben bundan hiç şüphe etmiyorum majesteleri, çünkü güçlü savaşçıların büyük kalpleri vardır. Beni misafirleri olarak gören bu sevecen krallığın halkı umarım sadakatimi kanıtlamam için bana  bir şans verir.”\n" +
                "\n" +
                "Kral: “Hım… Bütün şehir seyrediyor. Hiçbir şekilde  acil karar almamalıyım. O bizim konuğumuzdur o nedenle ona saygılı davranmalıyız. Ama Lilliput’un güvenliği için geldiği o tuhaf ülke hakkında bilgi sahibi olana kadar Gulliver’in hareketleri prangayla  kısıtlanacaktır.” demiş.\n" +
                "\n" +
                "Halk kralın kararı karşısında sevinçle “yaşasın kral.” diye bağırmaya başladı. Sonrada Gulliver serbest bırakılarak şehre uzak olamayan yıkık bir tapınakta kalmasına izin verildi. Ona yetecek tek büyük yapı burasıydı. Hareketlerini  kısıtlamak için sağ ayağına pranga bağlanmıştı. Lilliput halkı dev konuklarına çok iyi bakıyorlardı. Her gün onlarca insan yiyecek  dolu  arabalarla onun yanına gidiyordu.\n" +
                "\n" +
                "Halk çok miktarda kumaşı birleştirerek onun için yeni giysiler diktiler. Lilliput’lular dev konukları ile konuşmak için her gün gruplar halinde toplandılar. Gulliver onlara Masallar ve Hikayeler anlatarak onları güldürdü. Sonrada onları teker teker avucuna alarak yukarı kaldırdı ve şehrin manzarasını seyretmelerini sağladı.\n" +
                "\n" +
                "Bir gün şehirde bir etkinlik vardı. Lilliput halkı, yukarı gerilmiş ipin üstünde peş peşe  yürüyorlardı. Korkmuş  bir halleri vardı. Gulliver’in kafası karışmıştı. Krala ne olduğunu sordu.\n" +
                "\n" +
                "Kral: “Lilliput halkı cesur ve gözü pektir. Karşında gördüğün şey, cesaret ve sadakat sınavıdır. Bu sınavı her kim geçerse Savunma Bakanı olacaktır.\n" +
                "\n" +
                "Gulliver: “Ama Majesteleri, bu çok tehlikeli görünüyor, ip çok yüksekte. Ya düşerlerse ? Kötü bir şekilde yaralanabilir hatta hayatlarını kaybedebilirler! Sadakatlerini kanıtlamaları hayatlarından daha mı önemli yani?”\n" +
                "\n" +
                "Küçük Kral: ” Ama Lilliput halkı cesurdur. Ayrıca halkın cesaretini sınayacak başka bir yöntemimiz yok.” demiş.\n" +
                "\n" +
                "Gulliver bir süre düşündü ve sonra Redresaal‘dan kendisine bir ip getirmesini istedi. Redresaal yardımcı olmaktan memnundu, kendisi de bu sporu sevmiyordu. Gulliver daha sonra ipi parçalara böldü ve bunlardan bir ağ yaptı. Sonra bu ağı yukarıdaki ipin altına yerleştirdi.\n" +
                "\n" +
                "Gulliver: “İşte! Şimdi oldu. Lilliput’ lular artık hayatını tehlikeye atmadan bu spora katılabilirler. Krallıkta Savunma Bakanına kavuşabilir.”\n" +
                "\n" +
                "Halk Gulliver’in yaptığı bu yenilik için “yaşasın Guliver” diye tezahüratta bulundu. Kral ödül olarak Gulliver’ in ayağındaki prangayı söktürdü. Gulliver artık adada serbestçe gezebiliyordu. Çok mutlu olmuştu. Zaman geçtikçe Gulliver Lilliput halkının güvenini kazandı.\n" +
                "\n" +
                "Kral artık önemli konuları onunla konuşuyordu. Gulliver aynı zamanda düşman Blefusca adasınıda öğrendi. Lilliput halkı ile Blefusca halkı yıllardır birbirine düşmandı. Gulliver onların öykülerini merakla dinliyordu.\n" +
                "\n" +
                "Günler bu şekilde geçip giderken Guliver bir gün, acilen saraya davet edildi. Küçük Kral: “Gulliver bize yardım etmelisin Blefusca şuanda bize saldırıyor.” demiş.\n" +
                "\n" +
                "Gulliver hemen yerinden kalkarak sahile doğru koştu, silahlarla donatılmış bir gemi filosunun Lilliput’ a doğru geldiğini gördü. Guliver eline aldığı bir iple gemilere doğru yürüdü.\n" +
                "\n" +
                "Blefusca’lılar Guliveri görünce şoke oldular. Komutanları “Bu da ne? Nasıl bu kadar büyük olabilir?  Saldırın!”\n" +
                "\n" +
                "Gulliver: “Ah.. Kesin şunu!” \n" +
                "\n" +
                "Blefuscalılar: “Faydası yok! Geri  çekilin! Geri çekilin!” demiş. Gulliver bütün gemileri iplerle bağladı  ve gemileri omuzunun üstünden  bir bohça gibi çekti. Gemileri Lilliput sahiline getirdi. Halk bir kez daha “Yaşasın Gulliver” diye tezahürat etmeye başladı.\n" +
                "\n" +
                "Gulliver insanların hayatını kurtarmıştı. Küçük Kral: “Çok  iyi Lemual Gulliver ! Ama niye duruyorsun?  Blefusca’ ların bütün gemilerini buraya getir. Böylece gelecekte bize savaş açmak için ellerinde bir ordu kalmasın.\n" +
                "\n" +
                "Gulliver: “Beni affedin Majesteleri ama bu hiç adil değil. Blefuscu  kendini başka düşmanlardan korumak için orduya ihtiyaç duyabilir. Ben savaşa katılan bütün gemileri getirdim buraya. Öbür gemiler Blefuscu sahilinde şu anda, onları buraya getiremem.”\n" +
                "\n" +
                "Emrine uymadığı için kral Gulivere çok kızmıştı. Aradan birkaç gün geçtikten sonra Redresaal  Guliveri’n yanına giderek ona: “Guliver! Beni dinle!”\n" +
                "\n" +
                "Guliver: “Merhaba Redresaal neden fısıldiyorsun?” \n" +
                "\n" +
                "Redresaal: “Burda olduğumu hiçkise bilmemeli, sana çok önemli bir mesaj iletmeye geldim. Kralın konseyle yaptığı konuşmayı doydum. Senden memnun değiller.”\n" +
                "\n" +
                "Gulliver: “İyi ama neden?” \n" +
                "\n" +
                "Redresaal: “Çünkü sen bütün gemileri  Blefuscu’dan getirmeyen kralın emirlerine karşı  gelmiş oldun. Dinle, Gulliver, derhal Lillipu’u terk etmek zorundasın. Bu ada artık senin için güvenli değil.”\n" +
                "\n" +
                "Gullıver: “Ama ben nereye gidebilirim?”\n" +
                "\n" +
                "Redresaal: “Belki , Blefusca’ ya? Ele geçirilen gemilerden birini kumandanını duydum. Blefusca kralına mektup yazıp senin varlığından övgülerle bahsedecekmiş. Güvenle geri dönmek için onlardan bir gemi yapmalarını isteyebilirsin. Onlar hala bizim düşmanımız ama sen benim dostumsun ve senin için kaygılanıyorum.”\n" +
                "\n" +
                "Gullıver: “Çok teşekkür ederim dostum. Öyleyse derhal gitmem gerek. Seni her zaman hatırlayacağım küçük dostum.”\n" +
                "\n" +
                "Redresaal: “Bende seni hatırlayacağım, iyi kalpli dev.”\n" +
                "\n" +
                "Gulliver hemen Blefuscu’ya doğru kaçtı. Beline kadar derin suların içinde yürüdü ve Blefescu kıyılarına vardı. Kralın bütün ordusuyla birlikte kıyıda beklediğini gördü.\n" +
                "\n" +
                "Gulliver: “Benim geldiğimi görmüş olmalılar! Neden bana saldırmadılar? Majesteleri ben buraya savaşmaya gelmedim. Ben Lemune Guliver ve buraya sizden yardım istemeye geldim.”\n" +
                "\n" +
                "Blefusca Kralı: “Tabiki, sen gemilerimizi  ve adamlarımı kurtardın. Sana teşekkür ederim. Sana Gulliver diyebilirim umarım.”\n" +
                "\n" +
                "Gullıver: “Emrinizdeyim majesteleri.”\n" +
                "\n" +
                "Blefusca Kralı: “Gullıverin kalması için hazırlıkları yapın.” diye emir vermiş.\n" +
                "\n" +
                "Ertesi gün Gullıver Blefescu  kıyılarında dolaşıyordu. Suda yüzen bir şey gözüne ilişti. Gulliver: “O bir tekne mi!” diye söylendikten sonra hemen kralın yanına gitti.\n" +
                "\n" +
                "Kral derhal kumandana emir vererek en az bir düzine gemi yollayıp tekneyi sahile çekmelerini söyledi.\n" +
                "\n" +
                "Ardından adamlarına tekneyi onarması için Gulliver’ e yardım etmelerini söyledi ve ona her konuda yardım edeceğine söz vermişti.\n" +
                "\n" +
                "Gulliver kralın yardımı karşısında çok mutlu olmuştu. Artık eve dönebilir ve ailesini tekrardan görebilirdi. Tekneyi onarmaları tam bir hafta sürdü. Tekne sağlamdı ve Gulliver’e  yetecek kadar büyüktü.\n" +
                "\n" +
                "Blefesco halkı kralın emriyle tekneyi yeterli miktarda su, meyve ve yiyecekle doldurdu. Gulliver: “Bu  iyiliğinizi asla unutmayacağım majesteleri.”\n" +
                "\n" +
                "Blefuscu Kralı: “Sen güçlü ve genç, bir adamsın Gulliver. Bizde seni asla unutmayacağız , iyi yolculuklar dostum.” demiş.\n" +
                "\n" +
                "Gullıver, Blefescu halkına el salladı.  Çocukları için anlatacak pek çok güzel hikayesi vardı. Gulliver eve vardığında, karısına  ve çocuklarına sımsıkı sarıldı. Gullıver 24 Nisan 1702’de Nottinghamshire varmıştı.")
        landmarkList.add(guliverinGezileri)

        val polyanna=Landmark(" Polyanna","Bir varmış bir yokmuş, evvel vakit içinde Pollyanna adında uzun sarı saçları ve çevresine her daim mutluluk saçan dünyalar güzeli bir kız çocuğu yaşarmış.\n" +
                "\n" +
                "Pollyanna babasından her daim iyi şeyler öğrenir, bunlardan birisi de çevresinde yaşanan olaylara her daim sakin ve iyi niyetle yaklaşırdı. Babasıyla birlikte sık, sık mutluluk oyunu oynarlardı. Pollyanna’nın en sevdiği oyun mutluluk oyunuydu.\n" +
                "\n" +
                "Kısa bir süre sonra Pollyanna’nın ailesinin işleri gereği başka bir ülkeye gitmeleri gerekliymiş. Sevimli kızlarını bir süreliğine teyzesine göndermeye karar vermişler.\n" +
                "\n" +
                "Pollyanna’nın teyzesi çok huysuz ve kimseyi sevmezdi. Polly teyzesi ile zaman geçirmeyi hiç kimse istemezmiş. Çünkü çok zengin bir kadın olmasına rağmen çevresinde adam akıllı hiç beğendiği herhangi bir şey yokmuş.  \n" +
                "\n" +
                "Hanımefendi Polly, evin yardımcısı Nancy’e evin tavan katındaki küçük odayı Pollyanna için hazırlamasını istemişti. Evlerinde o kadar güzeller güzeli odalar olmasına rağmen, gelecek yeğeni için kış aylarında soğuk, yaz aylarında sıcak çatı katı odayı vermesi Nancy’i çok şaşırtmıştı.\n" +
                "\n" +
                "Bir sonra ki gün, Nancy ve evin bahçıvanını gelecek olan Pollyanna’yı almaları için, tren garına gönderdi.\n" +
                "\n" +
                "Bahçıvan ve Nancy Pollyanna’yı gördükleri gibi çok sevmişlerdi. Pollyanna’yı hemen eve götürmüşler, Pollyanna teyzesini görür görmez sarılmıştı, ama teyzesi aynı sıcaklıkla cevap verememişti. Bu durum Pollyanna’yı hiç üzmemişti bile.\n" +
                "\n" +
                "Zaman su gibi gelip giderken, teyzesinin sert ve katı tutumlarına rağmen Pollyanna’nın hiç üzülmemesi ve her daim mutlu olması Bayan Nancy’i çok şaşırtmıştı.\n" +
                "\n" +
                "Günlerden bir vakit Bayan Nancy:\n" +
                "\n" +
                "“Benim tatlı ve şirin kızım, mutlu olmanın ve her daim neşeli olmanın sırrı nedir?” Diye sordu.\n" +
                "\n" +
                "Pollyanna:\n" +
                "\n" +
                "“Biz babamla mutluluk oyunu oynarız hep. Bu oyunu babam bana küçükken öğretmişti. Çok eskiden iyi niyetli yaşlı bir teyze, hediye olarak bizlere koltuk değneklerini hediye etmişti. Bunun üzerine babama sebebini sorduğumda ise, babam bu değneklere her baktığımız da engelli ve sağlık sorunlarımız olmadığı için sevinmemiz ve şükür etmemiz gerektiğini söylemişti babam.” Diye cevap verdi.\n" +
                "\n" +
                "Pollyanna biraz dinlendikten sonra tebessüm ederek sözlerine davet etti:\n" +
                "\n" +
                "“O günden sonra şartlar ne kadar zor olursa olsun biz ailemizle en ufak şeylere dahi mutlu olabiliyoruz.” Dedi.\n" +
                "\n" +
                "Evin görevlisi Nancy adeta hayran kalmıştı küçük kıza. Küçük kızdan mutluluğun sırrının dersini almıştı.\n" +
                "\n" +
                "Günler bu şekilde ilerlerken, Köşkün düzeni yavaş, yavaş oturmaya başlıyordu. Pollyann’a  her sabah erkenden teyzesi ile ders çalışırdı öğlene kadar. Öğleden sonra ise akşama kadar oyunlar oynayıp, yada alışveriş için dışarı çıkardı.\n" +
                "\n" +
                "Pollyann’a markete giderken, siyah kıyafetlere kuşanmış esrarengiz bir beyefendi ile karşılaşmıştı. Pollyann’a beyefendiyi tanımaya çalışsa da esrarengiz adam mesafeliydi.\n" +
                "\n" +
                "Günlerden bir gün Pollyann’a yine o esrarengiz beyefendi ile tekrar karşılaşmıştı. Beyefendi bir önce ki gibi yine karşılık vermemişti, ama Pollyann’ın sıcak ve tatlı davranışları esrarengiz adamı da etkilemişti.\n" +
                "\n" +
                "Kısa bir süre sonra esrarengiz adam ile Polyanna her karşılaştıklarında oyunlar oynayıp, sohbet ederlerdi. Evin yardımcı Nancy bu durumu görünce çok şaşırmıştı, çünkü o esrarengiz adam Bay Pedaltın’dı. Çok servetli ve zengin olmasına rağmen kocaman evinde tek başına yaşar, ve hiç kimseyle konuşmazmış.\n" +
                "\nBir sabah Pollyann’a bir köpek yavrusunu kucaklayıp eve getirmişti. Bayan Polly köpeği görmesine rağmen bir tepki vermemişti. Bir sonra ki sabah bu sefer kucağında yavru bir kedi ile eve gelmişti. Bayan Polly ilginç şekilde yine tepki vermemişti.\n" +
                "\n" +
                "Başka bir gün ise Pollyann’a eve üstü başı kir içinde kalan sokak çocuğunu eve getirmişti. Bu sefer Bayan Polly oldukça öfkeli bir şekilde:\n" +
                "\n" +
                "–  Sabrımı taşırdın ama! Şuana kadar yapmış olduğun saçmalıkların en büyüğü bu! Sokakta bularak getirmiş olduğun köpek ve kedi yavrusu yetmezmiş gibi bir de ne olduğu belirsiz, üstü başı kir içinde ki sokak çocuğunu getiriyorsun.\n" +
                "\n" +
                "Bu sözleri işiten erkek çocuk, Bayan Polly’in karşısına geçerek:\n" +
                "“Hakkımda yanlış düşünüyorsunuz, ben dilenci değilim efendim. Sadece Pollyann’yı kırmamak için buradayım.” Dedikten sonra evi terk etti.\n" +
                "\n" +
                "Teyzesinin önyargılı hareketleri, Tomy adındaki çocuğa söylemiş olduğu sözler Pollyanna’yı çok üzmüştü. Zamanla teyzesinin de kalbi tıpkı kendisinin kalbi gibi yumuşayacağını düşünüyormuş.\n" +
                "\n" +
                "Yaz tatili bittikten sonra, okulların açılmasıyla Polyanna okula başlamış, ve tanıştığı arkadaşlarını sık, sık ziyaret edermiş.\n" +
                "\n" +
                "Bir sabah, Bay Pedaltın köpeği ile yürüyüş yaparken ayağının taşa takılması sonuncunda düşmüş, çevresinde yardım edebilecek kimseyi de bulamamıştı.\n" +
                "\n" +
                "Okuldan çıkan Pollyanna, Bay Pedaltın’ı fark eder etmez hemen ambulans çağırmıştı. Bay Pedaltın iyileştikten sonra:\n" +
                "\n" +
                "– Pollyanna neden benimle birlikte kalmıyorsun? Annen ve baban gelene kadar bana arkadaşlık edebilirsin. Hem seninle mutluluk oyununu da oynarız. Demiş.\n" +
                "\n" +
                "Polyanna ise teyzesini çok sevdiği için, ondan ayrılmak istemiyordu. Bay Pedaltın’a durumu nasıl anlatabileceğini bilemediğinden çaresiz kalmıştı. En sonunda teyzesinin evden kovmuş olduğu Tomy’i Pedaltın’ın yanına almasını rica edecekti." +
                "– Benim yerime Tomy adında çok masum ve şirin bir arkadaşım var. Kimsesi de yok, o sizinle kalabilir mi?\n" +
                "\n" +
                "Bay Pedaltın:\n" +
                "\n" +
                "– Madem öyle haftaya sizi bekliyorum.” Demiş.\n" +
                "\n" +
                "Birkaç gün sonrasında Polyanna’ya direksiyon hâkimiyetini kaybeden araba çarpmıştı.\n" +
                "\n" +
                "Hayati tehlikesi olmayan Polyanna’nın uzun bir süre yatması gerekecekti. Bir gün sonra kendisine gelen şirin kız etrafına yine neşe saçıyordu.\n" +
                "\n" +
                "Kazada hayati tehlikesi olmamasına rağmen, Polyanna’nun sağlığı için hastane birkaç gün yatması gerekliymiş. Bir sonra ki gün uyanan şirin kızımız etrafına yine mutluluk saçmaya devam etmiş.\n" +
                "\n" +
                "Özellikle teyzesinin içtenlikle, sevgiyle ona canım kızım demesi, daha da mutlu ediyormuş Polyanna’yı.\n" +
                "\n" +
                "Polyanna’nın ziyaretine gelen Bay Pedaltın teyzesiyle oturup konuşmaya başlamış.\n" +
                "\n" +
                "Bayan Polly’e Pollyanna’ya yapmış olduğu teklifi, teyzesi için teklifi kabul etmediğini de anlatmış.\n" +
                "\n" +
                "Bay Pedaltın’ın anlattıklarını öğrenen teyzesi yeğenini daha da çok sevmişti. O kadar çok seviyormuş ki, Polyanna mutlu olsun diye yukarı kata kedi, köpek ve arkadaşlarını çıkarmasına bir şey demiyormuş.\n" +
                "\n" +
                "Bay Pedaltın ise sırf Pollyannayı sevindirmek için tomy’i evlat edinmişti.\n" +
                "\n" +
                "Bay Pedaltın ise küçük kızdan aldığı derslerden sonra Tomy’i evlat edinmişti.\n" +
                "\n" +
                "Artık tüm şehir nasıl mutlu olabiliriz diye, Pollanya’yı ziyaret edip, fikirler alıyormuş. Tüm şehir mutluluk oyunu duymuş, ve hayatlarında uygulamaya başlamışlar.\n" +
                "\n" +
                "Pollyanna  ise kendisini ziyaret edenlerden dolayı her gün daha da hızlı iyileşiyormuş. Sonunda tamamen iyileşip ayağa kalmış.\n" +
                "\n" +
                "Tüm şehir mutluluk oyunun öğrendiği için çok mutlularmış. Bu yazımızı okuyan değerli okuyucumuz artık sizde mutluluk oyununu öğrendiniz. Umarım sizler de ailenizle bir ömür hep mutlu olurusunuz.")

        landmarkList.add(polyanna)

        val kamyon=Landmark(" Kamyon","Kamyon, Zincirli Han'ın dar ve basık kapısından, yan duvarlara sürtünüp sıvaları dökerek ve üzerine bağlanmış sepetlerle çuvalları dört tarafa fırlatarak ıkına sıkına çıktı. Şoför bir eliyle direksiyona yapışmış, dört metre genişliğindeki sokağın karşı tarafındaki berber dükkanlarına girmeden sola manevra yapabilmeye uğraşıyor, öteki eliyle de ağzına peynirli pide tıkıyordu. Toz, çamur, benzin, makine yağı tabakaların altında elbisesinin ve yüzünün rengi pek belli olmayan şoför yamağı arka tarafta durmuş, iki yana koşarak şoföre:\n" +
                "\"İleri!.. Geri!.. Yana!..\" diye işaretleri veriyor, bir taraftan da soğan ekmek tıkınıyordu. Kamyon, içindeki yirmi iki müşterisiyle beraber sokağa çıkıp biraz ilerledikten sonra durdu. Uzaktan doğru koşup gelen bir çocukla, otomobilde heybesini bacaklarının arasına almış değirmi sakallı birisi fiskos edip konuşmaya başladılar. Ara sıra duyulan \"Buğday, veresiye defteri, şinik, sekiz metre kara di mi...\" gibi sözlerden, İzmir'e giden manifaturacının oğluna dükkan idaresi ve köylülerle veresiye muamelesinin şekli hakkında son talimatı verdiği anlaşılıyordu. İkide birde sabırsızlıkla arkasına dönüp bakan şoföre şöyle bir başını çevirip:\n" +
                "\"Dur azıcık... patlamadın a!..\" diyor; sonra gözlerini müşterilerde de gezdirerek sözünün yalnız şoföre değil, başka sabırsızlanan varsa onlara da dokunur olduğunu anlatmak istiyordu.\n" +
                "Bu sırada, sırtındaki eski bir heybe ile çok genç bir köylü otomobile yaklıştı; tereddüt eder gibi bir müddet şoföre baktıktan sonra:\n" +
                "\"İzmir'e mi?\" diye sordu.\n" +
                "\"Oraya!..\"\n" +
                "\"Beni de alır mısınız?\"\n" +
                "\"Yer yok!..\"\n" +
                "Delikanlı hemen arkasını döndü, uzaklaşmaya başladı. Fakat şoförün penceresine dayanarak ona birtakım şeyler havale eden esmer, uzun boylu, sırım gibi incelmiş boyunbağlı birisi arkasından bağırdı:\n" +
                "\"Gel buraya! Hey... Delikanlı!..\"\n" +
                "Köylü döndü. Esmer, uzun boylu bir adam şoföre:\n" +
                "\"Ne diye yer yokmuş, arkada bir yere sıkışır!..\" dedi.\n" +
                "\n" +
                "Bu adam kamyonun sahibi idi. Şoför yüzünü buruşturarak indi. Delikanlıdan yarım lira peşin aldı. Sonra, arabanın arka kapağını gevşeterek eğri bir şekle koyan ve üzerine çulları seren öteki köylüleri sıkıştırıp, yeni gelene bir yer açtı. Zaten dizleri üzerine çömelerek ancak sığışabilen yolcular hem; \"olmaz, buraya nasıl sığar!\" diye söyleniyorlar, hem de her setre pantolonlunun emrine itaate alışık bir tavırla birbirlerini iterek yer açıyorlardı. Genç köylü bir kıyıya çömeldi, heybesini altına aldı ve kamyon, hızla bir sarsıldıktan sonra yürüdü.\n" +
                "\n" +
                "Şoförün yanında oturan siyah elbiseli, gümüş çerçeveli gözlük takmış, yaşlıca, sünepe tavırlı bir adam -Beyşehir tarafına dava toplamaya giden bir avukat,- başını arkaya çevirerek! \"Uğurlar olsun cümlemize!\" diye bağırdı. İçerdekiler hepsi birden aynı sözü tekrarladılar. Konya'dan çıkıp Beyşehir'e giden yolun başlangıcındaki dik yokuşu tırmanmaya başlayınca, herkes yanındaki ile veya çaprazlama ta öbür baştaki biriyle lafa koyuldu, birkaç kişi yalnız cıgara içip dumanını savuruyordu. Birbiri arkasına dizili tahta sıralarda oturmayıp yarım lira eksiğine en arkada yere çömelen ve kamyonun şiddetle sarsılan bu kısmında ikide birde, başlamak üzere olan uykularından fırlatılan köylüler, cıgara da içmeyerek, boş gözlerle bakışıyorlardı.\n" +
                "\n" +
                "Sonradan gelen genç köylü ilk defa otomobile biniyordu. Benzi sapsarıydı. Bunun yarısı alışmadığı bir şeyde hızlı hızlı götürülmenin verdiği heyecan ve korkudan, yarısı da başka bir şeyden geliyordu.\n" +
                "\n" +
                "Konya'ya bir saat ötedeki bir köyden olan bu delikanlı otomobile binmişti, İzmir'e gidecekti. Araba İzmir'e gelince şoför yolcuları selâmetlemeden evvel nedense yol parasının üstünü toplamak âdetindeydi. Bunu genç köylü de biliyordu, fakat yazık ki şoförün bu isteğini yerine getirecek vaziyette değildi. Yanında beş parası bile yoktu.\n" +
                "Mahsuller para etmeyince, vergiler ödenmez hale gelince, evde tuz, gaz tükenip yerine yenisi konmayınca oğul babasını bir kenara çekmiş:\n" +
                "\n" +
                "\"Baba, ben gidip şehirlerde çalışayım. Bak, köyün yarısı gitti, İzmir'de çok iş varmış. Fabrikalarda adamına göre yarım lire yevmiye bile veriyorlarmış. Kışın burada kalıp yük olacağıma, gidip ekmeğimi ararım, harman zamanında gene gelir, tarlada çalışırım...! demişti. İhtiyar babasının aklı ermedi ve fakirlikten söz söyleyemez, fikir ortaya atamaz hale geldiği için peki dedi. Ve on sekiz yaşındaki delikanlı, bundan evvel İzmir'e gidip gelenlerden akıl danışmaya gitti.\n" +
                "\n" +
                "İzmir'e gitmek için evvela Konya'dan otobüse binmek lazımdı. Beyşehir, Karaağaç, Ödemiş üzerinden iki üç günde varılıyordu. Yol parası beş lira idi. İzmir'e varınca hemşerileri bulup ötesini onlardan öğrenmek lazımdı.\n" +
                "\n" +
                "Delikanlı bunun üzerine yol parası tedarikine çıktı.\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "Fakat evindeki eski bir çifteye bir liradan fazla veren bulunmadı. Beş lira gibi mühim bir parayı köyde bir araya getirebilmek, bir hafta uğraştığı halde, mümkün olmadı. Ne yapacağını şaşırmış bir halde iken bakkalın oğluna rastladı. Bu çocuk bir zamanlar babasının yanından kaçıp şoför muavinliği yapmıştı. Kendisine akıl öğretti:\n" +
                "\n" +
                "\"Ülen, sen deli misin? Otomobile de para mı verilirmiş?..\" dedi ve ona, şoföre yarım lirayı peşin verdikten sonra bir daha beş para vermemesini, İzmir'e yaklaştıkları zaman usulca arkadan atlayarak tüymesini ve İzmir'e yayan girmesini söyledi. Yalnız şunu da ilave etti:\n" +
                "\"Amanın tetik ol, İzmir'e girmeden otomobili durdurup yol parasını toplarlar. Sen daha evvel atlamazsan yandığın gündür. Şoförler seni yatırıp suyunu çıkarana kadar döverler, üstelik de don gömlekten gayri neyin varsa alırlar...\"\n" +
                "\n" +
                "İşte bu on sekiz yaşındaki köylü delikanlısı, cebinden elli kuruşu peşin verdikten sonra, böylece on parasız otomobile binmiş, İzmir'e ameleliğe gidiyordu.\n" +
                "\n" +
                "Yolculuğun ikinci günü akşamına doğru genç köylü olduğu yerde rahat oturamamaya başladı. Yola çıkalıdan beri açtı. Köyden beraber aldığı azıcık yufkayı daha biner binmez yemişti. Yanıbaşında kuru ve siyah bir ekmeği ağır ağır geveleyen köylülere yutkunarak bakıyor, sanki başı dönüyormuş gibi gözlerini kapayarak kafasını kamyonun sarsılan tahtalarına dayıyordu. Sonra birdenbire irkiliyor, yerinden azıcık doğrularak öne, şoföre doğru bakıyor, tekrar sıkıştığı yere büzülüyordu. İçinde, otomobil ilerledikçe büyüyen bir korku ona arasıra açlığını unutturuyor, yahut açlıkla karışarak onu sersemletiyordu. İzmir'e yaklaştıklarını yolcuların konuşmalarından anlamıştı. Fakat ne kadar yaklaştılar? Atlayacak, kaçacak zaman geldi mi? Eğer daha çok varsa bu Allah'ın dağlarında gece yarısı nasıl yolu bulacak, buralarda nasıl geceleyecek? Ya candarmaların eline düşerse?.. Ya şoför parayı vermeden atlayıp kaçtığını karakola haber verirse?.. O zaman candarmaların dayağı mı daha kötü idi, şoförün dayağı mı? Belki otomobildeki müşterilerden bir merhametli çıkar da bunu dövdürmezdi. Fakat bu kadar adamın içinde rezil olmak vardı. Üstelik don gömlekle kalacaktı. Bu kılıkta İzmir'e nasıl girer, hemşerilerini nasıl arardı? Atlamaktan başka çare yoktu...\n" +
                "\n" +
                "Fakat atlamayı nasıl becerecekti? Kamyon, arkasından atılmış pamuk gibi bir toz yığını bırakarak koşuyor, dar dönemeçlerde, içindekileri bir yandan bir yana fırlatarak, kıvrıntılar yapıyordu. Birçok defa gördüğü halde hiç içine binmediği bu acayip şey, çıkardığı gürültü ve insanı sersem eden hızıyla, ciğerlere ve beyne dolan sıcak benzin kokusu ile birdenbire korkunç bir kılık alan bu makine ona anlaşılmaz bir ürkeklik veriyordu. Bu ara toz, gürültü ve sürat kargaşalığı içinde dumanlanan kafasından, bozuk bir rüya şeridi gibi, köyü, kendisine anlatılan İzmir'in hayalinde yarattığı vuzuhsuz şekilleri, şoförün benzin kokulu, Beyşehir'den inen siyah ceketinden fırlayan sıska ensesi geçiyordu.\n" +
                "\n" +
                "Arasıra otomobil herhangi bir sebeple yavaşlar gibi olunca delikanlı yüzünde zaptemediği bir dehşet ifadesiyle yerinden fırlıyor, \"acaba duracak mı? Para toplamaya mı başlayacak?\" diyor; araba tekrar hızlanınca derin bir nefes alarak yerine çekiliyor ve atlamak için katî kararını veriyordu. Fakat nasıl atlayacak? Bu kamyon, bu gitgide gözünde büyüyen, bütün hislerine, alışamadığı ve ezici tesirler yapan korku makinesi kendisini bir kıskaç gibi yakalamıştı. Buradan kurtulmasına imkan olmadığını sanıyordu. Gözleri alev alev olmuş, dört tarafına bakınıyor, etrafındaki köylülerin, ön sıralarında oturan efendilerin hep kendisine baktıklarını, biraz kımıldasa yakasına yapışacaklarını zannediyordu. Alnından yanaklarına doğru terler akıyor ve şakaklarındaki ayva tüylerini ıslatıyordu.\n" +
                "Otomobil birdenbire yavaşladı. Yolun sol tarafı sarp bir kesme idi ve sağ tarafta, iki minare boyunda bir yar, esner gibi ağzını açmıştı. Yol birdenbire darlaşıyordu. Motorun hafifleyen gürültüsü arasında aşağıdan doğru gelen bir su şırıltısı duyuluyordu. Henüz taş bile döşenmemiş olan şosenin bu kısmında çökme ve kayma tehlikesi bulunduğu için yolcular burada yayan yürür ve otomobiller yavaş yavaş ilerlerdi. Bunun için otomobili tamamen durdurmadan şoför başını arkaya doğru çevirdi ve:\n" +
                "\n" +
                "\"Haydi beyler!\" dedi.\n" +
                "Birdenbire arka tarafta bir hareket oldu: Delikanlı, gözleri dönmüş, korkudan titreyerek, kendini dışarıya, yolun üstüne fırlattı. Fakat daha durmamış olan otomobilden bu tersine atlayış ona muvazenesini kaybettirdi; olduğu yerde birkaç kere döndükten sonra aşağı boşa gitti ve eliyle çalılara tutunmaya çabalayarak, kafası sivri taşlara çarpa çarpa ve arkasından acı bir hışırtı ile akan topraklar ve ufak taşlarla birlikte, yardan aşağıya, şimdi şırıltısı daha çok duyulan dereye doğru yuvarlandı.")

        landmarkList.add(kamyon)

        val sarkiciBulbul=Landmark(" Şarkıcı Bülbül","Uzaklardan gelen nağmeler kulaklarından ruhunun derinliklerine yayılmıştı, ihtiyar kaplumbağanın. Yuvasından çıktı. Büyük ve ağır kabuğunu zorlukla sırtında taşıyordu. Ayakları ağrıyordu, ama olsundu. Sıkıntıya katlanacak fakat en güzel öten, en güzel şarkı söyleyen bülbülün konserini kaçırmayacaktı. O bülbül ki, aman efendim, bir ses bir nefes! Duyanlar elindeki işini bırakır, dinlemeye koşardı. Zalim, bir de yakışıklıydı ki.. Şöyle bir yan döner, kafasını yukarıya kaldırıp şarkı söylemeye başladığı zaman, dinleyenler mest olur “ Ah “ çekerler, biçareler, mecnunlar “ Of “ çekerlerdi.\n" +
                " \n" +
                "İki ay önce tüm çevre ormanları şampiyonlarının katıldığı güzel ses yarışmasında birinci olup “ Şampiyonlar Şampiyonu “ ünvanını almıştı. Kendisine armağan edilen büyük bir yuvada yaşıyordu. Yuvanın temizliğine ve yiyecek işine yardımcıları bakıyordu. Konserler veriyor, çok kazanıyor, çok harcıyordu. Yakın dostları, arkadaşları yüzleri aşmıştı. Hepsi, iltifat ediyor, övgüler yağdırıyor, çevresinde pervane oluyordu. Bu böyle dört ay daha devam etti. Havalar soğumaya başlamıştı. Orman hayvanları kış uykusuna yatmaya başladılar. Bülbül, yakın arkadaşları ile görkemli yuvasında eğlenceler tertipliyor, şarkılar söyleyip, sabahlara kadar zevk ve eğlence ile vakit geçiriyordu.\n" +
                " \n" +
                "Karlı bir kış günü bülbül yuvasından çıktı. Daldan dala neşe ile uçarken yoruldu. Terledi. Susuzluğunu gidermek için, biraz kar yedi. Tekrar havalandı. Uçtu. Uçtu. Akşamüstü yuvasına geri döndü. Arkadaşları evde toplanmışlardı. Bülbülün gelmesiyle eğlenceler tekrar başladı. Sabahlara kadar yediler, içtiler, güldüler, oynadılar. Arkadaşları gittikten sonra, bülbül odasına girdi. Yatağına yattı. Derin bir uykuya daldı.\n" +
                " \n" +
                "Vakit öğle üzerini geçmişti. Bülbül uyandı. Başı sersem gibiydi. Ter içindeydi. Yutkunmaya çalıştı, yutkunamadı. Boğazı yanıyordu. Aklını toplamaya çalışırken, dün terliyken soğuk kar yediğini hatırladı. Hastalanmıştı. Hemen Doktor Sincap Bey’i çağırdı. Doktor Sincap, bülbüle dinlenme tavsiye etti. Çeşitli ilaçlar yazdı, haplar verdi. Bülbül, bu tavsiyeleri aynen uyguladı. Birkaç gün sonra iyileşti, ayağa kalktı. Ertesi gün odasında yalnız olduğu bir sırada canı şarkı söylemek istedi. Kendisini ne kadar zorladıysa da fark etmedi; sesi eskisine göre, daha kalın, boğuk ve çatallı çıkıyordu. “ Bu sesle şarkı söylemeye kalkarsam herkesin yanında rezil olurum. Beni alaya alırlar. En iyisi hiç kimseye bundan söz etmemek “ dedi kendi kendine. Sonraki üç ay aynı şekilde eğlenceler devam etti.\n" +
                " \n" +
                "Nisan ayı geldiğinde kış bitmiş, havalar ısınmıştı. Orman hayvanlarının çoğu kış uykusundan uyanmışlardı. Hemen ormanda konser tertipleyen organizatörler harekete geçtiler. İlk durakları bülbülün yuvasıydı. Büyük paralar vaat ettikleri halde bülbül bütün teklifleri geri çevirdi. Aslında paraya çok ihtiyacı vardı. Kış mevsimi boyunca dostlarıyla birlikte, geçen yaz kazandığı paraları harcamıştı. Hazıra dağlar bile dayanmazdı. Çok uğraşıp, çalışıp çabaladığı halde, eskisi gibi güzel şarkı söyleyemiyordu. Sonunda orman hayvanları arasında şampiyon bülbülün sesini kaybettiği hakkında söylenti çıktı. Kimseler evine uğramaz oldu. Hizmetçiler, evi terk etmeye başladılar. Bülbül maaşlarını ödeyemez duruma gelmişti.\n" +
                " \n" +
                "Eski şarkıcı bülbül görkemli yuvasında yalnız kaldı. Çaresizdi. Tarifsiz acılar içindeydi. En güzel şarkı söyleyen şarkıcı seçilmiş, konserlerde büyük paralar kazanmış, kısa sürede baş döndürücü\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "bir hızla yükselmişti. Gençti, tecrübesizdi, aldanmıştı. Dostları, can arkadaşları neredeydiler şimdi? Fakat onlara da kızamıyordu: “ Beni hiçbirisi zorlamadı ki, her gece eğlenceler düzenle, paralarını bizim için harca diye. “ Ayrıca, soğuk bir kış günü terli terli kar yemişti. Ya buna ne demeliydi?\n" +
                " \n" +
                "İhtiyar kaplumbağa günlerdir çok üzgündü. Sesine hayran olduğu yakışıklı bülbülün haline kahroluyordu. Duydukları doğruysa, bülbül sesini kaybetmişti. Bülbülü evinde arıyor, fakat bulamıyordu. Bir gün ormanın tenha bir yerinde bülbülle karşılaştı.\n" +
                " \n" +
                "Kaplumbağa:\n" +
                "\n" +
                "“ Merhaba sayın bülbül. Ne zamandır sizinle tanışmak istiyordum. Geçen yıl siz şarkı yarışmasını kazandığınızda ben de seyirciler arasındaydım. Sesinizi ilk kez orada duydum, hayran kaldım. Daha sonra verdiğiniz konserlerden hiçbirini kaçırmadım. Siz şarkı söylerken, kendimi bulutların üzerinde gibi hissediyorum “ dedi.\n" +
                " \n" +
                "Bülbül:\n" +
                "\n" +
                "“ Ne yazıktır ki, hepsi mazide kaldı. Hatıralar hayal oldu. O bülbül yok artık aramızda. Duymuşsunuzdur, karlı bir kış günü uçarken yorulmuş ve biraz kar yemiştim. Hastalandım. Hastalık birkaç günde geçti. Fakat sesimi kaybetmiştim. Param çokken yanımdan ayrılmayan dostlarım beni terk ettiler. Her neyse, sizi de meşgul etmeyeyim, belki işiniz vardır “ dedi.\n" +
                " \n" +
                "Kaplumbağa:\n" +
                "\n" +
                "“ Bakın sayın bülbül. Ben tam yüz on yaşındayım. Nice olaylara tanık oldum. Bunca uzun süren yaşamım boyunca kimseye zararım dokunmadı. Aksine birçoklarına yardım ettim ve karşılık beklemedim. Anladığım kadarıyla, sesinizi etkileyen, ses tellerinizin iltihaplanmasıdır. Dumanlı dağdaki “ Şifa Veren İksiri “ ağır hastalıklar sonucu oluşan arazların giderilmesine birebirdir. Bu iksirin içinde bulunan elementler, çeşitli hastalıklara iyi geldiği gibi, ses telleri ve gırtlak üzerinde de olumlu etkileri vardır. İksirden günde üç bardak olmak üzere dört gün boyunca içeceksin, dört gün sonunda sesinin düzeldiğini göreceksin. Haydi, bakalım sayın bülbül, yolun açık olsun “ dedi.\n" +
                " \n" +
                "Bülbül, kaplumbağa ile vedalaştıktan sonra, bir ok gibi gökyüzüne yükseldi. Kaplumbağanın söyledikleri doğru ise ve sesi düzelirse, tekrar eski güzel günlere dönebilecekti. Fakat çok daha bilinçli ve tutumlu olacaktı. Bülbül uzun ve yorucu bir yolculuktan sonra, dumanlı dağa vardı. İksirin aktığı pınarı buldu. Dört gün sonunda, sesi eski sağlığına kavuştu. Tekrar ormana döndü. İlk işi kaplumbağa ile buluşmak oldu. Son derece sevinçliydiler. Hemen gidip konser tertipleyen bir organizatörle anlaştılar. Bülbülün konserler vereceği haberi ormanda büyük yankı uyandırdı. Orman hayvanları, bülbülün büyüleyici sesini dinlemeye koştular.\n" +
                " \n" +
                "İki hafta sonra: Bülbül eski güzel günlere nihayet dönmüştü. Kazandıklarını harcarken tutumlu davranıyor, gereksiz harcamalardan şiddetle kaçınıyordu. Bir işe karar vermeden önce kaplumbağaya danışıyor, onun söylediklerini harfiyen uyguluyordu. Organizatörlere yardımcısı olduğunu söyleyip ayrıca kaplumbağanın para kazanmasını sağlıyordu. Zevk ve eğlence arkadaşları: “ Neden tekrar evinde eğlence düzenlemiyorsun? “ diye sorduklarında buruk bir şekilde gülümsüyor, “ Yakında arkadaşlar, yakında…” diyerek geçiştiriyordu. Bu arkadaşlarıyla daima arasında belirli bir mesafe bırakıyordu.\n" +
                " \n" +
                "En acılı günlerinde karşılık beklemeden yardımcı olan, üstün bilgi ve engin hayat tecrübesine sahip bulunan yüz on yaşındaki ihtiyar kaplumbağaya sarılıyor ve “ Bir gerçek dost bin posttan iyidir.” diyordu.")
        landmarkList.add(sarkiciBulbul)

        val kucukDenizKizi=Landmark(" Küçük Deniz Kızı","Bir zamanlar altı güzel kızı olan bir kral varmış. Ama bu kral insanların kralı değilmiş. Ülkesi dalgaların altında balıkların değerli taşlar gibi parıldadığı bir ülkeymiş. Genç prenseslerin anneleri çoktan ölmüş ve onları büyükanneleri büyütmüş. İçlerinde en güzelleri en küçük olanıymış. Saçları altın bukleler halinde omuzlarına dökülüyormuş. Kızlar büyükannelerinin anlattığı yeryüzüyle ilgili masalları çok seviyorlarmış. Bu masallarda bacak adlı iki şeyin üzerinde yürüyen garip insanlar varmış. Küçük denizkızı da bu anlatılanları görmek istiyormuş. \"Onbeş yaşını beklemen gerekir,\" demiş büyükanneleri. \"O zaman gidip görebilirsin.\"\n" +
                "\n" +
                "En büyük denizkızı yaşı geldiğinde yüzeye çıkmış ve gördüğü ilginç şeyleri kardeşlerine anlatmış. Yıllar geçmiş ve sonunda küçük denizkızının da yüzeye, insanların dünyasına çıkabileceği gün gelmiş. Şimdiye kadar hep merak ettiği dünyayı artık kendi gözleriyle görebilecekmiş. Yüzeye doğru yüzerken güneş batıyormuş. Yakınlarda bir gemi demir atmış. Küçük denizkızı yüzeye çıktığında güvertedeki yakışıklı prensi görmüş. Prens kendisini birisinin gözlediğini de, prensesin ondan gözlerini ayıramadığını da bilmiyormuş tabii. Birden hava kararmış, gemi çıkan fırtınayla sallanmaya başlamış. Çok geçmeden yelkenleri parçalanmış, direği kırılmış ve gemi sulara gömülmüş. Küçük denizkızı sularda çırpınan prensi son anda görüp kurtarmış. Onu kucaklayıp kıyıya götürmüş ve sahile bırakmış. Sabah olduğunda prens hala yattığı yerde uyuyor, denizkızı da başucunda onu bekliyormuş.  Az sonra birkaç kız koşarak gelmiş. Prens gözlerini açmış ve kalkıp yürümüş. Küçük denizkızı oracıkta üzüntüsüyle baş başa kalmış." +
                "O günden sonra küçük denizkızı prensi görebilmek umuduyla birçok kez yüzeye çıkmış. Artık dayanamıyormuş. Su cadısına gidip akıl almaya karar vermiş. Cadı onu görünce bir kahkaha atmış:\n" +
                "\n" +
                " \n" +
                "\n" +
                "\"Niçin geldiğini biliyorum denizkızı,\" demiş. \"İnsana dönüşüp karaya çıkmak istiyorsun. Böylece\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "prensle daha yakın olacağını düşünüyorsun. Ama bunun bir bedeli var, biliyor musun?\"\n" +
                "\n" +
                "\"Bilmiyordum,\" demiş küçük denizkızı, \"ama insan olabilmek için neyse öderim.\"\n" +
                "\n" +
                "\"Sesini istiyorum,\" demiş cadı, \"şu şarkılar söyleyen güzel sesini. Bana sesini verirsen ben de seni iki ayaklı güzel bir genç kıza çeviririm. Ama unutma, prens seni bütün kalbiyle sevmeli ve evlenmeli. Yoksa bir deniz köpüğüne dönüşüp sonsuza dek yok olursun.\"\n" +
                "\n" +
                "\" Çabuk,\" demiş küçük denizkızı. \"Ben kararımı çoktan verdim zaten.\" Bunun üzerine su cadısı küçük denizkızına içmesi için büyülü bir ilaç vermiş. Küçük denizkızı prensin karşısına dikildiği an prens bu hiç konuşmayan kızdan çok hoşlanmış ve onsuz yapamayacağına karar vermiş. Küçük denizkızı da prensi her geçen gün daha çok sevmiş, ama prens ona bir türlü evlenme teklif etmiyormuş. Prensin annesi ve babası, kendine  eş bulması için baskı yapıyorlarmış. Prens sonunda yakındaki bir ülkenin prensesiyle tanışmaya karar vermiş. Yanında küçük denizkızını da götürmüş. Zavallı kız çok acı çekiyormuş. Prens komşu ülkeye gidip prensesle karşılaşınca aklı başından gitmiş ve hemen evlenmek istemiş. Düğünleri muhteşem olmuş. Her yer çiçek, ipek ve mücevherle kaplıymış. Mutlu çifti görmeye gelen herkes coşku içindeymiş. Yalnızca küçük denizkızı sessizmiş. Gözyaşları sessizce süzülüyormuş yanaklarından. O gece küçük denizkızı güvertede dikilmiş karanlık sulara bakıyormuş. Gün doğarken bir deniz köpüğü olup o sulara karışacakmış. Birden suların dibinden denizkızının kardeşleri çıkmışlar. Saçları kısa kısa kesilmiş.\n" +
                "\n" +
                "\"Saçlarımızı su cadısına verdik, karşılığında da bu bıçağı aldık. Eğer bu gece bu bıçağı prensin kalbine saplarsan büyü bozulacak.\" Küçük denizkızı bıçağı almış ama prense asla zarar veremeyeceğini biliyormuş. Güneş doğduğunda kendini ağlayarak denize atmış. Ama denize düşmemiş. Kendini havada uçarken bulmuş. Çevresinde altın renkli ışıklar dans ediyormuş. \"Biz havanın kızlarıyız \" demişler. \"Artık bizimle mutlu olursun.\" Küçük denizkızı gökyüzüne doğru yükselirken aşağıya, prensin gemisine bakmış ve gülümsemiş.")
        landmarkList.add(kucukDenizKizi)

        val keloglanVeKuyudakiDev=Landmark(" Keloğlan Ve Kuyudaki  Dev","Bir varmış, bir yokmuş, evvel zaman içinde, kalbur zaman içinde develer tellalken, pireler berberken, ben annemin beşiğini tıngır mıngır sallarken; ülkenin birinde bir kasaba varmış. Bu kasabanın kenar mahallelerindeki bir kulübede, çok fakir bir keloğlan ile ihtiyar annesi yaşamakta imiş. Keloğlan çok akıllı ve becerikli olmasına rağmen çalışmaktan hoşlanmaz, tembel tembel evde oturmayı, ne buldu ise yiyip, içmeyi ve uyumayı severmiş. Tembel mi tembel, saçsız kafası ile de çok çirkin olduğu için herkes ona keloğlan dermiş. Keloğlanın ihtiyar annesi ise el çamaşırı yıkar, hem kendini, hem de tembel keloğlanı beslemeğe çalışır, zorluklar içinde geçinirlermiş.\n" +
                "\n" +
                "Her nasılsa Keloğlanın canı çarşıya çıkıp dolaşmak istemiş. Bir de bakmış ki, uzakta bir kalabalık var. Kalabalığın ortasında bir adam bağıra bağıra bir şeyler söylüyor. Kalabalıktaki insanlarda onu dinlermiş. Bizim Keloğlanda kalabalığa sokularak bu adamın dediklerini dinlemiş. Adam meğer şehrin tellallarından biriymiş. Keloğlanın dinlemekte olduğu tellal şöyle demekteydi.\n" +
                "\n" +
                "-Ağır bir iş için bir adama ihtiyaç vardır. Bu işi görecek adama yüz altın verilecektir. Talip olacak kimse varsa ortaya çıksın....\n" +
                "\n" +
                "Keloğlan etrafta toplanan kalabalıktan ses seda çıkmadığını görünce ve bu işin sonunda yüz de altın verileceğini öğrenince tellala:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Bu işi ben yaparım, yalnız bu yapılacak işi hemen bana söyle, demiş.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Tellal Keloğlanı şöyle bir süzdükten sonra, gözü tutmamış olacak ki:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Oğlum, sen bu işi yapamazsın, iş çok zordur. Bunu ancak akıllı, becerikli ve cesur adamlar başarabilir. Ben bunları sende göremiyorum, deyince; Keloğlan:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Ummadığın taş baş yarar. Ben bu işi başarırım, diye cevap vermiş. Etrafta toplanan kalabalıktan alaylı gülüşmeler yükselmiş. Bu sırada tellal onun biraz da fakir haline acıyarak:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Pekala oğlum...Madem ki kendine güveniyorsun sana şimdi yapacağın işi tarif edeyim...Uzak bir ülkeden mal getirmeye gidilecek... Yolculuk at sırtında olacak, ama sen bu yolculuğa katlanabilecek misin?.. diye sorunca.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Ben yaparım dediğim her şeyi yaparım. Elbette katlanırım, karşılığını vermiş. Tellal:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Madem ki bu kadar güvenin var, bende sana bu işi veriyorum...Paranı şimdi mi, yoksa dönüşte mi istersin? Keloğlan da:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Şimdi verinde birazı yanımda bulunsun, geri kalanını anneme harçlık bırakırım, der.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Bu şartlarla anlaşmaya varan Keloğlan sevinçle annesine koşarak durumu anlatır ve\n" +
                "\n" +
                " \n" +
                "\n" +
                "yanındaki parayı annesine bırakarak veda edip yapacağı işe gider.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Toplantı yerine gelen Keloğlan, yolculuğun hazır olduğunu ve kafilenin kendisini beklemekte olduğunu görür. Kafile başkanı Keloğlana hazır olup olmadığını sorar. hazır olduğunu öğrenince küçük kafile hemen atlara binerek yola koyulur... İki gün durup dinlenmeden yol alırlar. Üçüncü gün Keloğlanın at sırtındaki yolculuktan vücudunun her tarafı ağrımaya başlar. Ama verdiği sözü ve aldığı parayı düşünerek sabırla yola devam eder. Artık akşam yaklaşmıştır. Kafile başkanı mola için kervanı durdurur. Keloğlan biraz dinleneceği için sevinmiştir. Ama bu sevinci çok sürmez. Atlar bağlandıktan sonra kafile başkanı kendini çağırır. Keloğlana der ki:\n" +
                "\n" +
                "-Keloğlan, şurada bir kuyu görüyorsun...\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Evet, der bizim Keloğlan.\n" +
                "\n" +
                " \n" +
                "\n" +
                "-İşte şimdi, o kuyuya ineceksin... Korkmazsın değil mi?...\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan kuyunun yanına gider bir sağına, bir soluna ve eğilip içine bakar, kafile başkanına dönerek:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Ne var bunda korkacak, elbette inerim. der. keloğlan korksa bile korktuğunu belli etmemeğe çalışarak kuyuya inme hazırlığına başlar. Etrafını saran yol arkadaşları Keloğlan'ın beline kalın bir ip bağlarlar, kuyuya sarkıtırlar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan kuyunun yarısına gelince sağ tarafında karanlıkta aniden\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "bir kapı açılır. Adamın biri Keloğlan'ı kucakladığı gibi bu kapıdan içeri çeker... Neye uğradığını anlayamayan Keloğlan kendine gelince, bir de ne görsün!.. Geniş bir bahçe ve bu bahçenin ortasında büyük bir saray durmuyor mu?.. Sarayın bahçesinde güllerin arasında Dünya güzeli bir kız oturmuş, arkasında bir dudağı yerde, bir dudağı gökte iri ve koyu siyah renkte bir zenci ayakta durmakta. çiçeklerin arasında bir tavus kuşu dolaşmaktadır. Şaşkınlıkla bunları seyre dalan Keloğlan birden arkasında gürleyen bir sesle aklı başından gider. Dönüp bakınca, ne görsün?... Koca bir dev. Arkasında durmuyor mu!.. Dev korkunç bir sesle:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Eyyyy, adem oğlu!... Söyle bakalım, şu gördüklerinden hangisi daha güzel?..\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan korkudan tir tir titremeğe başlar. Ne cevap vereceğini şaşırır ama, biraz sonra aklı başına gelir ve biraz düşündükten sonra:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Gönül neyi severse güzel odur sultanım, der.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Dev, aldığı cevaptan memnun gibi görünür ve Keloğlan'a tekrar sorar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Şu kız çok güzel, şu tavus kuşu çok hoş ama, şu zenci çok çirkin, çok kötü!.. Buna ne dersin?..\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan artık ilk şaşkınlık ve korkudan kurtulmuştur. Yine cevabı yapıştırır:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Gönül neyi severse, güzel odur sultanım, diye tekrar aynı cevabı yapıştırır.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Aldığı cevaptan çok hoşlanan dev, Keloğlan'a:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Aferin, sen akıllı bir çocuğa benziyorsun diye Keloğlan'a hemen yanındaki, ağaçtan kopardığı üç tane büyük narı verir. Ve:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Al bu narları. Dönüşte annenle birlikte yersin, diyerek Keloğlan'ın yanından ayrılmış.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Meğer Dev, her kuyuya inen insana bu soruları sorar fakat, bir türlü istediği akıllıca cevabı alamayınca çok kızar, hemen kellesini uçurur, sonra da etlerini yer, kafatasını sarayın duvarlarına asarmış. Böylece kuyuya inenlerin çoğu, Dev'in bu soruları karşısında kimi kız güzel, kimi tavuskuşu diye Dev'e cevap verirlermiş. Bu cevaplardan memnun kalmadığı için kuyuya inen bir daha yukarı çıkamazmış. Dev'in yanından ayrılan Keloğlan tekrar çıkış kapısına gelip yukarı nasıl çıkacağını düşünürken birden yukardan, su almak için sarkıtılmış bir kovanın kendisine doğru geldiğini görünce, Keloğlan hemen bu kovadan tutarak yukarı çıkar.\n" +
                "\n" +
                "Keloğlan'ı sapasağlam yukarı çıktığını gören arkadaşları, şaşkınlıktan ağızları bir karış açık, gözlerine inanamazlar ve birbirlerine bakışırlar. Zira kervancılar bu kuyudan su almak istedikleri zaman her seferinde Dev'e bir insanı kurban vermeleri adetmiş. Yol arkadaşları onu böyle sapasağlam, güler yüzlü görünce tabii şaşkınlıktan kendilerini alamamışlar. Kafile başkanı merakını yenemeyerek Keloğlan'a:\n" +
                "\n" +
                "-Şimdiye kadar bu kuyuya salladığımız adamlardan hiçbiri geri dönmemiştir. Sen nasıl oldu da bu kuyudan sağlam çıktın evlat?...\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan güler yüzle şu cevabı verir:\n" +
                "\n" +
                " \n" +
                "\n" +
                "-Nasıl çıktıysam çıktım.. Çıktım ya!... Siz ona bakın.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Yeniden kafile yola koyulmuş. Varacakları o uzak ülkeye varmış.Atlara malları yükleyerek memlekete dönmüşler.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Keloğlan elindeki Nar'ları sevinçle evine dönünce, annesi yine her zamanki gibi, el çamaşırı yıkamakta bulur. Annesi de oğlu geldiği için sevinmiştir. Yemekler yenir.Yemekten sonra da Keloğlan, Dev'in verdiği Nar'lardan birini çıkarıp yemek için ikiye böler. Bir de ne görsün? Dev'in verdiği Nar tanelerinin her biri meğer çok kıymetli birer mücevher değilmiymiş... Bunun değerini anlayan Keloğlan, zaman zaman bunların her birini azar azar satmış.. Ve Keloğlan öylesine zengin olmuş ki, artık ne kelliği kalmıştır, ne de çirkinliği, ne de annesinin çamaşırcılığı. Mutlu bir hayata kavuşmuşlar." +
                "")
        landmarkList.add(keloglanVeKuyudakiDev)

        val agustosBocegiİleGarınca=Landmark(" Ağustos Böceği İle  Karınca ","Eğlenceyi çok seven bir ağustos böceği varmış. Bu ağustos böceği sürekli saz çalar, şarkı söylermiş. Tüm gününü bu şekilde geçirirmiş. Derken güzel, sıcak günler bitmiş, kış gelmiş. Artık havalar çok soğuk ve yağışlıymış. Ağustos böceği şarkı söylemez hale gelmiş. Soğuktan çok üşüyormuş ve karnıda çok açıkmış. Ama hiç yiyeceği yokmuş. Çünkü tüm yazı saz çalarak ve şarkı söyleyerek geçirmiş. Kış için hiç hazırlık yapmamış. Ama o bu şekilde eğlenirken küçük komşusu karınca tüm yazı kış hazırlığı yaparak geçirmiş. Ağustos böceği bunu hatırlamış ve aklına karınca komşusundan ödünç istemek gelmiş;\n" +
                "\n" +
                "— Karınca komşumdan ödünç yiyecek bir şeyler isteyeyim, hem ne var ağustosta tekrar öderim, demiş.\n" +
                "\n" +
                "Ağustos böceği bu düşünce içerisinde karınca komşusunun kapısına gitmiş. Kapıyı\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "çalmış. Karınca açmış kapıyı. Karşısında açlık ve soğuktan perişan olmuş ağustos böceğini görmüş;\n" +
                "\n" +
                "— Ne istiyorsun ağustos böceği, demiş.\n" +
                "\n" +
                "— Karınca kardeş havalar çok soğudu çok üşüyorum, üstelik karnımda çok aç ama yiyecek hiçbir şeyim yok. Bana ödünç yiyecek bir şeyler verir misin? Söz veriyorum ağustosta borcumu ödeyeceğim sana, demiş ağustos böceği.\n" +
                "\n" +
                "Karınca;\n" +
                "\n" +
                "— Neden yiyecek hiçbir şeyin yok, bütün yaz ne yaptın sen?\n" +
                "\n" +
                "— Ağustos böceği çok utanmış, çok mahcup olmuş;\n" +
                "\n" +
                "— Şeyyy, ben bütün yaz saz çaldım, şarkı söyledim. Kış için hiç hazırlık yapmadım.\n" +
                "\n" +
                "Karınca çok sinirlenmiş bu cevabı duyunca;\n" +
                "\n" +
                "— Madem öyle tüm yaz saz çalıp, şarkı söyledin şimdide oyna o zaman, demiş karınca ve tak diye kapıyı ağustos böceğinin yüzüne kapatmış.")
        landmarkList.add(agustosBocegiİleGarınca)



        val gitarciAslan=Landmark(" Gitarcı Aslan","Ormanlar Kralı aslan bir varisi olmadığından yakınıyordu. Nedeni bilinmezdi fakat hiç yavrusu olmamıştı. Bir erkek yavrusu olsa bir iki yıla kalmaz kocaman olurdu. Şöyle yelesini savurarak boy boy dolaşırdı ortalıkta. Ormana asayişi kontrol için çıktığında bir kükre dimiydi, suçlular ve suç hazırlığı içinde bulunanlar saklanacak delik aramalıydı. Neden sanki tacını, tahtını bırakacağı bir varisi yoktu. Yakın akrabaları falan da yoktu ki, onlardan birini yanına alsın, yetiştirsin, kendinden sonrası için kral olmaya hazırlasın. Kral dediğin soylu olurdu, asil olurdu, öyle her önüne gelen krallık yapamazdı. Tutsa alelade bir aslanı kendinden sonrası için vasiyet etse, yeni kral beceriksiz çıkacak ve yönetim etkisiz kalınca da orman karışıklığa, kargaşalığa, kaosa sürüklenecekti.\n" +
                "\n" +
                "“ Hayır, gözüm arkada kalmamalı “ diye düşündü Ormanlar Kralı aslan. “ Soy kütüğümü tekrar kontrol etmeliyim. Hem bu defa öncekiler gibi olmamalı, çok daha dikkatli davranmalıyım. Babamı, dedemi ve tüm soyumu, sopumu en ince ayrıntılarına kadar incelemeliyim. Mutlaka bulmalıyım, damarlarında asalet kanı taşıyan bir aslan mutlaka bulmalıyım. ”\n" +
                "\n" +
                "Ormanlar Kralı aslanın günlerce süren araştırması sonunda meyvesini verdi. Dört nesil öncesinde krallık yapan aslan yerine büyük oğlunu vasiyet edince küçük oğlu bu duruma üzülmüş ve çekip gitmişti. Onun çok uzaklardaki Grandr Ormanı’na gittiği ve orada sakin bir yaşam sürmeye başladığı belirtilmişti. Konu hakkında daha sonra ne olduğu gibi bir bilgiye rastlanmıyordu. Ormanlar Kralı aslan tilkiyi huzuruna çağırdı ve ona durumu anlatıp, Grandr Ormanı’nda araştırma yapmasını, eğer varsa, akrabalarından genç ve yetenekli bir erkek aslanı alıp saraya getirmesini emretti. Tilki tamamen sessiz iş görecek ve dışarıya bilgi sızdırmayacaktı.\n" +
                "\n" +
                "Tilki, Grandr Ormanı’na vardığında küçük bir kalabalık gördü.Bu kalabalığın ortasında genç bir erkek aslan gitar çalıyordu. Tilki daha önce gitar çalan bir aslan görmediği için çok şaşırdı. Pek de güzel çalıyordu canım bu aslan gitarı. Gitar sesini yakından dinlemek için ön sıraya geçmek lazımdı. Haydi ne duruyordu geçseydi ya ön sıraya. Tilki kalabalığın arasından sıyrılarak ön sıraya geçti. İşte şimdi gitar sesi kulağına daha bir hoş geliyordu. Bir süre bu gitarcı aslanın konserini dinledikten sonra onun oldukça yetenekli olduğunda karar kıldı. Hani gitarcı aslan hava karardıktan sonra konserini bitirip dinleyenlere teşekkür edip kalkıp gitmese sabaha kadar onun çaldıklarını dinlemeye razıydı. Bu kadar olurdu canım, bu kadar olurdu.\n" +
                "\n" +
                "Tilki ertesi gün yoğun bir çaba içine girdi. Sağa gitti, sola gitti, gezdi, dolaştı. Pek çok orman hayvanıyla konuşmalar yaptı. Ne yaptı etti, sözü döndürdü, dolaştırdı, dört\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "nesil öncesinde kral olan aslanın küçük oğlunun ne olduğu, nasıl yaşadığı ve soyunun devam edip etmediği sorularını onlara sordu. Konuya doğru dürüst bir açıklama getiren yoktu. Hep ben ne bileyim, ben ne bileyim. Fakat iş dedikodu anlatmaya geldi miydi fındık kırdırıyorlardı. Birbirlerinin arkasından demediklerini bırakmıyorlardı. Dedikodu kötü bir alışkanlıktı, bunu bari bilselerdi ya..\n" +
                "\n" +
                "Tilkinin Grandr Ormanı’ndaki araştırması on gün devam etti. Sonunda bir yaşlı aslan konuyu aydınlığa kavuşturdu. Kraliyet ailesinden şu anda hayatta olan bir aslan kalmıştı. O da gitarcı aslandı. Tilki için gitarcı aslanı bulmak zor olmadı. Yine aynı yerde konser veriyordu. Tilki konser sona erdikten sonra gitarcı aslanın yanına giderek, Ormanlar Kralı aslan tarafından buraya gönderildiğini, kralın kendisini konser vermek için saraya davet ettiğini söyledi. Bu teklifi kabul eden gitarcı aslan, ertesi gün tilki ile birlikte yola çıktılar.\n" +
                "\n" +
                "Saraya varınca tilki gitarcı aslana kalacağı odayı gösterdikten sonra kralın huzuruna çıktı ve en başından başlayarak olanları anlattı. Damarlarında asalet kanı taşıyan genç ve yetenekli bir erkek aslan nihayet bulunmuştu. Fakat şu gitar çalma işi kralı hem şaşırtmış, hem de düşündürmüştü. Nereden aklına gelmişti bilmem ki bu aslanın gitar çalmak? Akşam yemeği sarayın yemek salonunda yendikten sonra gitarcı aslan konserine başladı. Sanki sihirli bir el gitarın telleri üzerinde dolaşıyordu ve dinleyenler bu tellerden çıkan nağmelerle büyüleniyorlardı. Bazı bazı gitarcı aslan sesiyle de iştirak ediyordu bu nağmelere ve gerçekten büyüleyici bir tablo ortaya çıkıyordu.\n" +
                "\n" +
                "Günler günleri kovaladı. Geçen günlerle birlikte kral gitarcı aslanı tanıdıkça daha bir sevdi. Asildi, soyluydu, bilgiliydi, kültürlüydü, saygılıydı. Daha ne olsundu canım aynı zamanda kuzeniydi ya bu gitarcı aslan.Yerine vasiyet ederdi olur biterdi.Ama bunu ona nasıl söyleyecekti. İşin en zor tarafına sıra gelmişti. Günler geçip gidiyor fakat kral bir türlü ona söyleyemiyordu. Sonunda kral bir gün cesaret bulup her şeyi olduğu gibi anlattı.\n" +
                "\n" +
                "“ İşte soy kütüğü burada. İşte şunlar dört nesil öncesinde dedelerimizin adları. Benim dedem kral tarafından vasiyet edilince, senin deden Grandr Ormanı’na gitmiş. Onun soyundan sadece sen yaşıyorsun. Yani sen benim kuzenim oluyorsun. Benim tahtımın, tacımın tek varisi sensin. “\n" +
                "\n" +
                "Kralın anlattıkları gitarcı aslanı hiç şaşırtmadı. Zaten o bütün bunları babasından defalarca dinlemişti. Her şeyi bildiğini krala söyledi. Kral, gitarcı aslanı açık sözlülüğünden dolayı kutladı. Çünkü gitarcı aslan her şeyi bildiği halde bildiğini söylemeyiverse hem kendini aldatmış sayılırdı, hem de kralı. Kral bunun farkındaydı ve böylesine mert bir aslanın varisliği kabul etmesinden kıvanç duydu.\n" +
                "\n" +
                "Yazan: Serdar Yıldırım")
        landmarkList.add(gitarciAslan)

        val yavruBalinaİleKopekBaligi=Landmark(" Yavru Balina İle Köpekbalıkları","Annesi balina avcıları tarafından öldürülen yavru balina Atlas Okyanusu’nda yüzerken etrafını yirmi kadar köpekbalığı sardı. Başkan köpekbalığı yavru balinanın yanına gelerek: “ Seni tanıyorum ve durumunu çok iyi anlıyorum yavru balina. Ama üzülmekle eline bir şey geçmez. Anneni insanlar öldürdü. Sen bunu onların yanına bırakmamalısın. Annenin intikamını almalısın. Biz senin dostunuz. Sana öldürmeyi öğretip, insanların üstüne salacağız. Çok yakında insanlar yavru balinayı tanıyıp, ondan korkacaklar “ dedi.\n" +
                "“ Annemi yerler mi insanlar? “ diye sordu yavru balina.\n" +
                "“ Yerler yavrum. İnsanlar acımasızdır. Onlar dünyadaki tüm canlıları acımasızca öldürürler. Hoş, insanlar birbirlerine karşı da acımasızdır. Ben buralarda çok gördüm gemiler içinde savaşan insanları. Dedem insanların toprak üstünde de savaştıklarını söylerdi. Savaşı kazanan kahraman olurmuş. “\n" +
                "“ İnsanlar kötü yaratık desene? “\n" +
                "“ Hem de çok kötü yaratık. “\n" +
                "“ O zaman beni annesiz bırakan, bana günlerce gözyaşı döktüren insanları cezalandıracağım, ama bunu nasıl yapacağımı bilemiyorum. “\n" +
                "“ Öğrenirsen bilirsin. Haydi, yavrucuk peşimden gel. Siz de peşimden gelin köpek kardeşlerim. Derinlikler bizi bekliyor. “\n" +
                "\n" +
                "Aradan bir ay geçti. Bu sürede köpekbalıkları bildikleri öldürme yöntemlerini yavru balinaya öğrettiler. Hedef, insanların toplu halde yüzdükleri plajlar olacaktı. Plajlar, insan kanına boyanacaktı. Yavru balina, öldürürüm, parçalarım, diyordu ama onu plaja salmadan önce bir deneme yapmalıydı. Bakalım öldürebilecek miydi? Beş köpekbalığı yalnız yüzen insan aramaya başladı. Deniz fenerinin yakınında bir çocuk yüzüyordu. İlk kurban o olacaktı. Köpekbalıkları sahilden uzak kaldılar. Çocuğu ürkütmek istemiyorlardı. Yavru balina hızla çocuğa doğru yüzmeye başladı. Fenerin oralar derin demişti köpekbalıkları, çocuk demek ki, usta yüzücüydü. Yoksa onun ne işi vardı böyle derin yerde. Yavru balina kafasını suyun üstüne çıkardı, daha sonra gövdesi ve kuyruğu göründü. Çocuk, yavru balinayı hemen fark etti. Derin bir nefes alıp suya daldı. Balina yavruydu ama dört metre boyundaydı. Sahile doğru yüzmeye kalksa bunu başaramazdı, çünkü yavru balina ondan çok daha hızlıydı. Yetişmesi an meselesiydi. Bundan dolayı çocuk sahile paralel yüzüyordu. Yavru balina çocuğa yetişti, bir süre onunla yan yana yüzdü ve aniden dönerek ağzını açıp kapadı. Yavru balina köpekbalıklarının yanına döndüğünde:\n" +
                "\n" +
                "“ Görevimi başardım. Çocuğun işi tamam “ dedi.\n" +
                "“ Çocuğu parçaladın mı? “ diye sordu, başkan köpekbalığı.\n" +
                "“ Hayır, parçalamadım “ dedi yavru balina.\n" +
                "“ Parçalamadın mı? O zaman ne yaptın? “\n" +
                "“ Çocuğu yuttum. “\n" +
                "“ Yuttun mu? “\n" +
                "“ Evet, yuttum…Çocuk şimdi midemde. “\n" +
                "“ Öyle veya böyle, çocuğu öldürmüşsün işte. Seni kutlarım yavru balina. Biz yarın uzaklara gidip bir toplantıya katılacağız. Birkaç gün yokuz. Sen şu ilerdeki plaja git, yakaladığını ister parçala, ister yut. Sıradan bütün plajları dolaş. İnsanlara acıma yok. “\n" +
                "\n" +
                "Köpekbalıkları döndüğünde yavru balinayı buldular. Yavru balina yirmi insanı acımadan öldürdüğünü, insanların plajlara çıkamadığını, etrafa korku saldığını söyledi. Köpekbalıkları bu habere çok sevindiler. Ertesi gün bir köpekbalığı deniz fenerinin yakınındaki sahilde\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "yavru balinanın yuttum dediği çocuğu gördü. Başkanı bularak durumu anlattı. Başkan, bunun üzerine çok sinirlendi. Nefretle yavru balinanın üstüne gitti:\n" +
                "“ Hani yutmuştun o çocuğu, bak fenerin oradaymış. Sen bizimle dalga mı geçiyorsun? “ Köpekbalıklarının etrafını sardığını gören yavru balina:\n" +
                "“ Şey, yutmuştum ama hazmedemedim, kusuverdim. Çocuk midemi tekmelemişti. “\n" +
                "“ Sus, yalancı seni, çocuğu yutmadın, plajlara saldırmadın, bütün plajlar dolu. Hani plajlara kimse çıkamıyordu, hani etrafa korku salmıştın. Yalan, hepsi yalan. Madem öldüremiyorsun, ölürsün. Şimdi seni…”\n" +
                "Başkan köpekbalığı sözlerini tamamlayamadı, çünkü yavru balina:\n" +
                "“ Beni ne yaparsın? Sıktın artık, çekil önümden “ dedikten sonra, ona sert bir kafa vurarak denizin derinliklerine yolladı.\n" +
                "Yavru balinanın önü açılmıştı. Gücünün yettiği kadar hızlı yüzmeye başladı. Karşısı sahildi. Artık geriye dönüş yoktu. Peşinde sürüyle köpekbalığı vardı. Yakalarlarsa parçalarlardı. Yavru balina kendini sahile zor attı. Debelendi kumun üstünde biraz daha, biraz daha ilerledi. Gücü tükenince başını sıcacık kumun üstüne bıraktı. Çocuk yavru balinayı tanımıştı. Onun yanına geldi:\n" +
                "“ Ne oluyor, yavru balina? Neden sahile çıktın? “\n" +
                "“ Oh, sen miydin? Nasılsın çocuk? Adın neydi senin? “\n" +
                "“ Benim adım Mark. İyiyim de burada ne işin var? “\n" +
                "“ Benim adım de Sili. Geçenlerde tanışmıştık, hatırladın mı? “\n" +
                "“ Hatırladım. Bir süre yan yana yüzmüştük, sonra sen gitmiştin. Üstüme gelirken beni yiyeceksin sanıp korkmuştum.”\n" +
                "“ Kim? Ben mi seni yiyecektim? O bir şakaydı. Seni korkuttuğum için özür dilerim. Beni affet.”\n" +
                "“ Affettim gitti. Anlat bakalım Sili, neler oluyor? Neden denizde değil de buradasın? “\n" +
                "Yavru balina olanları anlattıktan sonra:\n" +
                "“ Ya, işte böyle Mark, köpekbalıkları peşimde, sayıları yirmiden fazla. Onlarla yalnız başıma çarpışamam. Acı gerçek ama benim için böylesi daha iyi olacak. “\n" +
                "“ Köpekbalıkları toplantıya gittiğinde kaçıp gitseydin uzaklara veya balinalardan yardım isteseydin? “\n" +
                "“ Kaçsam kısa zamanda yakalanırdım. Kurtuluşu yoktu. Okyanustaki bütün köpekbalıkları peşime düşerdi. Balinalardan yardım isteyemezdim, çünkü bu korkunç bir savaşın başlangıcı olurdu. Yüzlerce balina ve köpekbalığı birbirine girerdi. Arada belki ben de ölürdüm. Oysa şimdi sadece ben ölüyorum, hiçbir balinayı tehlikeye atmıyorum. Bir benim için başkalarının keyfini kaçıramam. Sili ölürse kıyamet kopmaz. Hayat devam eder. Dünya uzayda nokta kadar, fakat Sili dünyada nokta kadar bile değil. “\n" +
                "“ Annen yaşasaydı köpekbalıkları sana sokulamazdı. Bu duruma düşmezdin. “\n" +
                "“ Onun orası öyle de annemi insanlar öldürdü. Asıl suçlu annemi öldüren insanlar. Mark, sence insanlar annemi neden öldürdü? “\n" +
                "“ Kazanç uğruna. Bazıları kendileri kazansın diye can alıyorlar. Öldürürken düşünmezler ki, balinanın yavrusu ne olacak? Yavru annesiz ne yapacak? Örneğin; annesiz, babasız bir çocuk ne olur, ne yapar, nasıl yaşar? Çocukken bunu düşünen biri büyüdüğünde diğer canlıların hayatına saygı duyar, onlara zarar vermez. Tanrı şahidimdir ki, ben insan olsun, diğer canlı varlıklar olsun hiçbirine zarar vermeyeceğim. Yemin ediyorum. “\n" +
                "“ Seni seviyorum, Mark.”\n" +
                "“ Ben de seni seviyorum, Sili. “")

        landmarkList.add(yavruBalinaİleKopekBaligi)

        val cizmeliKedi=Landmark(" Çizmeli Kedi "," Bir zamanlar, üç oğlu olan bir değirmenci varmış. Değirmenci ölünce büyük oğluna değirmen, ortanca oğluna eşek, küçük oğluna da kedi miras kalmış. Küçük oğlu bu duruma çok üzülmüş.\n" +
                "\n" +
                "“Kedi ne işine yarar ki insanın?” diye yakınmış. “Pişirip yiyemezsin bile.” Kedi bunu duymuş ve hemen cevap vermiş. “Kötü bir mirasa sahip olmadığınızı göreceksiniz efendim. Bana boş bir çuval ve bir çift de çizme verirseniz, neye yarayacağımı görürsünüz.”\n" +
                "\n" +
                "Şaşkınlıktan ağzı bir karış açık kalan çocuk, kedinin istediklerini yapmış. Kedi çizmeleri giyince ayna karşısına geçmiş ve kendini pek beğenmiş. Sonra kilerden taze bir marulla güzel bir havuç seçip ormanın yolunu tutmuş. Ormanda çuvalın ağzını açmış, marulla havucu çuvalın içine yerleştirip bir ağacın arkasına saklanmış. Çok geçmeden taze sebzelerin kokusunu alan küçük bir tavşan çuvalın yanına gelmiş, zıplayıp içine atlamış. Kedi saklandığı yerden çıkıp çuvalın ağzını sıkı sıkı bağlamış.\n" +
                "\n" +
                "Ancak Çizmeli Kedi tavşanı efendisine götürmek yerine doğruca saraya gidip Kral’la görüşmek istediğini söylemiş. Kral’ın huzuruna çıktığında yere eğilerek, “Yüce Efendimiz, size Efendim Marki’den bir hediye getirdim,” demiş. Bu hediye Kral’ın çok hoşuna gitmiş.\n" +
                "\n" +
                "Üç ay boyunca Çizmeli Kedi saraya o kadar çok hediye götürmüş ki, Kral artık onun yolunu gözler olmuş. Derken Çizmeli Kedi’nin dört gözle beklediği gün nihayet gelmiş çatmış. “Bana sakın neden diye sormayın ve bu sabah ırmağa gidip yıkanın,” demiş sahibine. Çizmeli Kedi, o sabah Kral’ın Prenses’le, yani kızıyla birlikte ırmağın kenarından geçeceğini biliyormuş.\n" +
                "\n" +
                "O sabah, Kral’ın faytonu ırmağın yakınından geçerken Çizmeli Kedi telaşla yanlarına yaklaşmış. “Yardım edin! Yardım edin!” diye bağırmış. “Efendim Marki boğuluyor!” Kral hemen bir alay askerini ırmağa yollamış.\n" +
                "\n" +
                "Fakat Çizmeli Kedi bununla da kalmamış. Kral’a, efendisi ırmakta yüzerken hırsızların onun elbiselerini çaldıklarını söylemiş. (Oysa Çizmeli Kedi, efendisinin elbiselerini çalıların arkasına kendisi gizlemiş!) Kral, hiç gecikmeden Marki’ye bir takım elbise yollamış. Tahmin edeceğiniz gibi Çizmeli Kedi’nin sahibi, kendisine Marki denmesine çok şaşırmış, ama akıllılık edip hiç sesini çıkarmamış.\n" +
                "\n" +
                "Marki güzelce giyindirildikten sonra Kral onu gideceği yere götürmek için faytonuna davet etmiş ve kızıyla tanıştırmış. Prenses,\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "iki dirhem bir çekirdek giyinmiş olan Marki’ye bir bakışta âşık olmuş.\n" +
                "\n" +
                "O sırada Çizmeli Kedi koşa koşa oradan uzaklaşmış. Çok geçmeden büyük bir tarlada ot biçen insanlara rastlamış. “Beni dinleyin!” diye bağırmış. “Kral bu yöne doğru geliyor. Size bu tarlaların kime ait olduğunu sorarsa ona efendim Marki’ye ait olduğunu söyleyeceksiniz. Yoksa sizi dilim dilim doğrattırırım!”\n" +
                "\n" +
                "Sonra Çizmeli Kedi bir süre daha koşmuş ve büyük bir tarlada buğday biçen adamlara rastlamış. Aynı şeyi onlara da söylemiş. Sonra tekrar koşmuş ve her rastgeldiği insana aynı şeyleri tekrarlamış. Derken Dev’in şatosuna varmış.\n" +
                "\n" +
                "Kral’ın Faytonu Çizmeli Kedi’nin geçtiği yerlerden geçerken Kral her rastgeldiği insana, “Bu tarlalar kime ait?” diye soruyormuş. Her defasında da aynı cevabı alıyormuş. Kral, Marki’nin bu kadar çok toprağa sahip olmasına şaşırmış. (Çizmeli Kedi’nin sahibi de öyle!)\n" +
                "\n" +
                "O sırada Çizmeil Kedi Dev’in şatosunda başka bir işler çevirmekle meşgulmüş. “Dev,” demiş Çizmeli Kedi, Dev’in nefesinin kokusundan iğrendiğini gizlemeye çalışarak. “Senin aynı zamanda müthiş bir sihirbazlık gücünün olduğunu söylüyorlar, doğru mu?”\n" +
                "\n" +
                "“Öyle diyorlarsa, öyledir,” demiş Dev alçakgönüllülükle.\n" +
                "\n" +
                "“Örneğin, istersen hemen bir aslana dönüşebildiğini söylüyorlar,” demiş Çizmeli Kedi. Bunu söyler söylemez Dev hemen kendini bir aslana dönüştürüvermiş. Çizmeli Kedi kendini dolabın üzerine zor atmış. Dev tekrar eski haline dönünce dolaptan aşağı inmiş. “Mükemmel!” demiş Çizmeli Kedi. “Ama fare gibi küçük bir şeye dönüşmek senin gibi cüsseli biri için imkânsız olmalı!”\n" +
                "\n" +
                "“İmkânsız mı?” diye gülmüş Dev. “Benim yapamadığım şey yoktur!” Dev bir anda fareye dönüşmüş, Çizmeli Kedi de onu hemen yutmuş.\n" +
                "\n" +
                "Derken Kral, Dev’in şatosuna varmış. Şatonun artık kime ait olduğunu tahmin etmişsinizdir herhalde! Çizmeli Kedi Kral’ın faytonunu şatonun yolunda karşılamış. “Bu taraftan gelin,” demiş. “Sizi bir ziyafet bekliyor.” (Dev o gün birkaç arkadaşına bir ziyafet vermeyi planladığı için yemeklerle donatılmış büyük bir masa hazır bekliyormuş!”)\n" +
                "\n" +
                "O günün sonunda Çizmeli Kedi’nin sahibi Marki Prenses’le nişanlanmış. Bir hafta sonra da evlenmişler. Çizmeli Kedi’ye ne mi olmuş? Dokuz canından dokuzunu da sefa içinde sürmüş ve bir daha da fare avlamasına gerek kalmamış , ara sıra avlamış, o da kedi olduğunu unutmamak için")
        landmarkList.add(cizmeliKedi)

        val altinSacliKiz=Landmark(" Altın Saçlı Kız","Zamanın birinde, bundan çok yıllar önce. Saraylarda padişahların yaşadığı, meydanlarda okların atıldığı, pazarlarda altın sikkelerle alış veriş yapıldığı zamanın birinde... Güzel bir bahçenin tam ortasına kurulu bembeyaz bir ev varmış. Bu evde altın sarısı saçları olan güzel mi güzel, alımlı mı alımlı; al yanaklı, gül dudaklı, boylu poslu, Bukle adında bir genç kız anneciği ile beraber otururmuş.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Güzeller güzeli Bukle her sabah, babaannesinden kalma bir kemik tarak ile saçlarını taramayı pek severmiş. Bir saat, iki saat hiç bıkmadan tarar da tararmış yumuşacık saçlarını. Sonra da tarağın dişlerine takılan, bir de yere dökülen tellerini itinayla toplarmış. Onları pembe ipek mendilinin içine sarar bir çekmecede saklarmış.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Oturdukları beyaz evin bahçesi öyle güzel çiçeklerle bezeliymiş ki, kokuları siz deyin on mahalle, ben diyeyim yirmi mahalle öteden duyulurmuş. Renkleri o kadar canlı, o kadar başkaymış ki; bahçenin önünden her geçen durup bakar, hayran kalırmış bu güzelliğe. Bukle’nin annesi Menzile, bir çocuk gibi severmiş bu güzel çiçekleri. Okşarmış, öpermiş; her akşam güneş batınca dağların gerisine, ay ışığı altında sularmış tek tek. Laleler onu gördüklerinde daha dik durmaya, menekşeler kokularını her köşeye yaymaya, güller iri iri açmaya çalışırlar; güzellik yarışına girişirlermiş. Hem çiçeklerle yaşamak öyle kolay da değilmiş. Çabuk küser, çabuk solar, çabuk bükerlermiş boyunlarını. Pek nazlı, pek nazenin, pek hassas, pek narin, pek kırılgan imişler. Öyleymişler işte. Sevgi imiş asıl onları besleyip büyüten.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Menzile haftada bir kere, karanlık çöker çökmez Bukle’nin altın sarısı tellerinden birisini alır, bahçedeki o güzel çiçeklerden seçtiğinin içine usulca koyarmış. Ertesi sabah da aynı çiçek bir altın verirmiş Menzile’ye. Bu, kimseye duyurmak istemedikleri bir sırmış. Anne kız böyle yaşar giderlermiş işte. Kimseye zararları yokmuş. Kimseye de muhtaç değillermiş.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Ancak insanlar çeşit çeşitmiş. İyiler de çokmuş, kötüler de... Kimin iyi, kimin kötü olduğunu ise bilebilmek pek zormuş. Günlerden bir gün nasıl olduysa, kadının biri, bir köşede durur iken Menzile’nin çiçekten aldığı altını görüvermiş. Hayret etmiş, gözlerine inanamamış, dönüp bir daha bakmış \"gördüklerim doğru mu acep!\" diye. Hemen aklında türlü fikirler dolaşmaya, bu fikirler bir kurt gibi beynini kemirmeye başlamış. Sonunda bu fikirlere yenilip de aklınca bir plan hazırlamış. Üzerine eski püskü, yırtık pırtık giysiler geçirip elini yüzünü kire pasa bulayıp, varmış güzel bahçeli beyaz evin kapısına.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Menzile çıkmış bu perişan görünen kadının karşısına. \"Buyrun\" demiş gülümseyerek. Kadın iki büklüm durarak, kısık sesle \"misafir etseniz beni birkaç gün Allah rızası için\" demiş ve kapının önüne yığılıp kalmış. Menzile kadına pek acımış, haline pek üzülmüş. Hemen ana kız içeri taşımışlar kadını. Yatağa yatırıp üstünü örtmüşler. Merakla başında beklemeye başlamışlar. Bir süre sonra kadın açmış gözlerini \"su içsem\" demiş. Bukle bir koşu su getirmiş. \"Açım\" demiş bunun üzerine kadın. Bu sefer de Menzile koşmuş mutfağa, sıcak çorba getirmiş. Bir güzel karnını doyurmuş kadın. Ardından da açmış elerini, uzun uzun dua etmiş bu güzel insanlara:\n" +
                "\n" +
                " \n" +
                "\n" +
                "“Allah ne muradınız varsa versin.masalsitesi.com\n" +
                "\n" +
                "Sağlık, mutluluk, huzur dolsun eviniz.\n" +
                "\n" +
                "Tuttuğunuz altın, sofranız bereketli olsun.\n" +
                "\n" +
                "Eviniz sıcak, yüreğiniz ferah olsun.\n" +
                "\n" +
                "Yarınınız güzel, seveniniz bol olsun.\n" +
                "\n" +
                "Kötülük dokunamadan geçip gitsin çatınızın üzerinden.\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "..........”\n" +
                "\n" +
                " \n" +
                "\n" +
                "Bir güzel dualar etmiş ki kadın oturduğu yerden, Bukle ve Menzile pek sevinmişler. Menzile \"evin yoksa kal bizimle, yoldaş olursun bize\" demiş. Kadın hiç beklemeden hemen atılmış. \"Olur olur, kalırım\" diyerek bir çığlık bırakmış havaya. Kim ne düşünür nereden bilsin Menzile. Kimin niyeti nedir nasıl bilsin Menzile.\n" +
                "\n" +
                " \n" +
                "\n" +
                "O günden sonra birlikte yaşamaya başlamışlar beyaz evde. Güzel, temiz elbiseler vermiş Menzile kadına. Birlikte yiyip birlikte içmeye, birlikte gezip birlikte tozmaya, birlikte oturup birlikte kalkmaya kısa zamanda pek alışmışlar. Her sabah Bukle’nin altın sarısı saçlarını o tarar olmuş. Her teli itinayla toplamış, kimse görmeden bir kısmını ayırıp saklamış. Fırsat buldukça bahçeye çıkıp çiçeklere koymuş telleri. Ertesi sabah da bir bir toplamış altınları.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Günler geçmiş, haftalar geçmiş, aylar geçmiş. Kadın usanmış bu işten. Yorulmuş, bıkmış, “yeter artık” diyerek bir gece yarısı uyurken Bukle derin derin, mışıl mışıl; almış makası eline, altın saçını kökünden tutup kesmiş bir çırpıda.\n" +
                "\n" +
                " \n" +
                "\n" +
                "İşte o an olmuş ne olduysa, altın saçın her bir teli kocaman bir yılana dönüşüp atlamışlar kadının üstüne. Oracıkta sokup öldüreceklermiş neredeyse, Bukle \"durun\" demeseymiş. Kadın korkudan küçük dilini yutmuş da, bir dahi hiç konuşamamış. Ödü \"pat\" diye patlamış da aklı yerinden oynamış. O günden sonra da kiminle karşılaştıysa, saçının tellerini yaşmağının ucundan gösterip birşeyler geveler, birşeyler anlatmak istermiş. Lakin kimse ne dediğini bir türlü anlayamazmış bu deli kadının. Acıdıklarından eline ekmek parası tutuşturup yollarına devam ederlermiş.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Birgün bir sokağın köşesinde bağdaş kurmuş otururken ak sakallı bir dede gelip durmuş karşısında. Uzun uzun bakmış gözlerine bir şey okur gibi. Sonra da \"bir adam vardı buralarda yaşayan\" demiş kadına. \"Nalbant idi. Herkes sever, herkes hürmet eder, herkes pek güvenirdi ona. Bir sabah senin gibi o da gördü çiçeklerin verdiği altınları. Göz bir gördü mü, akıl bir yazdı mı kenara gözün gördüklerini insan kendini tutamaz olur. Günler boyu eline iş alamadı. Gelip gidenler niye çalışmıyorsun, hasta mısın? diye sordular uzun süre. Nalbant kimseyle tek kelime konuşmadı. Gözünün önünden çil çil altınlar gitmiyordu. Bir damla uyku girmedi gözüne. Sonra baktı ki olmayacak; eline koluna, diline kulağına bir de aklına hakim olamayacak. Her bir şeyini, neyi var neyi yoksa olduğu gibi bırakıp çekti gitti buralardan. Kimseler bir daha haber alamadı nalbanttan. Ne nereye gittiğini öğrendiler, ne de neler yaptığını duydular. Ben sana söyliyeyim mi ne oldu nalbanta?”\n" +
                "\n" +
                " \n" +
                "\n" +
                "Kadın gözleri yuvalarından fırlayacakmış gibi bakmış dedeye, karşısında duran bir canavarmış gibi. Devam etmiş ak sakallı dede konuşmaya. \"Nalbant şimdi padişahın sağ kolu. Vezir oldu memlekete. Eğer senin gibi tutamasaydı kendini, bu şehrin sokaklarında dolaşacak, adı deli nalbanta çıkacaktı belki de.\"\n" +
                "\n" +
                " \n" +
                "\n" +
                "Konuşması bitince dede yürüye yürüye uzaklaşmış kadının yanından. Onun arkasından bakakalan kadın saçını başını yola yola bağırmış da duyanlar gök yarıldı sanmış. Çocuklar öyle bir ağlamış ki üç gün üç gece susturamamışlar. Kediler korkup damdan dama atlaya atlaya başka şehirde miyavlamaya gitmişler.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Bukle’nin saçları da kısa sürede uzamış, yine eskisi gibi taranacak hale gelmiş. Açgözlü olmanın, yalan söylemenin, kötü düşüncelerin ne kadar zararlı olduğunu da daha iyi öğrenmiş. Anne kız uzun yıllar mutlu bir şekilde, beyaz evlerinde, güzel çiçekleri ile yaşamaya devam etmişler. Bir daha da kimseye güvenip evlerine almayı hiç düşünmemişler.\n" +
                "\n" +
                " ")
        landmarkList.add(altinSacliKiz)

        val rapunzel=Landmark(" Rapunzel ","Bir zamanlar bir kadınla kocasının çocukları yokmuş ve çocuk sahibi olmayı çok istiyorlarmış. Gel zaman git zaman kadın sonunda bir bebek beklediğini fark etmiş.\n" +
                "\n" +
                "Bir gün pncereden komşu evin bahçesindeki güzel çiçekleri ve sebzeleri seyrederken, kadının gözleri sıra sıra ekilmiş özel bir tür marula takılmış. O anda sanki büyülenmiş ve o marullardan başka şey düşünemez olmuş.\n" +
                "\n" +
                "“Ya bu marullardan yerim ya da ölürüm” demiş kendi kendine. Yemeden içmeden kesilmiş, zayıfladıkça zayıflamış.\n" +
                "\n" +
                "Sonunda kocası kadının bu durumundan öylesine endişelenmiş, öylesine endişelenmiş ki, tüm cesaretini toplayıp yandaki evin bahçe duvarına tırmanmış, bahçeye girmiş ve bir avuç marul yaprağı toplamış. Ancak, o bahçeye girmek büyük cesaret istiyormuş, çünkü orası güçlü bir cadıya aitmiş.\n" +
                "\n" +
                "Kadın kocasının getirdiği marulları afiyetle yemiş ama bir avuç yaprak ona yetmemiş. Kocası ertesi günün akşamı çaresiz tekrar bahçeye girmiş. Fakat bu sefer cadı pusuya yatmış, onu bekliyormuş. “Bahçeme girip benim marullarımı çalmaya nasıl cesaret edersin sen!” diye ciyaklamış cadı. “Bunun hesabını vereceksin!”\n" +
                "\n" +
                "Kadının kocası kendisini affetmesi için yarvarmış cadıya. Karısının bahçedeki marulları nasıl canının çektiğini, onlar yüzünden nasıl yemeden içmeden kesildiğini bir bir anlatmış.\n" +
                "\n" +
                "“O zaman,” demiş cadı sesini biraz daha alçaltarak, “alabilirsin, canı ne kadar çekiyorsa alabilirsin. Ama bir şartım var, bebeğiniz doğar doğmaz onu bana vereceksiniz.” Kadının kocası cadının korkusundan bu şartı hemen kabul etmiş.\n" +
                "\n" +
                "Birkaç haftasonra bebek doğmuş. Daha hemen o gün cadı gelip yeni doğan bebeği almış. Bebeğe Rapunzel adını vermiş. Çünkü annesinin ne yapıp edip yemek istediği bahçedeki marul türünün adı da Rapunzel’miş. Cadı küçük kıza çok iyi bakmış. Rapunzel oniki yaşına gelince, dünyalar güzeli bir çocuk olmuş. Cadı bir ormanın göbeğinde, yüksek bir kuleye yerleştirmiş onu. Bu kulenin hiç merdiveni yokmuş, sadece en tepesinde küçük bir penceresi varmış.\n" +
                "\n" +
                "Cadı onu ziyarete geldiğinde, aşağıdan “Rapunzel, Rapunzel! Uzat altın sarısı saçlarını !” diye seslenirmiş. Rapunzel uzun örgülü saçlarını percereden uzatır, cadı da onun saçlarına tutuna tutuna yukarı tırmanırmış.\n" +
                "\n" +
                "Bu yıllarca böyle sürüp gitmiş. Bir gün bir kralın oğlu avlanmak için ormana girmiş. Daha çok uzaktayken güzel sesli birinin söylediği şarkıyı duymuş. Ormanda atını oradan oraya sürmüş\n" +
                "\n" +
                "Sponsorlu Bağlantılar\n" +
                "\n" +
                "ve kuleye varmış sonunda. Fakat sağa bakmış, sola bakmış, ne merdiven görmüş ne de yukarıya çıkılacak başka bir şey. Bu güzel sesin büyüsüne kapılan Prens, cadının kuleye nasıl çıktığını görüp öğrenene kadar hergün oraya uğrar olmuş. Ertesi gün hava kararırken, alçak bir sesle “Rapunzel, Rapunzel! Uzat altın sarısı saçlarını !” diye seslenirmiş. Sonrada kızın saçlarına tutunup bir çırpıda yukarı tırmanmış. Rapunzelönce biraz korkmuş, çünkü o güne kadar cadıdan başkası gelmemiş ziyaretine. Fakat prens onu şarkı söylerken dinlediğini, sesine aşık olduğunu anlatınca korkusu yatışmış. Prens Rapunzel’e evlenme teklif etmiş, Rapunzel’de kabul etmiş, yüzü hafifce kızararak.\n" +
                "\n" +
                "Ama Rapunzel’in bu yüksek kuleden kaçmasına imkan yokmuş. Akıllı kızın parlak bir fikri varmış. Prens her gelişinde yanında bir ipek çilesi getirirse, Rapunzel’de bunları birbirine ekleyerek bir merdiven yapabilirmiş.\n" +
                "\n" +
                "Her şey yolunda gitmiş ve cadı olanları hiç farketmemiş. Fakat bir gün Rapunzel boş bulunup da. “Anne, Prens neden senden daha hızlı tırmanıyor saçlarıma?” diye sorunca herşey ortaya çıkmış. “Seni rezil kız! Beni nasıl da aldattın! Ben seni dünyanın kötülüklerinden korumaya çalışıyordum!” diye bağırmaya başlamış cadı öfkeyle. Rapunzel’i tuttuğu gibi saçlarını kesmiş ve sonrada onu çok uzaklara bir çöle göndermiş.\n" +
                "\n" +
                "O gece cadı kalede kalıp Prensi beklemiş. Prens, “Rapunzel, Rapunzel! Uzat altın sarısı saçlarını !” diye seslenince. cadı Rapunzel’den kestiği saç örgüsünü uzatmış aşağıya. Prens başına neler geleceğini bilmeden yukarıya tırmanmış.\n" +
                "\n" +
                "Prens kederinden kendini pencereden atmış. Fakat yere düşünce ölmemiş, yalnız kulenin dibindeki dikenler gözlerine batmış. Yıllarca gözleri kör bir halde yitirdiği Rapunzel’e gözyaşları" +
                "dökerek ormanda dolaşıp durmuş ve sadece bitki kökü ve yabani yemiş yiyerek yaşamış.Derken bir gün Rapunzel’in yaşadığı çöle varmış. Uzaklardan şarkı söyleyen tatlı bir ses gelmiş kulaklarına.\n" +
                "\n" +
                "“Rapunzel! Rapunzel!” diye seslenmiş. Rapunzel, prensini görünce sevinçten bir çığlık atmış ve Rapunzel’in iki damla mutluluk göz yaşı Prensin gözlerine akmış. Birden bir mucize olmuş, Prensin gözleri açılmış ve Prens görmeye başlamış.\n" +
                "\n" +
                "Birlikte mutlu bir şekilde Prensin ülkesine gitmişler. Orada halk onları sevinçle karşılamış. Mutlulukları ömür boyu hiç bozulmamış.")

        landmarkList.add(rapunzel)

        val kulkedisi=Landmark(" Külkedisi ","Bir varmış, bir yokmuş. Günlerden bir gün, güzeller güzeli bir genç kız varmış. Annesi ölünce babası yeniden evlenmiş. Üvey annesi de ilk evliliğinden olan iki kızıyla birlikte gelip eve yerleşmiş. Bu iki kız, yeni kız kardeşlerinden hiç hoşlanmamış. Odasında ne var ne yoksa tavan arasına fırlatıp atmışlar. Ona bir kardeş gibi davranmak şöyle dursun, bütün ev işlerini üzerine yıkmışlar.\n" +
                "\n" +
                "Ev işleri bittikten sonra bile kızın onlarla oturmasına izin verilmiyormuş. Akşamları, mutfakta, sönmekte olan ocağın önünde duruyormuş tek başına, ellerini küllere doğru tutup ısınmaya çalışarak. Bu yüzden üvey kız kardeşleri ona “Külkedisi” adını takmışlar.\n" +
                "\n" +
                "Bir gün iki kız kardeşe sarayda verilecek bir balo için davetiye gelmiş. İkisi de heyecandan deliye dönmüşler. Herkes Prens’in evlenmek istediğini biliyormuş. ‘Bakarsın ikimizden birini seçer, belli mi olur?’ diye düşünmüşler.\n" +
                "\n" +
                "İki kız kardeş de kendilerini mümkün olduğunca güzelleştirmek için hemen kolları sıvamışlar. Fakat maalesef bu biraz zormuş, çünkü Külkedisi’nin aksine bayağı çirkinmiş her ikisi de!\n" +
                "\n" +
                "Balo akşamı, üvey kardeşleri gittikten sonra Külkedisi mutfakta oturmuş ve için için ağlamaya başlamış. “Neyin var, neden ağlıyorsun Külkedisi?” diye sormuş bir kadın sesi.\n" +
                "\n" +
                "“Ben de baloya gitmek istiyordum,” demiş hıçkırarak Külkedisi.\n" +
                "\n" +
                "“Gideceksin öyleyse,” demiş ses. Külkedisi duyduğu sese doğru dönüp bakmış, şaşkınlıktan donakalmış.\n" +
                "\n" +
                "Güzel bir kadın duruyormuş yanı başında.\n" +
                "\n" +
                "“Ben senin peri annenim,” demiş kadın. “Şimdi kaybedecek zamanımız yok! Bana bir balkabağı getir hemen!”\n" +
                "\n" +
                "Külkedisi bir bal kabağı getirmiş. Peri annesi sihirli değneğiyle dokununca, balkabağı birdenbire altından bir fayton oluvermiş.\n" +
                "\n" +
                "“Şimdi de altı fare…” Külkedisi altı fare bulup getirmiş, peri annesi onları hemen ata dönüştürmüş.\n" +
                "\n" +
                "“Bir sıçan…” Onu da arabacı yapmış.\n" +
                "\n" +
                "“Ve altı kertenkele…” Onları da faytonun arkasında koşacak altı uşağa çevirivermiş.\n" +
                "\n" +
                "Nihayet Külkedisi’ne gelmiş sıra. Peri değneğiyle bir dokununca Külkedisi’nin yırtık, pırtık giysileri nefesleri kesecek harika bir elbiseye dönmüşmüş. Ayaklarında bir çift camdan ayakkabı pırıl pırıl parlıyormuş.\n" +
                "\n" +
                "“Bir şey var yalnız,” demiş Peri. “Gece yarısına kadar eve dönmelisin. Saat on ikide elbisen tekrar eski giysilerine, faytonun bal kabağına, atların fareye dönüşecek. Prens’in bunu görmesini istemezsin herhalde? Şimdi git, dilediğince eğlen.”\n" +
                "\n" +
                "O gece Külkedisi balonun yıldızı olmuş. Baloya katılan hanımlar (özellikle de iki üvey kız kardeşi) onun elbisesini çok beğenmişler ve terzisinin adını öğrenmek için ona yalvarmışlar. Beyefendilerin hepsi onunla dans etmek için birbirleriyle yarışmışlar.\n" +
                "\n" +
                "Prens ise götür görmez ona âşık olmuş! Ve o andan sonra hiç kimseye bu kızla dans etmek için izin verilmemiş. Saatler saatleri, dakikalar dakikaları kovalamış ve Külkedisi saat tam on ikiyi vuracağı sırada evde olması gerektiğini hatırlamış.\n" +
                "\n" +
                "“Gitme!” diye seslenmiş Prens arkasından, ama Külkedisi bir an bile durmadan koşup oradan uzaklaşmış. Sokağa çaktığında elbisesi tekrar eski elbiselerine dönüşmüş. Geriye kala kala camdan ayakkabıların bir teki kalmış. Diğer tekini nerede kaybettiğini bilmiyormuş.\n" +
                "\n" +
                "O gece Külkedisi uyuyana kadar ağlamış. Hayatının bir daha asla o geceki kadar harika olamayacağını düşünüyormuş. Ama bu doğru değilmiş. Ayakkabının diğer tekini sarayın merdivenlerinde bulmuşlar. Ertesi sabah Prens ev ev dolaşıp ayakkabıyı tek tek bütün genç kızlara denetmiş. “Bu ayakkabının dün gece karşılaştığım güzel sahibini bulamazsam yaşayamam,” demiş. Derken Külkedisi’nin evine gelmiş. Üvey kardeşleri ayakkabıyı denemişler. Olmamış. Ayaklarına girmemiş bile.\n" +
                "\n" +
                "Prens çok üzgünmüş, çünkü uğramadığı sadece birkaç ev kalmış. Tam oradan ayrılacakken evin hizmetçisi dikkatini çekmiş.\n" +
                "\n" +
                "“Hanımefendi,” demiş Prens Külkedisi’ne, “bir de siz deneseniz?”\n" +
                "\n" +
                "“O mu deneyecek? Ne münasebet!” diye haykırmış üvey kardeşler.\n" +
                "\n" +
                "Fakat Prens ısrar etmiş. Külkedisi’nin ne kadar güzel bir kız olduğu gözünden kaçmamış. Tabii ayakkabı Külkedisi’nin ayağına kalıp gibi oturmuş. Prens diz çöküp Külkedisi’ne evlenme teklif ederken iki üvey kardeşe de öfke ve kıskançlıkla olanları seyretmek kalmış. Külkedisi Prens’in teklifini tabii ki kabul etmiş.")
        landmarkList.add(kulkedisi)

        val guzelVeCirkin=Landmark(" Güzel ve Çirkin Masalı","Bir zamanlar zengin bir tüccar varmış. Üç kızı olan bu tüccarın kızlarının ikisi son derece bencilmiş. Ama üçüncüsü, yani adı Güzel olanı hem iyi hem de sevgi doluymuş.\n" +
                "\n" +
                "Bir gün tüccar, gemilerinin şiddetli bir fırtınada battığı haberini almış. Zavallı adam varını yoğunu kaybetmiş, geriye bir tek kasabadaki küçük evi kalmış. Açgözlü iki kardeş bu durumdan hiç hoşlanmamışlar. Yatakta yatmak ve oflayıp poflamaktan başka bir şey yapmaz olmuşlar. Evin bütün işleri Güzel’e kalmış.\n" +
                "\n" +
                "Bir zaman sonra tüccar kayıp gemilerinden birinin limana ulaştığını duymuş. Haberin doğru olup olmadığını öğrenmek için yola çıkmadan önce kızlarına, dönüşte size ne hediye getireyim, diye sormuş. Açgözlü iki kardeşin neşeleri hemen yerine gelmiş.\n" +
                "\n" +
                "“Elbiseler ve mücevherler!” isteriz demişler.\n" +
                "\n" +
                "“Peki ya sen Güzel?” diye sormuş tüccar.\n" +
                "\n" +
                "“Bir gül. O bana yeter,” demiş Güzel.\n" +
                "\n" +
                "Birkaç gün sonra tüccar evine dönmek üzere üzgün üzgün yola koyulmuş. Yine yoksulmuş, çünkü son gemiden ona kalan paraları da dolandırıcılara kaptırmış. Akşam karanlığı bastırırken bir ormana varmış. Orman hem karanlık, hem de soğukmuş. Şimşekler çakıyor, rüzgar yerden karları havalandırıyormuş. Uzaklardan kurtların uluma sesleri geliyormuş.\n" +
                "\n" +
                "Tüccar nereye gittiğini bilmeden atıyla birlikte karların üzerinde bata çıka saatlerce yol almış, derken birden ileride pencerelerinden dışarı parlak ışıklar sızan son derece güzel bir şato görmüş. Ama bu çok garip bir şatoymuş, çünkü şöminelerinde harıl harıl ateş yanmasına, bütün odaları gün gibi aydınlık olmasına rağmen ortada kimsecikler yokmuş. Tüccar seslenmiş, seslenmiş, cevap veren olmamış. Sonunda, beklemenin bir anlamı olmadığını anlayınca, atını ahıra bağlamış ve salondaki uzun masanın üzerinde hazır bekleyen yemeği yemiş. Sonra bir yatağa yatıp uyumuş.\n" +
                "\n" +
                "Sabah uyandığında onun için bırakılmış yeni giysiler bulmuş yanı başında. Aşağıda da güzel bir kahvaltı onu bekliyormuş.\n" +
                "\n" +
                "“Bu şato, bana acıyan iyi kalpli bir periye ait herhalde,” demiş tüccar.\n" +
                "\n" +
                "“Ona bir teşekkür edebilseydim keşke.”\n" +
                "\n" +
                "Tüccar şatodan ayrılırken, bahçedeki gülleri fark etmiş. ‘Hiç yoksa Güzel’e verdiğim sözü yerine getireyim,’ demiş içinden. Güllerden birini koparmış. Ama koparır koparmaz müthiş bir kükremeyle inlemiş her yan. Çalıların arkasından korkunç görünüşlü bir canavar çıkmış. Öylesine korkunçmuş ki, tüccar neredeyse korkusundan bayılacakmış.\n" +
                "\n" +
                "“Seni değer bilmez adam!” diye kükremiş Canavar. “Hayatını kurtardım! Seni besledim, giydirdim! Sen kalkmış güzel güllerimi çalıyorsun. Hemen ölmeyi hak ettin!”\n" +
                "\n" +
                "Tüccar Canavar’ın karşısında diz çökmüş. “Gülü kızlarımdan birine götürecektim efendim,” demiş.\n" +
                "\n" +
                "“Ben efendi falan değilim, bir Canavar’ım,” diye hırlamış yaratık. Sonra tüccarın tepesine dikilmiş. “O değerli kızlarına gelince… Git, sor bakalım onlara, hayatına karşılık içlerinden biri gelip benimle birlikte yaşar mı? Bu teklifimi kabul eden olmazsa, üç ay içinde öleceksin.”\n" +
                "\n" +
                "Tüccar gün ışığıyla aydınlanmış ormanın içinden, üzgün bir şekilde atını sürüp evine dönmüş. Evde iki bencil kız kardeş babalarının başından geçen korkunç maceraları dinlerken kıllarını bile kıpırdatmamışlar. Babaları onlara giysi ve mücevher getirmedi diey küplere binmişler. Ama Güzel onlar gibi yapmamış.\n" +
                "\n" +
                "“Baba, izin ver ben gideyim,” demiş hiç tereddüt etmeden.\n" +
                "\n" +
                "“Tabii sen gideceksin, suç senin,” demiş kardeşleri. “Gül isterim diye tutturmasaydın, Canavar babamızı öldürmeyi düşünmeyecekti.”\n" +
                "\n" +
                "Üç ay geçince tüccar şatoya Güzel’le birlikte gitmiş. Her şey orayı ilk gördüğü gibiymiş: etrafta yine kimsecikler yokmuş, sofra hazırmış. Yemeklerini yemeyi bitirdiklerinde Canavar ortaya çıkmış. Güzel korkusundan tir tir titremeye başlamış, çünkü Canavar babasının anlattığı kadar korkunçmuş, hatta daha da korkunç!\n" +
                "\n" +
                "“Buraya kendi isteğinle mi geldin?” diye sormuş Canavar.\n" +
                "\n" +
                "“Evet,” demiş Güzel.\n" +
                "\n" +
                "“O zaman baban sabah olunca buradan gidecek ve bir daha buraya hiç gelmeyecek.”\n" +
                "\n" +
                "Sabah olup da babası gidince Güzel tek başına kalmış. Önce bir süre ağlamış, ama sonra gördüğü rüyayı hatırlayıp biraz olsun rahatlamış. Rüyasında bir peri, “Üzülme, babanın hayatını kurtarmak için gösterdiğin bu cesaret karşılıksız kalmayacak,” demiş ona.\n" +
                "\n" +
                "‘Belki de bu yaşama alışırım,’ diye düşünmüş, neşesi yerine gelmiş azıcık. Bahçede dolaşmış, güllere bakarken içi hüzünle dolmuş. Sonra şatonun içini gezmiş. Oda kapılarından birinin üzerinde adının yazılı olduğunu görünce çok şaşırmış. Kapıyı açıp içeri bakmış. Oda tam istediği gibi döşeliymiş, kitaplarla, müzik aletleriyle doluymuş.\n" +
                "\n" +
                "‘Canavar beni burada rahat ettirmeye çalıştığına göre, bana zarar vermez herhalde,” diye düşünmüş Güzel.\n" +
                "\n" +
                "Sonra bir kitap almış eline. Kitabın üzerinde altın yaldızla, “Sevgili Kraliçem. Her isteğin emirdir benim için,” diye yazıyormuş.\n" +
                "\n" +
                "“Şu anda babamı görebilseydim keşke!” demiş Güzel yüksek sesle Bunu der demez odanın öte ucundaki aynada babasının görüntüsü belirmiş. Böylece Güzel’in yalnızlık duygusu ve ev hasreti biraz olsun geçmiş.\n" +
                "\n" +
                "O gece yemekte Canavar ortaya çıkmış. “Seni izlememe izin verir misin Güzel?” diye sormuş.\n" +
                "\n" +
                "“Buranın sahibi sizsiniz,” demiş Güzel.\n" +
                "\n" +
                "“Hayır,” demiş Canavar. “Şatom senin emrindedir. İstersen hemen giderim.” Canavar bir an duraksamış. “Yalnız bir şey soracağım. Beni çok mu çirkin buluyorsun?”\n" +
                "\n" +
                "Güzel ne diyeceğini bilmemiş önce. Sonra başını kaldırıp Canavar’a bakmış. “Bunu söylemek istemezdim, ama doğruyu söylemem gerek. Evet, çirkin buluyorum,” demiş.\n" +
                "\n" +
                "Güzel, yemeğini bitirince Canavar, “Benimle evlenir misin?” diye sormuş.\n" +
                "\n" +
                "“Hayır Canavar, asla,” demiş Güzel.\n" +
                "\n" +
                "Canavar derin bir iç geçirirken çıkardığı ses, tüm şatoda yankılanmış.\n" +
                "\n" +
                "Her gece saat dokuzda Canavar konuşmak için Güzel’in yanına geliyormuş. Güzel, gün geçtikçe Canavar’a alışmaya başladığını fark etmiş. Hatta geç kaldığında onu merak bile ediyormuş. ‘Keşke,’ diyormuş, ‘bu kadar çirkin olmasaydı! Keşke ikide birde bana evlenme teklif etmeseydi! Çünkü Güzel, Canavar’ın, evlilik teklifini geri çevirdiğinde çıkardığı o sesten çok korkuyormuş.\n" +
                "\n" +
                "Canavar bir gün, “Beni sevmeyebilirsin ama, beni bırakıp gitmemeye söz vermelisin,” demiş. Her günü birbirine benzeyerek üç ay böyle geçmiş.\n" +
                "\n" +
                "Derken bir gün Güzel aynada babasının hasta olduğunu görmüş. Hemen Canavar’a babasına bakmak için eve gitmek istediğini söylemiş.\n" +
                "\n" +
                "“Gidebilirsin, Güzel,” demiş Canavar. “Ama geri dönmezsen kederimden öleceğimi biliyorsun, değil mi? Korkarım ki, babanın yanında kalmak isteyeceksin ve dönmeyeceksin. Ama eğer fikrini değiştirir de dönmek istersen, yüzüğünü yatağının yanındaki sehpaya koyman yeterli. Sabah olduğunda şatomda açacaksın gözlerini.”\n" +
                "\n" +
                "“Bir hafta sonra döneceğim, söz,” demiş Güzel.\n" +
                "\n" +
                "Ertesi sabah Güzel, babasının evinde, kendi yatağında açmış gözlerini. Babası onu karşısında görünce çok sevinmiş, kendini daha iyi hissetmiş. O gün öğleden sonra, kısa süre önce evlenmiş olan kız kardeşleri babalarını ziyarete gelmişler. Eve geldiklerinde babalarının biricik kızını karşılarında görünce kıskançlıktan ve öfkeden çatır çatır çatlamışlar.\n" +
                "\n" +
                "“Dinle!” demiş iki kardeşten biri. “Ona bir oyun oynayalım. Burada bir hafta daha kalmasını sağlayalım. O zaman Canavar gelip onu öldürür.” Bağırıp çağırıp onu kötülemek yerine, iki kardeş gözlerine soğan sürüp Güzel’in karşısına yaşlı gözlerle çıkmışlar ve ondan ayrılmak istemedikleri için ağladıklarını söylemişler. Güzel bir hafta daha kalmaya söz vermiş.\n" +
                "\n" +
                "Çok geçmeden Güzel, Canavar’ı babasını özlediği kadar özlediğini fark etmiş. Bir gün rüyasında Canavar’ı şatonun bahçesinde kaskatı ve cansız yatarken görmüş. Uyandığında, ‘Benim yaptığım düpedüz acımasızlık!’ diye düşünmüş. Hemen yüzüğünü parmağından çıkarıp, başucundaki sehpanın üzerine koymuş. Sabah gözlerini Canavar’ın şatosunda açmış.\n" +
                "\n" +
                "O günün akşamı Canavar’ı beklemiş. Saat dokuz olmuş. Canavar gelmemiş. Dokuzu çeyrek geçmiş, ortalarda yok. Birden endişe içinde koşa koşa şatodan bahçeye çıkmış. Canavar bahçede boylu boyunca yatıyormuş. ‘Onun ölümüne neden oldum!’ diye düşünmüş Güzel. Hemen ona sarılmış. Canavar’ın kalbi hâlâ atıyormuş!\n" +
                "\n" +
                "“Artık dönmezsin diye düşündüm. Yemeden içmeden kesilip ölmeye hazırlandım,” demiş Canavar fısıltılı bir sesle.\n" +
                "\n" +
                "“Ama ben seni seviyorum Canavar!” demiş Güzel. “Seninle evlenmek istiyorum.”\n" +
                "\n" +
                "O anda tuhaf bir şey olmuş. Birden sanki şato daha bir güzel, daha bir ışıltılı hale gelmiş. Güzel bir süre etrafına bakınmış, sonra tekrar Canavar’a çevirmiş başını. Fakat Canavar yerinde yokmuş. Yattığı yerde şimdi genç ve yakışıklı bir prens duruyormuş.\n" +
                "\n" +
                "“Ben Canavar’ı istiyorum,” diye ağlamaya başlamış Güzel. Prens bu sırada ayağa kalkmış.\n" +
                "\n" +
                "“Canavar benim,” demiş. “Kötü bir peri bana büyü yapmıştı. Beni yüzüne bakılamayacak kadar çirkin bir yaratığa dönüştürmüştü. Bana benimle evlenmek istediğini söylemeseydin, hayatımın sonuna kadar öyle kalacaktım.”\n" +
                "\n" +
                "Prens Güzel’i şatoya götürmüş. Şatoda Güzel, babası ve rüyasında gördüğü iyi periyle karşılaşmış.\n" +
                "\n" +
                "“Gösterdiğin cesaretin ödülünü aldın,” demiş iyi peri Güzel’e.\n" +
                "\n" +
                "Peri sihirli değneğini sallamış. Birden şatodaki herkes Prens’in topraklarında bulmuş kendini. Orada halk coşku ve alkışlarla karşılamış Prens’i. Çok geçmeden Güzel ve Canavar evlenmişler. Dünyanın gelmiş geçmiş en mutlu Prens ve Prensesi olmuşlar.")

        landmarkList.add(guzelVeCirkin)


        val pamukPrensesVeYediCuceler=Landmark(" Pamuk Prenses ve Yedi Cüceler ","\n" +
                "\n" +
                "Bir varmış, bir yokmuş. Her yerin karla kaplı olduğu bir kış günüymüş. Bir kraliçe, sarayının pencerelerinden birinin arkasında bir yandan nakış işliyor, bir yandan da hayal kuruyormuş. Derken birden parmağına iğne batmış ve gergefin üstüne üç damla kan akmış.\n" +
                "\n" +
                "Kraliçe kan damlalarına bakar bakmaz, “Çocuğum kız olursa, teni kar gibi ak, yanakları kan gibi al, saçları da pencerenin çerçevesi gibi kapkara olsun,” diye geçirmiş içinden. Bu olaydan kısa bir süre sonra bir kız çocuğu getirmiş dünyaya. Kızı tıpkı içinden geçirdiği gibi bir kızmış. Ona Pamuk Prenses adını vermişler. Ne yazık ki kraliçe doğumdan birkaç saat sonra ölmüş.\n" +
                "\n" +
                "Bir yıl sonra Kral yeniden evlenmiş. Yeni Kraliçe çok güzel bir kadınmış. Güzelliğine güzelmiş, ama bir o kadar da kibirliymiş, kendisinden daha güzel birinin olabileceğini düşüncesine bile tahammül edemezmiş. Odasında sihirli bir aynası varmış. Her gün o aynanın karşısına geçer, saatlerce kendisini seyreder ve sonunda,\n" +
                "\n" +
                "“Ayna, ayna söyle bana En güzel kim bu dünyada,” Diye sorarmış. Ayna da hiç duralamadan, “Sizsiniz Kraliçem,” dermiş. Fakat, Pamuk Prenses on dört yaşına geldiğinde, bir gün ayna şöyle demiş: Güzelsiniz Kraliçem, güzel olmasına, Ama Pamuk Prenses sizden daha güzel.”\n" +
                "\n" +
                "Kraliçe bunu duyunca çok kızmış, öfkesinden ne uyku girmiş gözüne, ne de bir lokma yemek yiyebilmiş. ‘Ne yapmalı, ne etmeli?’ diye düşünüp durmuş günlerce. Sonra kararını vermiş ve sarayın avcısını çağırmış huzuruna.\n" +
                "\n" +
                "“Pamuk Prenses’i ormana götür ve orada öldür. Öldürdüğüne kanıt olarak da kalbiyle ciğerini sök, bana getir.” Avcı Pamuk Prenses’i ormana götürmüş, bıçağını çekmiş. Fakat Pamuk Prenses’in ağladığını görünce onu öldürmeye kıyamamış. Pamuk Prenses ağaçların arasına dalıp gözden kaybolurken, “Ben yapamadım, ama hava kararıncaya kadar bir ayı veya bir kurt benim yapamadığımı yapar nasıl olsa,” demiş.\n" +
                "\n" +
                "Yolda genç bir yabandomuzu çıkmış avcının karşısına. O da hayvanı oracıkta öldürmüş, kalbiyle ciğerini söküp Kraliçe’ye götürmüş. Ama Pamuk Prenses’i avcının düşündüğü gibi ne bir ayı ne de bir kurt yemiş. Akşam olup hava kararınca dağların ardında küçük bir eve gelmiş. Kapısını çalmış, açan olmamış. Cesaretini toplayıp içeri girmiş. İçeride üzeri yenmeye hazır yiyeceklerle dolu yedi küçük tabağın bulunduğu yedi küçük sandalyeli uzun bir masa varmış, duvar dibinde de yedi yatak diziliymiş. Beklemiş, beklemiş, ama kimsecikler gelmemiş. Çok aç ve çok yorgun olduğu için daha fazla bekleyememiş ve her tabaktan bir kaşık yemek almış, yedi yataktan yedincisine yatıp uykuya dalmış. Biraz sonra evin sahipleri eve dönmüşler. Dağların derinliklerinde bulunan bir gümüş madeninde çalışan yedi cücelermiş bunlar. Pamuk Prenses’i görünce, “Ne kadar güzel bir kız!” demişler." +
                "Sabah olup uyandığında Pamuk Prenses cüceleri görünce önce çok korkmuş, ama kısa bir süre sonra onlardan bir kötülük gelmeyeceğini, onların çok iyi insanlar olduklarını anlamış. Yedi cüceler Pamuk Prenses’ten evlerini çekip çevirmesini istemişler, o da hemen kabul etmiş. “Hoşça kal,” demişler yedi cüceler işe giderlerken. “Kapıyı kimseye açma. Eğer üvey annen burada olduğunu öğrenirse seni tekrar öldürmeye kalkar sonra.” Bir gün Kraliçe tekrar aynasının karşısına geçmiş. Aynadan şu cevabı alınca suratının aldığı şekli varın siz düşünün artık:\n" +
                "\n" +
                "“Güzelsin Kraliçem, buraların en güzeli sizsiniz Ama ne var ki, yüksek dağların ardında Cücelerin küçük, şirin evindeki Pamuk Prenses dünyalar güzeli.”\n" +
                "Bunu duyar duymaz Kraliçe hemen kolları sıvamış. Yaşlı bir satıcı kadın kılığına bürünmüş ve elinde içi kurdele dolu bir tablayla dağlara doğru çıkmış yola. Cücelerin evine varınca, “Kurdelelerim var, harika kurdeleler!” diye seslenerek kapıyı çalmış. Kimin geldiğine bakmak için pencereye çıkan Pamuk Prenses kurdeleleri görünce içi gitmiş. ‘Bunda ne kötülük olabilir ki!’ diye düşünerek kapıyı açmış.\n" +
                "\n" +
                "“Bunu mu beğendin güzelim?” demiş Kraliçe kurdeleyi Pamuk Prenses’in boynuna takarken. Sonra kurdeleyi sıktıkça sıkmış, ta ki Pamuk Prenses ölü gibi boylu boyunca yere uzanana kadar. O gece yedi cüceler Pamuk Prenses’i o halde bulmuşlar. Kurdeleyi kesmişler ve Pamuk Prenses hayata dönmüş tekrar. Böylece Kraliçe’nin elinden ikinci kez kurtulmuş Pamuk Prenses. Ertesi sabah Kraliçe anasının karşısına geçmiş yeniden. Aynadan Pamuk Prenses’in hâlâ yaşadığı haberini alır almaz hemen kılık değiştirmiş ve bir kez daha dağların yolunu tutmuş.“Taraklarım var, harika taraklar!” diye seslenmiş cücelerin evinin kapısında. Pamuk Prenses yaşlı kadının elinde tuttuğu tarafı görünce başına gelenleri unutuvermiş. Kapıyı açmış.\n" +
                "\n" +
                "“Saçların ne güzel, bırak ben tarayayım,” demiş Kraliçe. Ama tarak zehirliymiş, başına değer değmez Pamuk Prenses ölü gibi yere uzanmış. O gece yedi cüceler saçından tarağı almışlar ve Pamuk Prenses yeniden hayata dönmüş. Böylece Kraliçe’nin elinden üçüncü kez kurtulmuş Pamuk Prenses. Ertesi gün Kraliçe aynasının karşısına geçince, Pamuk Prenses’in hâlâ yaşadığını öğrenmiş. Öfkesi burnunda, bu kez en büyülü iksirini hazırlayıp bir elmanın yarısına sürmüş. Sonra da yaşlı bir dilenci kılığına girip yola koyulmuş. “Güzel kızıma tatlı bir elma benden, armağan,” demiş Kraliçe, pencereden bakan Pamuk Prenses’e. “Pencereden de verebilirim, kapıyı açmana gerek yok.” “Kötü diye mi almıyorsun yoksa,” demiş Kraliçe, Pamuk Prenses’in kararsız olduğunu görünce. Sonra da zehirsiz tarafından ısırmış ve, “Al bak harika!” diyerek uzatmış, yanakları gibi al al elmayı Pamuk Prenses’e. Pamuk Prenses elmayı zehirli tarafından ısırır ısırmaz cansız yere uzanmış." +
                "Kraliçe pencereden içeri, Pamuk Prenses’e bakmış. “Nihayet senden kurtuldum, artık dünyanın en güzeli benim,” demiş. Oradan doğruca saraya gitmiş. Erkesi gün aynaya kimin en güzel olduğunu sorduğunda ayna, “Sizsiniz Kraliçem,” deyince dünyalar onun olmuş. Bu sefer cücelerden hiçbiri Pamuk Prenses’i uyandıramamış ölüm uykusundan. Aradan üç gün geçmiş, bütün umutlarını kaybetmişler. Fakat nedense Pamuk Prenses hiç de ölü gibi durmuyormuş. O yüzden yedi cüceler onu gömmemişler ve camdan bir tabut içine koymuşlar, tabutu da yüksek bir tepenin en tepesine yerleştirmişler. Günlerden bir gün cüceleri ziyarete gelen bir Prens oradan geçerken camdan tabutun içinde Pamuk Prenses’i görmüş ve hemen ona aşık olmuş.“Onu sarayıma götürmeme izin verin,” diye yalvarmış Prens. Yedi cüceler ona acımışlar ve izin vermişler. Prens’in uşakları tabutu kaldırırken Pamuk Prenses’in boğazına takılmış olan zehirli elma parçası pat düşmüş ağzından. Pamuk Prenses doğrulmuş nerede olduğunu anlamadan, gözünü açmış, yakışıklı Prensi karşısında görmüş. Görür görmez ona âşık olmuş. Birkaç hafta sonra nişanlanmışlar.\n" +
                "\n" +
                "Derken düğün günü gelip çatmış. Düğüne çağrılanlar arasında Pamuk Prenses’in üvey annesi de varmış. Üvey annesi sarayın salonuna girer girmez Pamuk Prenses’i tanımış, ama bu sefer bir şey yapmaya fırsat bulamamış. Çünkü Prens’in adamları Kraliçe’yi hemen yakalamış, Prens de onu artık kötülük yapamayacağı uzak bir ülkeye sürgün etmiş. O günden sonra Pamuk Prenses, güzelliğinin yanı sıra mutluluğuyla da ün salmış.")

        landmarkList.add(pamukPrensesVeYediCuceler)

        val aglayanElmaİleGulenElma=Landmark(" Ağlayan Elma ile Gülen Elma","Bir varmış bir yokmuş. Evvel zamanda bir padişah ve üç de oğlu varmış. Bunlar vatanlarında mutlu bir yaşam sürerlermiş. Minik oğlan bigün köşkünde otururken, sokaktaki çeşmeden su almak için bir kocakarının geldiğini görmüş. Oğlan ninenin testisine ufak bir taş atmış ve testiyi kırmış. Nine bir şey söylemeden evine dönmüş. Bir testi daha alıp gene çeşmeye gelmiş. Oğlan bu sefer de bir taş atıp testiyi kırmış. Nine sessiz bir şekilde evine geri dönmüş. Ertesi gün testi elinde gene çeşmeye gelmiş. Oğlan, ninenin geldiğini yukarıdan görüp derhal eline bir taş daha almış. Uygun aniden atıp gene testiyi kırmış. Nine başını kaldırmış:\n" +
                "\n" +
                "-Hey oğul, bir şeycikler demem.. Dilerim Mevla’dan, ağlayan elma ile gülen elmaya aşık olasın demiş, çekip gitmiş. Oğlan da aradan birkaç gün geçince ninenin söylediğini kendine dert etmeye başlamış. Hakikaten ağlayan elma ile gülen almaya aşık olmuş. Günden güne sararıp solmaya başlamış. Oldukca geçmeden padişah, oğlunun hastalandığını işitmiş. Hekimler bir türlü derdini anlayamamışlar. Günlerden bigün kente bir doktor gelmiş. Bakması için saraya çağırmışlar. Doktor:\n" +
                "\n" +
                "-Bunun hastalığı sevdadan başka bir şey değil demiş. Oğlan da en sonunda ağlayan elma ile gülen elmaya aşık bulunduğunu babasına söylemiş. Babası oldukça üzülmüş:\n" +
                "\n" +
                "-Şimdi nasıl yapsak, oğlum? Biz onu nerede buluruz demiş Oğlan: -Ben gider onu bulurum.. Yeter ki siz izin verin diye yanıt vermiş. Padişah; -Oğlum, bu hal ile nereye gideceksin? Onun kim bulunduğunu, nerede bulunduğunu bilmezsin. Vazgeç bu sevdadan. Dediyse de oğlan kanmamış.\n" +
                "\n" +
                "-Ne olursa olsun gidip bulacağım demiş. Ağabeyleri de babalarına;\n" +
                "\n" +
                "-Ikimiz de onunla beraber gideriz. Kardeşimizi yalnız bırakmaz, bu elmaları ne olursa olsun buluruz demişler. Bunlar yol hazırlığı yapmışlar. Üçü beraber yola düşüp bilmedikleri ülkelere, kentlere doğru yürümeye başlamışlar. Azca gitmiş uz gitmişler; dere tepe düz gitmişler… En sonunda bir çeşme başına gelmişler. Çeşmenin taşının üstünde bir yazı görmüşler. Taşta şunlar yazılıymış:\n" +
                "\n" +
                "“Karşıdaki üç yolun birine giden gelir, birine giden ya gelir ya gelmez, öbürüne giden hiç gelmez”\n" +
                "\n" +
                "Büyük oğlan;\n" +
                "\n" +
                "-Giden gelir yola ben gideyim demiş.\n" +
                "\n" +
                "Ortanca oğlan da;\n" +
                "\n" +
                "-Giden ya gelir ya gelmez yola da ben gideyim demiş. Giden gelmez yola gitme de ufak oğlana kalmış.\n" +
                "\n" +
                "Büyük oğlan;\n" +
                "\n" +
                "-Gittiğimiz yerden hangimiz ilkin gelirse, ötekilerin gelip gelmediğini nereden bilsin? demiş Minik oğlan ileri atılmış:\n" +
                "\n" +
                "-Parmaklarımızdaki yüzükleri çıkarıp şu taşın altına koyalım. Kim ilkin gelirse taşı kaldırsın yüzüğünü alsın. Sonrasında gelen de kimin dönerek dönmediğini bilsin. Bu şekilde yapmışlar. Her biri istediği yola gitmiş. Büyük oğlan “giden gelir” yoluna çıkmış. Azca gitmiş, uz gitmiş; bilmediği bir ülkeye varmış. Orada, ‘Giren çıkandan bir şeyler öğrenirim’ umuduyla bir hamama girmiş. Hamamda tellak olarak çalışmaya başlamış. Ortan oğlan “giden ya gelir ya gelmez” yoluna koyulmuş. Azca gitmiş uz gitmiş… Günlerden bigün bir ülkeye varmış. Orada bir kahveye girerek çalışmaya başlamış. Sonunda kahveci olup orada kalmış. Minik oğlan da “giden gelmez” yoluna düşmüş. O da azca gitmiş, uz gitmiş. Oldukca uzun yollarda yürümüş. Otura kalka, gide gide bigün bir çeşme başına gelmiş. Bakmış ki bir nine bu çeşmeden su dolduruyor. Oğlan yanına gitmiş…\n" +
                "\n" +
                "—Nineciğim, beni bu akşam evinde konuk eder misin demiş. Nine de;\n" +
                "\n" +
                "—Ah oğul, benim bir evim var… Yattığım süre ayaklarım dışarı çıkar. Ben kendim sığamıyorum, seni nerede konuk edeyim diye yanıt vermiş. Minik oğlan yaşlı hanıma bir avuç altın vermiş:\n" +
                "\n" +
                "-Aman nine, ne olur bana yatacak bir yer bul diyince nine altınların hatırına;\n" +
                "\n" +
                "-Gel oğul gel… Evim de var odam da.. Senden başka kimi konuk edeyim? Deyip, oğlanı evine götürmüş. Evde birazcık yemiş içmişler. Otururken oğlan sormuş:\n" +
                "\n" +
                "-Aman nine, bir ağlayan elma ile gülen elma varmış… Nerededir onlar bilir misin? Nine bunu duyunca oğlana bir tokat vurmuş.\n" +
                "\n" +
                "—Sus! Onların adını anmak yasaktır… Bunun üstüne oğlan çıkarmış bir avuç altın daha vermiş. Nine sevinerek;\n" +
                "\n" +
                "-Oğlum, yarın kalkarsın, şu karşıki dağa giderisin. Oraya bir çoban gelir. O çoban, ağlayan elma ile gülen elmanın olduğu sarayın çobanıdır. Onun gönlünün yapmış olup saraya girebilirsen elmaları orada bulursun. Fakat elmaları aldıktan sonrasında doğruca benim yanıma gelesin demiş. Oğlan da sabahleyin kalkmış. Kadının tarif etmiş olduğu dağa gitmiş. Bakmış ki orada bir çoban koyun otlatıyor. Gidip çobana merhaba vermiş… Oturup konuşmaya başlamışlar. Sonrasında oğlan ağlayan elma ile gülen elmayı çobana söylemiş. Çoban da tıpkı yaşlı kadının yapmış olduğu şeklinde bu sözü işittiği anda oğlana bir tokat vurmuş. Tokatı yiyen oğlanın aklı başından gitmiş.\n" +
                "\n" +
                "—Aman çoban kardeş bana niçin vurdun? Diyince çoban tekrardan üzerine yürümüş.\n" +
                "\n" +
                "—Sus daha konuşuyorsun, o şekilde mi? Diye bir tokat daha vurmuş.\n" +
                "\n" +
                "—Onun sözü burada yasaktır, demiş. Oğlan çobana yalvarmış yakarmış, bir avuç altın vermiş… Çoban altınları görünce yumuşamış. Oğlana demiş ki:\n" +
                "\n" +
                "-Ben şimdi bir koyun keserim. Onun derisini tulum çıkarırım. O tulumun içine girersin. Akşamüzeri ben koyunları sürüp saraya giderken sen de koyunların içinde saraya girersin. Şundan dolayı saraya girerken koyunları sayarlar. Sen de koyun şeklinde yürüyüp kendini bildirmeyerek sürüyle beraber içeri girersin. Geceleyin, hepimiz uyuyunca, en yukarı kata çıkar sessiz bir şekilde sağ taraftaki odaya girersin. Padişahın kızı yatakta yatar, elmaları da rafta durur. Onları, uyandırmadan alabilirsen alırsın… Eğer kız uyanırsa bağırır… Seni yakalarlarsa iş kötü olur.\n" +
                "\n" +
                "Çoban bu tarz şeyleri söyledikten sonrasında kalkmış bir koyun kesmiş. Koyunun tulum şeklinde çıkardığı derisine oğlanı sokmuş. Koyunların içine katarak doğruca saraya gitmiş. Nöbetçiler koyunları saraydan içeri girerken saymışlar. Oğlan da sürüyle beraber içeri girmiş. Gece olmuş, hepimiz uyumuş. Saat dörde beşe gelirken oğlan tulumdan çıkmış. Yavaş yavaş en yukarı kata gidip çobanın söylediği odayı bulmuş. Açıp bakmış ki orta yerde bir yatak, içinde de ayın on dördü şeklinde güzel bir kız yatıyor… Oğlan ona bakarken, raf üstünde bulunan elmaların biri kahkaha ile gülmeye diğeri de hüngür hüngür ağlamaya başlamışlar. Bu tarz şeyleri işiten oğlan derhal kapıyı kapamış olduğu şeklinde firar etmiş, doğruca koyunların yanına gitmiş. Elmaların gürültüsüne yatakta yatan kız uyanmış. Bakmış ki kimsecikler yok. Odanın dışına çıkmış, öteye bakmış, beriye bakmış… Kimseyi bulamayınca içeri girmiş:\n" +
                "\n" +
                "-Sizi gidi yalancılar sizi… Beni aldattınız. Diyerek elmalara kızmış. Tekrardan yatağa yatmış. Aradan kısa bir süre geçince kız yine uyumuş. Oğlan da tekrar yukarı çıkmış. Yavaş yavaş odanın kapısını açmış, içeri girmiş. Elmalara doğru bir iki adım atmış. Bu sırada tekrardan elmaların biri gülmeye, biri ağlamaya başlamış. Oğlan korkusundan gene firar etmiş. Kız uyanmış, bakmış ki kimsecikler yok…\n" +
                "\n" +
                "—Hay gidi edepsizler hay. İkidir beni uykudan uyandırıyorsunuz. Gene bir şey yapmış olursanız sizi döverim, demiş ve tekrardan yatmış. Kız uyuyunca oğlan gene gelmiş, kapıyı açıp elmaların yanına yaklaşmış. Elini uzatıp raftan alayım derken elmalar gene gülüp ağlamaya başlamış ve oğlan gene korkup firar etmiş. Kız uyanıp bakmış ki kimsecikler yok:\n" +
                "\n" +
                "-Sizi gidi arsızlar sizi. Bu gece deli mi oldunuz? Üç keredir beni uykudan uyandırıyorsunuz. Bu iyi mi iş? Deyip, bir tokat birine, bir tokat ta ötekine vurmuş. Sonrasında tekrardan yatağına girip yatmış. Aradan epeyce zaman geçmiş. Oğlan gene odaya girmiş ve rafa yaklaşmış. Elmanın birini eline almış… Bakmış ki ses yok… Öbürünü de alıp dışarı çıkarmış. Doğruca koyunların arasına gidip tulumun içine girmiş. Meğer elmalar kıza, kendilerine kızmış olduğu için darılmışlar, bu yüzden ses çıkarmazlarmış. Sabah olmuş… Çoban koyunları saraydan çıkarmış ve dağa doğru gitmiş. Oğlan, saraydan uzaklaşınca kimsenin olmadığı bir yerde tulumdan çıkmış. Çobana bir avuç altın daha vermiş.\n" +
                "\n" +
                "—Allaha ısmarladık, deyip doğru ninenin evine gelmiş. Nine oğlanı görünce derhal bir leğenin içine birazcık su koymuş. Bir tavuk keserek kanını suya akıtmış. Suyun içine bir tahta koyup oğlanı tahtanın üzerine oturtmuş. Kız sabah olup da uykudan uyanınca, aşağı bakmış, yukarı bakmış ki rafta elmalar yok.\n" +
                "\n" +
                "—Eyvah! Bu gece elmalarım çalındı. Onlar beni üç kere uyandırdılar fakat ben anlayamadım; meğerse hırsız gelmiş diye ağlamaya başlamış. Padişah bunu duyunca sarayın kapılarını kapattırmış. Hatta şehrin etrafındaki kalenin kapılarını da kapatarak gireni çıkanı sıkı sıkı arattırmış. Şehrin içini de aramışlar, bir türlü bulamamışlar. Falcılar fal bakmışlar. Sonunda görmüşler ki elmaları alan kanlı bir denizde gemiyle gidiyor.\n" +
                "\n" +
                "—Padişahım, demişler; -Bu adam oldukça uzaklara gitmiş. Bu kanlı deniz nerededir bilemeyiz… Sonunda bu elmaları aramaktan vazgeçmişler artık. Kalenin kapıları eskiden olduğu şeklinde açılmış. Oğlan nineye birazcık daha altın verdikten sonrasında -Eyvallah deyip oradan çıkmış. Geldiği yoldan dönmeye başlamış. Gide gide bigün, ağabeyleriyle ayrılmış olduğu çeşme başına gelmiş. Yüzüklerini koydukları taşı kaldırıp bakmış ki hiçbiri gelmemiş. Kendi yüzüğünü almış ve ufak ağabeyinin gittiği yola gitmiş. Azca gitmiş uz gitmiş, dere tepe düz gitmiş… Bigün bilmediği bir ülkeye varmış. Yolunun üstündeki bir kahveye girmiş. Bitkinlik çıkarmak için kahve çubuk içmiş. Bakmış ki ağabeyi orada kahvecilik ediyor. Yaklaşmış yanına, fakat kahveci olan ağabeyi onu tanımamış. Bir ara oğlan ağabeyini yanına çağırmış. Söz içinde:\n" +
                "\n" +
                "-Sen nerelisin? Filan derken, ağabeyi anlamış ki kendisiyle konuşan kardeşidir. Sonrasında beraber kalkmışlar geri dönmek için yola koyulmuşlar. Şurası burası derken gene o çeşmeye gelmişler. Taşı kaldırıp bakmışlar ki, ağabeyleri gelmemiş. Ortanca oğlan da yüzüğünü almış. Ağabeylerini aramak amacıyla onun gittiği yola gitmişler.\n" +
                "\n" +
                "—Kardeşim, bunlar birazcık bizde dursun, sonrasında gene sana veririz, demişler. O da; -Pekiyi deyip vermiş. Sonrasında bu iki ağabey birbirlerine;\n" +
                "\n" +
                "-Biz bunu öldürelim; şu elmaların biri sende biri bende kalsın demişler. Yol üstünde bir kahveye rast gelmişler. O kahvenin bahçesinde birazcık oturup yiyecek yiyelim demişler. Kahveciden bir hasır istemişler, kahveci de derhal getirmiş. Bahçede ağzı açık bir kuyu varmış. Hasırı o kuyunun üzerine yaymışlar. Minik oğlan kuyuyu görmemiş… Hasırın üzerine oturmuş olduğu şeklinde kendisini kuyunun dibinde bulmuş. Ağabeyleri birazcık oturmuşlar. Yiyecek yiyip karınlarını doyurmuşlar. Kahve, tütün içmişler. Azca sonrasında gene yola düşüp ülkelerine doğru gitmişler. Kuyuda su olmadığı için, aşağıya düşen oğlan ölmemiş, fakat bayılıp kalmış. Ağabeyleri ülkelerine varmışlar. Babaları ufak kardeşlerinin nerede bulunduğunu sormuş. Onlar da;\n" +
                "\n" +
                "-Biz gittik, ağlayan elma ile gülen elmayı bulup getirdik. O, bir giden gelmez yola gitmişti, tekrar gelmedi, demişler. Babaları da üzülmüş, ağlamışsa da;\n" +
                "\n" +
                "-Elbet gelir diyerek kendini avutmuş. Onlar babalarının yanında oturmada olsun, birazcık sonrasında, kuyuya düşen oğlanın aklı başına gelmiş. Kuyunun içinde yukarıya doğru bağırmaya başlamış. O sırada kahveci bahçede gezerken bir de bakmış ki kuyudan bir ses geliyor. En sonrasında kuyuya bir adam sarkıtmışlar ve oğlanı çıkarmışlar.\n" +
                "\n" +
                "—Sen buraya iyi mi düştün diye sorunca oğlan da başına gelenleri tek tek anlatmış. Sonrasında kalkıp kendi ülkesine gitmiş. Fakat babasının sarayına gitmemiş. Başına bir işkembe geçirmiş ve keloğlan kılığına girerek bir kalaycı dükkânına girmiş. Orada çırak olarak çalışmaya başlamış. Gel süre git süre, hepimiz kendi yaşamını yaşamaya devam etmiş… Fakat ağlayan elma ile gülen elmanın sahibi olan kız oldukça büyük üzüntü içindeymiş. Kızın padişah babası bin taneli bir tespih yaptırmış ve adamlarına vermiş.\n" +
                "\n" +
                "—Bu tespihi alın, ülke ülke gezin. Kim başına geleni anlatarak bu tespihi bitirinceye kadar çekebilirse bu elmaları o almıştır… Onu tutup bana getirin, demiş. Adamlar tespihi almışlar. Çeşitli ülkelere gitmişler. Gezmişler, dolaşmışlar fakat kimse o tespihi çekememiş. En sonunda bu elmaları çalan oğlanın ülkesine gelmişler. Tam o kalaycının önünden geçerlerken, oğlan ustasına;\n" +
                "\n" +
                "-Usta, ben başıma gelenleri anlatırken bu tespihi çekerim, demiş. Ustası adamlara haber vermiş. Onlar da tespihi getirmişler:\n" +
                "\n" +
                "-Haydi bakalım, hem anlat hem de çek demişler. Oğlan o süre;\n" +
                "\n" +
                "-Ben bunu çekerim fakat buranın padişahının yanında çekerim demiş. Oradan oğlanı alıp padişahın yanına getirmişler. Olan biteni padişaha anlatmışlar. Oğlan oturmuş, başına gelenleri tek tek anlatmış. Ayrıca tespihi çekmeye de başlamış. Tam kardeşlerinin onu kuyuya attıklarını söylediği sırada tespih bitmiş. Padişah da bu oğlanın kendi ufak oğlu bulunduğunu anlayıp, derhal kalkmış onun boynuna sarılmış.\n" +
                "\n" +
                "—Vah oğulcuğum, senin başına bunca işler gelmiş de benim haberim olmamış diyerek ağlamaya başlamış. Adamlar oğlanı alıp diğeri padişaha götürmek istemişler. Fakat ilkin elmaları alan iki büyük oğlanın cellât elinde cezaları verilmiş. Sonrasında da ufak oğlanı elmalarla birlikte diğeri padişahın ülkesine göndermişler. Azca gitmişler, uz gitmişler… Gide gide bigün gene, elmaların çalışılmış olduğu ülkeye ulaşıp, bu oğlanı padişahın yanına götürmüşler. Padişah oğlanı görünce ona kanı kaynamış. O tespihi bir de kendi önünde çekmesini istemiş. Oğlan gene tespihi alıp başına gelenleri baştan sona kadar anlatmış ve tespihi de çekmiş. Padişah;\n" +
                "\n" +
                "-Oğlum, sen bu elmaları âşık olduğun için çaldın. Fakat benim kızım da bunlara âşıktır. Gel, kızımı sana vereyim, ikiniz de bu elmalardan ayrılmayın demiş. Oğlan da: -Baş üzerine deyip padişahın söylediğini kabul etmiş. Minik oğlanla kız evlenmişler. Kırk gün kırk gece düğün yapmışlar. Onlar ermiş muradına, biz çıkalım kerevetine…")

        landmarkList.add(aglayanElmaİleGulenElma)

        val kucukPrens=Landmark(" Küçük Prens","Yerimden sıçradım. Şimşek çarpmışa dönmüştüm. Gözlerimi ovuşturdum ve dikkatle etrafıma baktım. Ne gördüm dersiniz? Şaşılacak derecede ufak bir adam evladı gözlerini dikmiş, ciddi ciddi bana bakıyordu. Gördüğünüz bu resmi sonradan yaptım. Onun çizebildiğim en iyi resmiydi. Fakat kesinlikle gerçeğinin yarısı kadar bile güzel olmadığını söylemeliyim. Doğal ki bu benim suçum değil. Altı yaşımdayken büyükler yüzünden fotoğraf kariyerime son vermek zorunda kalmış, boa yılanını dıştan ve içten gösteren resimler haricinde hiçbir şey çizmeyi öğrenememiştim.\n" +
                "\n" +
                "Nereden geldiğini öğrenmem oldukça uzun sürdü. Bana bu kadar oldukça sual soran ufak prens, benimkileri asla duymuyordu. Her neyse ki sordurulmuş olduğu soruların cevaplarını biliyordum. Şu saçma dünyada oradan oraya dolaşmak işe yaramıştı.\n" +
                "\n" +
                "Mesela, uçağımı ilk gördüğünde “Şu nesne de nedir?” diye sormuştu. (Ne yazık ki size uçağımı çizemeyeceğim, bundan dolayı bana gore oldukça karmaşık bir şey bu.)\n" +
                "\n" +
                "“ O bir nesne değil, benim uçağım. Gökyüzünde uçar.”\n" +
                "\n" +
                "Ona uçabildiğimi söylemekten de gurur duymuştum doğrusu. Bunun üstüne “ Ne? Yani gökten mi düştün?” diye haykırdı.\n" +
                "\n" +
                "“Evet dedim alçakgönüllü bir tavırla.\n" +
                "\n" +
                "“ Ah ne keyifli.” Sonrasında da kahkahalarla gülmeye başladı ufak prens. Bu oldukça canımı sıkmıştı. Talihsizliğimle alay edilmesinden pek hoşlanmam.\n" +
                "\n" +
                "“ O halde sen de gökyüzünden geliyorsun” dedi. “ Peki hangi gezegenden?”\n" +
                "\n" +
                "Bir şey yakaladığımı anlamıştım ve derhal onu sorguya çektim.\n" +
                "\n" +
                "“ Yani sen başka bir gezegenden mi geldin?”\n" +
                "\n" +
                "Fakat soruma yanıt vermedi. Kibarca başını salladı. Bir taraftan da bakışlarıyla uçağımı inceliyordu.\n" +
                "\n" +
                "“Bununla pek fazla uzaktan geliyor olamazsın…”\n" +
                "\n" +
                "Gözleri daldı. Uzun bir süre sonrasında cebinden çizdiğim koyun resmini çıkararak bu yeni hazinesini incelemeye koyuldu. Bu ‘ başka bir gezegen’ mevzusunda bana kati bir yanıt vermemesinin merakımı iyi mi artırdığını tahmin edebilirsiniz. Doğal ki ben de daha fazlasını öğrenmeye çalıştım.\n" +
                "\n" +
                "“ Nereden geliyorsun sen küçük dostum? Sözünü ettiğin bu ‘benim yaşadığım yer’ neresi? Çizdiğim koyunu nereye götüreceksin?”\n" +
                "\n" +
                "Geldiği gezegen bir evden daha büyük değildi. Fakat aslen bu beni pek de şaşırtmadı. Dünya, Jüpiter, Mars ve Venüs benzer biçimde büyük gezegenlerin haricinde isimsiz yüzlerce gezegen bulunduğunu biliyordum. Bu gezegenlerin bazıları o şekilde küçüktür ki, onları teleskopla bile fark etmek güçtür. Gökbilimciler bunlardan birini ortaya çıkardıklarında, ona isim yerine bir numara verirler. Mesela, ‘ Asteroid 325’ derler ona.\n" +
                "\n" +
                "Küçük prensin geldiği gezegenin Asteroid B-612 bulunduğunu zannediyorum. Bu şekilde düşünmek için iyi nedenlerim var. Bu asteroid yalnızca bir kez, bir Türk gökbilimci tarafınca 1909 senesinde görüldü. Gökbilimci bu keşfini bir Internasyonal Astronomi Kongresi’nde deklare etti. Fakat garip giysileri yüzünden kimse ona inanmadı. Büyükler böyledir işte.\n" +
                "\n" +
                "Asteroid-B-612 ile alakalı bu açıklamaları yalnız büyükler için yapıyorum. Onlar şekillerden hoşlanırlar. Onlara yeni tanıştığınız bir arkadaştan bahsetseniz, asla en mühim soruları sormazlar. Size arkadaşınızın sesinin iyi mi bulunduğunu, hangi oyunları tercih ettiğini, ya da kelebek koleksiyonu yapmış olup yapmadığını hiçbir vakit sormazlar. “ Kaç yaşlarında? Kaç kardeşi var? Babası kaç lira kazanıyor? “ benzer biçimde şeyler merak ederler. Sadece bu tarz şeyleri bildiklerinde onu tanımaya başladıklarını düşünürler.\n" +
                "\n" +
                "Onlara “ Pembe tuğlalardan yapılmış bir ev gördüm, pencerelerinin kenarında sardunyalar, çatısında güvercinler vardı” diyecek olsanız, bu şekilde bir evi hayal edemezler. Onlara “ Yüz bin dolar değerinde bir ev gördüm “ demeniz gerekir. O vakit “ Ah, ne kadar güzel bir ev ! “ diyeceklerdir.\n" +
                "\n" +
                "İşte bu şekilde. Bu yüzden de onlara “ Küçük prens oldukça güzeldi, kahkaha atıyordu ve bir koyun istemişti. İşte bunlar onun var bulunduğunun kanıtıdır “ deseniz, omuzlarını silkecek ve size çocuk muamelesi yapacaklardır. Fakat “ Onun geldiği gezegen Asteroid B-612 “ derseniz, size inanacaklar ve sorular sormaya başlayacaklardır. Onlar bu şekilde işte. Bu zayıflıklarından yararlanmak doğru olmaz. Evlatların yetişkinlere karşı daima anlayışlı olmaları gerekir.\n" +
                "\n" +
                "Fakat yaşamı hakikaten anlayan bizlerin, şekillere ihtiyacı yoktur. Hikayeme masal anlatır benzer biçimde başlayabilirdim. “ Bir zamanlar bir ufak prens vardı, kendisinden pek de büyük olmayan bir gezegende yaşardı ve bir arkadaşa ihtiyacı vardı “ diyebilirdim. Yaşamı hakikaten anlayan hepimiz, bunu daha gerçekçi bulurduk…\n" +
                "\n" +
                "Her gezegende olduğu benzer biçimde, ufak prensin gezegeninde de yararlı ve zararı dokunan bitkiler vardı anlaşılan. Yararlı tohumları yararlı bitkiler, zararı dokunan tohumları ise zararı dokunan bitkiler meydana getiriyordu. Fakat tohumlar görünmezdirler. Toprağın derinliklerinde uyurlar. Sonrasında bigün bir tanesi uyanmaya karar verir. Ilkin ürkek ürkek gerinir. Sonrasında yüzünü güneşe çevirmiş sempatik bir filiz olarak çıkar ortaya. Bu haliyle tamamen zararsızdır. Eğer bu bir turp filizi ya da gül fidanıysa, dilediği benzer biçimde büyümesine izin verilir. Yok eğer yabani bir bitkiyse, derhal sökülmelidir. İşte ufak prensin gezegeninde de bu şekilde zararı dokunan tohumlar vardı. Bunlar baobap tohumlarıydı. Küçük gezegenin her yerini salgın etmişlerdi. Eğer bir baobap filizini zamanında sökmezseniz, ondan tekrar asla kurtulamazsınız. Gezegenin her yerini kaplar. Kökleri toprağın derinliklerine doğru ilerler. Eğer gezegeniniz oldukça küçükse ve baobaplar da fazlaysa, o vakit gezegen patlayabilir.\n" +
                "\n" +
                "“ Bu bir terbiye meselesi “ demişti ufak prens daha sonraları. Sabahleyin kendi bakımınızı yaptıktan sonrasında, sıra gezegenin bakımına gelir. Bunu büyük bir dikkatle yapmalısınız. Küçük baobap filizleri gül fidanlarından ayırt edilebilecek kadar büyüdüklerinde, onları sökmelisiniz. Bu can sıkan bir iştir, fakat oldukça kolaydır.”\n" +
                "\n" +
                "Bir keresinde güneşin batışını tam kırk dört kez izlediğini anlatmıştın bana. Sonrasında da şu şekilde demiştin: “ Bilirsin, insan çok mutsuz olduğu zamanlarda güneşin batışını izlemeyi sever.”\n" +
                "\n" +
                "“ Peki sen mutsuz muydun? “ diye sormuş, fakat cevap alamamıştım senden.\n" +
                "\n" +
                "Beşinci gün, ufak prensin yaşamıyla ilgili yeni bir sırrı daha keşfettim. Bu gene çizdiğim koyun yardımıyla olmuştu. Sanki bu mevzuyu uzun süre düşünüp taşınmış benzer biçimde, ansızın bana “ Koyunlar çalıları yiyorlar, peki çiçekleri de bölgeler mi? “ diye sordu.\n" +
                "\n" +
                "“ Önlerine gelen her şeyi bölgeler. “\n" +
                "\n" +
                "“ Dikenli çiçekleri de mi? “\n" +
                "\n" +
                "“ Evet, dikenli çiçekleri de.”\n" +
                "\n" +
                "“ O halde dikenler…Dikenler ne işe yarar? “\n" +
                "\n" +
                "Bunun yanıtını bilmiyordum. Uçağın motorunda sıkışıp kalmış bir cıvatayı sökmekle meşguldüm. Uçağın bozulması canımı giderek daha çok sıkmaya başlamıştı. İçme suyum hızla azalıyordu ve ben durumun daha da kötüleşmesinden korkmaya başlamıştım.\n" +
                "\n" +
                "“ Dikenler diyordum…Ne işe yararlar? “ diye sordu gene. Küçük prens, sordurulmuş olduğu probleminin yanıtını almadıkça sormaktan vazgeçmiyordu. Bense cıvatayı sökmekle meşguldüm ve aklıma gelen ilk şeyi söyleyiverdim:\n" +
                "\n" +
                "“ Dikenler hiçbir işe yaramaz. Çiçekler onları sırf kızgınlıktan taşırlar.”\n" +
                "\n" +
                "“ Ah, demek o şekilde! “\n" +
                "\n" +
                "Sonrasında kısa bir sessizlik oldu ve peşinden, birazcık da kırgın bir sesle “ Sana inanmıyorum. Çiçekler narin yaratıklardır. Saftırlar. Dikenlerinin korkulu bulunduğunu düşünürler “ dedi. Yanıt vermedim. O sırada kendi kendime şu şekilde diyordum:\n" +
                "\n" +
                "“ Eğer bu cıvata yerinden çıkmamakta direnme ederse, onu çekiçle çıkaracağım.”\n" +
                "\n" +
                "Fakat ufak prens gene araya girdi : “Yani sen gerçekten çiçeklerin o dikenleri kızgınlıktan taşıdıklarına mı inanıyorsun?”\n" +
                "\n" +
                "“Hayır, hiçbir şeye inanmıyorum ben. Öylesine söyledim. Şu anda mühim bir işim var. “\n" +
                "\n" +
                "Şaşkınlıklar içinde kalmıştı ufak prens.\n" +
                "\n" +
                "“ Mühim bir iş mi? “\n" +
                "\n" +
                "Beni elimde çekiç, parmaklarım motorun yağından simsiyah olmuş bir halde o çirkin şeyin ( doğrusu uçağımın ) üstüne eğilmiş gören ufak dostum: “İşte şimdi tam da büyükler benzer biçimde konuştun “ dedi.\n" +
                "\n" +
                "“ Milyonlarca senedir çiçeklerin dikenleri var. Ve milyonlarca senedir koyunlar çiçekleri yiyorlar. Çiçeklerin hiçbir işlerine yaramayan dikenleri niçin büyüttüklerini anlamaya çalışmak gereksiz bir şey mi? Çiçekler ve koyunlar arasındaki harp önemsiz mi? O kırmızı suratlı beyefendinin şemalarından daha ciddi ve daha mühim değil mi bunlar? Ve evrende başka hiçbir gezegende yetişmediğini bildiğim bir çiçeğim var ise ve ufak bir koyun onu bir sabah, ben fark etmeden, tek bir ısırıkta yok ederse, bu önemsiz bir şey midir? “\n" +
                "\n" +
                "Yüzü kıpkırmızı olmuştu. Konuşmasını sürdürdü: “ Eğer bir insan milyonlarca yıldızın arasındaki tek bir gezegende yetişen bir çiçeği severse, bu onu mutlu etmeye yetecektir. Zira yıldızlara baktığında ‘ Benim çiçeğim oralarda bir yerlerde ‘ diyebilir. Fakat bu koyun çiçeğini yerse, o vakit tüm yıldızlar ansızın kararmış benzer biçimde gelir ona. Ve sen bunun mühim olmadığını düşünüyorsun! “ Daha çok konuşamamıştı, bundan dolayı gözyaşlarına boğulmuştu…\n" +
                "\n" +
                "Akşam olmuştu. Takımları bir kenara bırakmıştım. Herhalde çekicim, cıvatam, susuzluğum ve ölümüm bana şu an olduğundan daha önemsiz gelemezdi. Milyonlarca yıldızın içinde, bir gezegende, benim gezegenimde, rahatlatmam ihtiyaç duyulan bir ufak prens vardı! On kollarıma aldım ve yavaşça salladım. “ Çiçeğin için hiçbir çekince yok. Koyununa bir ağızlık çizeceğim… Çiçeğin için bir çit çizeceğim… Ben… Ben…” Ona iyi mi ulaşacağımı, onu iyi mi rahatlatacağımı bilemiyordum. Bu gözyaşı seli o şekilde tuhaftı ki…\n" +
                "\n" +
                "Yoruldu ve kumların üstüne oturdu. Ben de yanına oturdum. Kısa bir sessizlikten sonrasında:\n" +
                "\n" +
                "“Yıldızlar çok güzel… Çünkü içlerinden birinde, şu an göremediğim bir çiçek yaşıyor” dedi.\n" +
                "\n" +
                "“Elbette” dedim. Sessiz bir şekilde ay ışığının altındaki kum tepeciklerini izledim.\n" +
                "\n" +
                "“Çok de çok güzel” dedi sonrasında.\n" +
                "\n" +
                "Hakikaten güzeldi. Çölleri hep sevmişimdir. Bir kum tepeciğinin üzerine oturursun. Hiçbir şey görmezsin. Hiçbir şey işitmezsin. Bir tek çölün o sessiz, gizemli ışıltısını hissedersin.\n" +
                "\n" +
                "“Çöl çok güzel” dedi ufak prens, “çünkü bir yerlerinde bir kuyu gizliyor.”\n" +
                "\n" +
                "Bense çölün o gizemli ışıltısının farkına varmış, şaşırmıştım. Küçük bir çocukken oldukça eski bir evde otururduk. Burada bir hazinenin gizli saklı bulunduğunu anlatmışlardı kim bilir. Fakat bu öykü evimizi esrarengiz bir ev yapmıştı. Benim evim, ruhunun derinliklerinde bir sır saklıyordu…\n" +
                "\n" +
                "“Evet,” dedim, “ne bir evin, ne yıldızların, ne de çölün güzelliğinin nereden geldiği bilinmez.”\n" +
                "\n" +
                "“Benimle aynı fikirde olmana çok sevindim” dedi ufak prens.\n" +
                "\n" +
                "Uykuya dalınca, onu kollarıma aldım ve yine yürümeye koyuldum. Fazlaca duygulanmıştım. Sanki elimde oldukça narin bir gömü taşıyordum. Hatta dünyadaki en narin şeydi bu sanki. Ay ışığında onun solgun alnını, kapalı gözlerini ve rüzgarda titreyen buklelerini seyrettim. Kendi kendime şu şekilde dedim:\n" +
                "\n" +
                "“Bu gördüklerim sadece bir kılıftan ibaret. En önemli şeyi gözler göremez.”\n" +
                "\n" +
                "Ona bakarken dudakları aralandı ve uykusunda hafifçe gülümsedi. “Burada uyuyan şu küçük prensin beni böylesine duygulandırmasının nedeni, onun bir çiçeğe olan bağlılığı. Uyurken bile, bu çiçeğe olan sevgisi tüm benliğini bir kandil gibi aydınlatıyor.”\n" +
                "\n" +
                "Şimdi daha da narindi sanki. Kandilleri oldukça dikkatli korumalıyız. Şiddetli bir rüzgar onları söndürebilir.Böylece yürümeye devam ettim ve gün ağarırken kuyuyu buldum.\n" +
                "\n" +
                "“İnsanlar,” dedi ufak prens, “ne aradıklarını bilmeden hızlı trenlere doluşuyorlar. Endişe ve telaşla, aynı yerde dönüp duruyorlar.” Bir an durakladıktan sonrasında ekledi: “Çektikleri sıkıntıya değmez bu.”\n" +
                "\n" +
                "Bulduğumuz kuyu Sahara Çölünün malum kuyularından değildi. Sahara Çölü’ndeki kuyular kumda açılmış çukurlardan ibarettir. Fakat bizim bulduğumuz kuyu kasabalardaki kuyulardandı. Oysa etrafta kasaba filan yoktu. Düş gördüğümü sandım.\n" +
                "\n" +
                "“Ne kadar garip” dedim ufak prense, “her şey hazır durumda. Makara, kova, ip, hepsi hazır.” Güldü. Makarayı çevirmeye koyuldu. Uzun süredir çalışmamaktan paslanmış olan makara, inlemeye başladı.\n" +
                "\n" +
                "“Duyuyor musun?” dedi ufak prens. “Kuyuyu uyandırdık. O da şarkı söylemeye başladı…” Onun yorulmasını istemiyordu. “Bana bırak” dedim.\n" +
                "\n" +
                "“Senin için fazla ağır.”\n" +
                "\n" +
                "Kovayı ağır ağır çektim ve kuyunun kenarına bıraktım. Kovanın içindeki su hala titriyordu ve makaranın sesini hem kulaklarımda, hem de titreyen suda duyabiliyordum. Güneşin titrek ışıltılarını görebiliyordum.\n" +
                "\n" +
                "“Bu sudan içmek istiyorum” dedi ufak prens, “bana biraz su verir misin?”\n" +
                "\n" +
                "İşte şimdi onun ne aradığını anlamıştım! Kovayı dudaklarına dayadım. İçerken gözleri kapalıydı. Bir bayram şekeri kadar tatlıydı bu su. Öteki besinlerin hepsinden farklıydı. Yıldızların altında meydana getirilen bir yürüyüşten, makaranın şarkısından ve kollarımın emeğinden dünyaya gelmişti. Kalbe faydalıydı. Bir armağandı sanki. Küçük bir çocukken Noel’de aldığım hediyenin güzelliği Noel ağacının ışıltısından, kutlamanın müziğinden, gülümseyen yüzlerin sıcaklığından gelirdi.\n" +
                "\n" +
                "“Senin yaşadığın yerdeki insanlar,” dedi ufak prens, “bir bahçenin içinde binlerce gül yetiştiriyorlar ve yine de aradıklarını bulamıyorlar.”\n" +
                "\n" +
                "“Doğru, bulamıyorlar” dedim.\n" +
                "\n" +
                "“Ve aslında aradıkları şeyi tek bir gülde, ya da bir avuç suda bulabilirlerdi.”\n" +
                "\n" +
                "“Evet, haklısın” dedim.\n" +
                "\n" +
                "“Ama gözler göremez. İnsanın kalbiyle bakması gerekir.”\n" +
                "\n" +
                "Bir tek “Bugün evime dönüyorum” diye fısıldadı. Sonrasında üzüntüyle ekledi: “Evim çok uzakta… Oraya gitmek çok zor olacak…”\n" +
                "\n" +
                "Beklenmedik bir şey olacağını hissedebiliyordum. Onu bir çocuk benzer biçimde kollarımda sımsıkı tutuyordum. Fakat o sanki ellerimden bir uçuruma doğru kayıyordu ve ben bunu engelleyemiyordum… Bakışları ciddiydi ve ötelerde kaybolup gidiyordu.\n" +
                "\n" +
                "“Bana verdiğin koyun yanımda. Kutusu da yanımda. Ve ağızlığı da…” dedi. Buruk bir gülümseme yayıldı yüzüne. Uzun bir süre öylece bekledim. Vücut ısısının giderek arttığını hissediyordum.\n" +
                "\n" +
                "“Küçük dostum benim, sen korkmuşsun…” Normal olarak korkmuştu! Fakat yavaşça güldü.\n" +
                "\n" +
                "“Bu gece çok daha fazla korkacağım” dedi.\n" +
                "\n" +
                "Bir kez daha, içimde onarılmaz bir acı duydum. Bu gülüşü bir kez daha duyamayacağımı düşünmek bile istemiyordum. Buna dayanamazdım. Gülüşü, çölün ortasında bir su deposu gibiydi benim için.\n" +
                "\n" +
                "“Küçük prens, gülüşünü tekrar duymak istiyorum” dedim.\n" +
                "\n" +
                "Fakat o bana : “Bu gece, Dünyaya ineli tam bir yıl oluyor. Gezegenim, geçen yıl Dünyaya indiğim yerin tam üstünde olacak bu gece.” dedi.\n" +
                "\n" +
                "“Küçük prens, lütfen bunun sadece kötü bir rüya olduğunu söyle bana” dedim, “şu yılan hikayesinin gezegenine geri döneceğinin…” Fakat sorumu yanıtlamadı ufak prens. Onun yerine bana: “En önemli şeyi gözler göremez” dedi.\n" +
                "\n" +
                "“Evet, biliyorum…”\n" +
                "\n" +
                "“Su için de aynı şey geçerli. Makaranın çıkardığı sesi hatırlıyor musun? İşte tam da bu makara ve ip yüzünden, bana verdiğin bir yudum su müzik sesi gibi güzeldi. Çok tatlıydı…”\n" +
                "\n" +
                "“Evet, biliyorum…”\n" +
                "\n" +
                "“Geceleri yıldızları izlersin. Benim yaşadığım yerde her şey o kadar küçük ki, sana gezegenimi gösterebilmem imkansız. Ama böylesi daha iyi. Çünkü içlerinden birinde benim yaşadığımı bileceksin. Hepsini seveceksin. Hepsi senin dostun olacak. Ve sana bir hediyem var…”\n" +
                "\n" +
                "Bir kez daha güldü.\n" +
                "\n" +
                "“Ah, küçük prens! Benim sevgili küçük prensim. Gülüşünü duymak çok güzel!”\n" +
                "\n" +
                "“Aslında benim hediyemdi bu… tıpkı su için olduğu gibi.”\n" +
                "\n" +
                "“Anlamıyorum…\n" +
                "\n" +
                "“ Yıldızlar, başka başka insanlara değişik şeyler ifade ederler. Bazıları için yalnız gökyüzünde titreyen ışıklardır. Yolcular içinse, bir rehberdirler. Bilim adamları için düşünce kaynağıdırlar. Şu benim iş adamı içinse zenginlik. Fakat hepimiz için sessizdirler. Sen hariç…”\n" +
                "\n" +
                "“ Ne demek bu?”\n" +
                "\n" +
                "“ Geceleri gökyüzüne baktığında, yıldızlardan birinde benim yaşadığımı ve orada gülüyor olduğumu bileceksin. Bu yüzden sana sanki tüm yıldızlar gülüyormuş benzer biçimde gelecek. Tüm dünyada yalnızca senin gülen yıldızların olacak. “ Ve bunu söyledikten sonrasında gene güldü.\n" +
                "\n" +
                "“ Ve üzüntün geçtiğinde –bundan dolayı vakit tüm acıları iyileştirir- beni tanıdığına memnun olacaksın. Daima benim dostum olarak kalacaksın. Benimle beraber gülmek isteyeceksin. Bazen, yalnız bunun için gidip pencereyi açacaksın… Gökyüzüne bakarken güldüğünü gören arkadaşların buna oldukça şaşıracaklar. Sen de onlara; “Ah, evet, yıldızlar beni hap güldürürler” diyeceksin. Onlar da senin deli bulunduğunu düşünecekler. Görüyorsun, sana ne kadar fena bir oyun oynadım…” Ve bir kez daha güldü.\n" +
                "\n" +
                "“Aslında ben sana bir sürü yıldız değil de, kahkaha atabilen bir sürü zil vermiş gibi oldum.” Gene güldü. Sonrasında ciddileşti. “Bu gece… biliyorsun… gelme…”\n" +
                "\n" +
                "“Seni bırakmayacağım.”\n" +
                "\n" +
                "“Dışarıdan acı çekiyormuşum gibi görünecek. Ölüyormuş gibi görüneceğim. Bunu görmeye gelme. Hiçbir işe yaramaz bu…”\n" +
                "\n" +
                "“Seni bırakmayacağım” dedim Endişelenmişti.\n" +
                "\n" +
                "“Sana böyle söylememin nedeni, biraz da yılan yüzünden. Sana zarar vermemeli… Yılanlar hain yaratıklardır. Zevk için insanı sokabilirler.”\n" +
                "\n" +
                "“Seni bırakmayacağım” dedim.\n" +
                "\n" +
                "Sonrasında birden rahatladı. “Yılanlar sadece bir kez zehirleyebilirler, öyle değil mi?” dedi. O gece yola çıktığını görmedim. Sessiz bir şekilde ayrılmıştı. Arkasından koşup ona yetiştiğimde, süratli ve emin adımlarla yürüdüğünü gördüm. Bana:\n" +
                "\n" +
                "“Ah! Buradasın…” dedi. Fakat sesi hala telaşlıydı.\n" +
                "\n" +
                "“Gelmemeliydin. Üzüleceksin. Öldüğümü sanacaksın, ama gerçekte ölmüş olmayacağım.” Sustum.\n" +
                "\n" +
                "“Anlaman gerekiyor. Orası çok uzak. Bedenimi oraya götüremem. Bunun için fazla ağır.” Hiçbir şey demedim…\n" +
                "\n" +
                "“Boşalmış bir deniz kabuğu gibi kalacağım…Bunda üzülecek bir şey yok…” Yanıt vermedim…\n" +
                "\n" +
                "Bir parça cesareti kırılmıştı. Son bir gayretle; “Biliyorsun, çok güzel olacak. Yıldızlara ben de bakacağım. Bütün yıldızlar paslanmış makaraları olan birer kuyu olacak benim için. Hepsi bana içecek su verecekler” dedi. Hiçbir şey demedim.\n" +
                "\n" +
                "“Çok eğlenceli olacak. Senin beş yüz milyon tane küçücük zilin olacak; benimse beş yüz milyon su kaynağım…”\n" +
                "\n" +
                "Ve artık o da hiçbir şey söyleyemedi, bundan dolayı gözleri yaşlarla doldu. “İşte burası. Bırak yalnız devam edeyim.”\n" +
                "\n" +
                "Oturdu, bundan dolayı korkuyordu. Sonrasında; “Biliyorsun… Bir çiçeğim var… Ona karşı sorumluyum. O öyle narin, öyle masum ki… Kendini koruyabilmesi için sadece dört küçük dikeni var…”\n" +
                "\n" +
                "Ben de oturdum. Daha çok ayakta duramamıştım. “İşte…” dedi, “Hepsi bu…” Birazcık tereddütten sonrasında ayağa kalktı. Ben hareket edemedim.\n" +
                "\n" +
                "Ayak bileğinin çevresinde sarı bir ışık vardı, başka hiçbir şey yoktu. Bir an hareketsiz durdu. Asla bağırmadı. Bir ağaç benzer biçimde, yavaşça düştü yere. Yer kum olduğundan, düşerken en küçük bir ses bile çıkmamıştı.\n" +
                "\n" +
                "O günden bu yana tam altı yıl geçti. Bu hikayeyi daha ilkin hiç kimseye anlatmamıştım. Uçağımı onarıp geri döndüğümde, çevremdekiler hayatta olduğum için oldukça sevinmişlerdi. Bense üzgündüm ve onlara bitkin olduğumu söylemiştim. Şimdi acımın bir kısmı dinmiş durumda. Kısaca tamamen değil. Gezegenine geri döndüğünden inanırım, bundan dolayı gün ağarırken bedenini hiçbir yerde bulamamıştım. O denli da ağır bir vücut değildi onunki. Şimdiyse, geceleri yıldızları dinliyorum. Sanki beş yüz milyon tane ufak zil, oradan bana gülüyor.\n" +
                "\n" +
                "Fakat beni kaygılandıran bir şey var. Koyununun ağzına bağlaması için çizdiğim ağızlığın kayışlarını çizmeyi unutmuşum. Kısaca, onu asla kullanamayacak. Bu yüzden de gezegenine vardıktan sonrasında neler bulunduğunu oldukça merak ediyorum. Kim bilir çizdiğim koyun çiçeği yemiştir…\n" +
                "\n" +
                "Kimi zaman kendi kendime: “Kesinlikle yememiştir! Küçük prens çiçeği her gece camdan korunağıyla kapatmış, koyunu da dikkatle izlemiştir” diyorum. Bu şekilde düşününce mutlu oluyorum. Ve tüm yıldızlar bana gülüyorlar. Fakat sonrasında: “Herkes zaman zaman dalgın olabilir. Ya küçük prens bir gece camdan korunağı çiçeğin üstüne geçirmeyi unutursa ve koyun da sessizce yerinden çıkarsa…” diye düşünüyorum. O vakit benim ufak zillerim kahkaha yerine gözyaşlarına boğuluyorlar.\n" +
                "\n" +
                "Bu hakikaten büyük bir sır. Sizler benzer biçimde, benim benzer biçimde ufak prensi sevenler için, evrenin kim bilir neresindeki bir koyunun bir çiçeği yemiş ya da yememiş olması oldukça mühim bir şeydir. Gökyüzüne bakın. Kendinize “Acaba koyun çiçeği yedi mi, yemedi mi?” diye mesele. Bakın her şey iyi mi da değişiyor. Ve bunun niçin bu kadar mühim bulunduğunu büyükler asla anlayamazlar…\n" +
                "\n" +
                "Benim için bu, dünyanın en güzel ve en hüzünlü görünüm resmi. Bundan önceki resme oldukça benziyor fakat unutmamanız için bir kez daha çiziyorum. Küçük prensin Dünyaya indirilmiş olduğu ve ayrılmış olduğu yer işte burası.\n" +
                "\n" +
                "Lütfen resme oldukça dikkatli bakın ve onu hafızanıza iyice yerleştirin. Eğer bigün yolunuz Afrika’ya düşerse ve Sahara Çölü’nü geçerseniz, işte tam bu noktaya geldiğinizde lütfen birazcık durun. Eğer ufak bir çocuk size doğru gelirse, size gülerse, altın sarısı bukleleri var ise ve hiçbir sorunuzu yanıtlamıyorsa, onun kim bulunduğunu tahmin edersiniz. Lütfen bana bu iyiliği yapın. Beni merakta bırakmayın. Onun geri döndüğünü haber vermek için bana derhal yazın…")

        landmarkList.add(kucukPrens)

        val masaİleKocaAyı=Landmark(" Maşa ile Koca Ayı","Bir varmış bir yokmuş, evvel zaman içinde mert ismindeki küçük bir çocuk, hayatında ilk defa bir tramvaya binmişti. Onun karşısında oturmuş olan yaşlı bir teyze karşısındaki adama yüksek sesle; denizde yüzerken, belirlenmiş sınırların dışına çıkıldığında, başına gelebilecekleri masal anlatır gibi anlatıyormuş.\n" +
                "\n" +
                "En sonunda yaşlı Teyze o adama “Denize yüzmek için girip de sınır olarak belirlenmiş dubaları aşan veyahut yüzülmemesi gereken yerlerde yüzen çocuklar. Çoğu zaman Blooog, bloooog diyerek boğulma tehlikesi yaşarlar.” Demiş.\n" +
                "\n" +
                "Teyze, “Denize yüzmek için girip de sınır olarak belirlenmiş dubaları aşan veya yüzülmemesi gereken yerlerde yüzen çocuklar. Çoğu zaman blooog, bloooog diyerek boğulma tehlikesi yaşarlar.” Demiş.\n" +
                "\n" +
                "Teyzenin anlattıklarından etkilenen Mert, o günden sonra denizden, sanki çok tehlikeli bir şeymiş gibi kaçmaya başlamıştı.\n" +
                "\n" +
                "Ya Tatilinde arkadaşlarıyla beraber kampa giden Mert, suya girerse, bir şeyin onun ayağından tutarak denizin dibine çekeceğini düşünerek denize girmekten vazgeçmişti. Kampta bulunan tüm çocuklar keyifle yüzerlerken o ise iskelede oturup, öylece denize bakıyormuş.\n" +
                "\n" +
                "Mert, o anda sudan o kadar çok korkmaya başlamıştı ki, artık sabah kalktığında yüzünü suyla yıkayamaz olmuş. Bir süre sonra da yemeklerden önce ve sonra ellerini de yıkamaz olmuştu.\n" +
                "\n" +
                "Doğru dürüst yıkanmayan mert, zamanla tanınmayan bir hal almaya başlamıştı. Onu gören bazı çocuklar ona soğuk davranmaya, bazıları ise korkudan ağlayarak kaçmaya başlamıştı.\n" +
                "\n" +
                "Günler bu şekilde geçip giderken Mert gittikçe farklılaşmış ve bir domuza benzeyivermişti. Onu gören kamp liderleri çığlık atarak kaçmaya başlamış. Yüzme koçu ise hemen odaya saklanmıştı.\n" +
                "\n" +
                "Yüzme Koçu, domuz gibi görünen Mert’in kendisini bulamayacağını düşünmüştü. Ama yüzme koçu o kadar kiloluymuş ki onu görmemek mümkün mü?\n" +
                "\n" +
                "Mert odaya girerek “Koç niye saklanıyorsun benden.” Diye seslenmiş.\n" +
                "\n" +
                "Koç “İmdat! Yardım edin domuza benzeyen bir kurt adam, buraya gelmiş.” Diye bağırmış.\n" +
                "\n" +
                "Mert hiç yıkanmadığı için bir domuza benzeyivermişti. O yüzden kamptaki diğer çocukların yanında kalmaya devam edememişti. Çünkü onu yakalayan kamp görevlileri onu diğer hayvanların kaldığı ahıra koymuşlar.\n" +
                "\n" +
                "Olanlara bir anlam vermeyen Mert kendi yansımasını camda görünce, çok üzülmüş ve korkusunu yenmesi gerektiğini anlamıştı. Eğer bu korkusunu yenemezse herkes kendisinden kaçacak, kimse onunla arkadaş olmayacaktı.\n" +
                "\n" +
                "İşte o gün korkusuyla yüzleşmeye karar vermişti. Ahırdan çıkar çıkmaz denizin yanına giderek gözlerini kapatmış ve birden denize atlayıvermiş. Denize girdiği yerde kendisi gibi küçük çocukların yüzdüğü sığ sularmış.\n" +
                "\n" +
                "Korktuğu gibi hiçbir şey olmamıştı. Mert o kadar çok mutlu olmuştu ki, hemen banyo yapmak için odasına koşmuş.\n" +
                "\n" +
                "Güzelce yıkanan Mert o günden sonra her gün yüzmeye, yüzünü yıkamaya ve dişlerini fırçalamaya başlamıştı. Yaz kampının sonunda ise eskisi gibi sevimli ve temiz küçük çocuk olmuştu.\n" +
                "\n" +
                "Annesi onu kampın sonunda almaya gelince yanağına özlem dolu bir öpücük kondurmuş. Sonrada ona: ” Sudan korkmana hiç gerek yok ama unutmaman gereken çok önemli bir kural daha var o da denizde yüzerken asla açılmamak ve her zaman kurallara uymak lazım. ”demiş.")

        landmarkList.add(masaİleKocaAyı)

        val sihirliAsa=Landmark(" Sihirli Asa","Bir zamanlar çok uzaklarda bulunan bir şehirdeki Halk ile Periler uyum içerisinde huzurlu bir yaşam sürmekteymiş.\n" +
                "Bu şehirdeki çocuklar her yılbaşı gecesi bir evde toplanır, beraber güzelce eğlendikten sonra o eve gelen Peri’nin sorduğu soruya doğru cevap verene, Peri tarafından dileği sorulur, ne isterse istesin yerine getirilirmiş.\n" +
                "Yine bir yılbaşı gecesi arkadaşlarını kendi evlerine davet eden Lara, onlarla annesinin hazırladığı yiyecek ve içecekleri yerken bir taraftan da sohbet ediyormuş.\n" +
                "Tam o sırada bir Peri ortaya çıkarak “ Merhaba çocuklar, yeni yılınız kutlu olsun. Bu gecenin talihlisi kim olacak bakalım.” Demiş.\n" +
                "Tüm çocuklar heyecanla “Bizlerde seni bekliyorduk.” Dedikten sonra sessizce Perinin soru sormasını beklemişler.\n" +
                "Soracağı soruya bir türlü karar veremeyen Peri, bir süre düşünmüş ve en sonunda eline bir bardak alarak “Ben bu bardağı yere bıraktığımda onun yere düşmesine sebep olan şey nedir?” diye sormuş.\n" +
                "Diğer çocuklar daha düşünürken Lara “Yerçekimi” diye cevap vermiş.\n" +
                "Peri “Doğru bildin Lara. Şimdi sıra dileğini dilemeye geldi.” Demiş.\n" +
                "Lara ne dileyeceğini bilmiyormuş. Öylece gözü Peri’nin elindeki asadaymış. En sonunda “O elinizdeki Asa çok güzel, onu istiyorum.” Demiş.\n" +
                "Peri, Lara’nın talebi karşısında şok olmuştu. “Şey, şey asa mı?”\n" +
                "Lara “Yoksa yanlış bir şey mi istedim.”\n" +
                "Peri “ Bu asa sana vereceğim ama devlerden koruyamazsan, ülkedeki tüm periler devlerin esiri olacak.”\n" +
                "Lara “Özür dilerim. Böyle bir şey olabileceğini düşünememiştim. Dileğimi değiştirmek istiyorum.“ demiş.\n" +
                "Peri “Artık dileğini değiştiremezsin, bu dileğin gerçekleşmek zorunda. Eğer bu sihirli Asa Devlerin eline geçerse, tüm perilerin onların esiri olacağını unutma lütfen.” Dedikten sonra Sihirli Asayı ona uzatarak ortadan kaybolmuş.\n" +
                "Lara ve arkadaşları çok üzülmüştü. Arkadaşları o Asayı yanından hiç ayırmaması gerektiğini söylemişler.\n" +
                "Lara ise hemen sihirli asayı bir beze sararak, çantasına koymuş ve her gittiği yere kendisiyle götürmüş.\n" +
                "Perinin Sihirli Asasının Lara’nın elinde olduğu haberi kısa bir süre sonra yayılmaya başlayınca, Devlerden biri o Asayı Lara’dan almak için günlerce onu izlemiş.\n" +
                "Bir sabah erkenden evden dışarı çıkan Lara’nın karşısına çıkan yaşlı kılığındaki bir Dev, çok değerli bir şeyin elinde olduğunu ve onu güvende tutabilecek birinin yardımına ihtiyacı olduğunu söyledikten sonra cebinden çıkardığı ışıl ışıl parlayan bir Küreyi ona göstermiş.\n" +
                "Onun değerli bir şey olduğunu düşünen Lara “Tamam sana yardım edeceğim.” Diyerek Küreyi aldığı gibi çantasından çıkardığı ve içerisinde Sihirli Asa olan bezi açarak o küreyi de o beze saracağı sırada, Sihirli Asayı alan Dev, koşarak oradan uzaklaşmış.\n" +
                "Lara üzgün bir şekilde arkadaşlarının yanına giderek onlara “Devlerden biri sihirli Asayı çaldı. Sihirli Asayı geri alamazsam tüm periler Devlerin esiri olacak. ” demiş.\n" +
                "Arkadaşlarından biri “Aslında bize ormandaki yaşlı Nine yardım edebilir.” Demiş.\n" +
                "Hep beraber Ormana giderek Yaşlı Nineyi bulmuşlar. Lara olup, biteni en başından beri bir bir anlatmış.\n" +
                "Yaşlı Nine “O devler ormana girerken sağ taraftaki kocaman Dağın ardında yaşarlar. Ama çaldıkları her şey onlarındır. Sen o Asayı senden çalmadığını ona kendi isteğinle verdiğini kanıtlayabilirsen. Asayı geri alabilirsin. Onun dışında o Asayı alabilmenin bir yolu yok.” Demiş.\n" +
                "Yaşlı Nineye teşekkür eden çocuklar ormanın girişine geldiklerinde, Lara “ Arkadaşlar, ben yalnız gideceğim. Siz beni burada bekleyin.” Demiş.\n" +
                "Arkadaşları her ne kadar birlikte gitmeleri konusunda ısrar ettiyse de, onları orada kalmaya ikna eden Lara tek başına Devlerin yaşadığı yere doğru yola koyulmuş. Zorda olsa en sonunda oraya ulaşmış.\n" +
                "Lara’yı gören Devlerden biri hemen onu alarak Liderlerinin yanına götürmüş. Liderleri “ Sen buraya niye geldin. Artı buraya kadar gelebildiğine göre çok cesur biri olmalısın.”\n" +
                "Lara “Ben, Asamı geri almaya geldim.”\n" +
                "Dev “ Merdan’ın getirdiği sihirli Asadan mı bahsediyorsun.“ Demiş.\n" +
                "O anda Merdan ismindeki Dev “O sihirli asayı ondan çaldığım için yasalarımız gereği Asanın sahibi benim.” Demiş.\n" +
                "Lara “Çalmak mı? Ne çalması” diyerek cebinden çıkardığı küreyi, gösterip “Ben Asayı bu Küre ile değiştirdim. Ama sonra değiştirmekten vazgeçtim.” Demiş.\n" +
                "Merdan ismindeki Dev “Her ne kadar hayır yalan söylüyor.” Desede Lara’nın elindeki Küreyi gören Devler, Kürenin Merdan’a ait olduğunu bildiklerinden, Sihirli Asayı Lara’ya geri vermesini istemişler.\n" +
                "Sihirli Asayı geri alan Lara, Dağdan inince Peri ile karşılaşmış. O Asayı koruyamadığı için ondan özür dileyen Lara, Asayı ona geri vermek istediğini söyleyince, Asayı geri Alan Peri, onu cesaretinden dolayı tebrik ettikten sonra ortadan kaybolmuş.\n" +
                "Lara ise bu durumdan büyük bir ders almıştı. Artık başkalarına ait olan şeyleri istememesi gerektiğini öğrenmişti.\n" +
                "\n" +
                "Bu güzel Sihirli Asa Masalı da burada son buldu. Hoşçakalın")

        landmarkList.add(sihirliAsa)

        val keloglanAcilSusamAcil=Landmark(" Keloğlan Açıl Sofram  Açıl","Bir varmış bir yokmuş, evvel zaman içinde, kalbur saman içinde küçük ve şirin bir kasabada çok yoksul olan bir aile varmış. Bu ailenin kel olan ve inadına, hiçbir şeye aldırış etmeyen bir de çocukları varmış.\n" +
                "\n" +
                "Günlerden bir gün annesi Keloğlan’a seslenmiş:\n" +
                "\n" +
                "“Haydi, Keloğlan, kapının önündeki darıları değirmene götür de öğüt getir ki ekmek yapayım, akşama da sıcak ekmek yiyelim.” demiş\n" +
                "\n" +
                "Keloğlan istemeye istemeye olsa da, darı çuvalını yükleyip değirmene doğru yol aldı, değirmene varmadan yolun kenarında kekliklerin yiyecek aradığını görmüş,\n" +
                "\n" +
                "“Bunları yazık değil mi belki açlardır!” diyerek darıları kekliklerin önüne saçmış.\n" +
                "\n" +
                "Akşam olunca eve dönen Keloğlan anasına ne demiş biliyor musunuz?\n" +
                "\n" +
                " “Ana değirmenci yoktu, bende darıları oraya bırakıp da geldim.” demiş.\n" +
                "\n" +
                "Ertesi günün sabahında annesi yine değirmene yollanmış, Keloğlan darıları saçtığı yere varınca elindeki değneği hızlı bir şekilde yere vurmuştu, o anda bir mucize gerçekleşmiş aniden değneği vurduğu yerde karşısına bir dev dikilmiş.\n" +
                "\n" +
                "Keloğlan, ondan hiç çekinmeden, deve bağırmış:\n" +
                "\n" +
                "“Tez şu darılarımı ver! Onları kekliklere sen yedirdin, ben şimdi anama ne diyeceğim?”\n" +
                "\n" +
                "Keloğlan’ın bu tavrı  devin pek hoşuna gitmişti o yüzden;\n" +
                "\n" +
                "“Keloğlan şu sofrayı al, acıktığın vakit “Açıl, sofram, açıl!” diye seslen, o sana açılır” demiş,\n" +
                "\n" +
                "Keloğlan Deve teşekkür ettikten sonra eve dönerken acıkmıştı hemen sofrayı yere indirerek “Açıl, sofram, açıl!” demiş\n" +
                "\n" +
                "Önünde kurulan sofranın üzerinde birbirinden güzel yemekler belirmemiş mi?\n" +
                "\n" +
                "Keloğlan sevinçle karnını bir güzel doyurmuş, eve dönerek annesine sofranın marifetini gösterdikten sonra annesi de bu duruma çok sevinmiş ve oğluna “sakın bundan kimsenin haberi olmasın” demiş.\n" +
                "\n" +
                "Keloğlan dilini tutamayınca bir gün, nasıl olmuşsa hırsızlar Keloğlan’ın sihirli sofrasını çalmışlar. Çaresiz kalan Keloğlan yine değirmenin yoluna düşmüş.\n" +
                "\n" +
                "Artık öğrenmiş  ya;  hemen o yere giderek değneğini yere vurmuş, bu seferde sofra değil, bir eşek hediye etmiş, Keloğlan o eşeğin başını tutup çevirdiği anda eşekten altınlar dökülmeye başladığını görünce çok sevinmişti.\n" +
                "\n" +
                "Keloğlan hemen eşeğe binerek hamama doğru gitmiş, oraya vardığında eşeği kapıya bağlamış sonra da hamamcıya da: “Sakın ola benim eşeğin başını çevirme!” diyerek sıkıca tembih ettikten sonra içeri girmiş.\n" +
                "\n" +
                "Hamamcı sırf merakından eşeğin yanına giderek onun eşeğin başını çevirmiş, eşekten dökülen çil çil altınları görünce hemen onun gibi bir eşek bularak eşekleri değiştirmiş.\n" +
                "\n" +
                "Bir süre sonra Keloğlan eşeğin altın saçmadığını görünce yine doğruca değirmenin yolunu tutmuş, değneği yere vurarak Devi çağırmış, sonra da olanları anlatmış.\n" +
                "\n" +
                "Bu kez dev ona bir topuz uzatarak “şimdi bir şölen düzenle ve hamamcı dahil tüm tanıdıklarını davet” demiş.\n" +
                "\n" +
                "Şölen bittikten sonra, konuklar ayrılacakken, topuz içlerinden birini kıstırarak  “Çabuk, sofrayı geri getir!” diyerek vurmuş kafasına vurmaya.\n" +
                "\n" +
                "Adam bakmış ki ondan kurtuluş yok, hemen sofrayı getirmeye gitmiş.\n" +
                "\n" +
                "Topuz, bu sefer hamamcıyı kıstırmış.\n" +
                "\n" +
                "“Hemen çaldığın o eşeği geri getir!” diyerekten başlamış hamamcının kafasına vurmaya hamamcı onu kabul etmedikçe onun yakasını bırakmamış.\n" +
                "\n" +
                "Keloğlan o sofrayla eşek sayesinde padişahın kızıyla evlenmiş onlarla beraber mutlu ve mesut yaşamışlar.")

        landmarkList.add(keloglanAcilSusamAcil)

        val denizciİleBilgin=Landmark(" Denizci ile Bilgin "," Günlerden bir gün, o yörede yaşayan bilgili bir adam denize açılarak  seyahat etmek istemiş. Kitaplarını ve giysilerini çantasına koyarak hemen limana gidip bir denizci ile anlaşıp gemiye binmiş.\n" +
                "\n" +
                "Uzun süren bir yolculuk sonucu okyanusa varmışlar, bizim bilgin çok bilgili olduğundan mıdır nedir, neredeyse her konuda kendini çok beğendiğinden farklı bir tavırla söze başlamış;\n" +
                "\n" +
                "“Kaptan, kaptan hendese ilmi hakkında bilgin var mı?” diye sormuş.\n" +
                "\n" +
                "Denizci;\n" +
                "\n" +
                "” O nedir ki bilmiyorum.” demiş.\n" +
                "\n" +
                "Yine sormuş;\n" +
                "\n" +
                "”Peki öyleyse, lugat ilmini biliyor musun?”\n" +
                "\n" +
                "Denizci;\n" +
                "\n" +
                "“Onu da bilmiyorum.” demiş.\n" +
                "\n" +
                "Bilgin Adam; “Desene ömrünün yarısı boşu boşuna gitmiş.”\n" +
                "\n" +
                "Kaptan kendisine sorulan sorulara kayıtsız kalmış, biraz içerlemiş ve bilginin kendisini küçümsemesinden rahatsız olmuş.\n" +
                "\n" +
                "Birkaç saat sonra bir sallantı hissetmişler ve gemi alabora olmak üzereyken bu defa denizci sormuş;\n" +
                "\n" +
                "“Bay bilgin, size bir şey söyleyebilir miyim yüzmeyi bilir misiniz?”\n" +
                "\n" +
                "Bilgin;\n" +
                "\n" +
                "“Hayır bilmiyorum hiç yüzmedim.” deyince,\n" +
                "\n" +
                "Denizci;\n" +
                "\n" +
                "“Vah vah çok üzüldüm demiş, işte şimdi ömrünüzün tamamı boşa gitti, çünkü biraz sonra gemi su alarak batacak.” demiş.")

        landmarkList.add(denizciİleBilgin)


        val cirkinOrdekYavrusu=Landmark(" Çirkin Ördek Yavrusu","Bir varmış, bir yokmuş, evvel zaman içinde uzak diyarların birinde bulunan bir ülkenin güney ormanının kenarında yaşayan bir anne ördek varmış.\n" +
                "\n" +
                "Bir gün anne ördek yumurtaların üzerinde oturmuş, sabırsızlıkla yavruların yumurtalardan çıkmasını bekliyormuş.\n" +
                "\n" +
                "Aradan birkaç gün geçtikten sonra yumurtalardan çatırdama sesi duyan anne ördek sevinç içerisinde, kanatlarını çırpıp “vak vak vak” diyerek yumurtaların üzerinden kalkmış.\n" +
                "\n" +
                "Yumurtalara bakan anne ördek, yumurtalarından bir tanesinin çatlamadığını görünce,  kanat çırpmayı bırakıp, canı sıkılmış bir şekilde yumurtaya bakmış.\n" +
                "\n" +
                "Diğer yavrularına bakınca içi sevinç dolan Anne Ördek, çatlamayan yumurtaya bakınca da hüzünleniyordu.\n" +
                "\n" +
                "Anne Ördek için tüm yavruları değerli olduğundan, yumurtadan çıkan yavruları ile ilgilenirken, diğer bir taraftan da o yumurtanın üzerinde oturmaya devam etmiş.\n" +
                "\n" +
                "Bir süre sonra anne ördek, çatlamayan yumurtadan da çatırdama seslerini işitince, hemen yerinden kalkarak sevinçle yumurtaya bakmış.\n" +
                "\n" +
                "Bu sefer de yumurtadan diğer yavrulara göre daha iri ve çirkin bir ördek yavrusu çıkmış.\n" +
                "\n" +
                "Anne ördek, sonradan çıkan yavrusuna bakınca epey şaşırmıştı. “Bu yavru diğer yavrularımdan çok farklı” diye düşünmüş, sonrasında da, “Her neyse nasıl olsa benim diğer yavrularımın hepsi de güzel.” diye düşünmüş.\n" +
                "\n" +
                "Bir süre sonra çiftlikte bulunan yuvalarına gitmek için yavrularını peşine takan anne ördek, çiftliğe gitmek için çiftlik ile aralarında bulunan dereden geçmek zorundaydılar.\n" +
                "\n" +
                "Derenin içine giren Anne Ördeğin peşinden giden yavruları da sırayla dereye girmişler.\n" +
                "\n" +
                "Anne Ördek, zaman zaman arkasından gelen yavrularına bakıyormuş. Çirkin ördek yavrusunun diğerlerine göre daha iyi yüzmesi onun daha çok dikkatini çekmişti.\n" +
                "\n" +
                "Kendi kendine: “Bari çirkin olan yavru, diğer yavrularıma göre daha iyi yüzüyor. Başka bir ördeğin yumurtası ile karışmış olamaz. Nasıl olsa oda büyüdükçe güzelleşir.” demiş.\n" +
                "\n" +
                "Çirkin Ördek Yavrusu, da diğer yavrularla beraber büyümüş, büyümesine ancak gittikçe diğer yavru ördeklerden daha da farklı bir hale gelmişti.Çiftlikte bulunan diğer tüm hayvanlar da, ona farklı lakaplar takarak, alay etmekte ve neredeyse hiç rahat bırakmamaktaydılar.\n" +
                "\n" +
                "Öyleki kardeşleri bile vak, vak, vak ederek, çoğu zaman kafasını şişiriyorlar, hatta bazı zamanlarda “Bir kedi onu yakalasa da kurtulsak.” diyorlarmış.\n" +
                "\n" +
                "Tavuklar, onun yanlarına gitmesini istemiyordu. Hatta her gün sabah akşam tavuk ve ördeklere yem veren kız çocuğu da, çoğu zaman onu ayağıyla ittirerek, yemlerin yanından uzaklaşmasını sağlıyordu.\n" +
                "\n" +
                "Kendisine farklı davranılmasına üzülen çirkin ördek yavrusu, o kadar çok üzülüyormuş ki, bazen kimsenin olmadığı bir köşede gizlice ağladığı bile oluyormuş.\n" +
                "\n" +
                "Günler bu şekilde geçip giderken, güneşin etkisini iyice hissettirdiği sıcak bir yaz gününde sıkılan Çirkin Ördek Yavrusu, çitlerin üzerinden uçarak çiftlikten epeyce uzaklaşmış. Genelde yaban ördeklerinin yaşadığı bölgeye gelene kadar da hiç durmadan bir yürümüş, bir uçmuş.\n" +
                "\n" +
                "Yaban ördekleri de onu gördükleri vakit, ondan uzaklaşarak, onunla arkadaşlık yapmak istememişlerdi.\n" +
                "\n" +
                "Kimselerin kendisini kabul etmemesi üzerine, tek başına ortada kalmıştı. Onu gören küçük kuşlar dahi onun çirkinliği yüzünden, yanında durmamakta hemen uzaklaşmaktaydılar.\n" +
                "\n" +
                "Tek başına yaşamaya karar veren çirkin yavru ördek kendisine bir yuva yaparak yalnızca yaşamaya başlamıştı.\n" +
                "\n" +
                "Aradan aylar geçmiş, sonbahar mevsiminin gelmesiyle beraber, ağaçların yaprakları sararıp, solmaya, sonrasında ise dökülmeye başlamıştı.\n" +
                "\n" +
                "Bir gün güneşin batmasına çok az bir süre kalmıştı ki, Çirkin Ördeğin yuvasının üzerinden beyaz renkli, büyük ve güzel kuşlardan oluşan bir sürü kuş uçuyordu. Havadayken adeta oyunlar oynarcasına süzülmeye başlamışlar.\n" +
                "\n" +
                "Bu kuşlar hem çok zarif hemde uzun boylu kuşlarmış. Onların arkasından hayretle bakan Çirkin Ördek, onlara hayran kalmıştı. Birden onların peşinden gitmek aklına gelmiş ve hemen peşlerinden koşmuş.\n" +
                "\n" +
                "Güzel kuşların ardından koşarken ne kadar bağırsa da bir türlü sesini onlara duyuramamış, çünkü onlar kocaman kanatlarını çırpar çırpmaz hızla uzaklaşmışlardı. Oda onlar gibi kanatlarını çırparak uçmaya çalışmış, ama çok kısa bir mesafe uçabilmiş.\n" +
                "\n" +
                "Ertesi sabah uyanan ördek yavrusu bir yamacın kenarına giderek aşağılarda bulunan dereyi izliyormuş. Derede o beyaz tüylü kuşların yüzdüklerini görünce sevinmiş.\n" +
                "\n" +
                "Hem kanatlarının ne kadar güçlü olduğunu denemek, hemde onların yanına gidebilmek için hiç düşünmeden “Bende beyaz tüylü kuşlar gibi aşağı uçabilirim, ne kadar çirkin olsam dahi, onların yanlarına gitmeliyim. “ düşüncesiyle kendini yamaçtan aşağı bırakarak, o büyük kanatlarını açıp süzüle süzüle dereye doğru uçmuş.\n" +
                "\n" +
                "O esnada kıyıda bulunan iki erkek çocuk derede yüzen beyaz kuşlara yem atıyorlarmış. Kısa bir süre sonra dereye konan Çirkin Ördeği gören çocuklardan bir tanesi annelerine dönerek,\n" +
                "\n" +
                "“Anne, anne şuraya baksanıza! Orada bir kuğu yavrusu daha var. Hemde diğer kuğulardan daha güzel.” demiş.\n" +
                "\n" +
                "Çirkin Ördek çocuğun söylediklerini işitmiş, ama çocukların kimden bahsettiğini bir türlü anlamamış. Çünkü etrafında başka kuğu da yokmuş. Çocuğun bağırışları üzerine derede bulunan beyaz kuşların hepsi, arkalarına dönerek çirkin ördeğe bakmaya başlamışlar. O ise utancından başını önüne eğerek şöyle demiş.\n" +
                "\n" +
                "“Dilerseniz sizler de diğerleri gibi bana Çirkin Ördek Yavrusu diyerek, alay edebilirsiniz. Nasıl olsa artık o isme iyice alıştım.” demiş kendi kendine.\n" +
                "\n" +
                "Başını yukarı kaldıran ördek suda kendi yansımasını görünce şaşırmış. Uzun bir boynu bembeyaz tüyleri varmış. “Bu da kimin görüntüsü yoksa ben miyim?” diye kendi kendine sormuş.\n" +
                "\n" +
                "Suda gördüğü yansımanın kendisine ait olduğundan uzun bir süre emin olamamıştı.\n" +
                "\n" +
                "Onun yanına gelen beyaz tüylü kuğu kuşlarının ona “Ne kadar güzel ve zarif bir kuğu olduğunu söyledikleri vakit” ne diyeceğini bilememişti.\n" +
                "\n" +
                "İlk başta kendisiyle alay etmek için şaka yapıldığını düşünmüş. Sonrada gerçekten kendisinin de bir kuğu olduğunu görünce, hayretler içinde kalmış. Artık çirkin bir ördek yavrusu değilmiş.\n" +
                "\n" +
                "O günden sonra onu gören herkesin, güzelliği karşısında hayran olduğu bir kuğuymuş, Artık hayatını mutlu ve huzurlu bir şekilde geçirmeye başlamış.")

        landmarkList.add(cirkinOrdekYavrusu)

        val ucKucukSincap=Landmark(" Üç Küçük Sincap","Bir varmış, bir yokmuş kendi hallerinde mutlu bir yaşam süren bir sincap ailesi varmış. Bu ailede üç sincap kardeş varmış. Yavru kardeş sincaplar gel zaman git zaman hızlıca büyümüş ve artık evlerinin dışındaki, doğadaki bilmedikleri hayatı merak etmeye başlamışlar.\n" +
                "Sincaplar yeterince büyüdükten sonra anneleri onları çağırmış ve ‘Artık büyüdünüz yavrularım, artık dışarıdaki dünyayı tanıtıp yeni tecrübeler edinecek yaşa geldiniz’’ demiş. Devam etmiş anne sincap sözlerine: ‘Size yol gösterecek bir tavsiyem olacak. Her zaman doğru olanı yapın ve doğru olanı yapmanın emek gerektiğini, hayatta çaba göstermeniz gerektiğini unutmayın. Hiçbir zaman kolaya kaçmayın’’ demiş.\n" +
                "\n" +
                "Annelerinin öğüdünü dinledikten sonra sabah olur olmaz ormanı keşfetmek için yola düşen sincaplar başlamışlar yürümeye. Bir süre sonra kendilerine yeni bir ev yapmak için uygun bir yer bulan sincaplar büyük bir heyecanla birbirlerine sarılmış. ‘Benim evim samandan olacak’’ demiş sincapların en küçüğü. ‘Samandan ev yapmak çok basit, böylece hiç yorulmam ve hemen evimi yapıp diğerleriyle oyun oynamaya başlayabilirim.’’\n" +
                "\n" +
                "Abisi küçük sincabı samandan ev yapmanın çok kötü bir fikir olduğu konusunda uyarmış: ‘Aç kurtlar geldiğinde saklanacak bir eve ihtiyacın var, samandan ev seni koruyamaz.’’ Ancak küçük sincap abisini dinlememiş ve saman balyalarını dizip oyun oynamaya başlamış. Ortanca kardeş ise ahşaptan bir ev yapmayı tercih etmiş. Ahşap samandan daha sağlammış ama yine de onu korumaya yetmezmiş. Abisi ortanca kardeşi de uyarmış: ‘Hayal ettiğin evi yapman çok güzel ama burası kurtlar saldırdığında seni korumaya yetmeyecektir.’’\n" +
                "\n" +
                "Abilerini dinlemeyen küçük ve ortanca kardeşler başlamışlar neşe içinde diğer sincaplarla oynamaya. Artık evlerinin hazır olduğunu ve arkadaşlarıyla diledikleri gibi vakit geçirebileceklerini düşünüyorlarmış. Abileri ise onlara örnek olmak için sert kayalıklardan bir ev yapmaya başlamış. Kayaları taşımak hiç de kolay değilmiş, abi sincap çok yorulmuş ve evini ancak 1 haftada bitirebilmiş. Kardeşleri ise onunla alay ediyor, ‘Bunca zahmete ne gerek vardı, boşu boşuna kendini yoruyorsun’’ diyorlarmış.\n" +
                "\n" +
                "Gel zaman git zaman bir gece sincapların yuvalarını yaptığı yere aç bir kurt gelmiş, hemen gözüne saman evde oturan sincabı kestirmiş. ‘Hemen çık dışarı’’ demiş aç kurt, ‘’Yoksa evini başına yıkarım.’’ Küçük sincap ‘Benim evim çok güvenlidir, yıkılmaz, git başımdan!’’ demiş. Ancak aç kurt bir üfler üflemez samandan ev dağılıp gitmiş, küçük sincap ise korkuyla ortanca kardeşin evine sığınmış. Aç kurt bu defa ahşaptan evi kestirmiş gözüne, ‘Hemen çıkın ikiniz de dışarı, yoksa bu evi de yıkarım’’ demiş. Ortanca kardeş ‘Burası samandan daha güvenli, bize bir şey olmaz, git buradan’’ dese de aç kurt ahşaptan evi bir pençe darbesiyle devirmiş.\n" +
                "\n" +
                "Koşarak abilerinin evine sığınan kardeşler başlamışlar korkudan titremeye. Abileri ise onlara korkmamalarını, evin çok sağlam olduğunu, çünkü çok uğraştığını söylemiş. Aç kurt sincapların kayadan yapılan eve girdiğini görünce yıkamayacağını anlayarak uzaklaşmış oradan ve onları bir daha rahatsız etmemiş.\n" +
                "\n" +
                "Küçük sincap ve ortanca sincap abileri gibi annelerinin sözünü dinlemedikleri için çok pişman olmuşlar. Hayatta doğru olanı yapmak için emek sarf etmek gerektiğini ise hiç unutmamışlar.")

        landmarkList.add(ucKucukSincap)

        val prensesVeBezelyeTanesi=Landmark(" Prenses ile Bezelye Tanesi ","Bir varmış, bir yokmuş. Evvel zamanların birinde, uzak bir diyarda, iyi kalpli bir prens yaşıyormuş. Evlilik çağındaki bu prens, bir prenses ile evlenmek istiyormuş. Kendisine uygun bir eş bulmak için bütün ülkeleri dolaşmış ama bir türlü istediği gibi birini bulamamış. Karşılaştığı prenseslerin gerçek olup olmadığı konusunda hep tereddüt yaşıyormuş. Aramaktan yorulan prens, sarayının yolunu tutmuş..\n" +
                "\n" +
                "Bir gece sarayda büyük bir uğultuyla korkunç bir fırtına çıkmış; gök gürlüyor, şimşek çakıyor, adeta bardaktan boşanırcasına yağmur yağıyor, deyim yerindeyse adeta kıyamet kopuyormuş. Çok geçmeden sarayın kapısı çalınmış, kraliçe gidip kapıyı açmış. Fakat, o da ne kapının önünde, yağmurdan sırılsıklam olmuş genç bir kız duruyormuş. Tepeden tırnağa sırılsıklam olmuş bu genç kız, sarayının yolunu kaybettiğini, kendisinin de gerçek bir prenses olduğunu söylüyormuş.\n" +
                "\n" +
                "Yaşlı kraliçe, kapıdaki prensesi içeri almış, “Acaba gerçek prenses mi? Dur bakalım anlarız!” diye düşünmüş ama bu durumu kimseye belli etmemiş. Gerçek prenses için bir yatak sermiş, yatağının altına da bir bezelye tanesi koymuş. Bu bezelye tanesinin üstüne de yirmi kat döşek, döşeklerin üzerine de yirmi tane de kaz tüyü yatak koymuş. Gece olmuş, prenses kraliçenin yaptığı yatakta uyumuş. Sabah olunca da gerçek prensese, gece nasıl uyudun, rahat ettin mi diye sormuşlar.\n" +
                "\n" +
                "Gerçek prenses;\n" +
                "\n" +
                "“Ah, ah, yatağımın altında ne vardı bilmiyorum. Sanki yatağımın altında çok sert bir şey vardı. Gece boyunca gözümü bile kırpamadım, sabaha kadar kıvrandım. Sabah uyanınca da her yerim ağrıyordu.” demiş gerçek prenses.\n" +
                "\n" +
                "Kraliçe, o zaman anlaşılmış ki, yirmi kat döşeğin ve yirmi kaz tüyü yatağın altındaki bezelye tanesini hissedecek kadar nazlı, narin olduğuna göre, bu prenses gerçek bir prensestir! Hemen oğluna durumu anlatmış, oğlu da onun gerçek prenses olduğuna inanıp onunla evlenmiş. O bezelye tanesini de mumyalayıp saraylarında yaptıkları özel bir müzeye koymuşlar. ")

        landmarkList.add(prensesVeBezelyeTanesi)

        val kucukKaraBalık=Landmark(" Küçük Kara Balık","Büyük bir gölde yaşayan ve gezmeyi çok seven ve hep uzaklara giderek yeni bir yerler görmeyi hayal eden cesur isminde bir Küçük kara balık varmış.\n" +
                "\n" +
                "Her akşam ninesinin yanına giden Küçük kara balık Hadi Nine “bana masal anlat” dermiş. Gülümseyen ninesi yanıma gel yavrum. Sana daha önce hiç duymadığın Değişik Masallar anlatmamı ister misin?”\n" +
                "\n" +
                "Cesur “Evet nine” demiş.\n" +
                "\n" +
                "Ninenin masal anlatacağını bilen bir sürü yavru balık, Balık Ninenin etrafına toplanarak sessizce dinlemeye başlamış.\n" +
                "\n" +
                "Çok eski zamanlarda büyük bir okyanusta yaşayan cesur isminde yaramaz bir küçük kara balık varmış.  Cesur, diğer kardeşlerinden çok farklıymış. Hep görmediği yerleri görmeyi hayal edermiş.\n" +
                "\n" +
                "Bir gün Annesine “Annecim ben artık büyüdüm. Artık hayallerimdeki gibi yeni yerler görmek için uzaklara gitmek istiyorum.”\n" +
                "\n" +
                "Annesi “Hayır Cesur daha uzaklara gidecek kadar büyümedin. Büyüdüğün vakit sana izin veririm.” Demiş.\n" +
                "\n" +
                "Cesur annesinin izin vermemesine o kadar çok üzülmüştü ki, hiçbir şey söylemeden odasına gitmiş. Ertesi gün erkenden uyanan cesur. “Annem benim ne kadar büyüdüğümü bilmiyor. “ diyerek uzaklara gitmeye karar vermiş.\n" +
                "\n" +
                "Yolculuk için hazırlık yapan Cesur, kimseye görünmeden yola çıkmış. O gün Cesuru görmeyen Annesi ise her yerde onu aramış. Ancak hiçbir yerde bulamayınca uzaklara gittiğini anlamıştı.\n" +
                "\n" +
                "Cesur ilk defa bu kadar uzağa gidiyormuş. Akşam olmak üzereyken yiyecek bir şeyler aramaya başlamış. Her bulduğu yiyeceğe doğru gitmiş. Ama diğer balıklar ondan önce o yiyeceği çoktan kapmıştı.\n" +
                "\n" +
                "Epey bir acıkan Cesur “ Acaba annem haklımıydı.” Diye düşünmeye başlamıştı. Sonrada  “Pes etmek yok, yiyecek bir şeyler bulmalıyım.” Diyerek yiyecek aramaya koyulmuş.\n" +
                "\n" +
                "Ama yiyecek bir şeyler bulamayınca o geceyi aç bir şekilde geçirmiş. Sabah olunca uyanan Küçük Karabalık bir yengecin iştahla bir şeyler yediğini görünce onun yanına giderek “Merhaba Yengeç, benim adım Cesur. Yeni yerler görmek için evimden uzaklara geldim. Dünden beri yiyecek bir şeyler bulamadığımdan çok açım.” Demiş.\n" +
                "\n" +
                "Yengeç “ Böyle bir yolculuk yapmak için daha çok küçüksün. Senin yaşındaki bir balık için Okyanus tehlikelerle dolu. Gel hadi beraber şunları yiyelim.” Demiş.\n" +
                "\n" +
                "Cesur, yengeç ile birlikte bir güzel karnını doyurduktan sonra ona teşekkür ederek yoluna devam etmiş. \n" +
                "\n" +
                "Epey bir dolaşan Cesur, dilediği gibi rahat dolaşamadığı gibi çoğu alana girmeye korkar olmuştu. Çünkü daha önce hiç görmediği bir sürü garip balık ile karşılaşmıştı.\n" +
                "\n" +
                "Cesur “Ben bu şekilde, nasıl gezebilirim ki, aslında annem haklıydı. Daha tek başıma yiyecek bir şeyler bile bulamıyorum. En iyisi eve geri dönmek “diye söylenmiş.\n" +
                "\n" +
                "Bu arada kendisine doğru hızla yaklaşan bir kılıç balığını gören Cesur “İmdat.” Diye bağırarak hızla kaçmaya başlamış.\n" +
                "\n" +
                "Uzun bir kovalamaca sonucu bir kaya boşluğuna giren Cesur, kılıç balığından kurtulmuştu. Bir süre orada kalan Cesur, kılıç balığının oradan uzaklaştığından emin olduktan sonra eve geri dönmeye kesin karar vermişti.\n" +
                "\n" +
                "Bu sefer evin yolunu bulamayan Cesur, ne yapacağını bilmeden öylece bilmediği yöne doğru gitmeye devam etmiş.\n" +
                "\n" +
                "Bir süre sonra bir Ahtapotla karşılaşan Cesur korkuyla tekrar kaçmaya başlamış. Hangi yöne gittiğini bilmeyen Cesur, Ahtapottan kurtulmak için öyle hızlı kaçmıştı ki nefes nefese kalmıştı. Bir süre sonra saklandığı yerden çıkan Cesur. Tanıdık bir yer görünce çok sevinmişti.\n" +
                "\n" +
                "Eve vardığında annesinin merakla onun yolunu gözlediğini görünce, annesinin yanına giden Cesur. “Annecim özür dilerim. Sen haklıydın. Bu yolculuk için daha çok küçükmüşüm. Yolculuğum hayal ettiğim gibi sürmedi.” demiş.\n" +
                "\n" +
                "Yavrusunu karşısında gören anne gülümseyerek “Benim güzel yavrum. Biraz daha büyü, söz veriyorum, beraber bu yolculuğa çıkarız.” Diyerek yavrusuna sarılmış.\n" +
                "\n" +
                "İşte çocuklar bu masalda burada son buldu. Sizlerde her zaman Annenizin sözünden çıkmayarak onların dediğini yapın ki, Küçük karabalık gibi zor duruma düşmeyin…")
        landmarkList.add(kucukKaraBalık)

        val kurbagaPrens=Landmark(" Kurbağa Prens","prensesin kral babası ona doğum gününde altından bir top hediye etmiş.\n" +
                "\n" +
                "Topunu çok beğenen prenses hep onunla oynuyormuş.\n" +
                "\n" +
                "Bir gün bahçeye çıkıp topu yuvarlarken az aşağıda bulunan gölün içine doğru top kaçıvermiş. Buna çok üzülen prenses topumu ordan nasıl alıcam diye ağlamaya başlamış.\n" +
                "\n" +
                "O sırada vrak vrak diye sesler duyan prenses kafasını çevirdiğinde bir kurbağa görmüş.\n" +
                "\n" +
                "Kurbağa ona eğer altın topunu istersen sana getirebilirim ama bir şartım var demiş.\n" +
                "\n" +
                "Prenses nedir demiş?\n" +
                "\n" +
                "Sarayda beraber yaşarsak topunu getiririm demiş.\n" +
                "\n" +
                "Prenses çaresiz kabul etmiş.\n" +
                "\n" +
                "Topu prensese getirmiş.Prenses topuna kavuşunca çok sevinmiş ve hızlı adımlarla saraya doğru yürümeye başlamış. Kurbağa arkasından ona seslenmiş prenses beni unuttun demiş.\n" +
                "\n" +
                "Prenses arkasını dönerek ona demiş ki senin gibi çirkin bir kurbağa nasıl benimle aynı yerde yaşayabilir demiş ve saraya doğru gitmiş. Bu duruma kurbağa çok üzülmüş.\n" +
                "\n" +
                "Prenses akşam olunca Kral babası ve Kraliçe annesiyle yemek masasına oturmuş yemeklerini yerken kapı vurulmuş ve içeri kapıcı kadın girmiş.\n" +
                "\n" +
                "Efendim bir kurbağa geldi prensesin onu davet ettiğini söylüyor içeri alalım mı dedi.\n" +
                "\n" +
                "Kral kızına ne olduğunu soruyor ve başından geçenleri babasına anlatıyor.\n" +
                "\n" +
                "Babası yanlış yaptığını söylüyor ve çaresizce kurbağayı içeri davet ediyor. Kurbağa çok teşekkür ederim Kralım beni içeri aldığınız için diyor.\n" +
                "\n" +
                "Masaya yemek yemeğe oturan kurbağaya Kral tabak getirmelerini söylüyor.\n" +
                "\n" +
                "Kurbağa gerek yok diyor ben prensesin tabağından yerim diyor.\n" +
                "\n" +
                "Miğdesi bulanan prenses çaresizce bu duruma katlanıyor.\n" +
                "\n" +
                "Yemekten sonra uyumaya gidecek olan prenses kurbağınında   onunla geldiğini görünce moralleri bozuluyor.\n" +
                "\n" +
                "Aynı yatakta sabaha kadar birlikte uyuyorlar.\n" +
                "\n" +
                "Sabah olduğunda kurbağa prensese eğer son isteğimi yerine getirirsen buradan giderim diyor.\n" +
                "\n" +
                "Bu duruma çok sevinen prenses isteğinin ne olduğunu soruyor.\n" +
                "\n" +
                "Kurbağa beni bir kere dudaktan öpmeni istiyorum diyor.\n" +
                "\n" +
                "Prenses gözlerini kapatarak çaresizce onu öpüyor ve birden heryer sarı ışıklarla parlıyor ve kurbağa bir Prens’e dönüşüyor.\n" +
                "\n" +
                "Karşısında yakışıklı Prensi gören Prenses ona ne olduğunu soruyor.\n" +
                "\n" +
                "Prens başlıyor anlatmaya.\n" +
                "\n" +
                "Bana kötü bir cadı büyü yaptı, büyünün bozulması için güzel bir Prensesin yanında bir gece geçirmem gerekiyor ve beni öpmesi gerekiyordu demiş.\n" +
                "\n" +
                "Prens ve Prenses saraydaki odasından aşağıya babasının yanına giderek durumu babasına da anlatıyor.\n" +
                "\n" +
                "Daha sonra Prens ve Prenses ilk tanıştıkları gölün kenarına gidiyorlar.\n" +
                "\n" +
                "Orda Prens ona benimle evlenirmisin Prensesim diyor ve Prenses bu teklifi kabul ediyor ve o sırada karşılarına bir kurbağa çıkıyor.\n" +
                "\n" +
                "Kurbağaya baktıklarında sanki onun konuşmasını bekler gibi baka kakalıyorlar fakat kurbağa konuşmuyor.\n" +
                "\n" +
                "Prenses kurbağaya merak etme sende Prensesini bulursun dedikten sonra başlıyorlar gülmeye.\n" +
                "\n" +
                "Prens ve Prenses evlenip mutlu bir hayat sürmeye devam ediyorlar…")
        landmarkList.add(kurbagaPrens)

        val ikiİnatcıKeci=Landmark(" İki İnatçı Keçi","Bir köprünün ortasında rastlaşmış iki keçi\n" +
                "Hep inatçılıkmış meğer bu keçilerin suçu\n" +
                "Büyük keçi demiş yol ver önce ben geçeceğim\n" +
                "Küçük keçi demiş eğer verirsem öleceğim\n" +
                "Tam köprünün ortasında toslaşmış iki keçi\n" +
                "İkisi de suya düşmüş bunu görenler şaşmış\n" +
                "Keçilerin inatçısı suya düşer boğulur\n" +
                "İnsanların inatçısı kim bilir ki ne olur\n" +
                "\n" +
                "İşte böyle arkadaşlar, işin aslı şöyleymiş:\n" +
                "\n" +
                "Bir köylünün iki inatçı keçisi varmış. O kadar inatçılarmış ki biri diğerinin yaptığı şeylerin tam tersini yaparmış. Öyleki birisi otlamak için köylünün evlerinin kenarından akan derenin karşı tarafına geçse o mutlaka bu tarafı tercih edermiş.\n" +
                "\n" +
                "\n" +
                "Yine birgün kırlara otlamaya gitmişler. Her taraf yemyeşil taptaze çimenlerle doluymuş. Keçiler otlaya otlaya ırmağın kenarına kadar gelmişler. Keçilerden birisi ırmağın bir yakasında, diğeri öbür yakasında otlamaktaymış. İkisi de derenin karşı tarafından otlamak istemişler ve ikisi de ırmağın üzerindeki köprünün tam ortasına rastlaşmışlar. İki keçi, köprüde burun buruna gelmişler. Keçilerden birisi yol istemiş:\n" +
                "\n" +
                "– Çabuk yol ver karşıya geçeceğim.\n" +
                "\n" +
                "Diğer keçi yol vermeye yanaşmamış:\n" +
                "\n" +
                "– Önce ben geldim, sen bana yol ver.\n" +
                "\n" +
                "Keçilerin ikisi de inatçı mı inatçı. Köprüde kafa kafaya toslaşmışlar. İkisi de kavga etmekten yorgun düşmüşler. Bir tos, bir tos daha derken, keçilerin ikisi birden dengesini kaybedip, ırmağa düşmezler mi? İki keçi, ırmakta bata çıka sürüklenmeye başlamışlar. Boğulmak üzereyken yaptıkları hatayı anlamışlar.\n" +
                "\n" +
                "Son sözleri:\n" +
                "\n" +
                "– Keşke ikimizde bu kadar inatçı olmasaydık! Olmuş.")

        landmarkList.add(ikiİnatcıKeci)

        val karatren=Landmark(" Kara Tren","Evvel zaman içinde kalbur saman içinde pireler berber, develer tellal iken, ben ninemin beşiğini tıngır mıngır sallar iken uzak bir ülkede büyük bir orman varmış. Bu ormanın kenarından tren yolu geçermiş. Her gün bir tren kasabadan kente giderken bu ormanın yamacından geçermiş. Ormandaki hayvanlar treni çok severlermiş. Tren ormanın kenarına gelince düdüğünü öttürür haber verirmiş:\n" +
                "\n" +
                "Düüüüüütt!.. O zaman hayvanlar ormanın kenarına koşarlarmış. Tavşanlar, sincaplar kulaklarını sallayarak onu selamlarmış. Çiçekler bile başlarını sallar, kuşlar onunla yarışırlarmış. Trende keyifli keyifli çuf, çuf çuf çuf eder, puf puf puf diye dumanını çıkararak geçer gidermiş.\n" +
                "\n" +
                "Bir gün kara karga, “Aman bıktım bu trenin sesinden” diye gecirmis icinden. Kargaların kendi sesleri çirkin olduğu için olacak, trenin sesini, güzel düdüğünü sevmemiş bizim kara karga. Sonra da gidip trene şöyle demiş:\n" +
                "\n" +
                "“Biz senin sesini sevmiyoruz öttürüp durma.”Tren bu işe çok üzülmüş. “Beni seviyorlar sanıyordum” demiş. Ertesi günü ormanın kenarına varınca her zamanki gibi düdük çalacakmış, ama karganın söyledikleri aklına gelince `düt` demiş kesmiş düdüğü. Sonra da kimse duymasın diye çok, ama çok yavaş geçmiş gitmiş: Çuf, çuf, çuf, puuuuff… dumandan anlamış ormandakiler trenin geçtiğini hemen koşmuşlar ama yetişememişler.\n" +
                "\n" +
                "\n" +
                "Tren o kadar yavaş gitmiş ki kente geç gelmiş. Makinistler merak etmişler. Acaba bir arıza mı var diye. Oysa tren yavaş gittiği için gecikmiş. Ertesi gün tren ormanın kenarına gelince düdüğünü hiç çalmamış. Sonra da “düdük çalmadan, ormandakileri görmeden ne diye gideyim, hiç gitmem” demiş. Orada durmuş kalmış. Kentte beklemişler.\n" +
                "\n" +
                "Tren gelmemiş. Makinistler “Dünden belli oluyordu, arıza yaptı herhalde” demişler. Yeni bir lokomotif çıkarmışlar ve treni kasabaya geri çekmişler. Ertesi gün trene bakmaya karar vermişler. Bu sırada ormandakiler toplanıp aralarında konuşmuşlar. Treni özledik ne yapsak, diye düşünmüşler. Kuşlar ağlamışlar. Bize darıldı diye üzülüyorlarmış. Kara karga olanları görünce yaptığı yanlışı anlamış.\n" +
                "\n" +
                "“Sanırım siz seviyordunuz. Oysa ben ötmemesini söyledim. Ama üzülmeyin gider kendim anlatırım.” demiş ve ormanda herkes seni çok seviyor ve sen geçmediğin için üzülüyorlar. Kara tren bunu duyunca çok sevinmiş.\n" +
                "\n" +
                "“Yarın geleceğim git söyle” demiş.Ertesi gün makinistler gelmişler. Trende hiçbir arıza bulamamışlar. Çok şaşırmışlar. Yağlanması gerektiğini düşünmüşler. Treni bir güzel yağlamışlar. Sonra da yola çıkarmışlar. Tren koşa koşa ormana gelmiş. Gelince de uzun bir düdük çalmış. Düüüüüüüüüü…üüüüüü…..üüüüüüüt. Sincaplar, tavşanlar, kuşlar koşmuşlar trene, trende gene çuf çuf çuf, diye keyifle giderken puf puf puf, diye dumanını taa göklere salmış. O gün kente tam vaktinde varmış ve bir daha hiç bozulmamış.")
        landmarkList.add(karatren)

        val yoksulKunduraci=Landmark(" Yoksul Kunduracı","Bir varmış, bir yokmuş. Bir zamanlar ülkenin birinde yoksul bir kunduracı ile karısı yaşarmış. Kunduracı çok yaşlıymış ve artık eskisi gibi iş yapamıyormuş. Bu yüzden az kazanıyor, kazandıkları da karısıyla karınlarını doyurmaya ancak yetiyormuş. Gel zaman git zaman kunduracı iyice fakirleşmiş, elinde sadece bir çift ayakkabı yapacak deri parçası kalmış. Elinde kalan son deriyi ertesi gün ayakkabı yapmak için tezgâhın üzerine koymuş, üzgün bir şekilde yatmaya gitmiş. Sabah olunca ayakkabı yapmak için erkenden kalkmış. Atölyesine gelip tezgâhın üzerine bakınca çok şaşırmış. Gece bıraktığı deri parçasının olduğu yerde yepyeni bir çift ayakkabı duruyormuş. Gece yorgunken yaptığını ve hatırlamadığını düşünüp ayakkabıyı satmaya gitmiş. Ayakkabı o kadar güzelmiş ki müşterisi ona yüklüce para vermiş. Kunduracı kazandığı paralarla yeni iki çift ayakkabı yapacak kadar deri satın almış. Eve gelince karısına durumu anlatmış ve o da çok mutlu olmuş. O akşam, derileri yine ertesi gün ayakkabı yapmak üzere tezgâhın üzerine koymuş ve yatmaya gitmiş.\n" +
                "\n" +
                "Ertesi sabah uyandığında bu sefer tezgâhın üzerinde iki çift ayakkabı görmüş. Şaşkınlıkla birlikte çok da mutlu olmuş. Hemen götürüp ayakkabıları satmış ve bu sefer\n" +
                "ilkinden çok daha fazla para kazanmış. Gene kazandığı paralarla deriler satın almış. Hepsini tezgâhın üzerine koymuş. Bu sefer ertesi gün orada yeni ayakkabılar göreceğini biliyormuş. Uyanınca haklı olduğunu anlamış çünkü tezgâhın üzerinde bir sürü ayakkabı varmış. Gel zaman git zaman böyle devam etmiş. Kunduracı ile karısı nereden geldiklerini bilmedikleri bu ayakkabıları satarak bolca para kazanmışlar, artık fakir değillermiş. Fakat kunduracı derilerin ayakkabılara nasıl dönüştüğünü merak eder olmuş. Bir gün karısına,\n" +
                "\n" +
                "-Bize yardım edenlerin kim olduğunu öğrenmeliyiz, o yüzden bu gece derileri tezgâhın üzerine koyduktan sonra dolaba saklanıp gizlice olanları izleyelim, demiş.\n" +
                "\n" +
                "Akşam dolaba saklanmışlar, gece yarısına doğru tezgâhın oradan sesler gelmeye başlamış. Kunduracı ile karısı gördüklerine inanamamışlar. İki cücenin tezgâha çıkıp derilerle ayakkabı yapmaya başladıklarını görmüşler. Kunduracı ile karısı çok şaşırmış. Sabaha doğru cüceler gidince de kara kara düşünmeye başlamışlar.\n" +
                "\n" +
                "-Bizi fakirlikten kurtaran bu iyi cücelere teşekkür etmemiz lazım, diye diye bir karar vermişler. Sonunda onlara minik kıyafetler ve ayakkabılar hazırlamaya karar vermişler ve hemen işe koyulmuşlar.\n" +
                "\n" +
                "Kıyafetleri ve ayakkabıları hazırlayıp akşam tezgâhın üzerine koymuş ve gene dolaba saklanmışlar. Cüceler ayakkabı yapmak için tezgâha yaklaştıklarında hediyeleri fark etmiş ve çok mutlu olmuşlar. Hemen giyinmişler. Onların mutlu olduğunu gören kunduracı ve karısı da çok mutlu olmuş. Bu cüceleri son görüşleri olmuş, o günden sonra kunduracı ve karısının yardıma ihtiyaçlarının kalmadığını anlayan cüceler kendi yollarına gitmişler.\n" +
                "\n" +
                "Ama kunduracı ile karısı, minik adamlar sayesinde kazandıkları parayla ömür boyu rahat yaşamışlar. Onları da hiç unutmamışlar.")

        landmarkList.add(yoksulKunduraci)

        val tilkiileTeke=Landmark(" Tilki İle  Teke","Tilkinin biri bir kuyuya düşmüş, bir türlü çıkamazmış.\n" +
                "Oradan bir teke geçmiş, susadığı için kuyuya bakmış, tilkiyi içeride görünce: “Bu su iyi mi? İçilir bir şey mi?” diye sormuş.\n" +
                "Tilki işi babacanlığa vurup suyu bir övmüş, bir övmüş, tekenin ağzının suyunu akıtmış: “Hiç durma, in aşağı!” demiş.\n" +
                "Teke onun sözlerine kanmış, zaten susuzluktan da dili damağına yapışıyormuş, hiç düşünmeden aşağı inmiş.\n" +
                "Susuzluğunu giderdikten sonra aklı başına gelir gibi olmuş, tilkiye: “Eee! Nasıl çıkacağız buradan?” diye sormuş.\n" +
                "Tilki: “Sen hiç merak etme: ben buradan ikimizi de kurtarmanın yolunu biliyorum. Sen şimdi doğrulup ön ayaklarını duvara\n" +
                "dayar, boynuzlarını da havaya dikersin; ben tırmanıp çıkar, sonra seni de çekerim” demiş.\n" +
                "Teke bu aklı pek beğenmiş, hemen razı olmuş; tilki arkadaşının bacaklarından omuzlarına, omuzlarından boynuzlarına\n" +
                "atlayıp kuyunun ağzına varmış, hemen oradan uzaklaşmış.\n" +
                "Tekenin: “Biz böyle mi sözleştik? Sen sözünde durmaz mısın?” diye sitem ettiğini duyunca dönmüş: “Be herif! Senin\n" +
                "çenende kıl olduğu kadar kafanda da akıl olsaydı, nasıl çıkacağını düşünmeden hiç iner miydin bu kuyuya?” demiş.\n" +
                "\n" +
                "HİSSE: “Aklı başında bir insan, sonunun ne olacağını düşünüp\n" +
                "incelemeden, hiçbir işe girişmemelidir”")

        landmarkList.add(tilkiileTeke)

        val kedilerSultani=Landmark(" Kediler Sultanı","Bir zamanlar yoksul bir kadın varmış. Bu kadıncağız o kadar yoksulmuş ki yiyecek yemeği bile yokmuş. Bir gece açlıktan ve soğuktan bir köşede uyuyup kalmış. Rüyasında aksakallı bir ihtiyar görmüş. İhtiyar, eğer kediler sultanını bulabilirse yoksulluktan kurtulacağını söylemiş.Kadın o gün bu gündür kediler sultanını arayıp durmuş. Ama ne çare! Hangi kedinin yanına sokulup “Sen kediler sultanı mısın?” dese, kediler miyavlayıp kaçarlarmış.\n" +
                "\n" +
                "Bir sabah kalıntı unlardan küçücük bir hamur açarken gözlerinden seller gibi yaşlar akmaya başlamış. “Allahım. Böyle yoksul ve muhtaç yaşamaktansa, yer yarılsa da içine girsem” diye yalvarmış.\n" +
                "\n" +
                "O sırada yer yarılmış. Kadın içine girmiş. Geniş bir avluya düşmüş. Burada birçok kedi varmış. Kediler yemek pişiriyorlarmış.\n" +
                "\n" +
                "Kadın “Kediler sultanını biliyor musunuz?” diye sormuş.\n" +
                "\n" +
                "Kediler hiç konuşmadan elleriyle yukarı katı göstermişler. Kadın yukarı çıkmış. Orada birçok kedi temizlik yapıyormuş.\n" +
                "\n" +
                "Kadın “Kediler sultanını nerede bulabilirim?” diye sorduğunda kediler “Yukarda” demişler.\n" +
                "\n" +
                "Kadın bir kat daha çıkmış. Burada da birçok kedi çamaşır yıkıyormuş.\n" +
                "\n" +
                "Kadıncağız “Ne olur, beni kediler sultanına götürün” demiş.\n" +
                "\n" +
                "Kediler hep bir ağızdan \u0093Yukarı çık” demişler. Kadın bir kat daha çıkmış. Kediler sultanı başında tacı, altın bir taht üzerinde oturuyormuş. Kediler sultanı yoksul kadına bir torba uzatmış.\n" +
                "\n" +
                "Tavan yarılmış. Kadın yukarı çıkmış. Evine varınca da torbayı açmış. Torbanın içi ağzına kadar altın doluymuş. Kadın artık yoksulluktan kurtulmuş. Zengin olunca da bütün yoksullara yardım etmiş.")

        landmarkList.add(kedilerSultani)

        val kirmiziBenekliKelebek=Landmark(" Kırmızı Benekli Kelebe","Güzel bir yaz günüydü. Oya kırlara çıkmak çiçek toplamak istedi. Kırlara geldiğinde önce biraz çiçek topladı sonrada biraz temiz havada gezindi. Açık hava Oya’nın uykusunu getirmişti. Oya bir ağacın altına gidip biraz kestirdi. Rüyasında kırmızı benekli, yıldızlı kanatları olan şarkı söyleyen güzel bir kelebek gördü. Uyandığında ise kırmızı benekli kelebek yoktu. Ama Oya onu görmeyi çok istiyordu. Eve geldiğinde hemen annesine;\n" +
                "\n" +
                "— Anne kırmızı benekli kelebek nerde, hani dans edip şarkılar söyleyen kırmızı benekli kelebek? Annesi;\n" +
                "\n" +
                "— Kırmızı benekli kelebek olmaz ki kızım, sen rüya görmüş olmalısın. Oya;\n" +
                "\n" +
                "— Hayır anne gördüm. O gerçekten de var. Ben çıkıp onu arayacağım, demiş. Oya dışarı çıkıp her yerde kırmızı benekli kelebeği aramış, arkadaşlarına da sormuş kırmızı benekli kelebeği görüp görmedikleri ama hiç kimse görmemiş kırmızı benekli tavşanı.\n" +
                "\n" +
                "Oya tüm gün onu aradığı için çok yorulmuş. Eve gelir gelmez hemen uyuya kalmış. Yine rüyasında kırmızı benekli kelebeği görmüş. Yine dans ederek şarkı söylüyormuş. Oya hemen ona;\n" +
                "\n" +
                "— Bütün gün seni aradım, neredeydin sen, demiş. Ama kırmızı benekli kelebek ona cevap vermeden dans edip şarkı söylemeye devam etmiş. Sabah uyandığında Oya bu defa da babasına anlatmış kırmızı benekli kelebek gördüğünü. Ama babası da annesi gibi rüya görmüş olacağını kırmızı benekli kelebek olamayacağını söylemiş. Oya;\n" +
                "\n" +
                "\n" +
                "— Hayır, o gerçek. Ben onu arayacağım ve bulacağım, demiş. Yine Oya bütün gün onu aramıştı ve yine bulamamıştı. “Geçen defa olduğu gibi yine rüyamda onu görür müyüm acaba?” deyip hemen yattı eve geldiğinde. Rüyasında kırmızı benekli kelebeği görmemişti, dere kenarında yüzen ördekler görmüştü. Ertesi sabahta Oya kalkar kalmaz dere kenarına gitti.\n" +
                "\n" +
                "Gerçektende orda yüzen ördekler vardı. Oya birden ördeklerin başında dans edip şarkı söylenen kırmızı benekli kelebeği gördü. O an çok sevindi. Hemen kelebekle konuşmaya başladı. Ona onunla arkadaş olmak istediğini söyledi. Onu avucuna aldı eve götürdü. Önce anne babasına, sonra tüm arkadaşlarına gösterdi onu.\n" +
                "\n" +
                "Arkadaşları da onu çok sevmişti. Onlarda Oya gibi kırmızı benekli kelebekle oynamak istiyorlardı. Ama Oya buna izin vermedi. O kendinindi ve sadece kendisiyle oynayabilirdi. Oya kelebeğini alıp dere kenarına gitti. Kelebeğinden kendisi için dans edip şarkı söylemesini istedi. Ama kelebeği bir taş üzerine oturmuş kımıldamıyordu, Oya’nın isteğini yapmıyordu. Oya kelebeğini orda bırakıp evine gitti.\n" +
                "\n" +
                "Ertesi günde kelebeğini bulmak için onu bıraktığı yere gitti. Ama kelebeği orda yoktu. Oya ümitsizce evine gitti. Tüm bu olanları annesine anlattı. Annesi ona; Kelebeğini arkadaşlarınla paylaşmak istemediğin için sana küsmüş olabilir, dedi.\n" +
                "\n" +
                "Oya annesinin bu sözlerine hak verdi. Sonra kelebeğini ilk rüyasında gördüğü yere gitti. Yine aynı ağacın altına yattı ve uykuya daldı ve yine rüyasında kırmızı benekli kelebeği gördü. Oya buna çok sevindi. Kelebeğine;\n" +
                "\n" +
                "— Güzel kelebeğim, haydi git arkadaşlarımla da oyna dedi. Kelebek onun istediğini yaptı.")

        landmarkList.add(kirmiziBenekliKelebek)

        val katiYurekliZengin=Landmark(" Katı Yürekli Zengin","Evvel zaman içinde kalbur saman içinde için uzak diyarlarda güzel bir memleket varmış. Bu memlekette güzel insanlar yaşarmış ve bu güzel insanlar birbirleriyle mutlu mesut bir şekilde yaşarmış. İnsanlar birbirlerine, doğaya ve hayvanlara değer verirlermiş. Kendileri zenginlerse tüm kazançlarını fakirlere vererek onların rahat yaşamasını sağlarlarmış.\n" +
                "\n" +
                "Mutlu ve iyi insanların yaşadığı bu güzel memlekette çok zengin ancak huysuz mu huysuz bir adamda yaşarmış. Bu adam evine gelen herkese kötü davranır ve onları evinden kovarmış. Ayrıca fakir olan ve kendinden yardım isteyen insanlara yardım etmezmiş. Çünkü bu adam insanlardan hoşlanmazmış. O katı yürekli adam insanlara kötü davrandığı için insanlarda ondan korkarmış ve ona katı yürekli zengin derlermiş.\n" +
                "\n" +
                "Güzel memlekette yaşayan hiç kimse bu adamı mutlu ve iyiyken görmemiş. Adam hep mutsuzmuş ancak insanlar ondan korktuğu için neden mutsuz olduğunu bilmezlermiş.\n" +
                "Günün birinde katı yürekli ve huysuz olan zengin adamın kapısına giysileri yırtık fakir bir adam gelmiş. Kapıyı adamın hizmetçisi açmış. Dilenci olan fakir adam hizmetçiden ekmek istemiş. Harap haldeki adamı gören hizmetçi adama kapıdan gitmesini ev sahibinin katı bir yüreğe sahip olduğunu ve ona hiç bir şey vermeyeceğini söylemiş.\n" +
                "\n" +
                "Hizmetçi kapıya gelen dilenciyi göndermeye çalışırken katı yürekli olan ev sahibi sesleri duyarak kapıya gelmiş. Çünkü kapısını çalarak onu rahatsız eden kişinin kim olduğunu merak etmiş. Bunun üzerine dilenci çok aç olduğunu söyleyerek adamdan kendisine yiyecek ekmek vermesini istemiş. Dilencinin sözlerini duyan katı yürekli adam ona kızarak ondan hiç bir dilekçiye ekmek çıkmayacağını ve başkalarından ekmek istemesini söylemiş. Ona ekmeği başka yerde aramasını söyleyerek dilenciyi evinin kapısından kovmuş.\n" +
                "\n" +
                "Adamın bu tavrı dilenciyi çok üzmüş. Diğer yandan dilenci karşılaştığı adamın neden bu kadar katı yürekli olduğunu merak etmiş. Aynı zamanda onun durumuna üzülerek şu an içinde bulunduğu zenginliği bu katı kalbe ve insanlardan kaçmaya rağmen bereketli olmayacağını düşünmüş. Ardından da dilenci orayı terk etmiş.\n" +
                "Dilencinin katı yürekli adamın evinden gitmesinin üzerinden yıllar yıllar geçmiş. Geçen bu zaman içinde katı yürekli zengin adam tüm servetini kaybetmiş. Hiçbir şeyi kalmayınca da sokaklara düşmüş. Kapı kapı gezerek bir lokma ekmek için dilenmeye başlamış. Zamanında hor gördüğü dilencilerin durumuna kendisi düşmüş.\n" +
                "Yine ekmek dilenmek için sokaklarda olduğu bir gün karşısına çok güzel bir ev çıkmış. Bu evin dışından evin sahiplerinin ne kadar zengin olduğu anlaşılıyormuş. Bir parça ekmek bulmak ümidiyle adam gördüğü bu güzel evin kapısını çalmış. Kapıyı adamın zamanında onunla çalışan hizmetçisi açmış. Hizmetçi eski patronunun halini görünce çok şaşırmış ve bunu yüksek sesle dile getirmiş. Onun nasıl bu hale geldiğini merak ettiğini sormuş.\n" +
                "O sırada görkemli evin sahibi duyduğu ses üzerine kapıya gelmiş ve hizmetçisine ne olduğunu sormuş. O sırada da kapısına gelen dilenciyi tanımış. Çünkü şimdiki görkemli evin sahibi yıllar önce katı yürekli zenginin kapısına gelen dilenciymiş.Eskiden zengin olan adamın haline şaşıran eskinin dilencisi şimdinin zengini olan adam katı yürekli adam hakkında düşündüklerinin gerçekleştiğini anlamış. Ayrıca geçmişte onu hor gören adamın kaybettiklerini kendisinin kazandığını düşünmüş. Geçmişte adamın onu hor görmüş olmasına rağmen hizmetçisine kapıya gelen adamı içeri almasını ve karnını doyurarak ona iyi davranmasını söylemiş.\n" +
                "\n" +
                "Hizmetçi patronunun emrine uyarak katı yürekli adamı içeri almış ve önüne lezzetli yemekler getirmiş. Adam eskiden dilenci olan adamın evinde krallar gibi karşılanmış ve karnını tıka basa doyurmuş. Eskiden hor gördüğü adamın ona yardım etmesi adamı çok etkilemiş ve yaptıklarından dolayı çok pişman olmuş. Hatasını anlayarak adamın karşısına geçmiş ve ondan özür dileyerek ona olan hakkını helal etmesini söylemiş. Ayrıca kendisinin ona olan hakkını ödemeyeceğini de belirtmiş.\n" +
                "\n" +
                "Zengin adam onu affetmiş ve iki adam görkemli evde birlikte yaşamaya başlamışlar. Eskinin katı yürekli zengini eski dilenciyle yaşayarak gülmeyi ve mutlu olmayı öğrenmiş. Ayrıca insanlara yardım etmenin ve onları hor görmemenin iyi bir meziyet olduğunu öğrenmiş.")

        landmarkList.add(katiYurekliZengin)

        val cimri=Landmark(" Cimri","Bir zamanlar cimri bir adam yaşarmış. Öyle cimriymiş ki bütün mallarını altınla değiştirmiş. Bir çuval altını olunca da gidip bir ağacın dibine gömmüş.\n" +
                "\n" +
                "Gelgelelim aklı hep altınlarındaymış. Onları düşünmekten gözüne uyku girmez olmuş. Yemeden içmeden kesilmiş. Gece gündüz demez, aklına estiği zaman gider, toprağı kazarmış. Sonra altınlarını bir bir sayarmış.\n" +
                "\n" +
                "Rastlantı bu ya. Oradan geçen biri olanları uzaktan görmüş. Bakmış ki bu iş her gün tekrarlanıyor, durumu hemen anlamış.\n" +
                "\n" +
                "\"Bu adam cimrinin biri\" diye düşünmüş.\n" +
                "\n" +
                "Bir zaman sonra bizim cimri yine toprağı kazmış. Kazmış ama altınlar yerinde yok! Ne yapsın? Başlamış dövünmeye, çırpınmaya.\n" +
                "\n" +
                "Uzun zamandır cimriyi gözleyen adam dayanamamış.\n" +
                "\n" +
                "\"Ne var? Ne oldu da böyle ağlıyorsun?\" diye sormuş.\n" +
                "\n" +
                "Cimri cevap vermiş:\n" +
                "\n" +
                "- Daha ne olsun? Altınlarım yok olmuş. Hepsi çalınmış!\n" +
                "\n" +
                "Olan biteni bilen adam:\n" +
                "\n" +
                "- Altının ha varmış ha yokmuş. Harcayıp yemedikten sonra bir taş al, altın yerine onu göm. Senin için hiç fark etmez, demiş.")

        landmarkList.add(cimri)

        val daginikCocuk=Landmark(" Dağınık Çocuk","Bir çocuk varmış. Eşyalarını toplamaktan hiç hoşlanmazmış. Bir gün yerlerde atılı duran eşyalar, aralarında konuşuyorlarmış.\n" +
                "\n" +
                "-“Sen neden hala buradasın. Bu saatte okulda olman gerekmiyor mu?” diye sormuş ceket ders kitabına.\n" +
                "\n" +
                "Ders kitabı:\n" +
                "\n" +
                "-“Evet, ama dağınık çocuk okula giderken beni aradı, bulamadı. Sonunda beni almadan gitti” dedi.\n" +
                "\n" +
                "Çorap:\n" +
                "\n" +
                "-“Ben tam üç gündür burada yatağın altında sıkışıp kaldım. Kimse beni görmüyor.” Dedi.\n" +
                "\n" +
                "Tişört:\n" +
                "\n" +
                "\n" +
                "-“Ben tertemiz bir tişörttüm. Beni dolaptan çıkarttı sonra yere attı. Üstelik dağınık çocuk odada yürürken üstüme basıyor. Hem kirlendim, hem de buruştum.” -“Bir fikrim var” demiş pantolon.\n" +
                "\n" +
                "“Dağınık çocuk benim cebimde otobüs bileti unutmuş. Hep birlikte otobüse binip gidelim.”\n" +
                "\n" +
                "-“Evet” diye bağırmışlar. Hep birlikte yola çıkmışlar. Otobüs onları yemyeşil kırlara götürmüş.\n" +
                "\n" +
                "-“Ne kadar güzel bir yer burası? İyi ki yatak altlarında dolap kenarlarında beklemek yerine buradayız.” Saklambaç oynamışlar, yerlerde yuvarlanmışlar. Tozlanıp çamurlandıklarına hiç aldırmıyorlarmış. Tekrar otobüse binip eve dönmüşler. Bütün eşyalar daha önce atılmış oldukları yerlere aynen uzanıp yorgunluktan uyuya kalmışlar. Çocuk okuldan dönüp eşyalarının halini görünce:\n" +
                "\n" +
                "-“Aman Allahım! Yerlerde bıraktım diye ne hale gelmişler.” Demiş. O günden sonra eşyalarını hep yerli yerinde tutmuş.")
        landmarkList.add(daginikCocuk)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = adapter


    }


}
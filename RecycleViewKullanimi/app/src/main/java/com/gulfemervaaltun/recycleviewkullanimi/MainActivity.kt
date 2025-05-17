package com.gulfemervaaltun.recycleviewkullanimi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.gulfemervaaltun.recycleviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,BookClickListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        populateBooks()

        val mainActivity=this
        binding.recyclerView.apply {
            layoutManager=GridLayoutManager(applicationContext,3)
            adapter=CardAdapter(bookList, mainActivity)
        }
    }

    override fun onClick(book: Book) {
        val intent = Intent(applicationContext, DetailActivity:: class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateBooks() {
        val book1 = Book(
            cover = R.drawable.donusum,
            author = "Franz Kafka",
            title = "Dönüşüm",
            description = "Franz Kafka'nın en bilinen eserlerinden biri olan Dönüşüm, bireyin toplum içindeki yerini ve yabancılaşmasını çarpıcı biçimde ele alır. Gregor Samsa'nın bir sabah dev bir böceğe dönüşmesiyle başlayan hikâye, ailesinin ve çevresinin ona karşı tutumunu gözler önüne serer. Kafka'nın sembollerle dolu dili, insan doğasına dair derin sorular sordurur. Bireyin değeri üretkenliğiyle mi ölçülür sorusu sıkça gündeme gelir. Karamsar ama düşündürücü üslubuyla etkileyici bir içsel yolculuk sunar.",
            id = bookList.size
        )
        bookList.add(book1)

        val book2 = Book(
            cover = R.drawable.hayvanciftligi,
            author = "George Orwell",
            title = "Hayvan Çiftliği",
            description = "Hayvan Çiftliği, devrimle başlayan özgürlük hayallerinin nasıl bir diktaya dönüştüğünü anlatan alegorik bir romandır. Hayvanlar kendi yönetimlerini kurduktan sonra eşitlik yerini yeni bir baskıya bırakır. Orwell bu kitapta Sovyetler Birliği'ni sert bir şekilde eleştirir. Dili sade ama etkisi büyüktür. Politik eleştiri yönüyle edebiyat tarihinde özel bir yere sahiptir.",
            id = bookList.size
        )
        bookList.add(book2)

        val book3 = Book(
            cover = R.drawable.kucukprens,
            author = "Antoine de Saint-Exupéry",
            title = "Küçük Prens",
            description = "Küçük Prens, dostluk, sevgi ve hayatın anlamı üzerine düşündüren sade ama derinlikli bir eserdir. Küçük bir gezegenden gelen prensin öyküsü, yetişkinlere hayatı yeniden sorgulatır. Tilkiyle kurduğu dostluk, bağlılık ve sorumluluğun simgesidir. Her yaştan okuyucuyu etkileyen bu eser, insan ilişkilerine dair evrensel mesajlar içerir. Dünya çapında çok sevilen klasiklerden biridir.",
            id = bookList.size
        )
        bookList.add(book3)

        val book4 = Book(
            cover = R.drawable.kitap1984,
            author = "George Orwell",
            title = "1984",
            description = "1984, distopik bir dünyada bireyin devlet baskısıyla mücadelesini konu alır. Winston Smith, düşüncelerin bile kontrol edildiği bir rejimde yaşar. Büyük Birader'in gölgesinde geçen yaşam, bireysel özgürlüğün yok oluşunu gözler önüne serer. Orwell bu eseriyle sansür ve gözetimin tehlikelerine dikkat çeker. Günümüzde bile geçerliliğini koruyan güçlü bir uyarı niteliğindedir.",
            id = bookList.size
        )
        bookList.add(book4)

        val book5 = Book(
            cover = R.drawable.satranc,
            author = "Stefan Zweig",
            title = "Satranç",
            description = "Satranç, insanın zihinsel direncini ve yalnızlıkla mücadelesini anlatan etkileyici bir novelladır. Nazi döneminde hapsedilen bir adam, zihinsel sağlığını korumak için satranca sığınır. Oyun, onun için bir kaçış yolu haline gelir. Kısa ama yoğun bu eser, psikolojik çözümlemelerle okuyucuyu derinleştirir. Zweig’in son eseri olması, ona ayrı bir anlam katar.",
            id = bookList.size
        )
        bookList.add(book5)

        val book6 = Book(
            cover = R.drawable.martineden,
            author = "Jack London",
            title = "Martin Eden",
            description = "Martin Eden, alt sınıflardan gelen bir gencin, entelektüel yükselme çabası ve aşkı uğruna verdiği savaşı anlatır. Roman, bireysel azmin yanında sınıf ayrımının acımasızlığını da gözler önüne serer. Martin'in içsel çatışmaları ve yabancılaşması çarpıcı biçimde işlenir. Başarıya ulaştığında bile huzur bulamaz. Jack London, toplumsal eleştiriyi bireysel dramla harmanlar.",
            id = bookList.size
        )
        bookList.add(book6)

        val book7 = Book(
            cover = R.drawable.aliceharikalardiyari,
            author = "Lewis Carroll",
            title = "Alice Harikalar Diyarında",
            description = "Alice’in tavşan deliğinden geçerek girdiği fantastik dünya, hayal gücünün sınırlarını zorlayan bir maceraya dönüşür. Zaman, mantık ve kimlik gibi kavramlar ters yüz edilir. Her karakter sembolik anlamlar taşır. Lewis Carroll bu eseriyle çocuklar kadar yetişkinleri de düşündürür. Edebi değeri yüksek, zamansız bir klasik olarak öne çıkar.",
            id = bookList.size
        )
        bookList.add(book7)

        val book8 = Book(
            cover = R.drawable.beyazgemi,
            author = "Cengiz Aytmatov",
            title = "Beyaz Gemi",
            description = "Beyaz Gemi, doğayla iç içe büyüyen bir çocuğun masum dünyasını ve hayal kırıklıklarını konu alır. Masallar ve gerçekler iç içe geçer. Aytmatov, geleneksel değerlere ve toplumsal çözülmelere eleştirel yaklaşır. Çocuğun içsel dünyası, büyüme sancılarıyla doludur. Duygusal yönü güçlü ve dokunaklı bir eserdir.",
            id = bookList.size
        )
        bookList.add(book8)

        val book9 = Book(
            cover = R.drawable.bulbuluoldurmek,
            author = "Harper Lee",
            title = "Bülbülü Öldürmek",
            description = "Irkçılığın ve adaletsizliğin gölgesinde büyüyen Scout'un gözünden anlatılan bu roman, Amerikan toplumunun yaralarına ışık tutar. Babası Atticus Finch’in duruşu, insan hakları mücadelesine örnek olur. Masumiyetin yok oluşu, bülbül metaforuyla derinleştirilir. Eser, ahlaki cesaret ve empati üzerine güçlü bir mesaj verir. Modern Amerikan edebiyatının başyapıtlarındandır.",
            id = bookList.size
        )
        bookList.add(book9)

        val book10 = Book(
            cover = R.drawable.cesuryenidunya,
            author = "Aldous Huxley",
            title = "Cesur Yeni Dünya",
            description = "Teknolojinin insan hayatını nasıl şekillendirdiğini sorgulayan bu distopyada, bireysellik yok edilmiştir. İnsanlar şartlandırılmış bir sistemde mutlu görünse de özgürlükten yoksundurlar. Huxley, özgürlük, mutluluk ve kontrol arasındaki ince çizgiyi sorgular. Bilimsel ilerlemenin etik yönlerini de irdeler. Düşünmeye sevk eden, çarpıcı bir distopyadır.",
            id = bookList.size
        )
        bookList.add(book10)

        val book11 = Book(
            cover = R.drawable.peterpan,
            author = "J.M. Barrie",
            title = "Peter Pan",
            description = "Hiç büyümek istemeyen çocuk Peter Pan ve onun maceraları, çocukluğun masumiyetini ve özgürlüğünü simgeler. Neverland’de geçen olaylar, hayal gücünün ve dostluğun gücünü yüceltir. Wendy ve kardeşlerinin yaşadıkları, yetişkinliğe geçişin sancılarını da yansıtır. Barrie, büyümeme arzusu üzerinden zamanın akışına direnen bir karakter yaratır. Hem eğlenceli hem düşündürücüdür.",
            id = bookList.size
        )
        bookList.add(book11)

        val book12 = Book(
            cover = R.drawable.pinokyo,
            author = "Carlo Collodi",
            title = "Pinokyo",
            description = "Pinokyo, yalan söylemenin sonuçlarını ve dürüstlüğün önemini anlatan evrensel bir hikâyedir. Tahtadan yapılmış bir kuklanın gerçek bir çocuğa dönüşme arzusuyla çıktığı yolculuk, ahlaki derslerle doludur. Geçirdiği maceralar sayesinde büyümeyi ve sorumluluğu öğrenir. Collodi, hem çocuklara hem yetişkinlere seslenir. Eğitici ve sürükleyici bir eserdir.",
            id = bookList.size
        )
        bookList.add(book12)

        val book13 = Book(
            cover = R.drawable.romeovejuliet,
            author = "William Shakespeare",
            title = "Romeo ve Juliet",
            description = "İki düşman ailenin çocukları olan Romeo ve Juliet'in trajik aşkı, dünya edebiyatının en ünlü hikâyelerindendir. Aşk, nefret ve kader temaları eser boyunca yoğun biçimde işlenir. Shakespeare, gençlik tutkusu ile toplumsal baskılar arasındaki çatışmayı çarpıcı biçimde yansıtır. Dramatik yapısı güçlü, dili ise şiirseldir. Aşkın bedeli üzerine klasik bir trajedidir.",
            id = bookList.size
        )
        bookList.add(book13)

        val book14 = Book(
            cover = R.drawable.ucsilahsor,
            author = "Alexandre Dumas",
            title = "Üç Silahşör",
            description = "Üç Silahşör, dostluk, cesaret ve macera dolu bir yolculuğun romanıdır. D’Artagnan, üç silahşörle birlikte kraliyeti korumak için büyük mücadelelere girişir. Romandaki karakterler, sadakat ve onurun simgesidir. Dumas, tarihsel arka planı ustaca kurguya yedirir. Sürükleyici bir anlatıma sahiptir.",
            id = bookList.size
        )
        bookList.add(book14)

        val book15 = Book(
            cover = R.drawable.vahsetincagrisi,
            author = "Jack London",
            title = "Vahşetin Çağrısı",
            description = "Vahşetin Çağrısı, medeniyetten doğaya doğru sürüklenen bir köpeğin içgüdüsel dönüşümünü konu alır. Buck, sıcak bir çiftlikten yola çıkıp Kuzey’in sert coğrafyasına uyum sağlamak zorunda kalır. Doğanın acımasızlığı içinde hayatta kalmak için içindeki vahşi sesi dinler. Jack London, insan ve doğa ilişkisini bu eserle hayvanların gözünden anlatır. Sürükleyici ve etkileyici bir doğa klasiğidir.",
            id = bookList.size
        )
        bookList.add(book15)
    }
}

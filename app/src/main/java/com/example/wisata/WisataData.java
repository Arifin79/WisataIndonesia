package com.example.wisata;

import java.util.ArrayList;

public class WisataData {
    public static String[] wisataNames = {
            "CandiBorobudur",
            "IstanaBogor",
            "IstanaMaimun",
            "JamGadang",
            "KeratonYogyakarta",
            "LawangSewu",
            "MasjidAgungDemak",
            "MasjidIstiqlal",
            "TamanSari",
            "GedungSate"
    };
    public static String[] wisataDetails = {
            "Borobudur dibangun dengan gaya Mandala yang mencerminkan alam semesta dalam kepercayaan Buddha. Struktur bangunan ini berbentuk kotak dengan empat pintu masuk dan titik pusat berbentuk lingkaran. Jika dilihat dari luar hingga ke dalam terbagi menjadi dua bagian yaitu alam dunia yang terbagi menjadi tiga zona di bagian luar, dan alam Nirwana di bagian pusat.",
            "Istana Bogor berada di kota Bogor yang pada era kolonial bernama Buitenzorg atau Sans Souci yang berarti \"tanpa kekhawatiran\".Sejak tahun 1870 hingga 1942, Istana Bogor merupakan tempat kediaman resmi dari 38 Gubernur Jenderal Belanda dan satu orang Gubernur Jenderal Inggris.Pada tahun 1744 Gubernur Jenderal Gustaaf Willem Baron Van Imhoff terkesima akan kedamaian sebuah kampung kecil di Bogor (Kampung Baru), sebuah wilayah bekas Kerajaan Pajajaran yang terletak di hulu Batavia. Van Imhoff mempunyai rencana membangun wilayah tersebut sebagai daerah pertanian dan tempat peristirahatan bagi Gubernur Jenderal.",
            "Istana Maimun adalah istana Kesultanan Deli yang merupakan salah satu ikon kota Medan, Sumatera Utara, terletak di Jalan Brigadir Jenderal Katamso, Kelurahan Sukaraja, Kecamatan Medan Maimun.\n" +
                    "\n" +
                    "Didesain oleh arsitek Italia dan dibangun oleh Sultan Deli, Sultan Mahmud Al Rasyid. Pembangunan istana ini dimulai dari 26 Agustus 1888 dan selesai pada 18 Mei 1891. Istana Maimun memiliki luas sebesar 2.772 m2 dan 30 ruangan. Istana Maimun terdiri dari 2 lantai dan memiliki 3 bagian yaitu bangunan induk, bangunan sayap kiri dan bangunan sayap kanan. Bangunan istana ini menghadap ke utara dan pada sisi depan terdapat bangunan Masjid Al-Mashun atau yang lebih dikenal dengan sebutan Masjid Raya Medan.",
            "Jam Gadang adalah nama untuk menara jam yang terletak di pusat kota Bukittinggi, Sumatra Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti \"jam besar\".\n" +
                    "\n" +
                    "Selain sebagai pusat penanda kota Bukittinggi, Jam Gadang juga telah dijadikan sebagai objek wisata dengan diperluasnya taman di sekitar menara jam ini. Taman tersebut menjadi ruang interaksi masyarakat baik pada hari kerja maupun pada hari libur. ",
            "Karaton Ngayogyakarta Hadiningrat merupakan istana resmi Kesultanan Ngayogyakarta Hadiningrat yang kini berlokasi di Kota Yogyakarta, Daerah Istimewa Yogyakarta, Indonesia. Walaupun kesultanan tersebut secara resmi telah menjadi bagian Republik Indonesia pada tahun 1950, kompleks bangunan keraton ini masih berfungsi sebagai tempat tinggal sultan dan rumah tangga istananya yang masih menjalankan tradisi kesultanan hingga saat ini. Keraton ini kini juga merupakan salah satu objek wisata di Kota Yogyakarta. Sebagian kompleks keraton merupakan museum yang menyimpan berbagai koleksi milik kesultanan, termasuk berbagai pemberian dari raja-raja Eropa, replika pusaka keraton, dan gamelan. Dari segi bangunannya, keraton ini merupakan salah satu contoh arsitektur istana Jawa yang terbaik, memiliki balairung-balairung mewah dan lapangan serta paviliun yang luas.",
            "Lawang Sewu adalah gedung gedung bersejarah di Indonesia yang berlokasi di Kota Semarang, Jawa Tengah. Gedung ini, dahulu yang merupakan kantor dari Nederlands-Indische Spoorweg Maatschappij atau NIS. Dibangun pada tahun 1904 dan selesai pada tahun 1907. Terletak di bundaran Tugu Muda yang dahulu disebut Wilhelminaplein.\n" +
                    "\n" +
                    "Masyarakat setempat menyebutnya Lawang Sewu karena bangunan tersebut memiliki pintu yang sangat banyak, meskipun kenyataannya, jumlah pintunya tidak mencapai seribu. Bangunan ini memiliki banyak jendela yang tinggi dan lebar, sehingga masyarakat sering menganggapnya sebagai pintu (lawang).",
            "Masjid ini dipercayai pernah menjadi tempat berkumpulnya para ulama (wali) yang menyebarkan agama Islam di tanah Jawa yang disebut dengan Walisongo. Pendiri masjid ini diperkirakan adalah Raden Patah, yaitu raja pertama dari Kesultanan Demak sekitar abad ke-15 Masehi.\n" +
                    "\n" +
                    "Raden Patah bersama Wali Songo mendirikan masjid yang karismatik ini dengan memberi gambar serupa bulus. Ini merupakan candra sengkala memet, dengan arti Sarira Sunyi Kiblating Gusti yang bermakna tahun 1401 Saka. Gambar bulus terdiri atas kepala yang berarti angka 1 (satu), 4 kaki berarti angka 4 (empat), badan bulus berarti angka 0 (nol), ekor bulus berarti angka 1 (satu). Dari simbol ini diperkirakan Masjid Agung Demak berdiri pada tahun 1401 Saka. Masjid ini didirikan pada tanggal 1 Shofar.",
            "Masjid nasional negara Republik Indonesia yang terletak di bekas Taman Wilhelmina, di Timur Laut Lapangan Medan Merdeka yang di tengahnya berdiri Monumen Nasional (Monas), di pusat ibukota Jakarta. Di seberang Timur masjid ini berdiri Gereja Katedral Jakarta. Imam besarnya adalah Prof. Dr. Nasaruddin Umar, M.A. dan Ketua Badan Pelaksana Pengelola Masjid Istiqlal sekarang adalah Laksma (Purn) H. Asep Saefuddin.Pembangunan masjid ini diprakarsai oleh Presiden Republik Indonesia saat itu, Ir. Soekarno. Peletakan batu pertama sebagai tanda dimulainya pembangunan Masjid Istiqlal dilakukan oleh Ir. Soekarno pada tanggal 24 Agustus 1951. Arsitek Masjid Istiqlal adalah Frederich Silaban, seorang Kristen Protestan.",
            "Tamansari Ngayogyakarta adalah situs bekas taman atau kebun istana Keraton Ngayogyakarta Hadiningrat, yang dapat dibandingkan dengan Kebun Raya Bogor sebagai kebun Istana Bogor. Kebun ini dibangun pada zaman Sultan Hamengku Buwono I (HB I) pada tahun 1758-1765/9. Awalnya, taman yang mendapat sebutan \"The Fragrant Garden\" ini memiliki luas lebih dari 10 hektare dengan sekitar 57 bangunan baik berupa gedung, kolam pemandian, jembatan gantung, kanal air, maupun danau buatan beserta pulau buatan dan lorong bawah air. Kebun yang digunakan secara efektif antara 1765-1812 ini pada mulanya membentang dari barat daya kompleks Kedhaton sampai tenggara kompleks Magangan. Namun saat ini, sisa-sisa bagian Taman Sari yang dapat dilihat hanyalah yang berada di barat daya kompleks Kedhaton saja.",
            "Gedong Saté dengan ciri khasnya berupa ornamen tusuk sate pada menara sentralnya, telah lama menjadi penanda atau markah tanah Kota Bandung yang tidak saja dikenal masyarakat di Jawa Barat, tetapi juga seluruh Indonesia bahkan model bangunan itu dijadikan pertanda bagi beberapa bangunan dan tanda-tanda kota di Jawa Barat. Misalnya bentuk gedung bagian depan Stasiun Kereta Api Tasikmalaya. Mulai dibangun tahun 1920, gedung berwarna putih ini masih berdiri kokoh namun anggun dan kini berfungsi sebagai gedung pusat pemerintahan Jawa Barat."
    };
    public static int[] wisataImages = {
            R.drawable.candiborobudur,
            R.drawable.istanabogor,
            R.drawable.istanamaimun,
            R.drawable.jamgadang,
            R.drawable.keratonyogyakarta,
            R.drawable.lawangsewu,
            R.drawable.masjidagungdemak,
            R.drawable.masjidistiqlal,
            R.drawable.tamansari,
            R.drawable.gedungsate

    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setNama(wisataNames[position]);
            wisata.setDetail(wisataDetails[position]);
            wisata.setPhoto(wisataImages[position]);
            list.add(wisata);
        }
        return list;
    }

}

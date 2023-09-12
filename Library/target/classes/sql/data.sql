insert into Category(CategoryID, CategoryName) values(1, 'Novel');
insert into Category(CategoryID, CategoryName) values(2, 'Assay');
insert into Category(CategoryID, CategoryName) values(3, 'Mystery');
insert into Category(CategoryID, CategoryName) values(4, 'Poem');
insert into Category(CategoryID, CategoryName) values(5, 'Autobiography');
insert into Category(CategoryID, CategoryName) values(6, 'Biography');

insert into Authors(AuthorsID, AuthorsName) values(1, 'George Orwell');
insert into Authors(AuthorsID, AuthorsName) values(2, 'Fyodor Dostoyevski');
insert into Authors(AuthorsID, AuthorsName) values(3, 'Isaac Asimov');
insert into Authors(AuthorsID, AuthorsName) values(4, 'Aldous Huxley');
insert into Authors(AuthorsID, AuthorsName) values(5, 'Ahmet Hamdi Tanpınar');
insert into Authors(AuthorsID, AuthorsName) values(6, 'Sabahattin Ali');
insert into Authors(AuthorsID, AuthorsName) values(7, 'Agatha Christie');
insert into Authors(AuthorsID, AuthorsName) values(8, 'Asa Larsson');
insert into Authors(AuthorsID, AuthorsName) values(9, 'Adam Fawer');
insert into Authors(AuthorsID, AuthorsName) values(10, 'Orhan Veli');

insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(1, 'Hayvan Çiftliği', 1998,'Güneş', 200,
    'Hayvan Çiftliği, George Orwell''in mecazi bir dille yazılmış, fabl tarzındaki siyasi hiciv romanı.
    Roman ilk olarak 1945''te Birleşik Krallık''ta yayımlandı. 1996''da ise geçmiş tarihler için verilen Retro Hugo Ödülü''nü 1946 senesi için aldı.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(2, 'Suç ve Ceza', 2001,'Güneş', 300,
    ' Suç ve Ceza, Rus yazar Fyodor Dostoyevski tarafından yazılan romandır.
     İlk olarak 1866 yılı boyunca edebiyat dergisi Rus Habercisi''nde on iki ayda yayımlandı.
    Daha sonra tek cilt olarak yayımlandı. Dostoyevski''nin beş yıl süren Sibirya sürgününün dönüşü yazdığı tam uzunluktaki ikinci romanıdır.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(3, 'Ben Robot', 2003, 'Ay', 300, 
'Ünlü bilimkurgu yazarı Isaac Asimov’un bilimkurguya en büyük katkısı Üç Robot Kanunu’dur. Üç Robot Kanunu’na göre;
-Robotlar, insanlara zarar veremez ya da eylemsiz kalarak onlara zarar gelmesine göz yumamaz.
-Robotlar, Birinci Kanun’la çakışmadığı sürece insanlar tarafından verilen emirlere itaat etmek zorundadır.
-Robotlar, Birinci ya da İkinci Kanun’la çakışmadığı sürece kendi var.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(4, '1984', 2001,'Ay', 350,
'Parti’nin dünya görüşü, onu hiç anlayamayan insanlara çok daha kolay dayatılıyordu.
Her şeyi yutuyorlar ve hiçbir zarar görmüyorlardı çünkü tıpkı bir mısır tanesinin bir
kuşun bedeninden sindirilmeden geçip gitmesi gibi, yuttuklarından geriye bir şey kalmıyordu.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(5, 'Cesur Yeni Dünya', 2003,'Ay', 320,
' Cesur yeni Dünya bizi ''Ford''dan sonra 632 yılına'' götürür. Bu dünyanın cesur insanları kapısında "Cemaat, Özdeşlik, İstikrar" yazan Londra Merkez kuluçka ve
Şartlandırma Merkezi''nde üretilirler. Kadınların döllenmesi yasak ve ayıp olduğu için,
''annelik'' ve ''babalık'' pornografik birer kavram olarak görülür.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(6, 'Beş Şehir', 1999,'Ay', 270,
'"Beş Şehir''in asıl konusu hayatımızda kaybolan şeylerin ardından duyulan üzüntü ile yeniye karşı beslenen iştiyaktır.
İlk bakışta birbiriyle çatışır gibi görünen bu iki duyguyu sevgi kelimesinde birleştirebiliriz.
Bu sevginin kendisine çerçeve olarak seçtiği şehirler, benim hayatımın tesadüfleridir. Bu itibarla onların arkasında kendi insanımızı ve hayatımızı,
vatanın manevî çehresi olan kültürümüzü görmek daha da doğru olur."');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(7, 'Mahkemelerde (Belgeler)', 2006,'Ay', 180,
'Maarif Vekaleti Müfettişlerinden Reşat Nuri" Yazarlığının yanısıra siyasal kimliği de öne çıkan Sabahattin Ali,
1930''lu ve 1940''lı yıllarda Sol görüşlü olmanın bütün zorluklarını yaşadı.
Filiz Ali''nin babasına ait bir sandıkta bulduğu belgeler, bu zorlukların ve çilelerin birer tutanağı niteliğindedir.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(8, 'Acı Kahve', 2002,'Güneş', 180,
'Ünlü bir fizikçi olan Sir Claude Avory savunma sanayi alanında çok önemli bir formül üretir.
Ancak aile fertlerinin bu formülü çalacağından şüphe etmektedir. Duruma açıklık getirmesi için ünlü dedektif Hercule Poirot''yu malikânesine davet eder.
Bu arada Sir Avory tüm aile fertlerini de çağırmıştır. Yemek sonrası kütüphanede bir yandan kahvesini yudumlarken bir yandan da onlarla sohbet edecektir.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(9, 'Doğu Ekspresinde Cinayet', 1934,'Ay', 256,
'Gece yarısından sonra artan şiddetli tipi yüzünden Doğu Ekspresi artık yoluna devam edemez durumdadır. 
Yılın bu zamanlarında lüks tren tamamen doludur. Ertesi sabah yapılan kontroller sonucu tüm yolcuların sağ salim trende olduğu anlaşılır. 
Ancak, defalarca bıçaklanarak öldürülen Amerikalı yolcunun kompartımanının kapısı içeriden kilitlidir. 
Sonunda, trende yolculuk etmekte olan Hercule Poirot cinayeti incelemeye başlar. 
Ancak kimi yolcular cinayetin izlerini yok edebilmek için yaşlı dedektifin dikkatini dağıtmaya çalışırlar. 
Poirot, kehanet sayılabilecek bir saptamayla cinayeti bir değil iki şekilde çözümlemeyi başarır.
 ');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(10, 'Bütün Şiirleri', 1999,'Ay', 290,
'Bütün Şiirleri, Orhan Veli Kanık''ın ilk kez 1951 yılında yayınlanan şiir külliyatı.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(11, 'Kristal Kilise', 2002,'Ay', 320,
'Rebecka, güvenmekte kararsız olduğu Sanna’ya ve küçük çocuklarına göz kulak olmaya çalışacak, bir zamanlar âşık olduğu adamın katilinin peşine düşecek ve
geçmişte terk etmek zorunda kaldığı şehrin karanlık, soğuk ve ölüm kokan atmosferinin içine yeniden dalacaktır.');
insert into Book(BookID, BookName, ReleaseDate, Publisher, Page, Summary) 
values(12, 'Olasılıksız', 2002,'Güneş', 380,
 'Olasılıksız kitap özeti eklenmiştir....');
 
insert into Book_Auth(aid, bid) values (1,1);
insert into Book_Auth(aid, bid) values (1,4);
insert into Book_Auth(aid, bid) values (2,2);
insert into Book_Auth(aid, bid) values (3,3);
insert into Book_Auth(aid, bid) values (4,5);
insert into Book_Auth(aid, bid) values (5,6);
insert into Book_Auth(aid, bid) values (6,7);
insert into Book_Auth(aid, bid) values (7,8);
insert into Book_Auth(aid, bid) values (7,9);
insert into Book_Auth(aid, bid) values (10,10);
insert into Book_Auth(aid, bid) values (8,11);
insert into Book_Auth(aid, bid) values (9,12);


 insert into User(UserID, FirstName, LastName, Email, UserName, Password, Phone) 
values(1, 'user1', 'user1', 'user1@gmail.com', 'user123', '3', 0555055500);
insert into User(UserID, FirstName, LastName, Email, UserName, Password, Phone) 
values(2, 'user2', 'user2', 'user2@gmail.com', 'user231', '1', 055505200);
insert into User(UserID, FirstName, LastName, Email, UserName, Password, Phone) 
values(3, 'user3', 'user3', 'user3@gmail.com', 'user321', '2', 055507500);

package id.infinitelearning.KotlinSubmission.exercise1

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Mohamad Dzikri"
    val namaBelakang = "Arfiansyah"
    val single: Boolean = true
    val tidak: Boolean = false
    val umur = 20

    println("Nama Lengkap saya ialah $namaDepan $namaBelakang dan umur saya adalah $umur tahun ")
    println("single.and(tidak) = " + single.and(tidak))


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return println("Name : $groupId\nMember : $groupMember\nSession : $session")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val members = listOf(
        "Mohamad Dzikri Arfiansyah",
        "Al Ikhsan Akbar",
        "Kimberly",
        "Faza Atsmar Hifdzullah Supangat",
        "Irfan Wahendra",
        "Agus Salim",
        "Putri Alifia Rizky",
        "Ari Kurniawan",
        "Farhan Alamsyah",
        "Sambas Purnama Endang",
        "Rehanah Yulianti"
    )
    return members.filter { it == "Mohamad Dzikri Arfiansyah" }
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Widya", "Kak Ayat", "Kak Reza")
    val countOfGroup = arrayOf(
        "Mohamad Dzikri Arfiansyah",
        "Al Ikhsan Akbar",
        "Kimberly",
        "Faza Atsmar Hifdzullah Supangat",
        "Irfan Wahendra",
        "Agus Salim",
        "Putri Alifia Rizky",
        "Ari Kurniawan",
        "Farhan Alamsyah",
        "Sambas Purnama Endang",
        "Rehanah Yulianti"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        groupId = "Akatsuki",
        groupMember = listOf(
            "Mohamad Dzikri Arfiansyah",
            "Al Ikhsan Akbar",
            "Kimberly",
            "Faza Atsmar Hifdzullah Supangat",
            "Irfan Wahendra",
            "Agus Salim",
            "Putri Alifia Rizky",
            "Ari Kurniawan",
            "Farhan Alamsyah",
            "Sambas Purnama Endang",
            "Rehanah Yulianti"
        ),
        session = "Morning"
    )

}
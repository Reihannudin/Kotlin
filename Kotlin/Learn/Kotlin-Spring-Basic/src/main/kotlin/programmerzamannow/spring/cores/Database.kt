package programmerzamannow.spring.cores

import programmerzamannow.spring.cores.Database
// make Singleton
// make class Database and private constructor
class Database private constructor(){
    companion object { // make companion object
//        make private constructor
        private var database : Database? = null // make database null
//         make function getInstance // extend Database
        fun getInstance() : Database{
            if (database == null){ // if database is null
                database = Database() // make database
            }
            return database!! // return database
        }
    }

/*make private constructor*/
//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//        fun getInstance(): Database {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance!!
//        }
//    }
}
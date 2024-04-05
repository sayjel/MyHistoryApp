package com.example.myhistoryapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    //declare
    private lateinit var resultTextView: TextView
    private lateinit var clearButton: Button
    private lateinit var searchButton: Button
    private lateinit var ageInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //initialise
        resultTextView = findViewById(R.id.resultTextView)
        clearButton = findViewById(R.id.clearButton)
        searchButton = findViewById(R.id.searchButton)
        ageInput = findViewById(R.id.ageInput)

        searchButton.setOnClickListener {
            Log.d("MainActivity", "Search button clicked")
            val age = ageInput.text.toString().toIntOrNull()
            Log.d("MainActivity","Enter age: $age")

            if (age != null && age in 30..96) {
                Log.d("MainActivity", "Age is valid")


                val historicalperson = when (age){
                    32 -> "Alexander III of Macedon, most commonly known as Alexander the Great passed away at the age of 32, he was the king of the ancient Greek kingdom of Macedon. By the time he was 30, Alexander the Great had created one of the largest empires in history, which stretched from Greece to northwest India. In all that time, he was undefeated in battle."
                    39 -> "Cleopatra VII Thea Philopator was Queen of the Ptolemaic Kingdom of Egypt from 51 to 30 BC, and its last active ruler. Died at 39 years old. A member of the Ptolemaic dynasty, she was a descendant of its founder Ptolemy I Soter, a Macedonian Greek general and companion of Alexander the Great."
                    51 -> "Napoleon Bonaparte, later known by his regnal name Napoleon I, passed at the age of 51 years old. He was a French emperor and military commander who rose to prominence during the French Revolution and led successful campaigns during the Revolutionary Wars."
                    52 -> "William Shakespeare died at the age of 52 years old. He was an English playwright, poet and actor. He is widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist."
                    55 -> "Christopher Columbus died at 55 years old. He was an Italian explorer and navigator from the Republic of Genoa who completed four Spanish-based voyages across the Atlantic Ocean sponsored by the Catholic Monarchs, opening the way for the widespread European exploration and European colonization of the Americas."
                    56 -> "Adolf Hitler died at 56 years old. He was an Austrian-born German politician who was the dictator of Germany from 1933 until his suicide in 1945. He rose to power as the leader of the Nazi Party, becoming the chancellor in 1933 and then taking the title of Führer und Reichskanzler in 1934."
                    67 -> "Leonardo di ser Piero da Vinci died at 67 years old. He was an Italian polymath of the High Renaissance who was active as a painter, draughtsman, engineer, scientist, theorist, sculptor, and architect."
                    78 -> "Mohandas Karamchand Gandhi died at 78 years old. He was an Indian lawyer, anti-colonial nationalist and political ethicist who employed nonviolent resistance to lead the successful campaign for India's independence from British rule. He inspired movements for civil rights and freedom across the world."
                    95 -> "Nelson Rolihlahla Mandela died at 95 years old. He was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
                    96 -> "Elizabeth II died at 96 years old. She was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022. She was queen regnant of 32 sovereign states over the course of her lifetime and remained the monarch of 15 realms by the time of her death."
                    else -> null
                }

                val message = if (historicalperson != null) "The person's name is $historicalperson."
                else "no person found with the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "invalid input. Please enter a valid age between 30 and 96."
            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text=""



        }
    }
}

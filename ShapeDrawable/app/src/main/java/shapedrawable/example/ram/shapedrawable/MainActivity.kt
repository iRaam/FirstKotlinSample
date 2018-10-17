package shapedrawable.example.ram.shapedrawable

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.shape.CutCornerTreatment
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapePathModel
import com.google.android.material.shape.TriangleEdgeTreatment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Shape Drawable for Paragraph TextView
        val shapePathModelParagraph = ShapePathModel().apply {
            setAllCorners(CutCornerTreatment(8.toFloat()))
        }

        val backgroundDrawableParagraph = MaterialShapeDrawable(shapePathModelParagraph).apply {
            setTint(ContextCompat.getColor(applicationContext, R.color.colorPrimary))
        }


        val tvParagraph = findViewById<TextView>(R.id.paragraph)
        tvParagraph.background = backgroundDrawableParagraph

        // Shape Drawable for TheEnd TextView
        val shapePathModel = ShapePathModel().apply {
            setAllCorners(CutCornerTreatment(5.toFloat()))
            setAllEdges(TriangleEdgeTreatment(15.toFloat(), true))
        }

        val backgroundDrawable = MaterialShapeDrawable(shapePathModel).apply {
            setTint(ContextCompat.getColor(applicationContext, R.color.colorPrimary))
        }

        val tvEnd = findViewById<TextView>(R.id.end)
        tvEnd.background = backgroundDrawable
    }
}

import org.scalatest.{Matchers, FunSuite}

/** @version 1.0.0 */
class RnaTranscriptionTest extends FunSuite with Matchers {

  test("rna complement of cytosine is guanine") {
    RnaTranscription.toRna("C") should be (Some("G"))
  }

  test("rna complement of guanine is cytosine") {
    
    RnaTranscription.toRna("G") should be (Some("C"))
  }

  test("rna complement of thymine is adenine") {
    
    RnaTranscription.toRna("T") should be (Some("A"))
  }

  test("rna complement of adenine is uracil") {
    
    RnaTranscription.toRna("A") should be (Some("U"))
  }

  test("rna complement") {
    
    RnaTranscription.toRna("ACGTGGTCTTAA") should be (Some("UGCACCAGAAUU"))
  }

  test("dna correctly handles invalid input") {
    
    RnaTranscription.toRna("U") should be (None)
  }

  test("dna correctly handles completely invalid input") {
    
    RnaTranscription.toRna("XXX") should be (None)
  }

  test("dna correctly handles partially invalid input") {
    
    RnaTranscription.toRna("ACGTXXXCTTAA") should be (None)
  }
}
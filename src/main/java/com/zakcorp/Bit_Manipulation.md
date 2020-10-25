           Bit Manipulation

### Shift Operators
Given a number 'n' and the number of bits to be shifted 'k',
then,
* Left Shift  => 2^k * n i.e. Left shift is equivalent to multiplying the bit pattern with 2^k
    * One left shift One    -> 1 << 1  = 2  <===========> 2^1 * 1
    * One left shift Two    -> 1 << 2  = 4  <===========> 2^2 * 1
    * One left shift Four   -> 1 << 4  = 8  <===========> 2^4 * 1
    * Twenty left shift Two -> 20 << 2 = 80 <===========> 2^2 * 20
* Right Shift => n / 2^k i.e. Right shift is equivalent to dividing the bit pattern with 2^k
    * Four right shift One     -> 4 >> 1 = 2  <===========> 4 / 2^1
    * Six right shift One      -> 6 >> 1 = 3  <===========> 6 / 2^1
    * Five right shift One     -> 5 >> 1 = 2  <===========> 5 / 2^1
    * Sixteen right shift Four -> 16 >> 4 = 1  <===========> 16 / 2^4
    
### Bitwise Operators

| X | Y | X & Y | X \| Y | X ^ Y | ~X |
|:-:|:-:|-------|--------|-------|----|
| 0 | 0 | 0     | 0      | 0     | 1  |
| 0 | 1 | 0     | 1      | 1     | 1  |
| 1 | 0 | 0     | 1      | 1     | 0  |
| 1 | 1 | 1     | 1      | 0     | 0  |

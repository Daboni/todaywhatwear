import styled from '@emotion/styled';

const Container = styled.div`
  position: relative;
  filter: drop-shadow(0px 50px 25px rgba(0, 0, 0, 0.15));
  transform: translate(7vw, -5vh);
`;

const TextEditor = styled.textarea`
  font-family: inherit;
  font-size: 1rem;
  letter-spacing: 1px;
  box-sizing: border-box;
  padding: 1vh;
  color: transparent;
  background-color: transparent;
  line-height: 1.7rem;
  resize: none;
  border: none;

  caret-color: #000;

  width: 100%;
  height: 100%;
  overflow-y: auto;

  -ms-overflow-style: none; /* IE and Edge */
  scrollbar-width: none; /* Firefox */

  &::-webkit-scrollbar {
    display: none; /* Chrome, Safari, Opera*/
  }
`;

const Highlights = styled.div`
  position: absolute;
  z-index: -100;
  letter-spacing: 1px;
  box-sizing: border-box;
  padding: calc(15% + 1vh) 1vh 1vh 1vh;
  color: #000;
  background-color: #fff;
  line-height: 1.7rem;
  word-break: break-word;

  width: 100%;
  height: 100%;
  overflow-y: auto;

  top: 0;
  left: 0;

  -ms-overflow-style: none; /* IE and Edge */
  scrollbar-width: none; /* Firefox */

  &::-webkit-scrollbar {
    display: none; /* Chrome, Safari, Opera*/
  }

  & > .hashtag {
    border-radius: 0.3rem;
    color: #dd3345;
    background-color: #f4f4f8;
  }
`;

export default { Container, TextEditor, Highlights };
